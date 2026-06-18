package com.demo.dao;

import com.demo.model.Student;
import java.util.List;

public interface StudentFileDao {
    void writeCsv(List<Student> students) throws Exception;
}