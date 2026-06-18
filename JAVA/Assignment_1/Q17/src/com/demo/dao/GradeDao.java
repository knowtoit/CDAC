package com.demo.dao;

import com.demo.model.Grade;

public interface GradeDao {
    Grade findGrade(String gradeName);
}