package com.example.hotels.remote.rest.dto.response;

import java.math.BigDecimal;

public class RoomsDto {
    private Integer id;
    private String beds;
    private BigDecimal price;

    public RoomsDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public RoomsDto(Integer id, String beds, BigDecimal price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }
}
