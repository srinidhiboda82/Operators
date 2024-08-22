package org.com;

public class Vehicle {

				    void startEngine() {
		        System.out.println("The vehicle's engine starts.");
		    }
		

		    
		    void startEngine(int a) {
		    	
		        System.out.println("The car's engine starts with a roar.");
		    }

		    void honk() {
		        System.out.println("The car honks.");
		    }
		}

		class Motorcycle extends Vehicle {
		    void startEngine() {
		        System.out.println("The motorcycle's engine starts with a vroom.");
		    }

		    void rev() {
		        System.out.println("The motorcycle revs its engine.");
		    } 
		

		    public static void main(String[] args) {
		        Vehicle myCar = new Vehicle();
		        Vehicle myMotorcycle = new Motorcycle();

		        myCar.startEngine();        
		        myMotorcycle.startEngine(); 

		        //((Car) myCar).honk();              
		        //((Motorcycle) myMotorcycle).rev(); 
		    }
		}


	


