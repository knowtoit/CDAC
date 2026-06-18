package com.demo.service;

import java.util.List;

import com.demo.model.Employee;


//import com.demo.model.Employee;

public interface EmployeeService {

	 boolean addNewEmployee(int ch);
	 
	 List<Employee> getAll();

	 boolean deleteById(int id);

	 Employee getById(int id);


	 boolean updateById(int id, double s);


	 List<Employee> getByName(String nm);

	 List<Employee> sortById();

	 List<Employee> sortByName();

	 List<Employee> sortBySalary();

	

}
