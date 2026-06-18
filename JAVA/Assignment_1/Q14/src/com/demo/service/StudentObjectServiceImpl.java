package com.demo.service;

import com.demo.dao.StudentObjectDao;
import com.demo.model.Student;
import java.util.List;

public class StudentObjectServiceImpl implements StudentObjectService {
    private StudentObjectDao dao;
    public StudentObjectServiceImpl(StudentObjectDao dao) { this.dao = dao; }
    public List<Student> readStudents() throws Exception { return dao.readStudents(); }
}