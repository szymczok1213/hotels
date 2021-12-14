package com.example.hotels.remote.rest.dto.response;

import com.example.hotels.domain.ReservationStatusType;
import com.example.hotels.remote.rest.dto.common.PersonResDto;
import com.example.hotels.remote.rest.dto.common.RoomResDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusType status;
    private List<RoomResDto> rooms;
    private PersonResDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusType status, List<RoomResDto> rooms, PersonResDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomResDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomResDto> rooms) {
        this.rooms = rooms;
    }

    public PersonResDto getPerson() {
        return person;
    }

    public void setPerson(PersonResDto person) {
        this.person = person;
    }
}