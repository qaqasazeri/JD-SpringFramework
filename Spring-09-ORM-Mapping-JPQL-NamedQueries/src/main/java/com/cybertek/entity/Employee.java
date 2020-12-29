package com.cybertek.entity;

import com.cybertek.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="employees")
public class Employee extends BaseEntity {

    @Column(name="first_name")
    private  String firstname;

    @Column(name="last_name")
    private  String lastname;

    @Column(name="email")
    private  String email;

    @Column(columnDefinition="DATE")
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Integer salary;

    @ManyToOne
    @JoinColumn(name="department")
    private Department department;

    @ManyToOne
    private Region region;


}
