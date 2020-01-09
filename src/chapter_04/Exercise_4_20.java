package chapter_04;

/**    ************* Description of the Exercise_4_20 *************
 * 
 * 		(Process a string) Write a program that prompts the user to enter a string and displays
 * 		its length and its first character.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_20 */
public class Exercise_4_20 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//Create the object to absorb the string inputed by the user
		Scanner input = new Scanner(System.in);

		//printig out a message to communicate with the user
		System.out.print("\n\n\tInsert one String: ");

		//absorb the information
		String message = input.nextLine();


		//the length of the message
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			count++;
		}//closing for loop

		//print out the information
		System.out.print("\n\n\tThe first character is \t\t-> " +  message.charAt(0));
		System.out.print("\n\n\tThe message has a length of \t-> " + count);

		//closing object input
		input.close();


	}//closing the main method


}//closing the class_4_20
