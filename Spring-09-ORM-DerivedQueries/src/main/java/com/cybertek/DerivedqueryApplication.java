package com.cybertek;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import com.cybertek.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DerivedqueryApplication {

    @Autowired
    RegionRepository regionRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;
    public static void main(String[] args) {
        SpringApplication.run(DerivedqueryApplication.class, args);
    }

    @PostConstruct
    public void testRegions(){

       /* System.out.println("-----Regions Start-----");
        System.out.println("findByCountry"+ regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry"+ regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryContaining"+ regionRepository.findByCountryContaining("United"));
        System.out.println("findByCountryContainingOrderByCountry"+ regionRepository.findByCountryContainingOrderByCountry("United"));
        System.out.println("findTop2ByCountry"+ regionRepository.findTop2ByCountry("Canada"));
        System.out.println("-----End of Regions-----");*/




    }
    @PostConstruct
    public void testDepartment(){
/*

        System.out.println("-----Department  Start-----");
        System.out.println("findByDepartment"+ departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDivision"+ departmentRepository.findByDivision("Outdoors"));
        System.out.println("findByDivisionIs"+ departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findByDivisionEquals"+ departmentRepository.findByDivisionEquals("Outdoors"));
        System.out.println("findByDivisionEndingWith"+ departmentRepository.findByDivisionEndingWith("ics"));
        System.out.println("findDistinctTop3ByDivisionContains"+ departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("-----End of Department-----");
*/


    }

    @PostConstruct
    public void testEmployee(){

        System.out.println("-----Employee  Start-----");
       // System.out.println("findByEmail"+ employeeRepository.findByEmail("Toys"));

        System.out.println("findByEmailIsNull"+ employeeRepository.findByEmailIsNull());
        System.out.println("-----End of Employee-----");


    }
}
