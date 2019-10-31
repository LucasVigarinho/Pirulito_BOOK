package chapter_5;



/**    ************* Description of the Exercise_5_50 *************
 * 
 * 
 * 		(Count uppercase letters) Write a program that prompts the user to enter a string
 * 		and displays the number of the uppercase letters in the string.
 * 
 * 		Enter a string: Welcome to Java
 * 		The number of uppercase letters is 2
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

import java.util.Scanner;
/** Creating the class named Exercise_5_50 */
public class Exercise_5_50 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		

		
		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tEnter a string: ");
		//Create a variable to absorb the user insertion
		String userInsertion = input.nextLine();
		
		//create a variable necessary to count
		int upperCase = 0;
		
		//create a for loop in order to test all the letters
		for(int i = 0; i < userInsertion.length(); i++) {
			int charNumb = (int) userInsertion.charAt(i);
			
			if (charNumb >= 65 && charNumb <= 90 ) {
				upperCase += 1;
			}else {
			
			}
			
		}//closing for loop
		
		//print out the messages 
		System.out.print("\n\tThe number of uppercase letters is: " + upperCase);


		
		input.close();
		
	}//closing the main method
		



}//closing the class_5_50
