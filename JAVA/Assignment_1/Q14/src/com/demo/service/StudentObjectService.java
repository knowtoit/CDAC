package com.demo.service;

import com.demo.model.Student;
import java.util.List;

public interface StudentObjectService {
    List<Student> readStudents() throws Exception;
}