package chapter_5;


/**    ************* Description of the Exercise_5_3 *************
 * 
 * 		(Conversion from kilograms to pounds) Write a program that displays the following
 * 		table (note that 1 kilogram is 2.2 pounds):
 * 
 * 
 * 		Kilograms Pounds
 * 		1 		  2.2
 * 		3 	      6.6
 * 		...
 * 		197 	  433.4
 * 		199 	  437.8
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_3 */
public class Exercise_5_3 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		DecimalFormat df = new DecimalFormat("####.0");
		
		//Create the necessary variables
		int kilograms = 1;
		
		//printing out the first message
		System.out.print("\n\n\tKilograms  Pounds");
		
		//initiate for loop in order to fill the results expect
		for(int i = 1; i <= 199; i +=2) {
			kilograms = i;
			double pounds = 2.2 * kilograms;
			System.out.print("\n\n\t" + kilograms + "\t" + df.format(pounds));
		}//close for loop

		
	}//closing the main method


}//closing the class_5_3
