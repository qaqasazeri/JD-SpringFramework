package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // display all employees with email address

    List<Employee> findByEmail(String email);

    // display all employees with Firstname and Last name, also show all employees with email address
    List<Employee> findByFirstnameAndLastnameOrEmail(String firstName, String lastName, String email);

    // display all employees with Firstname not something
    List<Employee> findByFirstnameIsNot(String firstName);

    // display all employees where lastname starts something

    List<Employee> findByLastNameStartsWith(String pattern);

    // display all employees with salaries higher than something
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // display all employees with salaries less than equal something
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    // display all employees hired between 2010,6,1 and 2013,12,30
    List<Employee> findByHiAndHireDateBetween(LocalDate startDate, LocalDate endDate);

    // display all employees with salaries higher than or equal to something in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDepartmentDesc(Integer salary);

    //Display top uniques employees that is making less than

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);


    //Display all employees that don`t have email address
    @Transactional
    List<Employee> findByEmailIsNull();

}
