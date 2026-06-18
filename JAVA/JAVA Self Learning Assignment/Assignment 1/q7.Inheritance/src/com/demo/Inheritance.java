//Que7. Create demo applications to illustrate different types of inheritance.

package com.demo;

public class Inheritance {

	static class Animal{
		void eat() {
			System.out.println("Animal is eating");
		}
	}
	
	//Single Inheritance
	static class Dog extends Animal{
		void bark() {
			System.out.println("Dog is barking");
		}
	}
	
	//Multilevel Inheritance
	static class Puppy extends Dog{
		void weep() {
			System.out.println("Puppy is weeping");
		}
	}
	
	//Hierarchical Inheritance
	static class Cat extends Animal{
		void meow() {
			System.out.println("Cat is meowing");
		}
	}
	
	public static void main(String[] args) {
//		//Single Inheritance
//		Dog d = new Dog();
//		d.eat();
//		d.bark();
//		
//		
//		System.out.println("--------");
//		Puppy p = new Puppy();
//		p.bark();
//		p.eat();
//		p.weep();
//		
//		
//		System.out.println("----------");
//		//Hierarchical Inheritance
//		Cat c = new Cat();
//		c.eat();
//		c.meow();

	}

}
