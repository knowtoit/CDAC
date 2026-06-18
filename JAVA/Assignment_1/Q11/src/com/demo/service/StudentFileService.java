package com.demo.service;

import com.demo.model.Student;
import java.util.List;

public interface StudentFileService {
    void saveStudents(List<Student> students) throws Exception;
}