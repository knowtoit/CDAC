package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {

	boolean save(Student s);

	Student[] findAll();

	Student findById(int id);

	Student[] findByName(String name);

	float findGpa(int id);

}
