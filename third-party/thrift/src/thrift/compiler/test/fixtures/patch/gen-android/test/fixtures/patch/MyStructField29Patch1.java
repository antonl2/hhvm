/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructField29Patch1 implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructField29Patch1");
  private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.MAP, (short)1);
  private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
  private static final TField PATCH_PRIOR_FIELD_DESC = new TField("patchPrior", TType.MAP, (short)3);
  private static final TField ADD_FIELD_DESC = new TField("add", TType.MAP, (short)5);
  private static final TField PATCH_FIELD_DESC = new TField("patch", TType.MAP, (short)6);
  private static final TField REMOVE_FIELD_DESC = new TField("remove", TType.SET, (short)7);
  private static final TField PUT_FIELD_DESC = new TField("put", TType.MAP, (short)9);

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   */
  public final Map<String,Integer> assign;
  /**
   * Clears a value. Applies first.
   */
  public final Boolean clear;
  /**
   * Patches any previously set values. Applies second.
   */
  public final Map<String,I32Patch> patchPrior;
  /**
   * Add the given values, if the keys are not already present. Applies forth.
   */
  public final Map<String,Integer> add;
  /**
   * Patches any set value, including newly set values. Applies last.
   */
  public final Map<String,I32Patch> patch;
  /**
   * Removes entries, if present. Applies third.
   */
  public final Set<String> remove;
  /**
   * Adds or replaces the given key/value pairs. Applies fifth.
   */
  public final Map<String,Integer> put;
  public static final int ASSIGN = 1;
  public static final int CLEAR = 2;
  public static final int PATCHPRIOR = 3;
  public static final int ADD = 5;
  public static final int PATCH = 6;
  public static final int REMOVE = 7;
  public static final int PUT = 9;

  public MyStructField29Patch1(
      Map<String,Integer> assign,
      Boolean clear,
      Map<String,I32Patch> patchPrior,
      Map<String,Integer> add,
      Map<String,I32Patch> patch,
      Set<String> remove,
      Map<String,Integer> put) {
    this.assign = assign;
    this.clear = clear;
    this.patchPrior = patchPrior;
    this.add = add;
    this.patch = patch;
    this.remove = remove;
    this.put = put;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructField29Patch1(MyStructField29Patch1 other) {
    if (other.isSetAssign()) {
      this.assign = TBaseHelper.deepCopy(other.assign);
    } else {
      this.assign = null;
    }
    if (other.isSetClear()) {
      this.clear = TBaseHelper.deepCopy(other.clear);
    } else {
      this.clear = null;
    }
    if (other.isSetPatchPrior()) {
      this.patchPrior = TBaseHelper.deepCopy(other.patchPrior);
    } else {
      this.patchPrior = null;
    }
    if (other.isSetAdd()) {
      this.add = TBaseHelper.deepCopy(other.add);
    } else {
      this.add = null;
    }
    if (other.isSetPatch()) {
      this.patch = TBaseHelper.deepCopy(other.patch);
    } else {
      this.patch = null;
    }
    if (other.isSetRemove()) {
      this.remove = TBaseHelper.deepCopy(other.remove);
    } else {
      this.remove = null;
    }
    if (other.isSetPut()) {
      this.put = TBaseHelper.deepCopy(other.put);
    } else {
      this.put = null;
    }
  }

  public MyStructField29Patch1 deepCopy() {
    return new MyStructField29Patch1(this);
  }

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   */
  public Map<String,Integer> getAssign() {
    return this.assign;
  }

  // Returns true if field assign is set (has been assigned a value) and false otherwise
  public boolean isSetAssign() {
    return this.assign != null;
  }

  /**
   * Clears a value. Applies first.
   */
  public Boolean isClear() {
    return this.clear;
  }

  // Returns true if field clear is set (has been assigned a value) and false otherwise
  public boolean isSetClear() {
    return this.clear != null;
  }

  /**
   * Patches any previously set values. Applies second.
   */
  public Map<String,I32Patch> getPatchPrior() {
    return this.patchPrior;
  }

  // Returns true if field patchPrior is set (has been assigned a value) and false otherwise
  public boolean isSetPatchPrior() {
    return this.patchPrior != null;
  }

  /**
   * Add the given values, if the keys are not already present. Applies forth.
   */
  public Map<String,Integer> getAdd() {
    return this.add;
  }

  // Returns true if field add is set (has been assigned a value) and false otherwise
  public boolean isSetAdd() {
    return this.add != null;
  }

  /**
   * Patches any set value, including newly set values. Applies last.
   */
  public Map<String,I32Patch> getPatch() {
    return this.patch;
  }

  // Returns true if field patch is set (has been assigned a value) and false otherwise
  public boolean isSetPatch() {
    return this.patch != null;
  }

  /**
   * Removes entries, if present. Applies third.
   */
  public Set<String> getRemove() {
    return this.remove;
  }

  // Returns true if field remove is set (has been assigned a value) and false otherwise
  public boolean isSetRemove() {
    return this.remove != null;
  }

  /**
   * Adds or replaces the given key/value pairs. Applies fifth.
   */
  public Map<String,Integer> getPut() {
    return this.put;
  }

  // Returns true if field put is set (has been assigned a value) and false otherwise
  public boolean isSetPut() {
    return this.put != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructField29Patch1))
      return false;
    MyStructField29Patch1 that = (MyStructField29Patch1)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAssign(), that.isSetAssign(), this.assign, that.assign)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetClear(), that.isSetClear(), this.clear, that.clear)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPatchPrior(), that.isSetPatchPrior(), this.patchPrior, that.patchPrior)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAdd(), that.isSetAdd(), this.add, that.add)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPatch(), that.isSetPatch(), this.patch, that.patch)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetRemove(), that.isSetRemove(), this.remove, that.remove)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPut(), that.isSetPut(), this.put, that.put)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {assign, clear, patchPrior, add, patch, remove, put});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStructField29Patch1 deserialize(TProtocol iprot) throws TException {
    Map<String,Integer> tmp_assign = null;
    Boolean tmp_clear = null;
    Map<String,I32Patch> tmp_patchPrior = null;
    Map<String,Integer> tmp_add = null;
    Map<String,I32Patch> tmp_patch = null;
    Set<String> tmp_remove = null;
    Map<String,Integer> tmp_put = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ASSIGN:
          if (__field.type == TType.MAP) {
            {
              TMap _map172 = iprot.readMapBegin();
              tmp_assign = new HashMap<String,Integer>(Math.max(0, 2*_map172.size));
              for (int _i173 = 0; 
                   (_map172.size < 0) ? iprot.peekMap() : (_i173 < _map172.size); 
                   ++_i173)
              {
                String _key174;
                Integer _val175;
                _key174 = iprot.readString();
                _val175 = iprot.readI32();
                tmp_assign.put(_key174, _val175);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CLEAR:
          if (__field.type == TType.BOOL) {
            tmp_clear = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PATCHPRIOR:
          if (__field.type == TType.MAP) {
            {
              TMap _map176 = iprot.readMapBegin();
              tmp_patchPrior = new HashMap<String,I32Patch>(Math.max(0, 2*_map176.size));
              for (int _i177 = 0; 
                   (_map176.size < 0) ? iprot.peekMap() : (_i177 < _map176.size); 
                   ++_i177)
              {
                String _key178;
                I32Patch _val179;
                _key178 = iprot.readString();
                _val179 = I32Patch.deserialize(iprot);
                tmp_patchPrior.put(_key178, _val179);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADD:
          if (__field.type == TType.MAP) {
            {
              TMap _map180 = iprot.readMapBegin();
              tmp_add = new HashMap<String,Integer>(Math.max(0, 2*_map180.size));
              for (int _i181 = 0; 
                   (_map180.size < 0) ? iprot.peekMap() : (_i181 < _map180.size); 
                   ++_i181)
              {
                String _key182;
                Integer _val183;
                _key182 = iprot.readString();
                _val183 = iprot.readI32();
                tmp_add.put(_key182, _val183);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PATCH:
          if (__field.type == TType.MAP) {
            {
              TMap _map184 = iprot.readMapBegin();
              tmp_patch = new HashMap<String,I32Patch>(Math.max(0, 2*_map184.size));
              for (int _i185 = 0; 
                   (_map184.size < 0) ? iprot.peekMap() : (_i185 < _map184.size); 
                   ++_i185)
              {
                String _key186;
                I32Patch _val187;
                _key186 = iprot.readString();
                _val187 = I32Patch.deserialize(iprot);
                tmp_patch.put(_key186, _val187);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case REMOVE:
          if (__field.type == TType.SET) {
            {
              TSet _set188 = iprot.readSetBegin();
              tmp_remove = new HashSet<String>(Math.max(0, 2*_set188.size));
              for (int _i189 = 0; 
                   (_set188.size < 0) ? iprot.peekSet() : (_i189 < _set188.size); 
                   ++_i189)
              {
                String _elem190;
                _elem190 = iprot.readString();
                tmp_remove.add(_elem190);
              }
              iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PUT:
          if (__field.type == TType.MAP) {
            {
              TMap _map191 = iprot.readMapBegin();
              tmp_put = new HashMap<String,Integer>(Math.max(0, 2*_map191.size));
              for (int _i192 = 0; 
                   (_map191.size < 0) ? iprot.peekMap() : (_i192 < _map191.size); 
                   ++_i192)
              {
                String _key193;
                Integer _val194;
                _key193 = iprot.readString();
                _val194 = iprot.readI32();
                tmp_put.put(_key193, _val194);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    MyStructField29Patch1 _that;
    _that = new MyStructField29Patch1(
      tmp_assign
      ,tmp_clear
      ,tmp_patchPrior
      ,tmp_add
      ,tmp_patch
      ,tmp_remove
      ,tmp_put
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.assign != null) {
      if (isSetAssign()) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.I32, this.assign.size()));
          for (Map.Entry<String, Integer> _iter195 : this.assign.entrySet())          {
            oprot.writeString(_iter195.getKey());
            oprot.writeI32(_iter195.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.clear != null) {
      oprot.writeFieldBegin(CLEAR_FIELD_DESC);
      oprot.writeBool(this.clear);
      oprot.writeFieldEnd();
    }
    if (this.patchPrior != null) {
      oprot.writeFieldBegin(PATCH_PRIOR_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.patchPrior.size()));
        for (Map.Entry<String, I32Patch> _iter196 : this.patchPrior.entrySet())        {
          oprot.writeString(_iter196.getKey());
          _iter196.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.add != null) {
      oprot.writeFieldBegin(ADD_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I32, this.add.size()));
        for (Map.Entry<String, Integer> _iter197 : this.add.entrySet())        {
          oprot.writeString(_iter197.getKey());
          oprot.writeI32(_iter197.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.patch != null) {
      oprot.writeFieldBegin(PATCH_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.patch.size()));
        for (Map.Entry<String, I32Patch> _iter198 : this.patch.entrySet())        {
          oprot.writeString(_iter198.getKey());
          _iter198.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.remove != null) {
      oprot.writeFieldBegin(REMOVE_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.STRING, this.remove.size()));
        for (String _iter199 : this.remove)        {
          oprot.writeString(_iter199);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.put != null) {
      oprot.writeFieldBegin(PUT_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.I32, this.put.size()));
        for (Map.Entry<String, Integer> _iter200 : this.put.entrySet())        {
          oprot.writeString(_iter200.getKey());
          oprot.writeI32(_iter200.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

