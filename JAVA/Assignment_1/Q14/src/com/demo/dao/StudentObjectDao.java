package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentObjectDao {
    List<Student> readStudents() throws Exception;
}