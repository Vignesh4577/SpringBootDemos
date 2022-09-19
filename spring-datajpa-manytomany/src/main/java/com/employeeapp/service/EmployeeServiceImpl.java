package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		 employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		 employeeRepository.deleteById(employeeId);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getByCity(String city) {
		// TODO Auto-generated method stub
		return employeeRepository.findByCity(city);
	}

	@Override
	public List<Employee> getByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByCourseName(courseName);
	}

	@Override
	public List<Employee> getByCourseCategory(String category) {
		// TODO Auto-generated method stub
		return employeeRepository.findByCourseCategory(category);
	}

}
