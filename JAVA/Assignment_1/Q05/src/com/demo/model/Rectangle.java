package com.demo.model;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area(int length, int breadth) {
        System.out.println("Area: " + (length * breadth));
    }
}