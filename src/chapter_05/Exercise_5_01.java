package chapter_05;


/**    ************* Description of the Exercise_5_1 *************
 * 
 * 		(Count positive and negative numbers and compute the average of numbers) Write
 * 		a program that reads an unspecified number of integers, determines how many
 * 		positive and negative values have been read, and computes the total and average of
 * 		the input values (not counting zeros). Your program ends with the input 0. Display
 * 		the average as a floating-point number. Here is a sample run:
 * 
 * 		Enter an integer, the input ends if it is 0: 1 2 -1 3 0
 * 		The number of positives is 3
 * 		The number of negatives is 1
 * 		The total is 5.0
 * 		The average is 1.25
 * 		
 * 		Enter an integer, the input ends if it is 0: 0
 * 		No numbers are entered except 0
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_1 */
public class Exercise_5_01 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		/** Create an object to absorb the user insertion */
		Scanner input = new Scanner (System.in);
		
		/** Create necessary variables **/
		int positive = 0;
		int negative = 0;
		int total = 0;
		double average = 0;
		double sum = 0;
		
		/** Print out the message to be an user guide */
		System.out.print("\n\n\tEnter an integer, the input ends if it is 0: ");
		int number = input.nextInt();//create the variable to absorb the user insertion
		
		/** create an if statement in order to test the first number been a zero */
		if(number == 0) {
			System.out.print("\n\n\tNo numbers are entered except 0");
		}//closing if statement
		
		/** create a do loop while the number zero is not inserted */
		do {
			
			if(number > 0) {
				positive++;
				total++;
				sum += number;
			}else {
				negative++;
				total++;
				sum += number;
			}//closing if statement
			number = input.nextInt();
		}while(number != 0);		//closing the do loop using while
		
		average = sum / total;
		
		System.out.print("\n\n\tThe number of positives is " + positive + "\n");
		System.out.print("\tTThe number of negatives is " + negative + "\n");
		System.out.print("\tThe total is " + sum + "\n");
		System.out.print("\tThe average is " + average);
		
		
		 input.close();
		 
	}//closing the main method


}//closing the class_5_1
