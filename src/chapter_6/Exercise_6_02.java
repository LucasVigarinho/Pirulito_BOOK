package chapter_6;
/** 
 * 
 * 		(Sum the digits in an integer) Write a method that computes the sum of the digits
 * 		in an integer. Use the following method header:
 * 
 * 
 * 		public static int sumDigits(long n)
 * 
 * 		For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
 * 		to extract digits, and the / operator to remove the extracted digit. For instance,
 * 		to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 * 		(= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 * 		are extracted. Write a test program that prompts the user to enter an integer and
 * 		displays the sum of all its digits.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_02*/
public class Exercise_6_02{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tInsert the numbers to be summarized -> ");
		//Create a variable to absorb the user insertion summarized
		long number = input.nextLong();
		
		//print out the messages 
		System.out.print("\n\n\t" + sumDigits(number));
		
	}//closing the main method

	/** Method created in order to follow the instructions  */
	public static int sumDigits(long n) {
		/** Create the variable to summarized*/
		int sum = 0;
		long number = n;
		String test = Long.toString(n);
		
		//create a for loop in order to calculate
		for(int i = 0; i < test.length(); i++) {
			sum+=number%10;
			number/=10;
		}//closing for loop
		
		return sum;
	}
}//closing the class_6_02
