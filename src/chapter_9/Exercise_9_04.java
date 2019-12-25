package chapter_9;

/** 
 * 			(Use the Random class) Write a program that creates a Random object with seed
 * 		1000 and displays the first 50 random integers between 0 and 100 using the
 * 		nextInt(100) method.
 * 
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Random;

/** Creating the class named Exercise_9_04 */
public class Exercise_9_04{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variable
		Random randomN = new Random(1000);
		
		//print out a first line jump and spaces for visual motives
		System.out.print("\n\n\t");
		//created a for loop in order to print out the first 50 between 0 to 100
		for(int a = 0; a < 50; a++ ) {
			//created a if statement in order to print only 10 by 10 lines
			if(a != 0 && (a % 10) == 0) {
				System.out.print("\n\t" + randomN.nextInt(100) + "\t");
			}else {
				System.out.print("" + randomN.nextInt(100) + "\t");
			}//closing the if statement
		}//closing for loop
	}//closing the main method

	
}//closing the class_9_04

