package com.demo.model;

public class MyClass {
    private int value;

    public MyClass() {
    }

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void method5(int a, int b, int c, int d) {
        System.out.println("method5 sum = " + (a + b + c + d));
    }

    public void method6(String a, String b, String c, String d) {
        System.out.println("method6 output = " + a + b + c + d);
    }
}