package com.itarhitekture.repository;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class ReservationEntity extends PanacheMongoEntity {
    public String reservationId;
    public String restaurantId;
    public String customerId;
    public String date;
}