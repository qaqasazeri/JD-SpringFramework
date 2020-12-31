package com.cybertek.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name="departments")
@NamedQuery(name="Department.findSFDepartments",
             query = "Select d from Department d WHERE d.division=?1")

@NamedNativeQuery(name="Department.countAllDepartments",
        query = "Select * from departments",resultClass=Department.class)

public class Department{

    @Id
    private String department;
    private String division;
}
