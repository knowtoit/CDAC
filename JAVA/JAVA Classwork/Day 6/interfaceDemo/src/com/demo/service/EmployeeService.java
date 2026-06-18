package com.demo.service;
import java.util.*;

import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vender;




public class EmployeeService {
	
	static Employee[] emparr;
	static int count;
	static {
		emparr = new Employee[100];
		emparr[0] = new SalariedEmployee(1,"Ashu","8878","IT","Developer",90000,8000);
		emparr[1] = new ContractEmployee(2,"Deepa","8887","Admin","HR",80,80000);
		count =2;
	}
	
	
	public static boolean addNewEmp(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		if(count<emparr.length) {
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter your name");
			String nm = sc.next();
			System.out.println("Enter Mob number");
			String mob = sc.next();
			System.out.println("Enter Department");
			String dept = sc.next();
			System.out.println("Enter Designation");
			String desg = sc.next();
			System.out.println("Enter Salary");
			if(ch==1) {
				System.out.println("Enter your salary and bonus");
				double sal = sc.nextDouble();
				double bonus = sc.nextDouble();
				emparr[count] = new SalariedEmployee(id, nm, mob, desg, dept, sal, bonus);
			}
			else if(ch==2) {
				System.out.println("Enter your hrs");
				float hrs = sc.nextFloat();
				System.out.print("Enter charges");
				double charges = sc.nextDouble();
				
				emparr[count] = new ContractEmployee(id,nm, mob, desg, dept, hrs, charges);				
			}
			else if(ch==3) {
				System.out.println("Enter no of emp");
				int empNum = sc.nextInt();
				System.out.println("Enter charges");
				double charges = sc.nextDouble();
				
				emparr[count] = new Vender(id,nm,mob,empNum, charges);
			}
			count++;
			return true;
		}
		
		
		return false;
	}
	
	public static Employee[] getAll() {
		return emparr;
	}

	public static Employee findById(int id) {
		int pos = searchById(id);
		if(pos != -1) {
			return emparr[pos];
		}
		return null;
	}

	private static int searchById(int id) {
		// TODO Auto-generated method stub
		for(int i = 0; i<count; i++) {
			if(emparr[i].getPid()==id) {
				return i;
			}
		}
		return -1;
	}

	public static boolean deleteById(int id) {
		// TODO Auto-generated method stub
		int pos = searchById(id);
		if(pos != -1) {
			for(int i=pos; i<count; i++) {
				emparr[i] = emparr[i+1];
			}
			count --;
			return true;
		}
		return false;
	}



	public static boolean updateById(int id,double sal) {
		// TODO Auto-generated method stub
		Employee e = findById(id);
		if(e !=null) {
			if(e instanceof SalariedEmployee) {
				((SalariedEmployee)e).setSal(sal);
			}
			else if(e instanceof ContractEmployee) {
				((ContractEmployee)e).setCharges(sal);
			}
			return true;
		}
		return false;
	}

	public static Employee[] findByName(String nm) {
		// TODO Auto-generated method stub
		Employee [] arr = new Employee[count];
		int cnt = 0;
		for(int i=0;i<count;i++) {
			if(emparr[i].getPname().equals(nm)) {
				arr[cnt] = emparr[i];
				cnt++;
			}
		}
		if(cnt>0) {
			return arr;
		}
		return null;
	}

	public static double findNetSalary(int id) {
		// TODO Auto-generated method stub
		Employee e = findById(id);
		if(e != null) {
			return e.calculateSal();
		}
		return -1;
	}
	
	
	
	
	
}
