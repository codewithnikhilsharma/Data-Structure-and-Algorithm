package JavaFirstProgram;

import java.util.Scanner;

public class Arn {
	   public static void main(String[] args) {
	      // Get the two numbers from the user
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the starting number: ");
	      int start = sc.nextInt();
	      System.out.print("Enter the ending number: ");
	      int end = sc.nextInt();

	      // Loop through all the numbers between the two given numbers
	      for (int i = start; i <= end; i++) {
	         int number = i;
	         int digits = 0;
	         int result = 0;

	         // Count the number of digits in the current number
	         while (number > 0) {
	            digits++;
	            number /= 10;
	         }

	         // Calculate the sum of digits raised to the power of the number of digits
	         number = i;
	         while (number > 0) {
	            int digit = number % 10;
	            result += Math.pow(digit, digits);
	            number /= 10;
	         }

	         // If the result is equal to the original number, then it's an Armstrong number
	         if (result == i) {
	            System.out.print(i + " ");
	         }
	      }
	   }
	}


