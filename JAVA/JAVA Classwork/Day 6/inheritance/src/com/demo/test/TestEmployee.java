package com.demo.test;

import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;

public class TestEmployee {
	public static void main(String[] args) {
//		Employee e = new Employee(12,"xxxx","23344", "Hr" ,"mgr");
//		System.out.println(e);
		
		SalariedEmployee se = new SalariedEmployee(13, "Ashu", "8788", "CS", "eng", 6000000, 78787878);
		System.out.println(se);
		
		ContractEmployee ce = new ContractEmployee(14, "zzzz","8678","hr","mngr", 45, 32423);
		System.out.println(ce);
		
		
	}
}
