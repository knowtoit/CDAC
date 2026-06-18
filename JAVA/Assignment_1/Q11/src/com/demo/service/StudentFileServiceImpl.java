package com.demo.service;

import com.demo.dao.StudentFileDao;
import com.demo.model.Student;
import java.util.List;

public class StudentFileServiceImpl implements StudentFileService {
    private StudentFileDao dao;
    public StudentFileServiceImpl(StudentFileDao dao) { this.dao = dao; }
    public void saveStudents(List<Student> students) throws Exception { dao.writeCsv(students); }
}