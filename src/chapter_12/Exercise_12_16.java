package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces
 * 		text in a source file and saves the change into a new file. Revise the program to
 * 		save the change into the original file. For example, invoking
 * 
 * 		java Exercise12_16 file oldString newString
 * 
 * 		replaces oldString in the source file with newString.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (16) in a compose name */
public class Exercise_12_16 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** testing all the classes and methods */
		
			File fileName = new File ("Exercise12_15.txt");
			
			String oldString = "L e i t ã o";
			String newString = "Leitão		";
			
			
			String buffer = " ";
			
			try {
				Scanner input = new Scanner(fileName);
				while(input.hasNext()) {
					buffer += (input.nextLine() + " \n");
				}
				input.close();
			System.out.print("Old file: " + buffer);
			buffer = buffer.replaceAll(oldString, newString + " ");
			PrintWriter out = new PrintWriter(fileName);
			out.write(buffer);
			out.close();
			System.out.println("File " + fileName.getName() + "saved...");
			
			}catch (FileNotFoundException ex){
				ex.printStackTrace();
			}

			System.out.println("Updated file: ");
			System.out.print(buffer);
		
	}//closing the mains method
}//closing class exercise_12_16
