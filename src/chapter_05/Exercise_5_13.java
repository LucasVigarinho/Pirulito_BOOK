package chapter_05;


/**    ************* Description of the Exercise_5_13 *************
 * 
 * 		(Find the largest n such that n3 < 12,000) Use a while loop to find the largest
 * 		integer n such that n3 is less than 12,000.
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_13 */
public class Exercise_5_13 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		
		//create the necessary variables
		int n = 0;
		
		//creating a while loop in order test the number
		while(Math.pow(n,3) < 12000) {
			n++;
			
		}//closing while loop
		
		System.out.print("\n\n\t" + n);
	}//closing the main method



}//closing the class_5_13
