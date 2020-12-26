package com.cybertek.repository;

import com.cybertek.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {

    //display all departments in the furniture department
    List<Department> findByDepartment(String department);

    //display all departments in Health division
    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //display all departments in division nme ends with %ics
    List<Department> findByDivisionEndingWith(String pattern);

    //display top 3 departments with division name includes "Hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

}
