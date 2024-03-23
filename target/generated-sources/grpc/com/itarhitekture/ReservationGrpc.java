package com.itarhitekture;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: reservation.proto")
public interface ReservationGrpc extends MutinyService {

    io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request);

    io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request);

    io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request);

    io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request);

    io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request);

    io.smallrye.mutiny.Uni<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request);
}
