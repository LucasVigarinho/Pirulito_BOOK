package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Financial application: calculate interest) If you know the balance and the annual
 * percentage interest rate, you can compute the interest on the next monthly payment
 * using the following formula:
 * interest = balance * (annualInterestRate/1200)
 * 
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month. Here is a sample run:
 * 
 * 
 * 				Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
 * 				The interest is 2.91667
 * */
public class Exercise_2_20{

	/** Constructor not utilized */
	public Exercise_2_20() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.#####");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		

		double interest = balance * (interestRate/1200);
		
		System.out.print("\tThe area of the triangle is " + df.format(interest));

		input.close();
		
	}//close main method

}//close class Exercise_2_20
