package com.demo.servise;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao sdao;
	
	public StudentServiceImpl() {
		this.sdao = new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks for m1");
		float m1 = sc.nextFloat();
		System.out.println("Enter marks for m2");
		float m2 = sc.nextFloat();
		System.out.println("Enter marks for m3");
		float m3 = sc.nextFloat();
		
		
		Student s = new Student(id,name,m1,m2,m3);
		return sdao.save(s);
	}

	@Override
	public Student[] getAll() {
		// TODO Auto-generated method stub
		return sdao.findAll();
	}

	@Override
	public Student searchById(int id) {
		// TODO Auto-generated method stub
		return sdao.findById(id);
	}

	

	@Override
	public Student[] searchByName(String name) {
		// TODO Auto-generated method stub
		return sdao.findByName(name);
	}

	@Override
	public float getGpa(int id) {
		// TODO Auto-generated method stub
		return sdao.findGpa(id);
	}
}
