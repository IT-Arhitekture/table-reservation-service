package com.itarhitekture;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.itarhitekture.repository.ReservationEntity;
import org.apache.logging.log4j.Logger;

@GrpcService
public class ReservationGrpcService implements ReservationGrpc {

    private static final Logger logger = LogManager.getLogger(ReservationGrpcService.class);

    @Override
    public Uni<ReservationList> getReservations(EmptyRequest request) {
        logger.info("/getReservations");
        List<Reservation> reservations = new ArrayList<>();
        ReservationEntity.listAll().stream()
                .forEach(entity -> reservations.add(toReservation((ReservationEntity) entity)));
        ReservationList list = ReservationList.newBuilder().addAllReservations(reservations).build();
        return Uni.createFrom().item(list);
    }


    @Override
    public Uni<ReservationList> getReservationByRestaurantId(RestaurantIdRequest request) {
        logger.info("/getReservationsByRestaurantId : id :"+ request.getRestaurantId());
        List<Reservation> filteredReservations = new ArrayList<>();
        ReservationEntity.find("restaurantId", request.getRestaurantId()).stream()
                .forEach(entity -> filteredReservations.add(toReservation((ReservationEntity) entity)));
        ReservationList list = ReservationList.newBuilder().addAllReservations(filteredReservations).build();
        return Uni.createFrom().item(list);
    }

    @Override
    public Uni<ReservationList> getReservationByCustomerId(CustomerIdRequest request) {
        logger.info("/getReservationsByCustomerId : id :"+ request.getCustomerId());
        List<Reservation> filteredReservations = new ArrayList<>();
        ReservationEntity.find("customerId", request.getCustomerId()).stream()
                .forEach(entity -> filteredReservations.add(toReservation((ReservationEntity) entity)));
        ReservationList list = ReservationList.newBuilder().addAllReservations(filteredReservations).build();
        return Uni.createFrom().item(list);
    }

    @Override
    public Uni<Reservation> createReservation(CreateReservationRequest request) {
        logger.info("/createReservation : id :"+ request.getDateBytes());
        ReservationEntity newReservationEntity = new ReservationEntity();
        newReservationEntity.reservationId = String.valueOf(ReservationEntity.count() + 1);
        newReservationEntity.restaurantId = request.getRestaurantId();
        newReservationEntity.customerId = request.getCustomerId();
        newReservationEntity.date = request.getDate();
        newReservationEntity.persist();
        return Uni.createFrom().item(toReservation(newReservationEntity));
    }

    @Override
    public Uni<Reservation> updateReservation(UpdateReservationRequest request) {
        logger.info("/updateReservation : id :"+ request.getDateBytes());
        ReservationEntity reservationToUpdate = ReservationEntity.findById(request.getReservationId());
        if (reservationToUpdate != null) {
            reservationToUpdate.restaurantId = request.getRestaurantId();
            reservationToUpdate.customerId = request.getCustomerId();
            reservationToUpdate.date = request.getDate();
            reservationToUpdate.persistOrUpdate();
        }
        return Uni.createFrom().item(toReservation(reservationToUpdate));
    }

    @Override
    public Uni<EmptyResponse> deleteReservation(DeleteReservationRequest request) {
        logger.info("/deleteReservation : id :"+ request.getReservationId());
        ReservationEntity reservationToDelete = ReservationEntity.findById(request.getReservationId());
        if (reservationToDelete != null) {
            reservationToDelete.delete();
        }
        return Uni.createFrom().item(EmptyResponse.newBuilder().build());
    }

    private Reservation toReservation(ReservationEntity entity) {
        return Reservation.newBuilder()
                .setReservationId(entity.reservationId)
                .setRestaurantId(entity.restaurantId)
                .setCustomerId(entity.customerId)
                .setDate(entity.date)
                .build();
    }
}