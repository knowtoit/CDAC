package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Student;
import com.demo.servise.StudentService;
import com.demo.servise.StudentServiceImpl;

public class TestStudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService sservice = new StudentServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("1.Add New Student\n 2.Search by id\n 3. Search by name\n 4. Display All\n 5. Calculate GPA\n 6.Exit");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status = sservice.addNewStudent();
				if(status) {
					System.out.println("Student addedd successfully");
				}
				else {
					System.out.println("Not added");
				}
			}
			case 2->{
					System.out.println("Enter your id");
					int id = sc.nextInt();
					Student s = sservice.searchById(id);
					if(s !=null) {
						System.out.println(s);
					}
					else {
						System.out.println("Not found");
					}
			}
			case 3->{
				System.out.println("Enter your name");
				String name = sc.next();
				Student[] arr = sservice.searchByName(name);
				for(Student s:arr) {
					if(s !=null) {
						System.out.println(s);
					}
				}
			}
			case 4->{
				Student[]sarr = sservice.getAll();
				for(Student s:sarr) {
					if(s !=null) {
						System.out.println(s);
					}
				}
			}
			case 5->{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				float gpa = sservice.getGpa(id);
				
				if(gpa != -1) {
					System.out.println(gpa);
				}
				else {
					System.out.println("Not found");
				}
			}
			case 6->{
				sc.close();
				System.out.println("Thank you for visiting!");
			}
			default ->{
				System.out.println("Wrong Choice");
			}
			}
		}while(choice != 6);
	}

}
