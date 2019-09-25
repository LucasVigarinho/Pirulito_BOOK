package chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;;

/**
 * 
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 * Here are the sample runs:
 * 
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 * 
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Incorrect input
 * 
 */

/** Defining the main class*/
public class Exercise_3_31 {

	/** Defining the constructor of the class */
	public Exercise_3_31() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		//Creating necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.0");
		
		//print out asking to give the user a opportunity to insert information
		System.out.print("\n\n\tEnter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		System.out.print("\n\n\tEnter 0 to convert dollars to RMB and 1 vice versa: ");
		double convert = input.nextDouble();
		System.out.print("\n\n\tEnter the dollar amount: ");
		double amount = input.nextDouble();
		
		double ans = 0;
		//calculation
		if( convert == 0) {
			ans = rate * amount;
			System.out.print("\n\n\t $" + df.format(amount) + " is " + df.format(ans) + " vuan" );
		}else if (convert == 1){
			ans = amount / rate ;
			System.out.print("\n\n\t" + df.format(amount) + "vuan is " + df.format(ans) + " $" );
		}else {
			System.out.print("Incorrect input. You should insert 0 ou 1");
		}
	
		
		input.close();
		
	}//closing the main method

}//closing class exercise_3_31