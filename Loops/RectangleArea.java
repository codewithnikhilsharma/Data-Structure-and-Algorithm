package CLoops;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int len = in.nextInt();
		System.out.print("enter the Width : ");
		int wid = in.nextInt();
		
		double ans = len*wid;
		System.out.println("Area of Rectangle is : " + ans );
	}
}
