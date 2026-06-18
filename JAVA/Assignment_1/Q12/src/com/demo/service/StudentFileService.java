package com.demo.service;

import com.demo.model.Student;
import java.util.List;

public interface StudentFileService {
    List<Student> readStudents() throws Exception;
}