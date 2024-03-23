package com.itarhitekture;

import static com.itarhitekture.ReservationGrpcGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: reservation.proto")
public final class MutinyReservationGrpcGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyReservationGrpcGrpc() {
    }

    public static MutinyReservationGrpcStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyReservationGrpcStub(channel);
    }

    public static class MutinyReservationGrpcStub extends io.grpc.stub.AbstractStub<MutinyReservationGrpcStub> implements io.quarkus.grpc.MutinyStub {

        private ReservationGrpcGrpc.ReservationGrpcStub delegateStub;

        private MutinyReservationGrpcStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ReservationGrpcGrpc.newStub(channel);
        }

        private MutinyReservationGrpcStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ReservationGrpcGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyReservationGrpcStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyReservationGrpcStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getReservations);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getReservationByRestaurantId);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getReservationByCustomerId);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createReservation);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateReservation);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteReservation);
        }
    }

    public static abstract class ReservationGrpcImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ReservationGrpcImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(com.itarhitekture.ReservationGrpcGrpc.getGetReservationsMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.EmptyRequest, com.itarhitekture.ReservationList>(this, METHODID_GET_RESERVATIONS, compression))).addMethod(com.itarhitekture.ReservationGrpcGrpc.getGetReservationByRestaurantIdMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.RestaurantIdRequest, com.itarhitekture.ReservationList>(this, METHODID_GET_RESERVATION_BY_RESTAURANT_ID, compression))).addMethod(com.itarhitekture.ReservationGrpcGrpc.getGetReservationByCustomerIdMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.CustomerIdRequest, com.itarhitekture.ReservationList>(this, METHODID_GET_RESERVATION_BY_CUSTOMER_ID, compression))).addMethod(com.itarhitekture.ReservationGrpcGrpc.getCreateReservationMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.CreateReservationRequest, com.itarhitekture.Reservation>(this, METHODID_CREATE_RESERVATION, compression))).addMethod(com.itarhitekture.ReservationGrpcGrpc.getUpdateReservationMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.UpdateReservationRequest, com.itarhitekture.Reservation>(this, METHODID_UPDATE_RESERVATION, compression))).addMethod(com.itarhitekture.ReservationGrpcGrpc.getDeleteReservationMethod(), asyncUnaryCall(new MethodHandlers<com.itarhitekture.DeleteReservationRequest, com.itarhitekture.EmptyResponse>(this, METHODID_DELETE_RESERVATION, compression))).build();
        }
    }

    private static final int METHODID_GET_RESERVATIONS = 0;

    private static final int METHODID_GET_RESERVATION_BY_RESTAURANT_ID = 1;

    private static final int METHODID_GET_RESERVATION_BY_CUSTOMER_ID = 2;

    private static final int METHODID_CREATE_RESERVATION = 3;

    private static final int METHODID_UPDATE_RESERVATION = 4;

    private static final int METHODID_DELETE_RESERVATION = 5;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>, io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ReservationGrpcImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(ReservationGrpcImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                case METHODID_GET_RESERVATIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.EmptyRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver, compression, serviceImpl::getReservations);
                    break;
                case METHODID_GET_RESERVATION_BY_RESTAURANT_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.RestaurantIdRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver, compression, serviceImpl::getReservationByRestaurantId);
                    break;
                case METHODID_GET_RESERVATION_BY_CUSTOMER_ID:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.CustomerIdRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.ReservationList>) responseObserver, compression, serviceImpl::getReservationByCustomerId);
                    break;
                case METHODID_CREATE_RESERVATION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.CreateReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.Reservation>) responseObserver, compression, serviceImpl::createReservation);
                    break;
                case METHODID_UPDATE_RESERVATION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.UpdateReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.Reservation>) responseObserver, compression, serviceImpl::updateReservation);
                    break;
                case METHODID_DELETE_RESERVATION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((com.itarhitekture.DeleteReservationRequest) request, (io.grpc.stub.StreamObserver<com.itarhitekture.EmptyResponse>) responseObserver, compression, serviceImpl::deleteReservation);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch(methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
