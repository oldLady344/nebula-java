/* Copyright (c) 2019 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph;

public class ConnectionException extends Exception {

    public ConnectionException() {
        super();
    }

    public ConnectionException(String message) {
        super(message);
    }
}

