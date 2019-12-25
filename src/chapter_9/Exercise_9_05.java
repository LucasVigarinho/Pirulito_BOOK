package chapter_9;



/** 
 * 			(Use the GregorianCalendar class) Java API has the GregorianCalendar class
 * 		in the java.util package, which you can use to obtain the year, month, and day of a
 * 		date. The no-arg constructor constructs an instance for the current date, and the methods
 * 		get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 * 		and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 * 		Write a program to perform two tasks:
 * 		■ Display the current year, month, and day.
 * 		■ The GregorianCalendar class has the setTimeInMillis(long), which
 * 		can be used to set a specified elapsed time since January 1, 1970. Set the value
 * 		to 1234567898765L and display the year, month, and day.
 * 
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/** Creating the class named Exercise_9_05 */
public class Exercise_9_05{

	/** Creating the main method */
	@SuppressWarnings("static-access")
	public static void main(String[] arg) {

		//create the necessary object
		Date todays = new Date();
		Calendar todaysGreg = new GregorianCalendar();

		//print out the todays date
		System.out.print("\n\n\t" + todays);

		//print out the todaysGred date
		System.out.println("\n\n\tCurrent time is " + new Date());
		
		System.out.println("\n\n\tYEAR: " + todaysGreg.get(todaysGreg.YEAR));
		
		System.out.println("\n\n\tMONTH: " + todaysGreg.get(todaysGreg.MONTH));
		
		System.out.println("\n\n\tDAY OF MONTH: " + todaysGreg.get(todaysGreg.DAY_OF_MONTH));
		
		//created the array variable in order to make possible identify the day of the week
		String [] weekDays = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
		
		System.out.println("\n\n\tDAY OF WEEK: " + weekDays[todaysGreg.get(todaysGreg.DAY_OF_WEEK)-1]);

	}//closing the main method


}//closing the class_9_05

