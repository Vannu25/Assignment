package com.example.demo;

import java.time.LocalDate;

import javax.transaction.Transactional;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.DepartmentRepositoryImpl;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@SpringBootTest
class SpringOrm2ApplicationTests {
	@Autowired
	DepartmentRepositoryImpl deptRepo;
	
	@Autowired
	EmployeeRepositoryImpl empRepo;

	@Test
	void insertDeptTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(401);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Banglore");

		deptRepo.insertDepartment(dept);
	}
	
	@Test
	void updateDeptTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(353);
		dept.setDepartmentName("Testing");
		dept.setDepartmentLocation("Banglore");

		deptRepo.updateDepartment(dept);
	}
	@Test
	void deleteDeptTest() {
		// Department dept = new Department();
		// dept.setDepartmentNumber(372);
		// dept.setDepartmentName("Testing");
		// dept.setDepartmentLocation("Banglore");
		
		deptRepo.deleteDepartment(373);
		
	}
	
	
	
	
	@Test
	void insertEmpTest() {
		Employee emp = new Employee();
		
		LocalDate ld =  LocalDate.of(1997, 6, 2);
		
			emp.setEmployeeNumber(3);
			emp.setEmployeeName("Rishi");
			emp.setJob("DevOps");
		  emp.setManager(7839);
			emp.setHireDate(ld);
			emp.setSalary(2200);
			emp.setComm(900);
		
		empRepo.insertEmployee(emp);
	}
	
	@Test
	void updateEmpTest()
	{
	Employee emp = new Employee();

	LocalDate ld =  LocalDate.of(1997, 6, 2);

	emp.setEmployeeNumber(2);
	emp.setEmployeeName("Sheba");
	emp.setJob("Testing");
	emp.setManager(7839);
	emp.setHireDate(ld);
	emp.setSalary(2200);
	emp.setComm(900);

	empRepo.updateEmployee(emp);
	}
	
	@Test
	void deleteEmpTest()
	{
	Employee emp = new Employee();
     
	emp.getEmployeeNumber();
	empRepo.deleteEmployee(2);
	}

	@Test
	void selectEmpTest()
	{
	Employee emp ;

	empRepo.selectEmployee(7654);
//
//	System.out.println("Emp Number      :"+emp.getEmployeeNumber());
//	System.out.println("Emp Name        :"+emp.getEmployeeName());
//	System.out.println("Emp Job         :"+emp.getJob());
//	System.out.println("Emp MGR         :"+emp.getManager());
//	System.out.println("Emp Hiredate    :"+emp.getHireDate());
//	System.out.println("Emp Salary      :"+emp.getSalary());
//	System.out.println("Emp Commission  :"+emp.getComm());

	}
	

}
