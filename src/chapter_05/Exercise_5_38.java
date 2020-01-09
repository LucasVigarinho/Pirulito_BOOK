package chapter_05;

import java.util.Scanner;

/**    ************* Description of the Exercise_5_38 *************
 * 
 * 		(Decimal to octal) Write a program that prompts the user to enter a decimal
 * 		integer and displays its corresponding octal value. Don’t use Java’s Integer
 * 		.toOctalString(int) in this program.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */



/** Creating the class named Exercise_5_38 */
public class Exercise_5_38 {

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		//create the necessary objects
		System.out.print("\n\n\tEnter the decimal integer -> ");
		int decimalInteger = input.nextInt();

		//calculation
		// create the string in order to print the octal number 
		String octal = "";	
		//create the for loop in order to divide the number per 2 (decimal) in order to find each space
		for (int i = decimalInteger; i > 0; i /= 8) {
			
			//complete the string from right to the left
			
			octal = (i % 8) + octal; 
		}//closing for loop

		// Print out the correct answer
		System.out.println(
				"\n\n\tThe binary value of the decimial \"" + decimalInteger + "\" is: " + octal);
		//closing input object
		input.close();


	}//closing the main method


}//closing the class_5_38
