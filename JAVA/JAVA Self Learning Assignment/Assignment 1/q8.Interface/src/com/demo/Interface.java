//8. Implemention of functional Interface with anonymous class and lamda
//expression


package com.demo;

public class Interface {
	
	 // Functional Interface (only one abstract method)
   @FunctionalInterface interface MyInterface {
        void display();
    }

//	public static void main(String[] args) {
//		// ------------------
//        // 1. Using Anonymous Class
//        MyInterface obj1 = new MyInterface() {
//            public void display() {
//                System.out.println("Using Anonymous Class");
//            }
//        };
//        obj1.display();
//
//        System.out.println("-----");
//
//        // ------------------
//        // 2. Using Lambda Expression
//        MyInterface obj2 = () -> {
//            System.out.println("Using Lambda Expression");
//        };
//        obj2.display();
//
//	}

}
