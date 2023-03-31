package JavaFirstProgram;

import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)

public class Operators {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Value : ");
		int num1 = in.nextInt();
		
		System.out.print("Enter Second Value : ");
		int num2 = in.nextInt();
		
		System.out.println("Sum of two number is : " + (num1 + num2) );
		System.out.println("Subtraction of two number is : " + (num1 - num2) );
		System.out.println("Product of two number is : " + (num1 * num2) );
		System.out.println("Division of two number is : " + (num1 / num2) );
	}
}
