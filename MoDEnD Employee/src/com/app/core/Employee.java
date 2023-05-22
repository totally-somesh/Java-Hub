package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable,Comparable<Employee> {
//	name,email,city,sal,joning date,dept

	private int empId;
	private String email;
	private Double salary;
	private LocalDate joiningDate;
	private Department dept;
	
	public Employee (int empId, String email, Double salary, LocalDate joiningDate, Department dept) {
		super();
		this.empId = empId;
		this.email = email;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.dept = dept;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", email=" + email + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
