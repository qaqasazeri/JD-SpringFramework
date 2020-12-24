package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List <Address> addresses;

    /*case-1
   @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private List <Address> addresses;*/

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
