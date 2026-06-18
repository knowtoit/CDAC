package com.demo;

class Employee {

    // Private data members
    private int id;
    private String name;
    private String mob;
    private String dept;
    private String desg;
    private double sal;
    private double bonus;

    // Constructor
    public Employee(int id, String name, String mob, String dept, String desg, double sal, double bonus) {
        this.id = id;
        this.name = name;
        this.mob = mob;
        this.dept = dept;
        this.desg = desg;
        this.sal = sal;
        this.bonus = bonus;
    }

    // Getter and Setter methods
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMob() { return mob; }
    public void setMob(String mob) { this.mob = mob; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public String getDesg() { return desg; }
    public void setDesg(String desg) { this.desg = desg; }

    public double getSal() { return sal; }
    public void setSal(double sal) { this.sal = sal; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    // Main method
    public static void main(String[] args) {

        // Using constructor
        Employee e = new Employee(
                1, "Deepa", "1234567890", "IT", "Developer", 90000, 5000
        );

        // Display values
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSal());
    }
}