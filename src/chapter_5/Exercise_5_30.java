package chapter_5;


/**    ************* Description of the Exercise_5_30 *************
 * 
 * 		(Financial application: compound value) Suppose you save $100 each month
 * 		into a savings account with the annual interest rate 5%. So, the monthly interest
 * 		rate is 0.05 / 12 = 0.00417. After the first month, the value in the account
 * 		becomes
 * 
 * 				100 * (1 + 0.00417) = 100.417
 * 		After the second month, the value in the account becomes
 * 				
 * 				(100 + 100.417) * (1 + 0.00417) = 201.252
 * 		After the third month, the value in the account becomes
 * 		
 * 				
 * 				(100 + 201.252) * (1 + 0.00417) = 302.507
 * 		and so on.
 * 
 * 		Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * 		interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
 * 		in the savings account after the given month
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_30 */
public class Exercise_5_30 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df3 = new DecimalFormat("####.000");
		
		
		//create the necessary variables
		System.out.print("\n\n\tPrease, enter an amout (e.g., 100) -> ");
		double amount = input.nextDouble();

		System.out.print("\n\tPlease, enter the annual interest rate - > ");
		double interestRate = (input.nextDouble()/100.0);
		
		System.out.print("\n\tPlease, enter the number of months (e.g, 6) -> ");
		int months = input.nextInt();
		double result = 0;
		//calculation
		
		
		//open a for loop in order to calculate, according to the number of months
		for(int i = 0; i < months; i++) {
			 result = (result + amount) * (1 + (interestRate / 12.0));
			System.out.print("\n\tThe amount in the saving account after " + (i+1) + " month is -> " + df3.format(result));
		}//closing for loop
	
	}//closing the main method


}//closing the class_5_30
