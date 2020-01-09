package chapter_04;

import java.util.Random;


/**    ************* Description of the Exercise_4_16 *************
 * 
 * 
 * (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_4_16 */
public class Exercise_4_16 {

	/** Creating the main method */
	public static void main(String[] args) {
		
		//create the object to absorb the user insertion
		Random r = new Random();
		
		char c = (char)(r.nextInt(26) + 'a');
		
		c = Character.toUpperCase(c);

		System.out.print("\n\n\t" + c);
		 
		
	}//closing the main method
	
}//closing the class_4.16
