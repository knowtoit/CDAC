package com.demo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.comparators.EmployeeNameComparator;
import com.demo.comparators.EmployeeSalComparator;
import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vender;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> elist;
	
	static {
		elist = new ArrayList<>();
		elist.add(new SalariedEmployee(12, "Rajesh", "5555","HR","mgr", 7879,668 ));
		elist.add(new ContractEmployee(13,"Rajani","6889","admin","asst", 50,8000));
	}

	@Override
	public boolean save(Employee e) {
		// TODO Auto-generated method stub
		return elist.add(e);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return elist;
	}

	@Override
	public boolean removeById(int id) {
//		Iterator<Employee> it = elist.iterator();
//		while(it.hasNext()) {
//			Employee e = it.next();
//			if(e.getPid()==id) {
//				it.remove();
//				return true;
//			}
//		}
//		return false;
		
		return elist.remove(new SalariedEmployee(id));
	}

	@Override
	public Employee findById(int id) {
		int pos = elist.indexOf(new SalariedEmployee(id));
		if(pos !=-1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public boolean modifySalById(int id, double s) {
		Employee e = findById(id);
		if(e != null) {
			if(e instanceof SalariedEmployee) {
				((SalariedEmployee)e).setSal(s);
			}
			else if(e instanceof ContractEmployee) {
				((ContractEmployee)e).setCharges(s);
			}
			else {
				((Vender)e).setCharges(s);
			}
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findByName(String nm) {
		//java 1.7
		/*List<Employee>lst = new ArrayList<>();
		Iterator<Employee>it = elist.iterator();
		
		while(it.hasNext()) {
			Employee e =it.next();
			if(e.getPname().equals(nm)) {
				lst.add(e);
			}
		}*/
		
		//java 1.7
//		List<Employee> lst = new ArrayList<>();
//		for(Employee e:elist) {
//			if(e.getPname().equals(nm)) {
//				lst.add(e);
//			}
//		}
		
		//java 1.8 using stream function
		List<Employee> lst = elist.stream()
							.filter(e->e.getPname().equals(nm))
				            .collect(Collectors.toList());
		
		if(lst.size()>0) {
			return lst;
		}
		else {
			return null;
		}
		
	}

	@Override
	public List<Employee> sortById() {
		// Create copy of existing list as we are gonna sort the list
		List<Employee> elist = new ArrayList<>();
		for(Employee e:elist) {
			elist.add(e);
		}
		elist.sort(null);
		return elist;
	}

	@Override
	public List<Employee> sortByName() {
		// Create copy of exiting list
		List<Employee> elist = new ArrayList<>();
		for(Employee e: elist) {
			elist.add(e);
		}
		elist.sort(new EmployeeNameComparator());
		return elist;
	}

	@Override
	public List<Employee> sortBySalary() {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<>();
		for(Employee e:elist) {
			elist.add(e);
		}
		elist.sort(new EmployeeSalComparator());
		return elist;
	}

}
