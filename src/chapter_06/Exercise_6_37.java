package chapter_06;

/**
 * 
 * 
 * 		(Format an integer) Write a method with the following header to format the integer
 * 		with the specified width.
 * 
 * 		public static String format(int number, int width)
 * 
 * 		The method returns a string for the number with one or more prefix 0s. The size
 * 		of the string is the width. For example, format(34, 4) returns 0034 and format(
 * 		34, 5) returns 00034. If the number is longer than the width, the method
 * 		returns the string representation for the number. For example, format(34, 1)
 * 		returns 34.
 * 
 * 		Write a test program that prompts the user to enter a number and its width and
 * 		displays a string returned by invoking format(number, width).
 * 
 * @author lucasmaximo
 *
 */
/** Importing the necessary libraries */
import java.util.Scanner;

/** Created the exercise class */
public class Exercise_6_37 {

	/** Created the main method */
	public static void main(String [] args) {

		/** Created the objects necessary */
		Scanner input = new Scanner(System.in);

		/** Print out the message to be the guide for the user interaction number */
		System.out.print("\n\n\tType her the number -> ");
		/** Created the variables necessary to absorb the user interaction number */
		int number = input.nextInt();
		/** Print out the message to be the guide for the user interaction width fo the number */
		System.out.print("\n\tType her the size  -> ");
		/** Created the variables necessary to absorb the user interaction width of the number */
		int width = input.nextInt();

		
		/** Calling the method format */
		System.out.print("\n\tThe number formated is -> " + format(number, width));
		
		input.close();
	}//closing the main method

	/** Created the method following the instructions */
	public static String format(int number, int width) {

		/** Created the necessary variables */
		String form = "";
		String test = String.valueOf(number);
		
		/** Created a if statement in order to not apply "0" when is the width lower than the length of the number*/
		if(width < test.length()) {
			
		}else{
			/** Created a for loop to apply the "0" with the limit of the length of the number */
			for(int i = 0; i < width - test.length(); i++) {
				form += "0";
			}//closing for loop
		}//closing if statement
		
		//apply the number after the string with the zeros applied
		form += number;
		return form;
	}//close the method
	
}//closing class
