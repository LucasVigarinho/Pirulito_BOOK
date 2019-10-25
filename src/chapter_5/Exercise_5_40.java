package chapter_5;



/**    ************* Description of the Exercise_5_40 *************
 * 
 * 
 * 		(Simulation: heads or tails) Write a program that simulates flipping a coin one
 * 		million times and displays the number of heads and tails.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Random;

/** Creating the class named Exercise_5_40 */
public class Exercise_5_40 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Random random = new Random();
		int coin = (int) random.nextInt(2);
		
		int coinFace = 0;
		int coinTail = 0;
		
		//calculation
		for(int i = 0; i < 1000000; i++) {
			coin = (int) random.nextInt(2);
			if(coin == 1) {
				coinFace+=1;
			}else {
				coinTail+=1;
			}
		}
		System.out.print("\n\n\t Face -> " + coinFace);
		System.out.print("\n\t Tail -> " + coinTail);
		
	}//closing the main method


}//closing the class_5_40
