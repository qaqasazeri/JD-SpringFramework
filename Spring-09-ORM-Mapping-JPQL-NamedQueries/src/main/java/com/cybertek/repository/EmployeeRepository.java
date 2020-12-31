package com.cybertek.repository;


import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("Select e from Employee e where e.email='dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("Select e.salary from Employee e where e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    //Single bind parameter

    @Query("Select e from Employee e where e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);

    //Multiple bind parameter
    @Query("Select e from Employee e where e.email=?1 and e.salary=?2")
    Optional<Employee> getEmployeeByEmailAndSalary(String email, int salary);

    //Single named parameter
    @Query("Select e from Employee e where e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    //Multiple named parameter

    @Query("Select e from Employee e where e.salary=:salary or e.firstname=:firstname")
    List<Employee> getEmployeeByFirstnameOrSalary(@Param("salary") int salary, @Param("firstname") String firstName);

    //Not equal
    @Query("Select e from Employee e where e.salary<>?1")
    Employee getEmployeeBySalaryNotEqual(int salary);

    //Like, Contains, starts With, Ends with

    @Query("Select e from Employee e where e.firstname LIKE ?1")
    List<Employee> getEmployeeByFirstnameLike(String pattern);

    //Less than
    @Query("Select e from Employee e where e.salary<?1")
    List<Employee> getEmployeeBySalaryLessThan(int salary);

    //Greater than
    @Query("Select e from Employee e where e.salary>?1")
    List<Employee> getEmployeeBySalaryGreaterThan(int salary);


    //Between
    @Query("Select e from Employee e where e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeBySalaryBetween(int salary1, int salary2);


    //Before
    @Query("Select e from Employee e where e.hireDate>?1")
    List<Employee> getEmployeeByHireDateBefore(LocalDate date);

    //Null
    @Query("Select e from Employee e where e.email is null ")
    List<Employee> getEmployeeByEmailIsNull();

    //Not Null
    @Query("Select e from Employee e where e.email is not null ")
    List<Employee> getEmployeeByEmailIsNotNull();

    //Sort salary by acsending order

    @Query("Select e from Employee e order by e.salary")
    List<Employee> getEmployeeBySalaryOrderByAscending();

    //Sort salary by descending order

    @Query("Select e from Employee e order by e.salary DESC")
    List<Employee> getEmployeeBySalaryOrderByDescending();


    //Native query runs on db tables not on Entity
    @Query(value="Select * from employees where salary=?1",nativeQuery = true)
    List<Employee> readEmployeeSalary(int salary);

    //Update

    @Modifying
    @Transactional
    @Query("Update Employee e set e.email='sf@gamil.com' where e.id=:id")
     void updateEmployeeJPQL(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value="Update Employee e set e.email='sf@gmail.com' where e.id=:id",nativeQuery = true)
    void updateEmployeeNativeQuery(@Param("id") Integer id);

    //native query

    List<Employee> retrieveEmployeeBySalaryGreaterThan(int salary);
}
