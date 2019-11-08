package chapter_6;

/**
 * 
 * 		(Count the letters in a string) Write a method that counts the number of letters in
 * 		a string using the following header:
 * 
 * 		public static int countLetters(String s)
 * 
 * 		Write a test program that prompts the user to enter a string and displays the number
 * 		of letters in the string.
 * 
 * @author lucasmaximo
 *
 */
/** import the library needed */
import java.util.Scanner;

/** created the exercise 6 20 class */
public class Exercise_6_20 {
	
	
	/** Created the main method */
	public static void main (String [] args) {
		/** Created the Scanner method */
		Scanner input = new Scanner (System.in);
			
		/** Print out the message to ask to the user input the String */
		System.out.print("\n\n\tInput the String to be counted ->");
		/** Created the variable in order to absorb the user input */
		String s = input.nextLine();
		
		System.out.print("\n\n\tThe number of letters is " + countLetters(s));
		
		input.close();
	}//closing main method 
	
	/** created a method countLetters following the instructions */
	public static int countLetters(String s) {
		// created the variable to count
		int count = 0;
		
		/** Created the for loop in order to count the letters */
		for(int i = 0; i < s.length(); i++) {
			//created a if statement in order to test if the character is or not is a letter
			if(Character.isLetter(s.charAt(i))) {
				count+=1;
			}//closing the if statement
		}//closing the for loop
		return count;
	}//closing countLetters method
	
}//closing class exercise_6_20
