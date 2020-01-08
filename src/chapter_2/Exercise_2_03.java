package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter.
 * 				
 * 
 * 		Here is a sample run:
 * 		
 * 				Enter a value for feet: 16.5
 * 
 * 				16.5 feet is 5.0325 meters
 * 			
 * */
public class Exercise_2_03{

	/** Constructor not utilized */
	public Exercise_2_03() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("##.####");
		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, Enter a value for feet: \t--> ");
		
		//Naming the first scanner object as Celsius
		Double feets = input.nextDouble();

		//Confirming the value informed
		System.out.println("\n\tThe value informed of feet is \t\t--> " + feets + " feets.");
		
		//Creating the variable Fahrenheit using the formula informed
		double meters = ((feets) * 0.305);

				
		//Printing out the result of the transformation
		System.out.println("\n\tThe meters of " + feets + " feets is -->" + df.format(meters) );

		input.close();
		
		
	}//close main method

}//close class Exercise_2_3
