package chapter_05;


/**    ************* Description of the Exercise_5_37 *************
 * 
 * 		(Decimal to binary) Write a program that prompts the user to enter a decimal
 * 		integer and displays its corresponding binary value. Don’t use Java’s Integer
 * 		.toBinaryString(int) in this program.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

import java.util.Scanner;

/** Creating the class named Exercise_5_37 */
public class Exercise_5_37 {

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		//create the necessary objects
		System.out.print("\n\n\tEnter the decimal integer -> ");
		int decimalInteger = input.nextInt();

		//calculation
		// create the string in order to print the binary number 
		String binary = "";	
		//create the for loop in order to divide the number per 2 (decimal) in order to find each space
		for (int i = decimalInteger; i > 0; i /= 2) {
			//complete the string from right to the left
			binary = (i % 2) + binary; 
		}//closing for loop

		// Print out the correct answer
		System.out.println(
				"\n\n\tThe binary value of the decimial \"" + decimalInteger + "\" is: " + binary);
		//closing input object
		input.close();


	}//closing the main method


}//closing the class_5_37
