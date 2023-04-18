package CLoops;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius of Cricle : ");
		int area = in.nextInt();

		double pi = 3.14;
		double cal = 2 * pi * area;
		System.out.print("Area Of Circle is : " + cal);

	}
}
