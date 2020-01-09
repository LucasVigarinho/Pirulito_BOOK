package chapter_06;

/** 
 * 
 * 		(Number of days in a year) Write a method that returns the number of days in a
 * 		year using the following header:
 * 
 * 		public static int numberOfDaysInAYear(int year)
 * 
 * 		Write a test program that displays the number of days in year from 2000 to 2020.
 * 
 * @author lucasmaximo
 *
 */

import java.util.Scanner;

/** Create a exercise_6_16 class */
public class Exercise_6_16 {

	/** Create the main method */
	public static void main (String[] args) {
		
		/** Created the objects */
		Scanner input = new Scanner (System.in);
		
		/** Print the interaction with the user */
		System.out.print("\n\n\tType the year to be calculate number of the days -> ");
		/** Created the variable to absorb the user interaction */
		int year = input.nextInt();
		
		/** print out the message calling the method to count days of the year */
		System.out.print("\n\n\tThis year has " + numberOfDaysInAYear(year) + " days.");

		input.close();
	}//closing main method
	
	
	/** Created a method following the instructions */
	public static int numberOfDaysInAYear(int year) {
		
		//create an if statement in order to see if is or not a leap year
		if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0 ) {
			return 366;
		}else {
			return 365;
		}//close if statement
		
	}//close a plublic method numberOfDaysInYear
	
}//close class_6_16
