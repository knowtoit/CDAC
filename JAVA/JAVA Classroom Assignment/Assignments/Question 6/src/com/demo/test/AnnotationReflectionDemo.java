package com.demo.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
}

class MyClass {
    @CustomAnnotation
    public void method1() {
        System.out.println("Annotated method1 invoked");
    }

    public void method2() {
        System.out.println("method2");
    }

    @CustomAnnotation
    public void method3() {
        System.out.println("Annotated method3 invoked");
    }

    public void method4() {
        System.out.println("method4");
    }
}

public class AnnotationReflectionDemo {
    public static void main(String[] args) throws Exception {
        MyClass object = new MyClass();
        for (Method method : MyClass.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                method.invoke(object);
            } else {
                System.out.println("Not annotated: " + method.getName());
            }
        }
    }
}