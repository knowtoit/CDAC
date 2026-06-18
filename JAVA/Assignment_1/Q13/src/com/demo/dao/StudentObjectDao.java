package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentObjectDao {
    void writeStudents(List<Student> students) throws Exception;
}