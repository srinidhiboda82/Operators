package org.com;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int a = 10;
		        int b = 20;
		        int c = 15;

		        // Simple if statement
		        if (a < b) {
		            System.out.println("a is less than b");
		        }

		        // if-else statement
		        if (a > b) {
		            System.out.println("a is greater than b");
		        } else {
		            System.out.println("a is not greater than b");
		        }

		      
		        if (a == b) {
		            System.out.println("a is equal to b");
		        } else if (a == c) {
		            System.out.println("a is equal to c");
		        } else if (b == c) {
		            System.out.println("b is equal to c");
		        } else {
		            System.out.println("None of the values are equal");
		        }
		    }
		}

	
