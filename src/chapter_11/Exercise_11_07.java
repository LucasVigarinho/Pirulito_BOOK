package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Shuffle ArrayList) Write the following method that shuffles the elements in
 * 		an ArrayList of integers.
 * 		
 * 		public static void shuffle(ArrayList<Integer> list)
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;
import java.util.Collections;


/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_07 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Created an Array List */
		ArrayList<Integer> test = new ArrayList<>();
		
		/** Inputed the value in sequence in order to test the shuffle*/
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		
		/** Print the list created in order to visualize the result*/
		print(test);
		
		/** Shuffle the list using the method created */
		shuffle(test);
		
		/** Print the list shuffled in order to visualize the result */
		print(test);
	}//closing the mains method

	/** Created the shuffle method utilizing a shuffle method from collections library */
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}
	
	/** Created a print method in order to avoid re code */
	public static void print(ArrayList<Integer> list) {
		System.out.print("\n\t");
		for (int a = 0; a < list.size(); a++ ) {
			System.out.print((a==0)?list.get(a).toString():", " + list.get(a).toString());
		}
	}
}//closing class exercise_11_01

