/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.tools.connector.vertices

import java.util.Optional

import com.vesoft.nebula.tools.connector.{
  AddressHandler,
  MetaProvider,
  NebulaVertexReader,
  NebulaVertexWriter
}
import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.sources.DataSourceRegister
import org.apache.spark.sql.sources.v2.reader.DataSourceReader
import org.apache.spark.sql.sources.v2.writer.DataSourceWriter
import org.apache.spark.sql.sources.v2.{DataSourceOptions, DataSourceV2, ReadSupport, WriteSupport}
import org.apache.spark.sql.types.StructType
import org.slf4j.LoggerFactory

class DefaultSource()
    extends DataSourceV2
    with ReadSupport
    with WriteSupport
    with DataSourceRegister
    with AddressHandler {

  private lazy val LOG = LoggerFactory.getLogger(this.getClass)

  override def createReader(options: DataSourceOptions): DataSourceReader = {
    LOG.info(s"createReader: ${options.asMap()}")

    val pathsOpt = options.get("paths")
    if (!pathsOpt.isPresent) {
      throw new IllegalArgumentException("Paths not exist")
    }

    val paths        = toAddress(pathsOpt.get())
    val metaProvider = new MetaProvider(paths)
    val schema       = metaProvider.getTagSchema("space", "tag name")
    new NebulaVertexReader(paths, "space", "tag name", "")
  }

  override def createWriter(writeUUID: String,
                            schema: StructType,
                            mode: SaveMode,
                            options: DataSourceOptions): Optional[DataSourceWriter] = {
    LOG.info("create writer")
    LOG.info(s"options ${options.asMap()}")

    if (mode == SaveMode.Ignore || mode == SaveMode.ErrorIfExists) {
      LOG.warn("Currently ")
    }

    val space = options.get("nebula.space").get
    val tag   = options.get("nebula.tag").get
    val address = options
      .paths()
      .map(address => {
        val pair = address.split(":")
        (pair(0), pair(1).toInt)
      })
      .toList
    Optional.of(new NebulaVertexWriter(address, space, tag, schema))
  }

  override def shortName(): String = "Nebula Vertex Source"
}
