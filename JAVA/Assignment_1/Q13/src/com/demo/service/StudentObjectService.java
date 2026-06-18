package com.demo.service;

import com.demo.model.Student;
import java.util.List;

public interface StudentObjectService {
    void saveStudents(List<Student> students) throws Exception;
}