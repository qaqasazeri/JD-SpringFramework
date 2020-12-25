package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Location extends BaseEntity{
    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String country;
    private String state;
    private String city;
    private String postalCode;
    private String address;

    public Location(String name, BigDecimal latitude, BigDecimal longitude, String country, String state, String city, String postalCode, String address) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.state = state;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
    }
}
