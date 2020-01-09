package chapter_04;

/**    ************* Description of the Exercise_4_26 *************
 * 
 * 		(Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 * 		java, to fix the possible loss of accuracy when converting a float value to an int
 * 		value. Read the input as a string such as "11.56". Your program should extract
 * 		the dollar amount before the decimal point and the cents after the decimal amount
 * 		using the indexOf and substring methods.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_26 */
public class Exercise_4_26 {

	/** Creating the main method */
	public static void main(String[] args) {
		// Create the object through Scanner to absorb the user inserction
		Scanner input = new Scanner(System.in);

		// printing out the message to the user insert the amount
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();

		// using the substring 0 determined by the indexOf as a '.' the limit
		String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

		// transforming the cents part as a Double to a integer
		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		// Analyzed and find out the number of quarters
		int numberOfQuarters = cents / 25;
		cents %= 25;

		// number of dimes
		int numberOfDimes = cents / 10;
		cents %= 10;

		// number of nickels
		int numberOfNickels = cents / 5;
		cents %= 5;

		// Print out the correct answer
		System.out.println("\n\n\tYour amount " + amount + " consists of\n " 
			+ "\t\t\t\t\t" + numberOfOneDollars + " dollars\n " 
			+ "\t\t\t\t\t" +numberOfQuarters + " quarters\n "
			+ "\t\t\t\t\t" +numberOfDimes + " dimes\n "
			+ "\t\t\t\t\t" +numberOfNickels + " nickels\n "
			+ "\t\t\t\t\t" +cents + " pennies\n "
			);
	
		input.close();


	}//closing the main method


}//closing the class_4_26
