package chapter_9;

/** 
 * 			
 * 		(Use the Date class) Write a program that creates a Date object, sets its elapsed
 * 		time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 		10000000000, and 100000000000, and displays the date and time using the
 * 		toString() method, respectively.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Date;

/** Creating the class named Exercise_9_03 */
public class Exercise_9_03{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the first object using the library date, using 10000
		Date date1 = new Date(10000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date1.toString());

		//create the second object using the library date, using 10000
		Date date2 = new Date(100000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date2.toString());

		//create the third object using the library date, using 10000
		Date date3 = new Date(1000000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date3.toString());

		//create the fourth object using the library date, using 10000
		Date date4 = new Date(10000000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date4.toString());

		//create the fifth object using the library date, using 10000
		Date date5 = new Date(100000000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date5.toString());

		//create the sixth object using the library date, using 10000
		Date date6 = new Date(1000000000);
		//printing out the date from 1970 using toString() method
		System.out.print("\n\n\t"+ date6.toString());
		
		//out of range - check on Internet possible solutions

//		//create the seventh object using the library date, using 10000
//		Date date7 = new Date(10000000000);
//		//printing out the date from 1970 using toString() method
//		System.out.print("\n\n\t"+ date7.toString());
//
//		//create the eight object using the library date, using 10000
//		Date date8 = new Date(100000000000);
//		//printing out the date from 1970 using toString() method
//		System.out.print("\n\n\t"+ date8.toString());

	}//closing the main method


}//closing the class_9_03



