package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Course;


@Repository
public interface ICourseServiceRepository extends JpaRepository<Course, Integer> {

	List<Course> findByCategory(String category);
	
	@Query("from Course c inner join c.employees e where e.employeeName=?1")
	List<Course> findByEmployee(String name);
	
	@Query("from Course c inner join c.employees e where e.city=?1")
	List<Course> findByCity(String city);
	
}
