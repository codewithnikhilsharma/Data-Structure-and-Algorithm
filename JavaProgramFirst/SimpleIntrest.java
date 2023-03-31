package JavaFirstProgram;

import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

public class SimpleIntrest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Principal Amount : ");
		double pri = in.nextDouble();
		
		System.out.print("Enter Rate of Intrest : ");
		double intr = in.nextDouble();
		
		System.out.print("Enter Time : ");
		double time = in.nextDouble();
		
		double cal = pri*intr*time/100;
		System.out.println("Simple Intrest Is : " + cal );
	}
}
