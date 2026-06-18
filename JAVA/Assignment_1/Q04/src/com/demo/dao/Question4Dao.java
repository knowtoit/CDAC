package com.demo.dao;

import com.demo.model.Employee;
import com.demo.model.Product;
import com.demo.model.StudentSkillProfile;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public interface Question4Dao {
    Set<Employee> employeeSet();
    TreeMap<Integer, Employee> employeeMap();
    List<Product> products();
    List<StudentSkillProfile> students();
}