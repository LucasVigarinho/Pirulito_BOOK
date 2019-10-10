package chapter_5;


/**    ************* Description of the Exercise_5_12 *************
 * 
 * 		(Find the smallest n such that n2 > 12,000) Use a while loop to find the smallest
 * 		integer n such that n2 is greater than 12,000.
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_12 */
public class Exercise_5_12 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		
		//create the necessary variables
		int n = 0;
		
		//creating a while loop in order test the number
		while(Math.pow(n,2) < 12000) {
			n++;
			
		}//closing while loop
		
		System.out.print("\n\n\t" + n);
	}//closing the main method


}//closing the class_5_12
