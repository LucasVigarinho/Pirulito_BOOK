package chapter_5;



/**    ************* Description of the Exercise_5_43 *************
 * 
 * 
 * 		(Math: combinations) Write a program that displays all possible combinations
 * 		for picking two numbers from integers 1 to 7. Also display the total number of
 * 		all combinations.
 * 
 * 		1 2
 * 		1 3
 * 		...
 * 		...
 * 		The total number of all combinations is 21
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_43 */
public class Exercise_5_43 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n\tType the number limit -> ");
		int number = input.nextInt();
		int count = 0;
		
		//calculation
		for (int i =1; i < number; i++) {
			for (int j = i; j < number; j++) {
				count+=1;
			}
		}//closing for loop
		
		System.out.print("\n\n\tTotal of combinations -> " + count);
	}//closing the main method


}//closing the class_5_43
