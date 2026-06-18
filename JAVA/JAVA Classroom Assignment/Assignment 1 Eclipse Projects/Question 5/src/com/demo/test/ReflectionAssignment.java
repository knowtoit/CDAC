package com.demo.test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Rectangle {
    public void area(int length, int breadth) {
        System.out.println("Area: " + (length * breadth));
    }
}

class Student {
    public void setMarks(int m1, int m2, int m3) {
        System.out.println("Total: " + (m1 + m2 + m3));
    }
}

class Friend {
    public void update(String name, String mobile, String email) {
        System.out.println(name + " " + mobile + " " + email);
    }
}

class MyClass {
    public void method5(int a, int b, int c, int d) {
        System.out.println("method5 sum=" + (a + b + c + d));
    }

    public void method6(String a, String b, String c, String d) {
        System.out.println("method6 " + a + b + c + d);
    }
}

public class ReflectionAssignment {
    private static Object sampleValue(Class<?> type, int index) {
        if (type == int.class || type == Integer.class) return index + 1;
        if (type == double.class || type == Double.class) return (double) index + 1;
        if (type == String.class) return "value" + index;
        return null;
    }

    public static void main(String[] args) throws Exception {
        Class<?>[] classes = {Rectangle.class, Student.class, Friend.class, MyClass.class};
        for (Class<?> clazz : classes) {
            System.out.println("\nClass: " + clazz.getName());
            Object object = clazz.getDeclaredConstructor().newInstance();
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("Method: " + method.getName());
                System.out.println("Parameter count: " + method.getParameterCount());
                int index = 0;
                Object[] values = new Object[method.getParameterCount()];
                for (Parameter parameter : method.getParameters()) {
                    System.out.println("Parameter: " + parameter.getName() + ", type=" + parameter.getType().getName());
                    values[index] = sampleValue(parameter.getType(), index);
                    index++;
                }
                if (method.getParameterCount() >= 3) {
                    method.invoke(object, values);
                }
            }
        }
    }
}