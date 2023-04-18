package CLoops;

import java.util.Scanner;

public class Trianglearea {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enetr the  height : ");

		int hei = in.nextInt();

		System.out.print("Enter the base : ");

		int bas = in.nextInt();

		double sol = hei * bas / 2;

		System.out.println("Area of Triangle is : " + sol);
	}
}
