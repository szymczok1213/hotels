package com.example.hotels.remote.rest.dto.request;

public class DeleteReservation {
    private Integer id;

    public DeleteReservation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeleteReservation(Integer id) {
        this.id = id;
    }
}
