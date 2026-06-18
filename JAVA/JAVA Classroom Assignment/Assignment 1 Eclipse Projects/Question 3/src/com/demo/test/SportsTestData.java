package com.demo.test;

import com.demo.model.ContractEmployee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vendor;
import com.demo.service.EmployeeService;
import java.time.LocalDate;

public class SportsTestData {
    public static void load(EmployeeService service) {
        service.addEmployee(new SalariedEmployee("Asha", "9001", "asha@club.com", "Admin", "Manager", LocalDate.now(), 50000));
        service.addEmployee(new ContractEmployee("Nitin", "9002", "nitin@club.com", "Training", "Coach", LocalDate.now(), 80, 500));
        service.addEmployee(new Vendor("Sai Services", "9003", "vendor@club.com", "Maintenance", "Vendor", LocalDate.now(), 12, 75000));
    }
}