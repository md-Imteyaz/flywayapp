package com.Employees.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Employees.Entity.Employee;
import com.Employees.Repo.EmployeeRepo;
import com.Employees.service.EmployeeService;
@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public Employee AddorUpdateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee deleteId(int id) throws Exception {
		Employee deleteEmployee = null;
		try {
			deleteEmployee = employeeRepo.findById(id).orElse(null);
			if (deleteEmployee == null) {
				throw new Exception("Employee is not available");
			} else {
				employeeRepo.deleteById(id);
			}

		} catch (Exception ex) {
			throw ex;

		}
		return deleteEmployee;
	}

}
