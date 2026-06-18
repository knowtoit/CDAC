package com.demo.dao;

import com.demo.model.MyClass;

public class AnnotationDaoImpl implements AnnotationDao {
    public Class<?> getTargetClass() {
        return MyClass.class;
    }
}