package com.example.hotels.remote.rest.dto.response;

import java.util.List;

public class HotelsCollectionDto {
    private List<HotelsDto> hotels;

    public HotelsCollectionDto() {
    }

    public List<HotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }

    public HotelsCollectionDto(List<HotelsDto> hotels) {
        this.hotels = hotels;
    }
}
