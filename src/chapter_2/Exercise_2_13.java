package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Financial application: compound value) Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account
 * becomes
 * 					100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes
 * 					(100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * 					(100 + 201.252) * (1 + 0.00417) = 302.507
 * and so on.
 * 
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Exercise 5.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter the monthly saving amount: 100
 * 						After the sixth month, the account value is $608.81
 * 
 * 
 * */
public class Exercise_2_13{

	/** Constructor not utilized */
	public Exercise_2_13() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###.##");
		
		System.out.print("\n\t\tEnter the monthly saving amount:  ");
		double amount = input.nextDouble();
		
		//calculation of minimum length
		double firstMonth = (amount * (1 + (0.05/12)));
		double secondMonth = amount + (firstMonth * (1 + (0.05/12)));
		double thirdMonth = amount + (secondMonth * (1 + (0.05/12)));
		double fourthMonth = amount + (thirdMonth * (1 + (0.05/12)));
		double fifthMonth = amount + (fourthMonth * (1 + (0.05/12)));
		double sixthMonth = amount + (fifthMonth * (1 + (0.05/12)));
		
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(firstMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(secondMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(thirdMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(fourthMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(fifthMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(sixthMonth));
		
	}//close main method

}//close class Exercise_2_13
