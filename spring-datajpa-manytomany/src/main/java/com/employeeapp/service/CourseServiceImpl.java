package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repository.ICourseServiceRepository;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	ICourseServiceRepository courseServiceRepository;
	
	@Override
	public void addCourse(Course course) {
		
		courseServiceRepository.save(course);

	}

	@Override
	public void updateCourse(Course course) {
		courseServiceRepository.save(course);

	}

	@Override
	public void deleteCourse(int courseId) {
		courseServiceRepository.deleteById(courseId);

	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseServiceRepository.findAll();
	}

	@Override
	public Course getByid(int courseId) {
		// TODO Auto-generated method stub
		return courseServiceRepository.findById(courseId).get();
	}

	@Override
	public List<Course> getByCategory(String category) {
		// TODO Auto-generated method stub
		return courseServiceRepository.findByCategory(category);
	}

	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return courseServiceRepository.findByEmployee(name);
	}

	@Override
	public List<Course> getByCity(String city) {
		// TODO Auto-generated method stub
		return courseServiceRepository.findByCity(city);
	}

}
