package chapter_5;



/**    ************* Description of the Exercise_5_46 *************
 * 
 * 
 * 		(Reverse a string) Write a program that prompts the user to enter a string and
 * 		displays the string in reverse order.
 * 
 * 		Enter a string: ABCD
 * 		The reversed string is DCBA
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;


/** Creating the class named Exercise_5_46 */
public class Exercise_5_46 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);
		
		//create the necessary variable
		System.out.print("\n\n\tEnter a string: ");
		String user = input.nextLine();
		System.out.print("\n\t");
		//create a for loop in order to print the opposite order
		for (int i = user.length()-1; i >= 0; i--) {
			System.out.print(user.charAt(i));
		}//closing for loop
		
		input.close();
	}//closing the main method


}//closing the class_5_46
