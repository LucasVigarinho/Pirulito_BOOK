package chapter_05;


/**    ************* Description of the Exercise_5_35 *************
 * 
 * 		(Summation) Write a program to compute the following summation.
 * 
 * 			  1            1             1                       1
 * 		----------- + ----------- + ----------- + ...+ ----------------------
 * 		  1 + V2         V2 + V3      V3 + V4            V624 + V625    
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */



/** Creating the class named Exercise_5_35 */
public class Exercise_5_35 {

	/** Creating the main method */
	public static void main(String[] arg) {

		double result = 0.0;

		//create the necessary objects
		for (int x = 1; x < 625; x++) {

			result += (1/(Math.pow(x, 0.5)+Math.pow(x+1, 0.5)));

		}
		
		System.out.print("\n\n\tResult is -> " + result);


	}//closing the main method


}//closing the class_5_35
