package com.demo;

import com.demo.Inheritance.Cat;
import com.demo.Inheritance.Dog;
import com.demo.Inheritance.Puppy;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single Inheritance
				Dog d = new Dog();
				d.eat();
				d.bark();
				
				
				System.out.println("--------");
				Puppy p = new Puppy();
				p.bark();
				p.eat();
				p.weep();
				
				
				System.out.println("----------");
				//Hierarchical Inheritance
				Cat c = new Cat();
				c.eat();
				c.meow();

	}

}
