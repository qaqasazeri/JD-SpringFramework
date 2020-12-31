package com.cybertek.repository;

import com.cybertek.entity.Department;
import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,String> {

    @Query("Select d from Department d where d.division=?1")
    List<Department> getDepartmentByDivisionIn(List<String>divisions);

    List<Department> retrieveDepartmentByDivisionIn(List<String>divisions);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContains(String pattern);

    List<Department> findSFDepartment(String id);

    List<Department> countOfAllDepartments();
}
