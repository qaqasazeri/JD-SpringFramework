package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long id;

    private String zipCode;
    private  String street;

    @ManyToOne()
    private Person person;

    public Address(String zipCode, String street) {
        this.zipCode = zipCode;
        this.street = street;
    }
}
