package com.demo.test;
import java.util.*;

import com.demo.model.ContractEmployee;
import com.demo.model.Customer;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vender;


public class TestPolymorphism {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Salaried \n 2. Contract \n 3. Vendor\n 4. Customer\n 5.Exit \n choice");
		
		int choice = sc.nextInt();
		Employee e = null;
		Customer c = null;
		
		switch(choice) {
		case 1->{
			e = new SalariedEmployee(12,"xxxx","7878", "hr","mngr",1000, 500);
			System.out.println(((SalariedEmployee)e).calculateBonus(0.3f));
		}
		case 2->{
			e = new ContractEmployee(13,"yyyy","7768","finance","accnt",67,8898);
//			System.out.println(((ContractEmployee)e).calculateSal());
			System.out.println(e.calculateSal());
		}
		case 3->{
			e = new Vender(14,"zzz","78787",80,5578);
			System.out.println(e.calculateSal());
		}
		case 4->{
			c = new Customer(101, "ssss","89898",7879);
			System.out.println(c);
		}
		case 5->{
			sc.close();
			System.out.println("Thank you! Visit again");
		}
		default->{
			System.out.println("Invalid Choice");
		}
	}
		//dynamic polymorphism
		//System.out.println(e.calculateSal());
		
	}
}
