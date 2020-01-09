package chapter_06;

import java.text.SimpleDateFormat;
/**
 * 
 * 		(Current date and time) Invoking System.currentTimeMillis() returns the
 * 		elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 * 		that displays the date and time. Here is a sample run:
 * 
 * 		Current date and time is May 16, 2012 10:34:23
 *
 * @author lucasmaximo
 *
 */
import java.util.Date;


/** Created the exercise_6_33 class */
public class Exercise_6_33 {

	/** Created the main method */
	public static void main(String [] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		System.out.println("\n\n\t Current date and time is " + formatter.format(time()));
	}//closing the main method

	//**created the method to set the time */
	public static Date time() {

		long millis = System.currentTimeMillis();  

		Date date2 = new Date(millis);  

		return (date2);
	}//close Time method

}//closed the exercise_6_33
