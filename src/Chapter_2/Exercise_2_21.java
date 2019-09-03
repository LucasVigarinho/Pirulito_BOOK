package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 * futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 * 			
 * 				Here is a sample run:
 * 
 * 
 * 				Enter investment amount: 1000.56
 * 				Enter annual interest rate in percentage: 4.25
 * 				Enter number of years: 1
 * 						
 * 				Accumulated value is $1043.92
 * */
public class Exercise_2_21{

	/** Constructor not utilized */
	public Exercise_2_21() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("$####.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("\n\n\tEnter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();
		System.out.print("\n\n\tEnter number of years: ");
		double years = input.nextDouble();

		double interestMonth = (interestRate/12)/100;
		double months = years* 12;
		double accumulated1 = amount + ((interestMonth * amount) * months);
		double accumulated2 = amount;
		for(int i = 1; i <= months; i++) {
			accumulated2 += (interestMonth * accumulated2);
		}
		
		System.out.print("\n\tThe area of the triangle is " + df.format(accumulated1));
		System.out.print("\n\tThe area of the triangle is " + df.format(accumulated2));

		input.close();

	}//close main method

}//close class Exercise_2_21
