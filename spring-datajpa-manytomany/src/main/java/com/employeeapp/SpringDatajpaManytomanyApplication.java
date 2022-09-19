package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	IEmployeeService employeeService;

	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	ICourseService courseService;

	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee("Jack", "Bangalore", "Mech");
//		Course ncourse = new Course("java", 10, "fullsatck");
//		Course mcourse = new Course("sql", 30, "fullsatck");
//		Course tcourse = new Course("java script", 50, "fullsatck");
//
//		Set<Course> courses = new HashSet<>(Arrays.asList(ncourse, mcourse, tcourse));
//		employee.setCourses(courses);

		Employee employee = new Employee("Rahul", "Bangalore", "Digital");
		Course acourse = courseService.getByid(100);
		Course bcourse = courseService.getByid(101);

		Set<Course> courses = new HashSet<>(Arrays.asList(acourse, bcourse));
		employee.setCourses(courses);
		
		employeeService.addEmployee(employee);
		
		

	}

}
