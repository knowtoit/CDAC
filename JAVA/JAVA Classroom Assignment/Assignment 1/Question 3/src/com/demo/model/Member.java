package com.demo.model;

public class Member implements PersonInfo {
    private static int nextId = 501;
    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String membershipType;
    private double amountPaid;

    public Member(String name, String mobileNo, String emailId, String membershipType, double amountPaid) {
        this.id = nextId++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public void display() {
        System.out.println(id + " " + name + " " + mobileNo + " " + emailId + " " + membershipType + " amount=" + amountPaid);
    }
}