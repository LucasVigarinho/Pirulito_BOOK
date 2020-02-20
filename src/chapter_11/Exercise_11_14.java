package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Combine two lists) Write a method that returns the union of two array lists of
 * 		integers using the following header:
 * 
 * 		public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * 
 * 		For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * 		{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * 		each with five integers, and displays their union. The numbers are separated by
 * 		exactly one space in the output. Here is a sample run:
 * 
 * 		Enter five integers for list1: 3 5 45 4 3
 * 		Enter five integers for list2: 33 51 5 4 13
 * 		The combined list is 3 5 45 4 3 33 51 5 4 13
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_14 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		/** Created the object scanner to make possible the user interaction */
		Scanner input = new Scanner (System.in);
		
		/** Created the arrayList in order to absorb the user interaction */
		ArrayList <Integer> list1 = new ArrayList <>();
		ArrayList <Integer> list2 = new ArrayList <>();


		/** Printing out the message to be the user guide */
		System.out.println("\n\t\t********** Are you going to type 5 numbers for the first list, in order to be union betweewn two ArrayList **********");
		
		insert(input, list1);
		
		System.out.println("\n\t\t********** Are you going to type 5 numbers for the second list, in order to be union betweewn two ArrayList **********");

		insert(input, list2);

		
		ArrayList <Integer> unionOfLists = union(list1, list2);
		
		
		System.out.print("\n\n\t\t" + Arrays.deepToString(unionOfLists.toArray()));
		
		input.close();
	}//closing the mains method

	/** created a method in order to insert the numbers inserted by the user into the list */
	public static ArrayList<Integer> insert(Scanner input,  ArrayList <Integer> x ){
		/** Created the for loop in order to receive the user interaction */
		for(int i = 0; i < 5; i ++ ) {
			System.out.print("\n\t\tPlease, insert the number -> ");
			x.add(input.nextInt());
		}//closing for loop 
		
		return x;
	}
	
	/** Created a method union in order to unites the two lists */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		return (ArrayList<Integer>) Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
	}
	
}//closing class exercise_11_01

