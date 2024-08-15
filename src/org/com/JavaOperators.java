package org.com;

public class JavaOperators {

	public static void main(String[] args) {
		        int a = 10;
		        int b = 5;

		        // Arithmetic Operators
		        System.out.println("Arithmetic Operators:");
		        System.out.println("a + b = " + (a + b)); // Addition
		        System.out.println("a - b = " + (a - b)); // Subtraction
		        System.out.println("a * b = " + (a * b)); // Multiplication
		        System.out.println("a / b = " + (a / b)); // Division
		        System.out.println("a % b = " + (a % b)); // Modulus

		        // Unary Operators
		        System.out.println("\nUnary Operators:");
		        System.out.println("++a = " + (++a)); // Pre-increment
		        System.out.println("--b = " + (--b)); // Pre-decrement
		        System.out.println("a++ = " + (a++)); // Post-increment
		        System.out.println("b-- = " + (b--)); // Post-decrement
		        System.out.println("a after a++ = " + a);
		        System.out.println("b after b-- = " + b);

		        // Relational Operators
		        System.out.println("\nRelational Operators:");
		        System.out.println("a == b = " + (a == b)); // Equal to
		        System.out.println("a != b = " + (a != b)); // Not equal to
		        System.out.println("a > b = " + (a > b));   // Greater than
		        System.out.println("a < b = " + (a < b));   // Less than
		        System.out.println("a >= b = " + (a >= b)); // Greater than or equal to
		        System.out.println("a <= b = " + (a <= b)); // Less than or equal to

		        // Logical Operators
		        boolean x = true;
		        boolean y = false;
		        System.out.println("\nLogical Operators:");
		        System.out.println("x && y = " + (x && y)); // Logical AND
		        System.out.println("x || y = " + (x || y)); // Logical OR
		        System.out.println("!x = " + (!x));         // Logical NOT

	
		        // Assignment Operators
		        System.out.println("\nAssignment Operators:");
		        a = 10;
		        b = 5;
		        a += b; // a = a + b
		        System.out.println("a += b = " + a);
		        a -= b; // a = a - b
		        System.out.println("a -= b = " + a);
		        a *= b; // a = a * b
		        System.out.println("a *= b = " + a);
		        a /= b; // a = a / b
		        System.out.println("a /= b = " + a);
		        a %= b; // a = a % b
		        System.out.println("a %= b = " + a);

		        

	}

}
