package com.demo.service;

import com.demo.dao.Question4Dao;
import com.demo.model.Employee;
import com.demo.model.Product;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Question4ServiceImpl implements Question4Service {
    private Question4Dao dao;

    public Question4ServiceImpl(Question4Dao dao) {
        this.dao = dao;
    }

    public Set<Employee> createEmployeeHashSet() {
        dao.employeeSet().add(new Employee(1, "Asha", 60000, "IT", "Developer"));
        dao.employeeSet().add(new Employee(1, "Duplicate", 60000, "IT", "Developer"));
        dao.employeeSet().add(new Employee(2, "Nitin", 55000, "HR", "Executive"));
        return dao.employeeSet();
    }

    public TreeMap<Integer, Employee> createEmployeeTreeMap() {
        for (Employee employee : createEmployeeHashSet()) {
            dao.employeeMap().put(employee.getId(), employee);
        }
        return dao.employeeMap();
    }

    public List<Product> createProducts() {
        dao.products().add(new Product(1, "Milk", "perishable", LocalDate.now(), LocalDate.now().plusDays(2), "", 50));
        dao.products().add(new Product(2, "Chair", "nonperishable", LocalDate.now(), null, "furniture", 2000));
        return dao.products();
    }
}