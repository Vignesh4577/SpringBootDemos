package com.employeeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
	@GeneratedValue(generator = "emp_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "emp_gen", sequenceName = "emp_sequence", initialValue = 100, allocationSize = 1)
	private Integer empoyeeId;

	@Column(length = 20)
	private String employeeName;
	@Column(length = 20)
	private String city;

	@Column(length = 20)
	private String department;

	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "employee_course", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	Set<Course> courses;

	public Employee() {
		super();
	}

	public Employee(String employeeName, String city, String department) {
		super();
		this.employeeName = employeeName;
		this.city = city;
		this.department = department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(Integer empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", empoyeeId=" + empoyeeId + ", city=" + city
				+ ", department=" + department + "]";
	}

}
