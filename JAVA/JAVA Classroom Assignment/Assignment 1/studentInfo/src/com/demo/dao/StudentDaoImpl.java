package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	static Student[] sarr;
	static int count=0;
	static {
		sarr = new Student[100];
		sarr[0] = new Student(1,"Ashu",89,98,66);
		sarr[1] = new Student(2,"Deepa", 78, 98,87);
		count=2;
	}

	@Override
	public boolean save(Student s) {
		if(count < sarr.length) {
			sarr[count] = s;
			count++;
			return true;
		}
		else
		return false;
	}

	@Override
	public Student[] findAll() {
		// TODO Auto-generated method stub
		return sarr;
	}

	@Override
	public Student findById(int id) {
		for(int i=0; i<count;i++) {
			if(sarr[i].getStudid()==id) {
				return sarr[i];
			}
		}
		return null;
	}


	@Override
	public Student[] findByName(String name) {
		Student[] arr = new Student[count];
		int i=0;
		for(Student s:sarr) {
			if(s !=null) {
				if(s.getName().equals(name)) {
					arr[i] = s;
					i++;
				}
				
			}
		}
			if(i>0) {
				return arr;
			}
		
		return null;
	}

	@Override
	public float findGpa(int id) {
		// TODO Auto-generated method stub
		Student s = findById(id);
		if(s !=null) {
			
			float gpa=(1.0f/3)*s.getM1()+(1.0f/2)*s.getM2()+(1.0f/4)*s.getM3();
			
			return gpa;
		}
		return 0;
	}

}
