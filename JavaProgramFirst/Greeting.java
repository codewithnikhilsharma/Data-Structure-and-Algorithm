package JavaFirstProgram;

import java.util.Scanner;

//  Take name as input and print a greeting message for that particular name

public class Greeting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = in.nextLine();
		System.out.println("Good Morning " + name +" have a Nice Day ");
	}
}
