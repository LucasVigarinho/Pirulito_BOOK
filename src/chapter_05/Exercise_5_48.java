package chapter_05;



/**    ************* Description of the Exercise_5_48 *************
 * 
 * 
 * 		(Process string) Write a program that prompts the user to enter a string and displays
 * 		the characters at odd positions. Here is a sample run:
 * 
 * 		Enter a string: Beijing Chicago
 * 		BiigCiao
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_48 */
public class Exercise_5_48 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		
		//Creating the variable necessary to absorb the user interaction
		String userInteraction = " ";
		boolean test = true; //create a variable in order to find the odds
		
		//Print out the message which make possible the interaction between user and system
		System.out.print("\n\n\tEnter a string: ");
		userInteraction = input.nextLine();
		System.out.print("\n\n\t");
		
		//create a for loop in order to print out the odd char
		for(int i = 0; i < userInteraction.length(); i++) {
			
			//create a char variable in order to absorb the char form the odd string position
			char letter = (char) userInteraction.charAt(i);
			//create a if statement in order to print only the right letter
			if(test) {
				System.out.print(letter);
				test = false;
			}else {
				test = true;
			}
		}//close for loop
		
		input.close();
	}//closing the main method


}//closing the class_5_48
