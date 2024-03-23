package com.itarhitekture;

import java.util.function.BiFunction;
import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: reservation.proto")
public class ReservationGrpcClient implements ReservationGrpc, MutinyClient<MutinyReservationGrpcGrpc.MutinyReservationGrpcStub> {

    private final MutinyReservationGrpcGrpc.MutinyReservationGrpcStub stub;

    public ReservationGrpcClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyReservationGrpcGrpc.MutinyReservationGrpcStub, MutinyReservationGrpcGrpc.MutinyReservationGrpcStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyReservationGrpcGrpc.newMutinyStub(channel));
    }

    private ReservationGrpcClient(MutinyReservationGrpcGrpc.MutinyReservationGrpcStub stub) {
        this.stub = stub;
    }

    public ReservationGrpcClient newInstanceWithStub(MutinyReservationGrpcGrpc.MutinyReservationGrpcStub stub) {
        return new ReservationGrpcClient(stub);
    }

    @Override
    public MutinyReservationGrpcGrpc.MutinyReservationGrpcStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservations(com.itarhitekture.EmptyRequest request) {
        return stub.getReservations(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByRestaurantId(com.itarhitekture.RestaurantIdRequest request) {
        return stub.getReservationByRestaurantId(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.ReservationList> getReservationByCustomerId(com.itarhitekture.CustomerIdRequest request) {
        return stub.getReservationByCustomerId(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> createReservation(com.itarhitekture.CreateReservationRequest request) {
        return stub.createReservation(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.Reservation> updateReservation(com.itarhitekture.UpdateReservationRequest request) {
        return stub.updateReservation(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<com.itarhitekture.EmptyResponse> deleteReservation(com.itarhitekture.DeleteReservationRequest request) {
        return stub.deleteReservation(request);
    }
}
