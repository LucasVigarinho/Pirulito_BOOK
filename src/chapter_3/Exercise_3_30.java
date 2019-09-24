package chapter_3;

import java.util.Scanner;

/**
 * 
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 * 
 * 
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34 AM
 */

/** Defining the main class*/
public class Exercise_3_30 {

	/** Defining the constructor of the class */
	public Exercise_3_30() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);


		//Asking to the user inform 
		System.out.print("\n\tPlease, Enter the time zone offset to GMT:  \t--> ");


		int timeZone = input.nextInt();

		// milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds/1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;

		long totalSecondsNow = totalSeconds % 60;
		long totalMinutesNow = totalMinutes % 60;
		long totalHoursNow = totalHours % 24;

		
		//Confirming the value informed
		System.out.println("\n\tThe number informed is \t\t--> " + timeZone);


		if (totalHoursNow > 12) {
			//Printing out the result of the transformation
			System.out.println("\n\tThe current time is " + (totalHoursNow - 12) + ":" + totalMinutesNow + ":" + totalSecondsNow + " " + "PM" );

		}else {
			//Printing out the result of the transformation
			System.out.println("\n\tThe current time is " + (totalHoursNow) + ":" + totalMinutesNow + ":" + totalSecondsNow + " " + "AM" );

		}



		input.close();


	}//closing the main method

}//closing class exercise_3_29
