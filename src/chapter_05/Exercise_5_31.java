package chapter_05;



/**    ************* Description of the Exercise_5_31 *************
 * 
 * 		(Financial application: compute CD value) Suppose you put $10,000 into a CD
 * 		with an annual percentage yield of 5.75%. After one month, the CD is worth
 * 
 * 						10000 + 10000 * 5.75 / 1200 = 10047.92
 * 
 * 		After two months, the CD is worth
 * 
 * 						10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
 * 
 * 		After three months, the CD is worth
 * 
 * 						10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
 * 		and so on.
 * 
 * 		Write a program that prompts the user to enter an amount (e.g., 10000), the
 * 		annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 * 		displays a table as shown in the sample run.
 * 
 * 
 * 		Enter the initial deposit amount: 10000
 * 		Enter annual percentage yield: 5.75
 * 		Enter maturity period (number of months): 18
 * 		
 * 		Month 		CD Value
 * 		1 			10047.92
 * 		2 			10096.06
 * 		...
 * 		17 			10846.57
 * 		18 			10898.54
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

import java.text.DecimalFormat;
import java.util.Scanner;

/** Creating the class named Exercise_5_31 */
public class Exercise_5_31 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("####.00");
		
		
		//create the necessary variables
		System.out.print("\n\n\tEnter the initial deposit amount: (e.g., 10000) -> ");
		double amount = input.nextDouble();

		System.out.print("\n\tEnter annual percentage yield: (e.g, 5.75) -> ");
		double interestRate = (input.nextDouble()/100.0);
		
		System.out.print("\n\tEnter maturity period (number of months): (e.g, 18) -> ");
		int months = input.nextInt();
	
		//calculation
		
		System.out.print("\n\n\tMonth\t\tCD Value");
		//open a for loop in order to calculate, according to the number of months
		for(int i = 0; i < months; i++) {
			 amount += (amount * ( (interestRate / 12.0)));
			System.out.print("\n\t"+ (i+1) + "\t\t" + df2.format(amount));
		}//closing for loop
	
		input.close();
	}//closing the main method
		
		
		



}//closing the class_5_31
