package com.demo.service;

import com.demo.dao.GradeDao;
import com.demo.model.Grade;

public class GradeServiceImpl implements GradeService {
    private GradeDao dao;

    public GradeServiceImpl(GradeDao dao) { this.dao = dao; }

    public String gradeRange(String gradeName) {
        Grade grade = dao.findGrade(gradeName);
        return "Minimum marks: " + grade.getMin() + ", Maximum marks: " + grade.getMax();
    }
}