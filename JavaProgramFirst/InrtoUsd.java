package JavaFirstProgram;

import java.util.Scanner;

//Input currency in rupees and output in USD.

public class InrtoUsd {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print(" Enter Inr : ");
		double inr = in.nextDouble();
		
		double dol = inr/75;
		System.out.println(" Amount in USD : " + dol);
	}
}
