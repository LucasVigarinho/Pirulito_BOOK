package chapter_5;


/**    ************* Description of the Exercise_5_4 *************
 * 
 * 		(Conversion from miles to kilometers) Write a program that displays the following
 * 		table (note that 1 mile is 1.609 kilometers):
 * 
 * 
 * 		Miles Kilometers
 * 		1 	  1.609
 * 		2 	  3.218
 * 		...
 * 		9 	  14.481
 * 		10 	  16.090
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

import java.text.DecimalFormat;

/** Creating the class named Exercise_5_4*/
public class Exercise_5_4{

	/** Creating the main method */
	public static void main(String[] arg) {
		
		DecimalFormat df = new DecimalFormat("####.000");
		
		//Create the necessary variables
		int miles = 1;
		
		//printing out the first message
		System.out.print("\n\n\tMiles  Kilometers");
		
		//initiate for loop in order to fill the results expect
		for(int i = 1; i <= 10; i++) {
			miles = i;
			double kilometers = 1.609 * miles;
			System.out.print("\n\n\t" + miles + "\t" + df.format(kilometers));
		}//close for loop

		
	}//closing the main method


}//closing the class_5_4
