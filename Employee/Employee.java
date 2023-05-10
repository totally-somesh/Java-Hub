package com.app.emp;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{

	
	private String id;
	private String firstName;
	private String lastName;
	private Department dept;
	private LocalDate  jdate;
	private double salary;
	public Employee(String id, String firstName, String lastName, Department dept, LocalDate jdate, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.jdate = jdate;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public LocalDate getJdate() {
		return jdate;
	}
	public void setJdate(LocalDate jdate) {
		this.jdate = jdate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept
				+ ", jdate=" + jdate + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
