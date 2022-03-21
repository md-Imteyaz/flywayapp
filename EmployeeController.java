package com.Employees.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employees.Entity.Employee;
import com.Employees.service.EmployeeService;
@Component
@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping("/allEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> employee = null;
		try {
			employee = employeeservice.getAllEmployee();
		} catch (Exception ex) {
			ex.getStackTrace();

		}

		return new ResponseEntity<List<Employee>>(employee, HttpStatus.OK);

	}

	@GetMapping("/getEmployeeById")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) {
		Employee employee = null;
		try {
			employee = employeeservice.getEmployeeById(id);
		} catch (Exception ex) {
			ex.getMessage();

		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}

	@PostMapping("/addorUpdateemployee")
	public ResponseEntity<Employee> addorUpadateNote(@RequestBody Employee employee) {
		Employee employees = null;
		try {
			employee = employeeservice.AddorUpdateEmployee(employee);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteId(@PathVariable("id") int id) {
		Employee employee = null;
		try {
			employee = employeeservice.deleteId(id);

		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

}
