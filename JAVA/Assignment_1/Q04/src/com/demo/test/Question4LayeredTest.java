package com.demo.test;

import com.demo.dao.Question4DaoImpl;
import com.demo.service.Question4Service;
import com.demo.service.Question4ServiceImpl;

public class Question4LayeredTest {
    public static void main(String[] args) {
        Question4Service service = new Question4ServiceImpl(new Question4DaoImpl());
        System.out.println(service.createEmployeeHashSet());
        System.out.println(service.createEmployeeTreeMap());
        service.createProducts().forEach(product -> System.out.println(product.getName() + " tax=" + product.calculateTax()));
    }
}