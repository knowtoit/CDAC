package com.demo.dao;

import com.demo.model.Friend;
import com.demo.model.MyClass;
import com.demo.model.Rectangle;
import com.demo.model.Student;

public class ReflectionDaoImpl implements ReflectionDao {
    public Class<?>[] getClassesForReflection() {
        return new Class<?>[] { Rectangle.class, Student.class, Friend.class, MyClass.class };
    }
}