package com.demo.test;
import java.util.*;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeArray {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.Add new Employee\n 2.Delete Employee \n 3.Search employee by id \n 4.update employee salary");
			System.out.print("5.Display All \n 6.Display emp by name \n 7.Calculate net salary \n 8.Exit\n choice");
			
			choice =sc.nextInt();
			switch(choice) {
			case 1->{
				System.out.println("1.Salaried Employee\n 2.Contractor Employee \n 3. Vender");
				int ch = sc.nextInt();
				boolean status = EmployeeService.addNewEmp(ch);
				if(status) {
					System.out.println("Employee added successfully");
				}
				else {
					System.out.println("Could not add employeee");
				}
			}
			
			case 2->{
			System.out.println("Enter id");
			int id = sc.nextInt();
			boolean status = EmployeeService.deleteById(id);
			if(status) {
				System.out.println("Employee Deleted Successfully");
			}
			else {
				System.out.println("Could not delete employee data");
			}
			}
			
			case 3->{
				System.out.println("Enter id");
				int id = sc.nextInt();
				Employee e = EmployeeService.findById(id);
				if(e != null) {
					System.out.println(e);
				}
				else {
					System.out.println("Not found");
				}
				}
			
			case 4->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				System.out.println("Enter salary");
				double sal = sc.nextDouble();
				boolean status = EmployeeService.updateById(id,sal);
				if(status) {
					System.out.println("Your salary has been updated successfully!");
				}
				else {
					System.out.println("Employee not found");
				}
			}
			case 5->{
				Employee[] emparr = EmployeeService.getAll();
				for(Employee e:emparr) {
					if(e != null) {
						System.out.println(e);
					}
					else {
						break;
					}
				}
			}
			case 6->{
				System.out.println("Enter name");
				String nm = sc.next();
				Employee[] arr = EmployeeService.findByName(nm);
				if(arr != null) {
					for(Employee e:arr) {
						if(e != null) {
							System.out.println(e);
						}
						else {
							break;
						}
					}
				}
				else {
					System.out.println("Name not found!");
				}
			}
			case 7->{
				System.out.println("Enter id");
				int id = sc.nextInt();
				double netsal = EmployeeService.findNetSalary(id);
				if(netsal != -1) {
					System.out.println("Net salary for "+ id +":" + netsal);
				}
				else {
					System.out.println("Employee not found");
				}
			}
			case 8->{
				sc.close();
				System.out.println("Thank you for visiting!");
			}
			default ->{
				System.out.println("Wrong choice");
			}
		  }
		}
		while(choice !=8);
		
		
	}
}
