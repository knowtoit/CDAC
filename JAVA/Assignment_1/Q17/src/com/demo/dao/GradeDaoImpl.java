package com.demo.dao;

import com.demo.model.Grade;

public class GradeDaoImpl implements GradeDao {
    public Grade findGrade(String gradeName) {
        return Grade.valueOf(gradeName);
    }
}