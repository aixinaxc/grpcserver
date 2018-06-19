package testg;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: testg/user_server.proto")
public final class UserServerGrpc {

  private UserServerGrpc() {}

  public static final String SERVICE_NAME = "testg.UserServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserByIdMethod()} instead. 
  public static final io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> METHOD_GET_USER_BY_ID = getGetUserByIdMethod();

  private static volatile io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> getGetUserByIdMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<testg.UserVo.User, testg.UserVo.User> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserServerGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserServerGrpc.class) {
        if ((getGetUserByIdMethod = UserServerGrpc.getGetUserByIdMethod) == null) {
          UserServerGrpc.getGetUserByIdMethod = getGetUserByIdMethod = 
              io.grpc.MethodDescriptor.<testg.UserVo.User, testg.UserVo.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testg.UserServer", "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServerMethodDescriptorSupplier("GetUserById"))
                  .build();
          }
        }
     }
     return getGetUserByIdMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetListMethod()} instead. 
  public static final io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.UserList> METHOD_GET_LIST = getGetListMethod();

  private static volatile io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.UserList> getGetListMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.UserList> getGetListMethod() {
    io.grpc.MethodDescriptor<testg.UserVo.Empty, testg.UserVo.UserList> getGetListMethod;
    if ((getGetListMethod = UserServerGrpc.getGetListMethod) == null) {
      synchronized (UserServerGrpc.class) {
        if ((getGetListMethod = UserServerGrpc.getGetListMethod) == null) {
          UserServerGrpc.getGetListMethod = getGetListMethod = 
              io.grpc.MethodDescriptor.<testg.UserVo.Empty, testg.UserVo.UserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "testg.UserServer", "GetList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.UserList.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServerMethodDescriptorSupplier("GetList"))
                  .build();
          }
        }
     }
     return getGetListMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetListStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.User> METHOD_GET_LIST_STREAM = getGetListStreamMethod();

  private static volatile io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.User> getGetListStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<testg.UserVo.Empty,
      testg.UserVo.User> getGetListStreamMethod() {
    io.grpc.MethodDescriptor<testg.UserVo.Empty, testg.UserVo.User> getGetListStreamMethod;
    if ((getGetListStreamMethod = UserServerGrpc.getGetListStreamMethod) == null) {
      synchronized (UserServerGrpc.class) {
        if ((getGetListStreamMethod = UserServerGrpc.getGetListStreamMethod) == null) {
          UserServerGrpc.getGetListStreamMethod = getGetListStreamMethod = 
              io.grpc.MethodDescriptor.<testg.UserVo.Empty, testg.UserVo.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "testg.UserServer", "GetListStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServerMethodDescriptorSupplier("GetListStream"))
                  .build();
          }
        }
     }
     return getGetListStreamMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSetUserStreamMethod()} instead. 
  public static final io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.UserList> METHOD_SET_USER_STREAM = getSetUserStreamMethod();

  private static volatile io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.UserList> getSetUserStreamMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.UserList> getSetUserStreamMethod() {
    io.grpc.MethodDescriptor<testg.UserVo.User, testg.UserVo.UserList> getSetUserStreamMethod;
    if ((getSetUserStreamMethod = UserServerGrpc.getSetUserStreamMethod) == null) {
      synchronized (UserServerGrpc.class) {
        if ((getSetUserStreamMethod = UserServerGrpc.getSetUserStreamMethod) == null) {
          UserServerGrpc.getSetUserStreamMethod = getSetUserStreamMethod = 
              io.grpc.MethodDescriptor.<testg.UserVo.User, testg.UserVo.UserList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "testg.UserServer", "SetUserStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.UserList.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServerMethodDescriptorSupplier("SetUserStream"))
                  .build();
          }
        }
     }
     return getSetUserStreamMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getChatMethod()} instead. 
  public static final io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> METHOD_CHAT = getChatMethod();

  private static volatile io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> getChatMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<testg.UserVo.User,
      testg.UserVo.User> getChatMethod() {
    io.grpc.MethodDescriptor<testg.UserVo.User, testg.UserVo.User> getChatMethod;
    if ((getChatMethod = UserServerGrpc.getChatMethod) == null) {
      synchronized (UserServerGrpc.class) {
        if ((getChatMethod = UserServerGrpc.getChatMethod) == null) {
          UserServerGrpc.getChatMethod = getChatMethod = 
              io.grpc.MethodDescriptor.<testg.UserVo.User, testg.UserVo.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "testg.UserServer", "Chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  testg.UserVo.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServerMethodDescriptorSupplier("Chat"))
                  .build();
          }
        }
     }
     return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServerStub newStub(io.grpc.Channel channel) {
    return new UserServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServerFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserById(testg.UserVo.User request,
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void getList(testg.UserVo.Empty request,
        io.grpc.stub.StreamObserver<testg.UserVo.UserList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListMethod(), responseObserver);
    }

    /**
     */
    public void getListStream(testg.UserVo.Empty request,
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<testg.UserVo.User> setUserStream(
        io.grpc.stub.StreamObserver<testg.UserVo.UserList> responseObserver) {
      return asyncUnimplementedStreamingCall(getSetUserStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<testg.UserVo.User> chat(
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                testg.UserVo.User,
                testg.UserVo.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                testg.UserVo.Empty,
                testg.UserVo.UserList>(
                  this, METHODID_GET_LIST)))
          .addMethod(
            getGetListStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                testg.UserVo.Empty,
                testg.UserVo.User>(
                  this, METHODID_GET_LIST_STREAM)))
          .addMethod(
            getSetUserStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                testg.UserVo.User,
                testg.UserVo.UserList>(
                  this, METHODID_SET_USER_STREAM)))
          .addMethod(
            getChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                testg.UserVo.User,
                testg.UserVo.User>(
                  this, METHODID_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class UserServerStub extends io.grpc.stub.AbstractStub<UserServerStub> {
    private UserServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServerStub(channel, callOptions);
    }

    /**
     */
    public void getUserById(testg.UserVo.User request,
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getList(testg.UserVo.Empty request,
        io.grpc.stub.StreamObserver<testg.UserVo.UserList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListStream(testg.UserVo.Empty request,
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetListStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<testg.UserVo.User> setUserStream(
        io.grpc.stub.StreamObserver<testg.UserVo.UserList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSetUserStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<testg.UserVo.User> chat(
        io.grpc.stub.StreamObserver<testg.UserVo.User> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserServerBlockingStub extends io.grpc.stub.AbstractStub<UserServerBlockingStub> {
    private UserServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public testg.UserVo.User getUserById(testg.UserVo.User request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public testg.UserVo.UserList getList(testg.UserVo.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetListMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<testg.UserVo.User> getListStream(
        testg.UserVo.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetListStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServerFutureStub extends io.grpc.stub.AbstractStub<UserServerFutureStub> {
    private UserServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<testg.UserVo.User> getUserById(
        testg.UserVo.User request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<testg.UserVo.UserList> getList(
        testg.UserVo.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_ID = 0;
  private static final int METHODID_GET_LIST = 1;
  private static final int METHODID_GET_LIST_STREAM = 2;
  private static final int METHODID_SET_USER_STREAM = 3;
  private static final int METHODID_CHAT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((testg.UserVo.User) request,
              (io.grpc.stub.StreamObserver<testg.UserVo.User>) responseObserver);
          break;
        case METHODID_GET_LIST:
          serviceImpl.getList((testg.UserVo.Empty) request,
              (io.grpc.stub.StreamObserver<testg.UserVo.UserList>) responseObserver);
          break;
        case METHODID_GET_LIST_STREAM:
          serviceImpl.getListStream((testg.UserVo.Empty) request,
              (io.grpc.stub.StreamObserver<testg.UserVo.User>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_USER_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setUserStream(
              (io.grpc.stub.StreamObserver<testg.UserVo.UserList>) responseObserver);
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<testg.UserVo.User>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return testg.UserServerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServer");
    }
  }

  private static final class UserServerFileDescriptorSupplier
      extends UserServerBaseDescriptorSupplier {
    UserServerFileDescriptorSupplier() {}
  }

  private static final class UserServerMethodDescriptorSupplier
      extends UserServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServerFileDescriptorSupplier())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGetListMethod())
              .addMethod(getGetListStreamMethod())
              .addMethod(getSetUserStreamMethod())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
