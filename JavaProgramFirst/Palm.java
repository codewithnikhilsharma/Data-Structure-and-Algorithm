package JavaFirstProgram;

import java.util.Scanner;

public class Palm {

	public static void main(String[] args) {
		// creating scanner object to take input from user
		Scanner input = new Scanner(System.in);

		// taking input from user
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		// reversing the string
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}

		// checking if the string is palindrome or not
		if (str.equals(reverseStr)) {
			System.out.println(str + " is a palindrome string.");
		} else {
			System.out.println(str + " is not a palindrome string.");
		}
	}
}
