package chapter_6;
/** 
 * 
 * 		(Display patterns) Write a method to display a pattern as follows:
 * 					  1
 * 				    2 1
 * 				  3 2 1
 * 		...
 * 		n n-1 ... 3 2 1
 * 
 * 		The method header is
 * 
 * 		public static void displayPattern(int n)
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_06*/
public class Exercise_6_06{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tType the size of the patter to be printed -> ");
		//Create a variable to absorb the user insertion
		int number = input.nextInt();

		//call the method to create the patter
		displayPattern(number);

		input.close();
	}//closing the main method

	/** Create the pattern's method following the instructions */
	public static void displayPattern(int n) {

		//create a for loop responsible for the columns 
		for(int i = 1; i <= n; i++) {
			//Print out the visual position
			System.out.print("\n\t\t\t\t\t\t\t");

			//create a nested for loop in order to print the lines
			for (int j = n; j >= 1; j--) {
				//create a if statement in order to print the spaces or the number in order to create the pattern
				System.out.print((j > i)?"  ":j + " ");

			}//closing the nested for loop (lines)

		}//closing the main for loop responsible by the columns
		//print out the messages 


	}//closing method pattern

}//closing the class_6_06
