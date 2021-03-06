/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class AdminJobReq implements TBase, java.io.Serializable, Cloneable, Comparable<AdminJobReq> {
  private static final TStruct STRUCT_DESC = new TStruct("AdminJobReq");
  private static final TField OP_FIELD_DESC = new TField("op", TType.I32, (short)1);
  private static final TField PARAS_FIELD_DESC = new TField("paras", TType.LIST, (short)2);

  /**
   * 
   * @see AdminJobOp
   */
  public int op;
  public List<String> paras;
  public static final int OP = 1;
  public static final int PARAS = 2;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __OP_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(OP, new FieldMetaData("op", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARAS, new FieldMetaData("paras", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AdminJobReq.class, metaDataMap);
  }

  public AdminJobReq() {
  }

  public AdminJobReq(
    int op,
    List<String> paras)
  {
    this();
    this.op = op;
    setOpIsSet(true);
    this.paras = paras;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdminJobReq(AdminJobReq other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.op = TBaseHelper.deepCopy(other.op);
    if (other.isSetParas()) {
      this.paras = TBaseHelper.deepCopy(other.paras);
    }
  }

  public AdminJobReq deepCopy() {
    return new AdminJobReq(this);
  }

  @Deprecated
  public AdminJobReq clone() {
    return new AdminJobReq(this);
  }

  /**
   * 
   * @see AdminJobOp
   */
  public int  getOp() {
    return this.op;
  }

  /**
   * 
   * @see AdminJobOp
   */
  public AdminJobReq setOp(int op) {
    this.op = op;
    setOpIsSet(true);
    return this;
  }

  public void unsetOp() {
    __isset_bit_vector.clear(__OP_ISSET_ID);
  }

  // Returns true if field op is set (has been assigned a value) and false otherwise
  public boolean isSetOp() {
    return __isset_bit_vector.get(__OP_ISSET_ID);
  }

  public void setOpIsSet(boolean value) {
    __isset_bit_vector.set(__OP_ISSET_ID, value);
  }

  public List<String>  getParas() {
    return this.paras;
  }

  public AdminJobReq setParas(List<String> paras) {
    this.paras = paras;
    return this;
  }

  public void unsetParas() {
    this.paras = null;
  }

  // Returns true if field paras is set (has been assigned a value) and false otherwise
  public boolean isSetParas() {
    return this.paras != null;
  }

  public void setParasIsSet(boolean value) {
    if (!value) {
      this.paras = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((Integer)value);
      }
      break;

    case PARAS:
      if (value == null) {
        unsetParas();
      } else {
        setParas((List<String>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case OP:
      return getOp();

    case PARAS:
      return getParas();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case OP:
      return isSetOp();
    case PARAS:
      return isSetParas();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdminJobReq)
      return this.equals((AdminJobReq)that);
    return false;
  }

  public boolean equals(AdminJobReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_op = true;
    boolean that_present_op = true;
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!TBaseHelper.equalsNobinary(this.op, that.op))
        return false;
    }

    boolean this_present_paras = true && this.isSetParas();
    boolean that_present_paras = true && that.isSetParas();
    if (this_present_paras || that_present_paras) {
      if (!(this_present_paras && that_present_paras))
        return false;
      if (!TBaseHelper.equalsNobinary(this.paras, that.paras))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_op = true;
    builder.append(present_op);
    if (present_op)
      builder.append(op);

    boolean present_paras = true && (isSetParas());
    builder.append(present_paras);
    if (present_paras)
      builder.append(paras);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(AdminJobReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(op, other.op);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParas()).compareTo(other.isSetParas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(paras, other.paras);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case OP:
          if (field.type == TType.I32) {
            this.op = iprot.readI32();
            setOpIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARAS:
          if (field.type == TType.LIST) {
            {
              TList _list18 = iprot.readListBegin();
              this.paras = new ArrayList<String>(Math.max(0, _list18.size));
              for (int _i19 = 0; 
                   (_list18.size < 0) ? iprot.peekList() : (_i19 < _list18.size); 
                   ++_i19)
              {
                String _elem20;
                _elem20 = iprot.readString();
                this.paras.add(_elem20);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(OP_FIELD_DESC);
    oprot.writeI32(this.op);
    oprot.writeFieldEnd();
    if (this.paras != null) {
      oprot.writeFieldBegin(PARAS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.paras.size()));
        for (String _iter21 : this.paras)        {
          oprot.writeString(_iter21);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("AdminJobReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("op");
    sb.append(space);
    sb.append(":").append(space);
    String op_name = AdminJobOp.VALUES_TO_NAMES.get(this. getOp());
    if (op_name != null) {
      sb.append(op_name);
      sb.append(" (");
    }
    sb.append(this. getOp());
    if (op_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("paras");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getParas() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getParas(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetOp() && !AdminJobOp.VALID_VALUES.contains(op)){
      throw new TProtocolException("The field 'op' has been assigned the invalid value " + op);
    }
  }

}

