package chapter_5;



/**    ************* Description of the Exercise_5_44 *************
 * 
 * 
 * 		(Computer architecture: bit-level operations) A short value is stored in 16 bits.
 * 		Write a program that prompts the user to enter a short integer and displays the 16
 * 		bits for the integer. Here are sample runs:
 * 
 * 		Enter an integer: 5
 * 		The bits are 0000000000000101
 * 
 * 		Enter an integer: -5
 * 		The bits are 1111111111111011
 * 
 * 		(Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 * 		operator (&), which are covered in Appendix G, Bitwise Operations.)
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_44 */
public class Exercise_5_44 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a short integer
		System.out.print("\n\n\tEnter an integer: ");
		short number = input.nextShort();
	
		String bits = Integer.toBinaryString(number);


		// Display result
		System.out.println("\n\n\tThe bits are " + bits);
		
		//calculation
		
		input.close();
	}//closing the main method


}//closing the class_5_44
