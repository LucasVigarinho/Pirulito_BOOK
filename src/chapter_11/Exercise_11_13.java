package chapter_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;


/**			EXERCISE DESCRIPTION 
 * 
 * 		(Remove duplicates) Write a method that removes the duplicate elements from
 * 		an array list of integers using the following header:
 * 
 * 		public static void removeDuplicate(ArrayList<Integer> list)
 * 
 * 		Write a test program that prompts the user to enter 10 integers to a list and displays
 * 		the distinct integers separated by exactly one space. Here is a sample run:
 * 
 * 		Enter ten integers: 34 5 3 5 6 4 33 2 2 4
 * 		The distinct integers are 34 5 3 6 4 33 2
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */


/** Created the main class, using the name of the package (11) and the exercise (13) in a compose name */
public class Exercise_11_13 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		/** Created the object scanner to make possible the user interaction */
		Scanner input = new Scanner (System.in)
				;
		/** Created the arrayList in order to absorb the user interaction */
		ArrayList <Integer> numbers = new ArrayList <>();

		/** Printing out the message to be the user guide */
		System.out.println("\n\t\t********** Are you going to type 10 numbers, in order to be removed those that are duplicated **********");

		/** Created the for loop in order to receive the user interaction */
		for(int i = 0; i < 10; i ++ ) {
			System.out.print("\n\t\tPlease, insert the number -> ");
			numbers.add(input.nextInt());
		}//closing for loop 

		removeDuplicate(numbers);

		input.close();
	}//closing the mains method

	/** Created the necessary method removeDuplicate 
	 * @param <T>*/
	@SuppressWarnings("unchecked")
	public static void removeDuplicate(ArrayList<Integer> list) {

		@SuppressWarnings({ "rawtypes" })
		ArrayList <Integer> answer = (ArrayList) list.stream().distinct().collect(Collectors.toList());
		
		System.out.print("\n\t\tThe list whitout duplicated numbers -> "  + Arrays.deepToString(answer.toArray()));
		
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll((Collection<? extends Integer>) list);
		list.clear();
		list.addAll((Collection<? extends Integer>) set);
		
		System.out.print("\n\t\tThe list whitout duplicated numbers -> "  + Arrays.deepToString(list.toArray()));

		
		
	}

}//closing class exercise_11_13
