package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentFileDao {
    List<Student> readCsv() throws Exception;
}