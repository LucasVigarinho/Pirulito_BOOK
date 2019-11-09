package chapter_6;




/** 
 * 
 * 
 * 		(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 * 		current time. Improve this example to display the current date and time. The calendar
 * 		example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 * 		how to find the year, month, and day.
 * 
 * @author lucasmaximo
 *
 */
/** Imported necessary libraries */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

/** Created the exercise_6_24 class */
public class Exercise_6_24 {

	/** Created the main method */
	public static void main (String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date));  


//		System.out.println(java.time.LocalDate.now());  
//
//		System.out.println(java.time.LocalTime.now());  
//
//		System.out.println(java.time.LocalDateTime.now());  
//
//		System.out.println(java.time.Clock.systemUTC().instant());  

		java.util.Date date1 = new java.util.Date();  
		System.out.println(date1); 
		
		long millis = System.currentTimeMillis();  
		java.util.Date date2 = new java.util.Date(millis);  
		System.out.println(date2);

		Date date3 = java.util.Calendar.getInstance().getTime();  
		System.out.println(date3);  
		
	}//closing the main method

	/** Created a method to produce the day */

	/** Created a method to produce the month */

	/** Created a method to produce the year */

	/** Created a method to produce the current time */


}//closing class exercise_6_24
