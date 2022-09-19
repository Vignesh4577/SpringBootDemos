package com.employeeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.employeeapp.model.Employee;

@Service
public interface IEmployeeService {

	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	List<Employee> getAll();
	Employee getById(int employeeId);
	
	//derived queries
	List<Employee> getByCity(String city);
	
	//custom 
	List<Employee> getByCourseName(String courseName);
	List<Employee> getByCourseCategory(String category);
}
