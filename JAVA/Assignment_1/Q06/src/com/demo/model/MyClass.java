package com.demo.model;

public class MyClass {
    private int value;

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    @CustomAnnotation
    public void method1() { System.out.println("Annotated method1 invoked"); }
    public void method2() { System.out.println("method2"); }
    @CustomAnnotation
    public void method3() { System.out.println("Annotated method3 invoked"); }
    public void method4() { System.out.println("method4"); }
}