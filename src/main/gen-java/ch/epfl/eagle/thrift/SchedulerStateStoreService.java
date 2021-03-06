/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ch.epfl.eagle.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-03")
public class SchedulerStateStoreService {

  public interface Iface {

    public void updateNodeState(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void updateNodeState(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void updateNodeState(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot) throws org.apache.thrift.TException
    {
      send_updateNodeState(snapshot);
      recv_updateNodeState();
    }

    public void send_updateNodeState(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot) throws org.apache.thrift.TException
    {
      updateNodeState_args args = new updateNodeState_args();
      args.setSnapshot(snapshot);
      sendBase("updateNodeState", args);
    }

    public void recv_updateNodeState() throws org.apache.thrift.TException
    {
      updateNodeState_result result = new updateNodeState_result();
      receiveBase(result, "updateNodeState");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void updateNodeState(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      updateNodeState_call method_call = new updateNodeState_call(snapshot, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class updateNodeState_call extends org.apache.thrift.async.TAsyncMethodCall {
      private Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot;
      public updateNodeState_call(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.snapshot = snapshot;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("updateNodeState", org.apache.thrift.protocol.TMessageType.CALL, 0));
        updateNodeState_args args = new updateNodeState_args();
        args.setSnapshot(snapshot);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_updateNodeState();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("updateNodeState", new updateNodeState());
      return processMap;
    }

    public static class updateNodeState<I extends Iface> extends org.apache.thrift.ProcessFunction<I, updateNodeState_args> {
      public updateNodeState() {
        super("updateNodeState");
      }

      public updateNodeState_args getEmptyArgsInstance() {
        return new updateNodeState_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public updateNodeState_result getResult(I iface, updateNodeState_args args) throws org.apache.thrift.TException {
        updateNodeState_result result = new updateNodeState_result();
        iface.updateNodeState(args.snapshot);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("updateNodeState", new updateNodeState());
      return processMap;
    }

    public static class updateNodeState<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, updateNodeState_args, Void> {
      public updateNodeState() {
        super("updateNodeState");
      }

      public updateNodeState_args getEmptyArgsInstance() {
        return new updateNodeState_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            updateNodeState_result result = new updateNodeState_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            updateNodeState_result result = new updateNodeState_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, updateNodeState_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.updateNodeState(args.snapshot,resultHandler);
      }
    }

  }

  public static class updateNodeState_args implements org.apache.thrift.TBase<updateNodeState_args, updateNodeState_args._Fields>, java.io.Serializable, Cloneable, Comparable<updateNodeState_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateNodeState_args");

    private static final org.apache.thrift.protocol.TField SNAPSHOT_FIELD_DESC = new org.apache.thrift.protocol.TField("snapshot", org.apache.thrift.protocol.TType.MAP, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new updateNodeState_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new updateNodeState_argsTupleSchemeFactory());
    }

    public Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SNAPSHOT((short)1, "snapshot");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // SNAPSHOT
            return SNAPSHOT;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SNAPSHOT, new org.apache.thrift.meta_data.FieldMetaData("snapshot", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
              new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ch.epfl.eagle.thrift.TNodeState.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateNodeState_args.class, metaDataMap);
    }

    public updateNodeState_args() {
    }

    public updateNodeState_args(
      Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot)
    {
      this();
      this.snapshot = snapshot;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateNodeState_args(updateNodeState_args other) {
      if (other.isSetSnapshot()) {
        Map<String,ch.epfl.eagle.thrift.TNodeState> __this__snapshot = new HashMap<String,ch.epfl.eagle.thrift.TNodeState>(other.snapshot.size());
        for (Map.Entry<String, ch.epfl.eagle.thrift.TNodeState> other_element : other.snapshot.entrySet()) {

          String other_element_key = other_element.getKey();
          ch.epfl.eagle.thrift.TNodeState other_element_value = other_element.getValue();

          String __this__snapshot_copy_key = other_element_key;

          ch.epfl.eagle.thrift.TNodeState __this__snapshot_copy_value = new ch.epfl.eagle.thrift.TNodeState(other_element_value);

          __this__snapshot.put(__this__snapshot_copy_key, __this__snapshot_copy_value);
        }
        this.snapshot = __this__snapshot;
      }
    }

    public updateNodeState_args deepCopy() {
      return new updateNodeState_args(this);
    }

    @Override
    public void clear() {
      this.snapshot = null;
    }

    public int getSnapshotSize() {
      return (this.snapshot == null) ? 0 : this.snapshot.size();
    }

    public void putToSnapshot(String key, ch.epfl.eagle.thrift.TNodeState val) {
      if (this.snapshot == null) {
        this.snapshot = new HashMap<String,ch.epfl.eagle.thrift.TNodeState>();
      }
      this.snapshot.put(key, val);
    }

    public Map<String,ch.epfl.eagle.thrift.TNodeState> getSnapshot() {
      return this.snapshot;
    }

    public updateNodeState_args setSnapshot(Map<String,ch.epfl.eagle.thrift.TNodeState> snapshot) {
      this.snapshot = snapshot;
      return this;
    }

    public void unsetSnapshot() {
      this.snapshot = null;
    }

    /** Returns true if field snapshot is set (has been assigned a value) and false otherwise */
    public boolean isSetSnapshot() {
      return this.snapshot != null;
    }

    public void setSnapshotIsSet(boolean value) {
      if (!value) {
        this.snapshot = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SNAPSHOT:
        if (value == null) {
          unsetSnapshot();
        } else {
          setSnapshot((Map<String,ch.epfl.eagle.thrift.TNodeState>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SNAPSHOT:
        return getSnapshot();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SNAPSHOT:
        return isSetSnapshot();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof updateNodeState_args)
        return this.equals((updateNodeState_args)that);
      return false;
    }

    public boolean equals(updateNodeState_args that) {
      if (that == null)
        return false;

      boolean this_present_snapshot = true && this.isSetSnapshot();
      boolean that_present_snapshot = true && that.isSetSnapshot();
      if (this_present_snapshot || that_present_snapshot) {
        if (!(this_present_snapshot && that_present_snapshot))
          return false;
        if (!this.snapshot.equals(that.snapshot))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_snapshot = true && (isSetSnapshot());
      list.add(present_snapshot);
      if (present_snapshot)
        list.add(snapshot);

      return list.hashCode();
    }

    @Override
    public int compareTo(updateNodeState_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSnapshot()).compareTo(other.isSetSnapshot());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSnapshot()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snapshot, other.snapshot);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("updateNodeState_args(");
      boolean first = true;

      sb.append("snapshot:");
      if (this.snapshot == null) {
        sb.append("null");
      } else {
        sb.append(this.snapshot);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateNodeState_argsStandardSchemeFactory implements SchemeFactory {
      public updateNodeState_argsStandardScheme getScheme() {
        return new updateNodeState_argsStandardScheme();
      }
    }

    private static class updateNodeState_argsStandardScheme extends StandardScheme<updateNodeState_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateNodeState_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // SNAPSHOT
              if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
                {
                  org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                  struct.snapshot = new HashMap<String,ch.epfl.eagle.thrift.TNodeState>(2*_map40.size);
                  String _key41;
                  ch.epfl.eagle.thrift.TNodeState _val42;
                  for (int _i43 = 0; _i43 < _map40.size; ++_i43)
                  {
                    _key41 = iprot.readString();
                    _val42 = new ch.epfl.eagle.thrift.TNodeState();
                    _val42.read(iprot);
                    struct.snapshot.put(_key41, _val42);
                  }
                  iprot.readMapEnd();
                }
                struct.setSnapshotIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateNodeState_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.snapshot != null) {
          oprot.writeFieldBegin(SNAPSHOT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.snapshot.size()));
            for (Map.Entry<String, ch.epfl.eagle.thrift.TNodeState> _iter44 : struct.snapshot.entrySet())
            {
              oprot.writeString(_iter44.getKey());
              _iter44.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateNodeState_argsTupleSchemeFactory implements SchemeFactory {
      public updateNodeState_argsTupleScheme getScheme() {
        return new updateNodeState_argsTupleScheme();
      }
    }

    private static class updateNodeState_argsTupleScheme extends TupleScheme<updateNodeState_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateNodeState_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSnapshot()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSnapshot()) {
          {
            oprot.writeI32(struct.snapshot.size());
            for (Map.Entry<String, ch.epfl.eagle.thrift.TNodeState> _iter45 : struct.snapshot.entrySet())
            {
              oprot.writeString(_iter45.getKey());
              _iter45.getValue().write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateNodeState_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            struct.snapshot = new HashMap<String,ch.epfl.eagle.thrift.TNodeState>(2*_map46.size);
            String _key47;
            ch.epfl.eagle.thrift.TNodeState _val48;
            for (int _i49 = 0; _i49 < _map46.size; ++_i49)
            {
              _key47 = iprot.readString();
              _val48 = new ch.epfl.eagle.thrift.TNodeState();
              _val48.read(iprot);
              struct.snapshot.put(_key47, _val48);
            }
          }
          struct.setSnapshotIsSet(true);
        }
      }
    }

  }

  public static class updateNodeState_result implements org.apache.thrift.TBase<updateNodeState_result, updateNodeState_result._Fields>, java.io.Serializable, Cloneable, Comparable<updateNodeState_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("updateNodeState_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new updateNodeState_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new updateNodeState_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(updateNodeState_result.class, metaDataMap);
    }

    public updateNodeState_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public updateNodeState_result(updateNodeState_result other) {
    }

    public updateNodeState_result deepCopy() {
      return new updateNodeState_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof updateNodeState_result)
        return this.equals((updateNodeState_result)that);
      return false;
    }

    public boolean equals(updateNodeState_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      return list.hashCode();
    }

    @Override
    public int compareTo(updateNodeState_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("updateNodeState_result(");
      boolean first = true;

      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class updateNodeState_resultStandardSchemeFactory implements SchemeFactory {
      public updateNodeState_resultStandardScheme getScheme() {
        return new updateNodeState_resultStandardScheme();
      }
    }

    private static class updateNodeState_resultStandardScheme extends StandardScheme<updateNodeState_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, updateNodeState_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, updateNodeState_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class updateNodeState_resultTupleSchemeFactory implements SchemeFactory {
      public updateNodeState_resultTupleScheme getScheme() {
        return new updateNodeState_resultTupleScheme();
      }
    }

    private static class updateNodeState_resultTupleScheme extends TupleScheme<updateNodeState_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, updateNodeState_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, updateNodeState_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}
