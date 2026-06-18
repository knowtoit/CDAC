package com.demo.service;

import com.demo.dao.VectorDao;
import java.util.Enumeration;

public class VectorServiceImpl implements VectorService {
    private VectorDao dao;

    public VectorServiceImpl(VectorDao dao) { this.dao = dao; }

    public void displayUsingEnumeration() {
        Enumeration<String> enumeration = dao.getStrings().elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}