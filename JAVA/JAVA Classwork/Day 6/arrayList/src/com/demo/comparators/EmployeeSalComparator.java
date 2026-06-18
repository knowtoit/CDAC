package com.demo.comparators;

import java.util.Comparator;

import com.demo.model.ContractEmployee;
import com.demo.model.Person;
import com.demo.model.SalariedEmployee;

public class EmployeeSalComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		double s1=0.0,s2=0.0;
		if(o1 instanceof SalariedEmployee) {
			s1 = ((SalariedEmployee)o1).getSal();
		}
		else if(o1 instanceof ContractEmployee) {
			s1 = ((ContractEmployee)o1).getCharges();
		}
		
		if(o2 instanceof SalariedEmployee) {
			s2 = ((SalariedEmployee)o2).getSal();
		}
		else if(o2 instanceof ContractEmployee) {
			s2 = ((ContractEmployee)o2).getCharges();
		}
		
		System.out.println("In salary comparator"+s1+"---------"+s2);
		
		if(s1<s2) {
			return -1;
		}
		else if(s1==s2) {
			return 0;
		}
		else
			return 1;
	}
	

}
