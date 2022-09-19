package com.employeeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;

@Service
public interface ICourseService {

	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int courseId);
	List<Course> getAll();
	
	Course getByid(int courseId);
	List<Course> getByCategory(String category);
	
	List<Course> getByEmployee(String name);
	List<Course> getByCity(String city);
}
