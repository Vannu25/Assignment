package com.example.demo.layer2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp6")

public class Employee {
	@Id
	@Column(name = "empno")
	private int EmployeeNumber;

	@Column(name = "ename")
	private String EmployeeName;

	@Column(name = "job")
	private String Job;

	@Column(name = "MGR")
	private int Manager;

	@Column(name = "hiredate")
	private LocalDate HireDate;

	@Column(name = "sal")
	private int Salary;
	
	@Column(name = "comm")
	private Integer Comm;

	public LocalDate getHireDate() {
		return HireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		HireDate = hireDate;
	}

	public int getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.EmployeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		this.Job = job;
	}

	public int getManager() {
		return Manager;
	}

	public void setManager(int manager) {
		this.Manager = manager;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

	public Integer getComm() {
		return Comm;
	}

	public void setComm(Integer comm) {
		this.Comm = comm;
	}

}
