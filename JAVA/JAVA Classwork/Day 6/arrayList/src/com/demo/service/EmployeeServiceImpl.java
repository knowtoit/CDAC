package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vender;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		this.edao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter name");
		String nm = sc.next();
		
		System.out.println("Enter Mob");
		String mob = sc.next();
		
		System.out.println("Enter dept");
		String dept = sc.next();
		
		System.out.println("Enter desg");
		String desg = sc.next();
		
		Employee e = null;
		
		if(ch==1) {
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			double bonus = sc.nextDouble();
			e = new SalariedEmployee(id,nm,mob,dept,desg,sal,bonus);
		}
		if(ch==2) {
			System.out.println("Enter hours");
			float hrs = sc.nextFloat();
			System.out.println("Enter charges");
			float charges = sc.nextFloat();
			e = new ContractEmployee(id,nm,mob,dept,desg,hrs,charges);
		}
		if(ch==3) {
			System.out.println("Enter no of employee");
			int empNum = sc.nextInt();
			System.out.println("Enter charges");
			double charges = sc.nextDouble();
			e = new Vender(id, nm, mob,empNum, charges);
		}
		
		return edao.save(e);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		
		return edao.removeById(id);
	}

	@Override
	public Employee getById(int id) {
		
		return edao.findById(id);
	}

	@Override
	public boolean updateById(int id, double s) {
		
		return edao.modifySalById(id,s);
	}

	@Override
	public List<Employee> getByName(String nm) {
		// TODO Auto-generated method stub
		return edao.findByName(nm);
	}

	@Override
	public List<Employee> sortById() {
		// TODO Auto-generated method stub
		return edao.sortById();
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return edao.sortByName();
	}

	@Override
	public List<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		return edao.sortBySalary();
	}

}
