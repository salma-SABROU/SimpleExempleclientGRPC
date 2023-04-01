package org.example.stub;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BanqueServiceGrpc {

  private BanqueServiceGrpc() {}

  public static final String SERVICE_NAME = "BanqueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = org.example.stub.Bank.ConvertCurrentRequest.class,
      responseType = org.example.stub.Bank.ConvertCurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse> getConvertMethod;
    if ((getConvertMethod = BanqueServiceGrpc.getConvertMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getConvertMethod = BanqueServiceGrpc.getConvertMethod) == null) {
          BanqueServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getGetCurrentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentStream",
      requestType = org.example.stub.Bank.ConvertCurrentRequest.class,
      responseType = org.example.stub.Bank.ConvertCurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getGetCurrentStreamMethod() {
    io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse> getGetCurrentStreamMethod;
    if ((getGetCurrentStreamMethod = BanqueServiceGrpc.getGetCurrentStreamMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getGetCurrentStreamMethod = BanqueServiceGrpc.getGetCurrentStreamMethod) == null) {
          BanqueServiceGrpc.getGetCurrentStreamMethod = getGetCurrentStreamMethod = 
              io.grpc.MethodDescriptor.<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "getCurrentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("getCurrentStream"))
                  .build();
          }
        }
     }
     return getGetCurrentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = org.example.stub.Bank.ConvertCurrentRequest.class,
      responseType = org.example.stub.Bank.ConvertCurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = BanqueServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getPerformStreamMethod = BanqueServiceGrpc.getPerformStreamMethod) == null) {
          BanqueServiceGrpc.getPerformStreamMethod = getPerformStreamMethod = 
              io.grpc.MethodDescriptor.<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getFullStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullStream",
      requestType = org.example.stub.Bank.ConvertCurrentRequest.class,
      responseType = org.example.stub.Bank.ConvertCurrentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest,
      org.example.stub.Bank.ConvertCurrentResponse> getFullStreamMethod() {
    io.grpc.MethodDescriptor<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse> getFullStreamMethod;
    if ((getFullStreamMethod = BanqueServiceGrpc.getFullStreamMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getFullStreamMethod = BanqueServiceGrpc.getFullStreamMethod) == null) {
          BanqueServiceGrpc.getFullStreamMethod = getFullStreamMethod = 
              io.grpc.MethodDescriptor.<org.example.stub.Bank.ConvertCurrentRequest, org.example.stub.Bank.ConvertCurrentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "fullStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.stub.Bank.ConvertCurrentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("fullStream"))
                  .build();
          }
        }
     }
     return getFullStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BanqueServiceStub newStub(io.grpc.Channel channel) {
    return new BanqueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BanqueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BanqueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BanqueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BanqueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BanqueServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(org.example.stub.Bank.ConvertCurrentRequest request,
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentStream(org.example.stub.Bank.ConvertCurrentRequest request,
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentRequest> performStream(
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentRequest> fullStream(
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.stub.Bank.ConvertCurrentRequest,
                org.example.stub.Bank.ConvertCurrentResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrentStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.stub.Bank.ConvertCurrentRequest,
                org.example.stub.Bank.ConvertCurrentResponse>(
                  this, METHODID_GET_CURRENT_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.stub.Bank.ConvertCurrentRequest,
                org.example.stub.Bank.ConvertCurrentResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.stub.Bank.ConvertCurrentRequest,
                org.example.stub.Bank.ConvertCurrentResponse>(
                  this, METHODID_FULL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BanqueServiceStub extends io.grpc.stub.AbstractStub<BanqueServiceStub> {
    private BanqueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(org.example.stub.Bank.ConvertCurrentRequest request,
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentStream(org.example.stub.Bank.ConvertCurrentRequest request,
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentRequest> performStream(
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentRequest> fullStream(
        io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getFullStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BanqueServiceBlockingStub extends io.grpc.stub.AbstractStub<BanqueServiceBlockingStub> {
    private BanqueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.stub.Bank.ConvertCurrentResponse convert(org.example.stub.Bank.ConvertCurrentRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.stub.Bank.ConvertCurrentResponse> getCurrentStream(
        org.example.stub.Bank.ConvertCurrentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrentStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BanqueServiceFutureStub extends io.grpc.stub.AbstractStub<BanqueServiceFutureStub> {
    private BanqueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.stub.Bank.ConvertCurrentResponse> convert(
        org.example.stub.Bank.ConvertCurrentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENT_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BanqueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BanqueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((org.example.stub.Bank.ConvertCurrentRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENT_STREAM:
          serviceImpl.getCurrentStream((org.example.stub.Bank.ConvertCurrentRequest) request,
              (io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse>) responseObserver);
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
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse>) responseObserver);
        case METHODID_FULL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullStream(
              (io.grpc.stub.StreamObserver<org.example.stub.Bank.ConvertCurrentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BanqueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BanqueService");
    }
  }

  private static final class BanqueServiceFileDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier {
    BanqueServiceFileDescriptorSupplier() {}
  }

  private static final class BanqueServiceMethodDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BanqueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BanqueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BanqueServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrentStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
