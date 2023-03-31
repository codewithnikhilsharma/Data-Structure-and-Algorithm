package JavaFirstProgram;

import java.util.Scanner;

//  Write a program to print whether a number is even or odd, also take
// input from the user

public class EvenOdd {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int num = in.nextInt();

		if (2 % num == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}
	}
}
