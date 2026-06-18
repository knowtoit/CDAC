package com.demo.test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationDemo {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Java");
        names.add("HTML");
        names.add("JDBC");
        names.add("Collections");

        Enumeration<String> enumeration = names.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}