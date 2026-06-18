package com.demo.servise;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	boolean addNewStudent();

	Student[] getAll();

	Student searchById(int id);

	Student[] searchByName(String name);

	float getGpa(int id);

}
