package com.itarhitekture;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.1)", comments = "Source: reservation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationGrpcGrpc {

    private ReservationGrpcGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "ReservationGrpc";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList> getGetReservationsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getReservations", requestType = com.itarhitekture.EmptyRequest.class, responseType = com.itarhitekture.ReservationList.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList> getGetReservationsMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList> getGetReservationsMethod;
        if ((getGetReservationsMethod = ReservationGrpcGrpc.getGetReservationsMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getGetReservationsMethod = ReservationGrpcGrpc.getGetReservationsMethod) == null) {
                    ReservationGrpcGrpc.getGetReservationsMethod = getGetReservationsMethod = io.grpc.MethodDescriptor.<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservations")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.EmptyRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.ReservationList.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("getReservations")).build();
                }
            }
        }
        return getGetReservationsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList> getGetReservationByRestaurantIdMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getReservationByRestaurantId", requestType = com.itarhitekture.RestaurantIdRequest.class, responseType = com.itarhitekture.ReservationList.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList> getGetReservationByRestaurantIdMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList> getGetReservationByRestaurantIdMethod;
        if ((getGetReservationByRestaurantIdMethod = ReservationGrpcGrpc.getGetReservationByRestaurantIdMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getGetReservationByRestaurantIdMethod = ReservationGrpcGrpc.getGetReservationByRestaurantIdMethod) == null) {
                    ReservationGrpcGrpc.getGetReservationByRestaurantIdMethod = getGetReservationByRestaurantIdMethod = io.grpc.MethodDescriptor.<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationByRestaurantId")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.RestaurantIdRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.ReservationList.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("getReservationByRestaurantId")).build();
                }
            }
        }
        return getGetReservationByRestaurantIdMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList> getGetReservationByCustomerIdMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "getReservationByCustomerId", requestType = com.itarhitekture.CustomerIdRequest.class, responseType = com.itarhitekture.ReservationList.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList> getGetReservationByCustomerIdMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList> getGetReservationByCustomerIdMethod;
        if ((getGetReservationByCustomerIdMethod = ReservationGrpcGrpc.getGetReservationByCustomerIdMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getGetReservationByCustomerIdMethod = ReservationGrpcGrpc.getGetReservationByCustomerIdMethod) == null) {
                    ReservationGrpcGrpc.getGetReservationByCustomerIdMethod = getGetReservationByCustomerIdMethod = io.grpc.MethodDescriptor.<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "getReservationByCustomerId")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.CustomerIdRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.ReservationList.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("getReservationByCustomerId")).build();
                }
            }
        }
        return getGetReservationByCustomerIdMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation> getCreateReservationMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "createReservation", requestType = com.itarhitekture.CreateReservationRequest.class, responseType = com.itarhitekture.Reservation.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation> getCreateReservationMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation> getCreateReservationMethod;
        if ((getCreateReservationMethod = ReservationGrpcGrpc.getCreateReservationMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getCreateReservationMethod = ReservationGrpcGrpc.getCreateReservationMethod) == null) {
                    ReservationGrpcGrpc.getCreateReservationMethod = getCreateReservationMethod = io.grpc.MethodDescriptor.<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "createReservation")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.CreateReservationRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.Reservation.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("createReservation")).build();
                }
            }
        }
        return getCreateReservationMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation> getUpdateReservationMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "updateReservation", requestType = com.itarhitekture.UpdateReservationRequest.class, responseType = com.itarhitekture.Reservation.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation> getUpdateReservationMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation> getUpdateReservationMethod;
        if ((getUpdateReservationMethod = ReservationGrpcGrpc.getUpdateReservationMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getUpdateReservationMethod = ReservationGrpcGrpc.getUpdateReservationMethod) == null) {
                    ReservationGrpcGrpc.getUpdateReservationMethod = getUpdateReservationMethod = io.grpc.MethodDescriptor.<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateReservation")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.UpdateReservationRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.Reservation.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("updateReservation")).build();
                }
            }
        }
        return getUpdateReservationMethod;
    }

    private static volatile io.grpc.MethodDescriptor<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse> getDeleteReservationMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/' + "deleteReservation", requestType = com.itarhitekture.DeleteReservationRequest.class, responseType = com.itarhitekture.EmptyResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse> getDeleteReservationMethod() {
        io.grpc.MethodDescriptor<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse> getDeleteReservationMethod;
        if ((getDeleteReservationMethod = ReservationGrpcGrpc.getDeleteReservationMethod) == null) {
            synchronized (ReservationGrpcGrpc.class) {
                if ((getDeleteReservationMethod = ReservationGrpcGrpc.getDeleteReservationMethod) == null) {
                    ReservationGrpcGrpc.getDeleteReservationMethod = getDeleteReservationMethod = io.grpc.MethodDescriptor.<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse>newBuilder().setType(io.grpc.MethodDescriptor.MethodType.UNARY).setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteReservation")).setSampledToLocalTracing(true).setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.DeleteReservationRequest.getDefaultInstance())).setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.itarhitekture.EmptyResponse.getDefaultInstance())).setSchemaDescriptor(new ReservationGrpcMethodDescriptorSupplier("deleteReservation")).build();
                }
            }
        }
        return getDeleteReservationMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static ReservationGrpcStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcStub>() {

            @java.lang.Override
            public ReservationGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReservationGrpcStub(channel, callOptions);
            }
        };
        return ReservationGrpcStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static ReservationGrpcBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcBlockingStub>() {

            @java.lang.Override
            public ReservationGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReservationGrpcBlockingStub(channel, callOptions);
            }
        };
        return ReservationGrpcBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static ReservationGrpcFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ReservationGrpcFutureStub>() {

            @java.lang.Override
            public ReservationGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ReservationGrpcFutureStub(channel, callOptions);
            }
        };
        return ReservationGrpcFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void getReservations(com.itarhitekture.EmptyRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationsMethod(), responseObserver);
        }

        /**
         */
        default void getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByRestaurantIdMethod(), responseObserver);
        }

        /**
         */
        default void getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByCustomerIdMethod(), responseObserver);
        }

        /**
         */
        default void createReservation(com.itarhitekture.CreateReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.Reservation> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
        }

        /**
         */
        default void updateReservation(com.itarhitekture.UpdateReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.Reservation> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
        }

        /**
         */
        default void deleteReservation(com.itarhitekture.DeleteReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.EmptyResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service ReservationGrpc.
     */
    public static abstract class ReservationGrpcImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return ReservationGrpcGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service ReservationGrpc.
     */
    public static class ReservationGrpcStub extends io.grpc.stub.AbstractAsyncStub<ReservationGrpcStub> {

        private ReservationGrpcStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReservationGrpcStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReservationGrpcStub(channel, callOptions);
        }

        /**
         */
        public void getReservations(com.itarhitekture.EmptyRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetReservationByRestaurantIdMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetReservationByCustomerIdMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void createReservation(com.itarhitekture.CreateReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.Reservation> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void updateReservation(com.itarhitekture.UpdateReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.Reservation> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         */
        public void deleteReservation(com.itarhitekture.DeleteReservationRequest request, io.grpc.stub.StreamObserver<com.itarhitekture.EmptyResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service ReservationGrpc.
     */
    public static class ReservationGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<ReservationGrpcBlockingStub> {

        private ReservationGrpcBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReservationGrpcBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReservationGrpcBlockingStub(channel, callOptions);
        }

        /**
         */
        public com.itarhitekture.ReservationList getReservations(com.itarhitekture.EmptyRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetReservationsMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.itarhitekture.ReservationList getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetReservationByRestaurantIdMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.itarhitekture.ReservationList getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetReservationByCustomerIdMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.itarhitekture.Reservation createReservation(com.itarhitekture.CreateReservationRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateReservationMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.itarhitekture.Reservation updateReservation(com.itarhitekture.UpdateReservationRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
        }

        /**
         */
        public com.itarhitekture.EmptyResponse deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationGrpc.
     */
    public static class ReservationGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<ReservationGrpcFutureStub> {

        private ReservationGrpcFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ReservationGrpcFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReservationGrpcFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetReservationByRestaurantIdMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetReservationByCustomerIdMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_GET_RESERVATIONS = 0;

    private static final int METHODID_GET_RESERVATION_BY_RESTAURANT_ID = 1;

    private static final int METHODID_GET_RESERVATION_BY_CUSTOMER_ID = 2;

    private static final int METHODID_CREATE_RESERVATION = 3;

    private static final int METHODID_UPDATE_RESERVATION = 4;

    private static final int METHODID_DELETE_RESERVATION = 5;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_RESERVATIONS:
                    serviceImpl.getReservations((com.itarhitekture.EmptyRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver);
                    break;
                case METHODID_GET_RESERVATION_BY_RESTAURANT_ID:
                    serviceImpl.getReservationByRestaurantId((com.itarhitekture.RestaurantIdRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver);
                    break;
                case METHODID_GET_RESERVATION_BY_CUSTOMER_ID:
                    serviceImpl.getReservationByCustomerId((com.itarhitekture.CustomerIdRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver);
                    break;
                case METHODID_CREATE_RESERVATION:
                    serviceImpl.createReservation((com.itarhitekture.CreateReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.Reservation>) responseObserver);
                    break;
                case METHODID_UPDATE_RESERVATION:
                    serviceImpl.updateReservation((com.itarhitekture.UpdateReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.Reservation>) responseObserver);
                    break;
                case METHODID_DELETE_RESERVATION:
                    serviceImpl.deleteReservation((com.itarhitekture.DeleteReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.EmptyResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getGetReservationsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList>(service, METHODID_GET_RESERVATIONS))).addMethod(getGetReservationByRestaurantIdMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList>(service, METHODID_GET_RESERVATION_BY_RESTAURANT_ID))).addMethod(getGetReservationByCustomerIdMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList>(service, METHODID_GET_RESERVATION_BY_CUSTOMER_ID))).addMethod(getCreateReservationMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation>(service, METHODID_CREATE_RESERVATION))).addMethod(getUpdateReservationMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation>(service, METHODID_UPDATE_RESERVATION))).addMethod(getDeleteReservationMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse>(service, METHODID_DELETE_RESERVATION))).build();
    }

    private static abstract class ReservationGrpcBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        ReservationGrpcBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.itarhitekture.ReservationGrpcProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("ReservationGrpc");
        }
    }

    private static final class ReservationGrpcFileDescriptorSupplier extends ReservationGrpcBaseDescriptorSupplier {

        ReservationGrpcFileDescriptorSupplier() {
        }
    }

    private static final class ReservationGrpcMethodDescriptorSupplier extends ReservationGrpcBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        ReservationGrpcMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (ReservationGrpcGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME).setSchemaDescriptor(new ReservationGrpcFileDescriptorSupplier()).addMethod(getGetReservationsMethod()).addMethod(getGetReservationByRestaurantIdMethod()).addMethod(getGetReservationByCustomerIdMethod()).addMethod(getCreateReservationMethod()).addMethod(getUpdateReservationMethod()).addMethod(getDeleteReservationMethod()).build();
                }
            }
        }
        return result;
    }
}
