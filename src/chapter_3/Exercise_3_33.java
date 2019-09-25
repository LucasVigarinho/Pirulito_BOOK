package chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of the each package and displays the one with
 * the better price. Here is a sample run:
 * 
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 * 
 * 
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 * 
 * 
 */

/** Defining the main class*/
public class Exercise_3_33 {

	/** Defining the constructor of the class */
	public Exercise_3_33() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
	
		//Creating the objects to format the information to be printed and to absord the user information
		Scanner input = new Scanner (System.in);

		
		
		//Print out the information to the user knows what has to be entered
		System.out.print("\n\n\tEnter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.print("\n\n\tEnter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		//calculation
		double realPrice1 = price1 / weight1; 
		double realPrice2 = price2 / weight2; 
		
		//if statement to control the right answer
		if (realPrice1 > realPrice2) {
			System.out.print("\n\n\tPackage 2 has a better price. ");
		}else if (realPrice1 < realPrice2) {
			System.out.print("\n\n\tPackage 1 has a better price. ");
		}else {
			System.out.print("\n\n\tTwo packages have the same price. ");
		}//close if statement
		
		//close input object scanner
		input.close();
		
	}//closing the main method

}//closing class exercise_3_33
