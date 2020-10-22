package chapter_12;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Write/read data) Write a program to create a file named Exercise12_15.txt if
 * 		it does not exist. Write 100 integers created randomly into the file using text
 * 		I/O. Integers are separated by spaces in the file. Read the data back from the
 * 		file and display the data in increasing order.
 * 		
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (15) in a compose name */
public class Exercise_12_15 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) throws Exception {
		
		/** Creating the file and giving to it a properly name */
		File file = new File ("Exercise12_15.txt");
		if(file.exists()) {
			System.out.println("File already exists");
//			file.delete();
			System.exit(0);
		}
		
		try(
			PrintWriter output = new PrintWriter(file);
			){
			/** Write 100 integers created randomly into the file using text
			 *	I/O */
			for (int i = 0; i < 100; i++) {
				output.print(((int) (Math.random() * 100) + 1) + " ");
				
			}
			
		}

		/** Creating an array List in order to sort the numbers in order to receive it and print out */
		ArrayList<Integer> list = new ArrayList<>();
		
		try(
				Scanner input = new Scanner(file);
			){
			while(input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		
		/** In order to have the array List sorted*/
		Collections.sort(list);
		
		System.out.print(list.toString());
		System.out.println();
		
		
	}//closing the mains method

	
}//closing class exercise_12_15
