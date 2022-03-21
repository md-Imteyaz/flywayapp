package com.Employees.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Employees.Entity.Employee;
@Repository
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
