package JavaFirstProgram;

import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.

public class Finonacchi {

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.print(" Enter Num : ");
		int num = in.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.println(" Printing fononachi num of term " + num );
		
		for(int i = 1; i<=num; i++) {
			System.out.print( a + " " );
			
			int sum = a+b;
			a=b;
			b=sum;
		}
	}
}
