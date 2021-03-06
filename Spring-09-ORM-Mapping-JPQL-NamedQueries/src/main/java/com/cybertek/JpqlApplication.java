package com.cybertek;

import com.cybertek.repository.DepartmentRepository;
import com.cybertek.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JpqlApplication {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpqlApplication.class, args);}

        @PostConstruct
        public void testEmployee(){
            /*System.out.println("getEmployeeDetail: "+employeeRepository.getEmployeeDetail());
            System.out.println("getEmployeeSalary: "+employeeRepository.getEmployeeSalary());
            System.out.println("getEmployeeByEmail: "+employeeRepository.getEmployeeByEmail("myakovlivf@ucsd.edu").get());
            System.out.println("Single Named getEmployeeBySalary: "+employeeRepository.getEmployeeBySalary(82753));
            System.out.println("Multi Named getEmployeeByFirstnameOrSalary: "+employeeRepository.getEmployeeByFirstnameOrSalary(82753,"Feliks"));
            employeeRepository.updateEmployeeJPQL(1);
            employeeRepository.updateEmployeeNativeQuery(1);*/

         //   System.out.println("Salary Greater than: "+employeeRepository.retrieveEmployeeBySalaryGreaterThan(100000));
          //  System.out.println("Query from Entity: "+departmentRepository.findSFDepartment("Kids"));
            System.out.println("Count all departments: "+departmentRepository.countOfAllDepartments());

        }
}
