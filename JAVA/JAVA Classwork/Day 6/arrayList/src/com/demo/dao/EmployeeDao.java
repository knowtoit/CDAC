package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	boolean save(Employee e);
	
	List<Employee> findAll();

	boolean removeById(int id);

	Employee findById(int id);

	boolean modifySalById(int id, double s);

	List<Employee> findByName(String nm);

	List<Employee> sortById();

	List<Employee> sortByName();

	List<Employee> sortBySalary();
}
