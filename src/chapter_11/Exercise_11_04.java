package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Maximum element in ArrayList) Write the following method that returns the
 * 		maximum value in an ArrayList of integers. The method returns null if the
 * 		list is null or the list size is 0.
 * 		
 * 		public static Integer max(ArrayList<Integer> list)
 * 
 * 		Write a test program that prompts the user to enter a sequence of numbers ending
 * 		with 0, and invokes this method to return the largest number in the input.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES  */
import java.util.ArrayList;
import java.util.Scanner;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_04 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Created the objects necessary to input from the user in an ArrayList */
		ArrayList<Integer> test = new ArrayList<>();
		Scanner input = new Scanner (System.in);
		System.out.print("Enter input end with zero to stop: ");
		int user = input.nextInt();
		
		while (user != 0) {
			test.add(user);
			user = input.nextInt();
		}
		
		System.out.print(max(test));
		
		
	}//closing the mains method

	/**  The method returns null if the list is null or the list size is 0.*/
	public static Integer max(ArrayList<Integer> list) {
		
		if(list == null || list.isEmpty()) {
			return null;
		}
		
		int max = 0;
		
		for(int a = 0; a < list.size(); a++) {
			if(list.get(a) != 0 && list.get(a) > max) {
				max = list.get(a);
			}
		}
		
		return max;
	}
	
}//closing class exercise_11_01
