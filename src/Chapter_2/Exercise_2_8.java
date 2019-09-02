package Chapter_2;

import java.util.Scanner;


/** 
 * 
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone. Here
 * is a sample run:
 * 		 		Here is a sample run:
 * 		
 * 				Enter the time zone offset to GMT: −5
 * 				The current time is 4:50:34
 * 
 * 
 * */
public class Exercise_2_8{

	/** Constructor not utilized */
	public Exercise_2_8() {
		
	}//close constructor

	/** Automatic generated main method */
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
		
		totalHoursNow = totalHoursNow + timeZone;
		
		//Confirming the value informed
		System.out.println("\n\tThe number informed is \t\t--> " + timeZone);
		
				
		//Printing out the result of the transformation
		System.out.println("\n\tThe current time is " + totalHoursNow + ":" + totalMinutesNow + ":" + totalSecondsNow);

		input.close();
		
		
	}//close main method

}//close class Exercise_2_8
