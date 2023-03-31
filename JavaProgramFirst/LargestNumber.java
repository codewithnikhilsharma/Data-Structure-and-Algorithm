package JavaFirstProgram;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num = in.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num1 = in.nextInt();
		
		if(num>num1) {
			System.out.println( num + " is greater than " + num1 );
		}
		else {
			System.out.println( num1 + " num1 is greater than "  + num);
		}
	}
}
