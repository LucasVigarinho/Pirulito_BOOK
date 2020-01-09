package chapter_06;

/**
 * 
 * 		(Occurrences of a specified character) Write a method that finds the number of
 * 		occurrences of a specified character in a string using the following header:
 * 
 * 		public static int count(String str, char a)
 * 
 * 		For example, count("Welcome", 'e') returns 2. Write a test program that
 * 		prompts the user to enter a string followed by a character and displays the number
 * 		of occurrences of the character in the string.
 * 
 * @author lucasmaximo
 *
 */
/** import the necessary libraries */
import java.util.Scanner;

/** Created the class */
public class Exercise_6_23 {

	/** created the main method **/
	public static void main (String[] args) {

		/** Created the objects needed */
		Scanner input = new Scanner(System.in);
		

		/** Print out the message to be a guide for the user interaction */
		System.out.print("\n\n\tEnter a string: ");
		/** Created the variable to absorb the user insertion */
		String text = input.nextLine();
		/** Print out the message to be a guide for the user interaction */
		System.out.print("\n\n\tWhat is the letter to be analysed: ");
		/** Created the variable to absorb the user insertion */
		String letter = input.nextLine();
		
		
		System.out.print("\n\n\tFor example - " + text + " - counts " + count(text, letter.charAt(0)) + " ocurrences of the letter " + letter.charAt(0) );

		
		/** closing the object opened  */
		input.close();
	}//closing the main method

	/** Create the method in order to count occurrences */
	public static int count(String str, char a) {
		int count = 0;
		//create a for loop to analyze the substring of the string
		for (int i = 0; i < str.length(); i++) {
			//creating a if statement in order to count the ocurrences
			if (str.charAt(i) == a) {
				count +=1;
			}//closing if statement
		}//closing the for loop
		
		return count;
	}//closing count method
}//closing class
