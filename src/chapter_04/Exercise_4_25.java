package chapter_04;

/**    ************* Description of the Exercise_4_25 *************
 * 
 * 		(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * 		uppercase letters followed by four digits. Write a program to generate a plate
 * 		number.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Random;

/** Creating the class named Exercise_4_25 */
public class Exercise_4_25 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		//generate random
		Random r = new Random();

		char l1 = Character.toUpperCase((char) (r.nextInt(26) + 'a'));
		char l2 = Character.toUpperCase((char) (r.nextInt(26) + 'a'));
		char l3 = Character.toUpperCase((char) (r.nextInt(26) + 'a'));
		
		int d1 = (int) (r.nextInt(10));
		int d2 = (int) (r.nextInt(10));
		int d3 = (int) (r.nextInt(10));
		int d4 = (int) (r.nextInt(10));
		
		System.out.println("\n\n\t" + l1 + "" +  l2 + "" + l3 + "" + d1 + "" + d2 + "" + d3 + "" + d4);

	}//closing the main method


}//closing the class_4_25
