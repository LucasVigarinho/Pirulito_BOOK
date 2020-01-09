package chapter_06;

/**
 * 
 * 		(Sum series) Write a method to compute the following series:
 * 	
 * 		
 * 		m(i) = 1/2 + 2/3 + ... + i / (i+1)
 * 	
 * 
 * 		Write a test program that displays the following table:
 * 		i 		m(i)
 * 		1 		0.5000
 * 		2 		1.1667
 * 		...
 * 		19 		16.4023
 * 		20 		17.3546
 * 
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;;

/** Created the class exercise 6 13 **/
public class Exercise_6_13 {

	/** Creating a main class */
	public static void main (String[] args) {

		/** Created an object */
		DecimalFormat df0 = new DecimalFormat("###");
		DecimalFormat df4 = new DecimalFormat("###.0000");

		/** Print out a message to display the table */
		System.out.print("\n\n\tWrite a test program that displays the following table:");

		System.out.print("\n\n\ti\tm(i)");

		double sum = 0;

		/** Create a for loop in order to print all the answers of the table */
		for (double i = 1.0; i <= 20; i++) {
			System.out.print("\n\n\t" + df0.format(i) + "\t" + df4.format(sum += i / (i + 1)));

		}//closing for loop 

	}//closing the main method

}//closing the class
