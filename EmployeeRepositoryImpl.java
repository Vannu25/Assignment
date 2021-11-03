package com.example.demo.layer3;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.layer2.Employee;
@Repository
public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository{
	public EmployeeRepositoryImpl() {
		System.out.println("EmployeeRepositoryImpl ..");	
}
	@Transactional
	public void insertEmployee(Employee eobj) {
		super.persist(eobj); // invoking the dummy persist of the super class
		System.out.println("employee inserted...");
		
		
	}

	@Override
	public Employee selectEmployee(int empno) {
		System.out.println("EmployeeRepositoryImpl : selecting employee by empno");
		Employee emp = super.find(Employee.class, empno);
		
		return emp;
	}

	@Override
	public List<Employee> selectEmployees() {
		List<Employee>  empList = new ArrayList<Employee>();

		System.out.println("EmployeeRepositoryImpl : Selecting all employees...");
		return super.findAll("Employee");
	}

	@Transactional
	public void updateEmployee(Employee eobj) {
		System.out.println("EmployeeRepositoryImpl : Updating employee...");
		super.merge(eobj);
		
	}

	@Transactional
	public void deleteEmployee(int empno) {
		System.out.println("EmployeeRepositoryImpl : Deleting employee");
		super.remove(Employee.class, empno);
		
	}
	

}
