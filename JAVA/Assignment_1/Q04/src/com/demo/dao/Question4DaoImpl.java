package com.demo.dao;

import com.demo.model.Employee;
import com.demo.model.Product;
import com.demo.model.StudentSkillProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Question4DaoImpl implements Question4Dao {
    private Set<Employee> employees = new HashSet<>();
    private TreeMap<Integer, Employee> employeeMap = new TreeMap<>();
    private List<Product> products = new ArrayList<>();
    private List<StudentSkillProfile> students = new ArrayList<>();

    public Set<Employee> employeeSet() { return employees; }
    public TreeMap<Integer, Employee> employeeMap() { return employeeMap; }
    public List<Product> products() { return products; }
    public List<StudentSkillProfile> students() { return students; }
}