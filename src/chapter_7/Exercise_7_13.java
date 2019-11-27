package chapter_7;
/** 
 * 
 * 
 * 		(Random number chooser) Write a method that returns a random number between
 * 		1 and 54, excluding the numbers passed in the argument. The method header is
 * 		specified as follows:
 * 		
 * 		
 *		public static int getRandom(int... numbers) 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;
import java.util.Random;

/** Creating the class named Exercise_7_13 */
public class Exercise_7_13{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);


		/** Create a communication guide between user interaction and system */
		System.out.print("\n\n\tGive an argument integer between 1 and 54 -> ");
		//Create the variable to absorb the argument
		int argument [] = new int [10];
	
		//created a for loop in order to populate all the places of the array
		for(int i = 0; i < argument.length; i++) {
			argument[i] = input.nextInt();
		}//closing the for loop
		
		//Created the variable which is going to absorb the number from getRandom
		int number = getRandom(argument);

		//print out the messages 
		Exercise_7_05.printOutArray(argument);
		System.out.print("\n\n\tThe Random number is -> "+ number);

	}//closing the main method

	/** Created the method getRandom following the instructions */
	public static int getRandom(int... numbers) {
		/** Created the necessary objects to generate the random number */
		Random rand = new Random();
		
		//created an array argument to absorb the numbers array sent
		int[] argument = numbers;
		
		//created the variable number to absorb the first random number generated 
		int number = rand.nextInt(54)+1;
		//create a while loop in order to test all the letters
		for (int i = 0; i < argument.length; i++){
			//created  if statement in case of the random number generated be equal of a number from the array argument
			if(number == argument[i]) {
				//generated a new random number
				number = rand.nextInt(54)+1; 
				//initiated the i number from the for loop again
				i = -1;
			}
		}//close while loop
		
		return number;

	}//closing the getRandomNumber

}//closing the class_7_13
