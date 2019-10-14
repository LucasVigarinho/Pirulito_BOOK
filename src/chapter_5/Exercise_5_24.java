package chapter_5;


/**    ************* Description of the Exercise_5_24 *************
 * 
 * 		(Sum a series) Write a program to sum the following series:
 * 
 * 		1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_24 */
public class Exercise_5_24 {

	/** Creating the main method */
	public static void main(String[] arg) {


	
		//create the necessary variables
		double count = 0;
		
		//create a for loop to start the sum
		for (double i = 3.0; i <= 99; i += 2) {
			count += (i-2)/i;
		}//closing for loop
		
		System.out.print("\n\n\tThe result is -> " + count);
	}//closing the main method


}//closing the class_5_24
