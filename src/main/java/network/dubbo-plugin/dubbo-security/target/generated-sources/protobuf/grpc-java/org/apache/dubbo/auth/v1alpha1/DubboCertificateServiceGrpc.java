package org.apache.dubbo.auth.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ca.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DubboCertificateServiceGrpc {

  private DubboCertificateServiceGrpc() {}

  public static final String SERVICE_NAME = "org.apache.dubbo.auth.v1alpha1.DubboCertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest,
      org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> getCreateCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCertificate",
      requestType = org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest.class,
      responseType = org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest,
      org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> getCreateCertificateMethod() {
    io.grpc.MethodDescriptor<org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest, org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> getCreateCertificateMethod;
    if ((getCreateCertificateMethod = DubboCertificateServiceGrpc.getCreateCertificateMethod) == null) {
      synchronized (DubboCertificateServiceGrpc.class) {
        if ((getCreateCertificateMethod = DubboCertificateServiceGrpc.getCreateCertificateMethod) == null) {
          DubboCertificateServiceGrpc.getCreateCertificateMethod = getCreateCertificateMethod =
              io.grpc.MethodDescriptor.<org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest, org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DubboCertificateServiceMethodDescriptorSupplier("CreateCertificate"))
              .build();
        }
      }
    }
    return getCreateCertificateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DubboCertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceStub>() {
        @java.lang.Override
        public DubboCertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DubboCertificateServiceStub(channel, callOptions);
        }
      };
    return DubboCertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DubboCertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceBlockingStub>() {
        @java.lang.Override
        public DubboCertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DubboCertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return DubboCertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DubboCertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DubboCertificateServiceFutureStub>() {
        @java.lang.Override
        public DubboCertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DubboCertificateServiceFutureStub(channel, callOptions);
        }
      };
    return DubboCertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCertificate(org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCertificateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DubboCertificateService.
   */
  public static abstract class DubboCertificateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DubboCertificateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DubboCertificateService.
   */
  public static final class DubboCertificateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DubboCertificateServiceStub> {
    private DubboCertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DubboCertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DubboCertificateServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCertificate(org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest request,
        io.grpc.stub.StreamObserver<org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCertificateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DubboCertificateService.
   */
  public static final class DubboCertificateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DubboCertificateServiceBlockingStub> {
    private DubboCertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DubboCertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DubboCertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse createCertificate(org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCertificateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DubboCertificateService.
   */
  public static final class DubboCertificateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DubboCertificateServiceFutureStub> {
    private DubboCertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DubboCertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DubboCertificateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse> createCertificate(
        org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCertificateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CERTIFICATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CERTIFICATE:
          serviceImpl.createCertificate((org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateCertificateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.apache.dubbo.auth.v1alpha1.DubboCertificateRequest,
              org.apache.dubbo.auth.v1alpha1.DubboCertificateResponse>(
                service, METHODID_CREATE_CERTIFICATE)))
        .build();
  }

  private static abstract class DubboCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DubboCertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.dubbo.auth.v1alpha1.Ca.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DubboCertificateService");
    }
  }

  private static final class DubboCertificateServiceFileDescriptorSupplier
      extends DubboCertificateServiceBaseDescriptorSupplier {
    DubboCertificateServiceFileDescriptorSupplier() {}
  }

  private static final class DubboCertificateServiceMethodDescriptorSupplier
      extends DubboCertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DubboCertificateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DubboCertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DubboCertificateServiceFileDescriptorSupplier())
              .addMethod(getCreateCertificateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
