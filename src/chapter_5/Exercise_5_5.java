package chapter_5;



/**    ************* Description of the Exercise_5_5 *************
 * 
 * 		(Conversion from kilograms to pounds and pounds to kilograms) Write a program
 * 		that displays the following two tables side by side:
 * 
 *  * 		Miles Kilometers     |     		Kilograms Pounds
 * 		1 	  1.609				 |			1 		  2.2
 * 		2 	  3.218			     |			3 	      6.6
 * 		...						 |			...
 * 		9 	  14.481    		 |   	 	197 	  433.4
 * 		10 	  16.090 			 | 			199 	  437.8
 * 
 *
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_5 */
public class Exercise_5_5 {

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df = new DecimalFormat("####.000");
		DecimalFormat df1 = new DecimalFormat("####.0");
		//Create the necessary variables
		int miles = 1;
		int kilograms =1;
		int var = 2;

		//printing out the first message
		System.out.print("\n\n\tMiles\tKilometers\t |\tKilograms\tPounds");

		//initiate for loop in order to fill the results expect
		for(int i = 1; i <= 199; i++) {
			miles = i;
			double kilometers = 1.609 * miles;
			double pounds = 2.2 * kilograms;
			
			System.out.print("\n\t"+ (miles<=10? miles + "\t" + df.format(kilometers):"\t ")+ "\t\t | \t"+ kilograms + "\t\t" + df1.format(pounds));
	
			kilograms+= var;
		}//close for loop
		//generate random


	}//closing the main method


}//closing the class_5_5
