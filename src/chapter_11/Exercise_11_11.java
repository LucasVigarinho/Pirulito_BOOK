package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 		
 * 		(Sort ArrayList) Write the following method that sorts an ArrayList of
 * 		numbers:
 * 
 * 		public static void sort(ArrayList<Integer> list)
 * 
 * 		Write a test program that prompts the user to enter 5 numbers, stores them in an
 * 		array list, and displays them in increasing order.
 * 
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_11 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Created the object scanner to make possible the user interaction */
		Scanner input = new Scanner (System.in)
				;
		/** Created the arrayList in order to absorb the user interaction */
		ArrayList <Integer> numbers = new ArrayList <>();
		
		/** Printing out the message to be the user guide */
		System.out.println("\n\t\t********** Are you going to type 5 numbers, in order to be sorted **********");
		
		/** Created the for loop in order to receive the user interaction */
		for(int i = 0; i < 5; i ++ ) {
			System.out.print("\n\t\tPlease, insert the number -> ");
			numbers.add(input.nextInt());
		}//closing for loop 
		
		sort(numbers);
		
		input.close();
	}//closing the mains method

	/** Created the method sort as asked */
	public static void sort(ArrayList<Integer> list) {
		
		/** Sort the array list */
		Collections.sort(list);
		System.out.print("\n\t\tThe ArrayList sorted is -> "+ Arrays.deepToString(list.toArray()));
		
	}//closing sort method
	
}//closing class exercise_11_01
