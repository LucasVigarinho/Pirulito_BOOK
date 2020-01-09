package chapter_06;

/** 
 * 
 * 		(Estimate p) p can be computed using the following series:
 * 
 *                       i+1
 * 		m(i) = 4 ( * ((-1)	 )
 * 					---------
 * 					2*i - 1
 * 
 * 		Write a method that returns m(i) for a given i and write a test program that displays
 * 		the following table:
 * 		
 * 
 * 		i 		m(i)
 * 		1 		4.0000
 * 		101		3.1515
 * 		201 	3.1466
 * 		301 	3.1449
 * 		401 	3.1441
 * 		501 	3.1436
 * 		601 	3.1433
 * 		701 	3.1430
 * 		801 	3.1428
 * 		901 	3.1427
 * 
 * 
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;

/** Created a class exercise_6_14 */
public class Exercise_6_14 {

	/** Created the main method of the class */
	public static void main (String[] args) {
		/** Created an object */
		DecimalFormat df0 = new DecimalFormat("###");
		DecimalFormat df4 = new DecimalFormat("###.0000");

		System.out.print("\n\n\tPrinting the table");

	

		System.out.print("\n\n\tPrinting table");
		System.out.print("\n\n\ti\tm(i)");

		//create a for loop to print the table 
		for(double i = 1.0; i <= 901.0; i+=100) {
			//printing out the line 
			System.out.print("\n\t" + df0.format(i) + "\t" + df4.format(	pi(i)));
		}//close the for loop

	}//closing main method

	//create a method to print the table
	public static double pi( double finish) {

		double phi = 0;

		//create a for loop in order to calculate until the limit
		for (double i = 1; i <= finish; i++) {
		phi = (((Math.pow((-1.0), (i+1))/(2*i-1))));
		}//closing for loop
		phi *= 4;		
		
		return phi;
	}//closing the table method

}//closing exercise_6_14 class
