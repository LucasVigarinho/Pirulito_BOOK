package chapter_05;


/**    ************* Description of the Exercise_5_26 *************
 * 
 * 		(Compute e) You can approximate e using the following series:
 * 
 * 
 * 				e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/i!
 * 
 * 		Write a program that displays the e value for i = 10000, 20000, …, and
 * 		100000. (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
 * 
 * 					1/i! is 1/i(i - 1)!
 * 
 * 				
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_21 */
public class Exercise_5_26 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variables
		double e = 0.0;


				// create a for loop to calculate the numbers 10000, 20000... to 10000
				for (double value = 10000; value <= 100000; value += 10000 ) {
					for (double i = 1; i <= value; i++) {

						double denominator = i;

						//Create a for loop nested
						for (double k = i - 1; k >= 1; k--) {
							denominator *= k;
						}
						e += 1 / denominator;  
					}
					// Display result
					System.out.println("The e value for i = " + value + ": " + e);
				}



		//create the necessary variables

	}//closing the main method


}//closing the class_5_26
