package com.demo.test;

import java.util.List;

abstract class Party {
    protected int id;
    protected String name;
    protected String email;

    Party(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

class Vendor extends Party {
    private String phoneNumber;
    private List<String> products;

    Vendor(int vendorId, String name, String email, String phoneNumber, List<String> products) {
        super(vendorId, name, email);
        this.phoneNumber = phoneNumber;
        this.products = products;
    }

    public String toString() {
        return "Vendor{id=" + id + ", name='" + name + "', phone='" + phoneNumber + "', products=" + products + "}";
    }
}

abstract class Customer extends Party {
    protected String creditClass;
    protected double discount;
    protected String plan;

    Customer(int custId, String name, String email, String creditClass, double discount, String plan) {
        super(custId, name, email);
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }
}

class IndividualCustomer extends Customer {
    private String phoneNumber;

    IndividualCustomer(int custId, String name, String email, String creditClass, double discount, String plan, String phoneNumber) {
        super(custId, name, email, creditClass, discount, plan);
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "IndividualCustomer{id=" + id + ", name='" + name + "', phone='" + phoneNumber + "', plan='" + plan + "'}";
    }
}

class CompanyCustomer extends Customer {
    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private List<String> numbers;

    CompanyCustomer(int custId, String name, String email, String creditClass, double discount, String plan, String relationshipManager, double creditLine, int extensions, List<String> numbers) {
        super(custId, name, email, creditClass, discount, plan);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    public String toString() {
        return "CompanyCustomer{id=" + id + ", name='" + name + "', manager='" + relationshipManager + "', creditLine=" + creditLine + ", extensions=" + extensions + ", numbers=" + numbers + "}";
    }
}

public class TelecomDemo {
    public static void main(String[] args) {
        System.out.println(new Vendor(1, "CableWorld", "sales@cableworld.com", "8888888888", List.of("Router", "Fiber Cable")));
        System.out.println(new IndividualCustomer(101, "Ravi", "ravi@mail.com", "A", 10, "5G Basic", "9999999999"));
        System.out.println(new CompanyCustomer(201, "ABC Ltd", "it@abc.com", "A+", 15, "Corporate", "Meera", 500000, 25, List.of("0201111", "0202222")));
    }
}