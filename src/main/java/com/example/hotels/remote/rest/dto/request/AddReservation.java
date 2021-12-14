package com.example.hotels.remote.rest.dto.request;


import com.example.hotels.remote.rest.dto.common.PersonResDto;
import com.example.hotels.remote.rest.dto.common.RoomResDto;

import java.util.List;

public class AddReservation {
    private List<RoomResDto> hotels;
    private PersonResDto person;

    public AddReservation() {
    }

    public List<RoomResDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomResDto> hotels) {
        this.hotels = hotels;
    }

    public PersonResDto getPerson() {
        return person;
    }

    public void setPerson(PersonResDto person) {
        this.person = person;
    }

    public AddReservation(List<RoomResDto> hotels, PersonResDto person) {
        this.hotels = hotels;
        this.person = person;
    }
}
