package com.itarhitekture;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: reservation.proto")
public class ReservationGrpcBean extends MutinyReservationGrpcGrpc.ReservationGrpcImplBase implements BindableService, MutinyBean {

    private final ReservationGrpc delegate;

    ReservationGrpcBean(@GrpcService ReservationGrpc delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request) {
        try {
            return delegate.getReservations(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
        try {
            return delegate.getReservationByRestaurantId(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
        try {
            return delegate.getReservationByCustomerId(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request) {
        try {
            return delegate.createReservation(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request) {
        try {
            return delegate.updateReservation(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
        try {
            return delegate.deleteReservation(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
