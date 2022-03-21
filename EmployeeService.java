package com.Employees.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Employees.Entity.Employee;
@Component
@Service
public interface EmployeeService {
	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(int id);

	public Employee AddorUpdateEmployee(Employee employee);

	public Employee deleteId(int id) throws Exception ;

}