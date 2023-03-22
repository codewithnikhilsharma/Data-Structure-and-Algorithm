package Array;

public class Array {

	public static void main(String[] args) {
		
		// create an array of integers
		int[] myArray = {1, 2, 3, 4, 5};

		// access the first element of the array
		int firstElement = myArray[0];

		// modify the third element of the array
		myArray[2] = 10;

		// get the length of the array
		int length = myArray.length;

		// loop through the array and print each element
		for (int i = 0; i < myArray.length; i++) {
		    System.out.println(myArray[i]);
		}

	}
}
