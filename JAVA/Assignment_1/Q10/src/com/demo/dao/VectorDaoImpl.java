package com.demo.dao;

import java.util.Vector;

public class VectorDaoImpl implements VectorDao {
    public Vector<String> getStrings() {
        Vector<String> values = new Vector<>();
        values.add("Java");
        values.add("HTML");
        values.add("JDBC");
        values.add("Collections");
        return values;
    }
}