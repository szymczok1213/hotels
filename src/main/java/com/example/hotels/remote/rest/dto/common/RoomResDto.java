package com.example.hotels.remote.rest.dto.common;

public class RoomResDto {
    private Integer id;
    private Integer roomId;
    private Integer days;

    public RoomResDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public RoomResDto(Integer id, Integer roomId, Integer days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }
}