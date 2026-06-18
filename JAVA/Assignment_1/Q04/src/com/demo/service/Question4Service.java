package com.demo.service;

import com.demo.model.Employee;
import com.demo.model.Product;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public interface Question4Service {
    Set<Employee> createEmployeeHashSet();
    TreeMap<Integer, Employee> createEmployeeTreeMap();
    List<Product> createProducts();
}