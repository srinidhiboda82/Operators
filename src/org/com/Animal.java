package org.com;

public class Animal {
	void sound() {
	     System.out.println("Animal makes a sound");
	 }
	}

	//Derived class 1
	class Dog extends Animal {
	 @Override
	 void sound() {
	     System.out.println("Dog barks");
	 }
	}

	//Derived class 2
	class Cat extends Animal {
	 @Override
	 void sound() {
	     System.out.println("Cat meows");
	 }
	
	
	 public static void main(String[] args) {
	     Animal myAnimal = new Animal(); // Animal object
	     Animal myDog = new Dog(); // Dog object
	     Animal myCat = new Cat(); // Cat object

	     myAnimal.sound(); // Calls Animal's sound method
	     myDog.sound(); // Calls Dog's sound method
	     myCat.sound(); // Calls Cat's sound method
	 }
	

	

	}



 
