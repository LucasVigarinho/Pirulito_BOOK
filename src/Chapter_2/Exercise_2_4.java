package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 * sample run:
 * 				
 * 		 		Here is a sample run:
 * 		
 * 				Enter a number in pounds: 55.5
 *				
 *				55.5 pounds is 25.197 kilograms
 * 			
 * */
public class Exercise_2_4{

	/** Constructor not utilized */
	public Exercise_2_4() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("##.####");
		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, Enter a number in pounds: \t--> ");
		
		//Naming the first scanner object as Celsius
		Double pounds = input.nextDouble();

		//Confirming the value informed
		System.out.println("\n\tThe value informed of feet is \t\t--> " + pounds + " pounds.");
		
		//Creating the variable Fahrenheit using the formula informed
		double kilograms = ((pounds) * 0.454);

				
		//Printing out the result of the transformation
		System.out.println("\n\tThe kilograms of " + pounds + " pounds is -->" + df.format(kilograms) );

		
		input.close();
		
	}//close main method

}//close class Exercise_2_4
