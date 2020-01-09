package chapter_06;
/** 
 * 
 * 		(Financial application: compute the future investment value) Write a method that
 * 		computes future investment value at a given interest rate for a specified number
 * 		of years. The future investment is determined using the formula in Programming
 * 		
 * 		Exercise 2.21.
 * 		
 * 		Use the following method header:
 * 		
 * 		public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
 * 		
 * 
 * 		For example, futureInvestmentValue(10000, 0.05/12, 5) returns
 * 		12833.59.
 * 		
 * 		Write a test program that prompts the user to enter the investment amount (e.g.,
 * 		1000) and the interest rate (e.g., 9%) and prints a table that displays future value
 * 		for the years from 1 to 30, as shown below:
 * 		
 * 		The amount invested: 1000
 * 		Annual interest rate: 9
 * 		Years Future Value
 * 		1 		   1093.80
 * 		2          1196.41
 * 		...
 * 		29        13467.25
 * 		30        14730.57
 * 		
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;
/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_07*/
public class Exercise_6_07{

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df = new DecimalFormat("$####.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("\n\n\tEnter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		System.out.print("\n\n\tEnter number of years: ");
		int years = input.nextInt();

		//print out the annunciate
		System.out.print("\n\n\tYears\tFuture Value");
		//crete for loop to print out the values per year
		for (int i = 1; i <= years; i++) {
			System.out.print("\n\t" + i + "\t" + df.format(futureInvestmentValue(amount, interestRate, i)));
		}//closing the for loop
		

		input.close();
		
	}//closing the main method

	/** Creating the method futureInvestmentValue following the instructions */
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		double interestMonth = (monthlyInterestRate/12)/100;
		double months = years* 12;
		double accumulated2 = investmentAmount;
		for(int i = 1; i <= months; i++) {
			accumulated2 += (interestMonth * accumulated2);
		}
		return accumulated2;
	}//closing the fututureInvestmentValue

}//closing the class_6_07
