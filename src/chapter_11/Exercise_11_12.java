package chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Sum ArrayList) Write the following method that returns the sum of all numbers
 * 		in an ArrayList:
 * 
 * 		public static double sum(ArrayList<Double> list)
 * 
 * 		Write a test program that prompts the user to enter 5 numbers, stores them in an
 * 		array list, and displays their sum.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */


/** Created the main class, using the name of the package (11) and the exercise (12) in a compose name */
public class Exercise_11_12 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Created the object scanner to make possible the user interaction */
		Scanner input = new Scanner (System.in)
				;
		/** Created the arrayList in order to absorb the user interaction */
		ArrayList <Double> numbers = new ArrayList <>();
		
		/** Printing out the message to be the user guide */
		System.out.println("\n\t\t********** Are you going to type 5 numbers, in order to be summarize **********");
		
		/** Created the for loop in order to receive the user interaction */
		for(int i = 0; i < 5; i ++ ) {
			System.out.print("\n\t\tPlease, insert the number -> ");
			numbers.add(input.nextDouble());
			
		}//closing for loop 
		
		if(numbers.contains(3.0)) {
			System.out.print("\n\t\t" + sum(numbers));
		}
		
		
		input.close();
	}//closing the mains method

	/** Created the necessary method described */
	public static double sum(ArrayList<Double> list) {
		
		/** Using stream */
		Double sum = list.stream().mapToDouble(a -> a).sum();
		
		/** Using for each */
		for (Double d : list) {
			sum += d;
		}
		
		return sum;
	}
}//closing class exercise_11_12
