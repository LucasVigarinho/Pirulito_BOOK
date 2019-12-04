package chapter_7;

/** 
 * 
 * 		(Math: combinations) Write a program that prompts the user to enter 10 integers
 * 		and displays all combinations of picking two numbers from the 10.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_28 */
public class Exercise_7_28{

	/** Creating the main method */
	public static void main(String[] arg) {
		// Created an object Scanner, in order to make possible interaction between user and system
		Scanner input = new Scanner(System.in); 
		
		//created variable for absorb the user insertion - ten integers ARRAY
		int[] numbers = new int[10]; 

		// Print out the message to be the user guide during the interaction
		System.out.print("Enter ten numbers: ");
		
		//created a for loop to absorb all the ten integers inserted 
		for (int i = 0; i < numbers.length; i++)
			//using the array to insert all the user insertions 
			numbers[i] = input.nextInt();

		//print out all the possibles combinations
		printComb(numbers);
	}

	/** printCombinations displays all combinations  
	*   of picking two numbers from the array */
	public static void printComb(int[] numbers) {
		System.out.print("\n\n\t|");
		//create a variable in order to print a better visual of the possible combinations
		int count = 6;
		/** Created a main loop in order to run all the positions using every time, as a first number 
		 * between the two numbers that must be picked */
		for (int i = 0; i < numbers.length; i++) {
			/** Created a nested for loop in order to run all the positions of the array variable as 
			 * a second number between of the two numbers picked */
			for (int j = 0; j < numbers.length; j++) {
				/** created an if statement in order of
				 *  only avoid the same position in every loop */
				if (i != j) {
					
					//created a if statement in order to print only five combinations each line, making a better visualization
					if(count > 0) {
						System.out.print( numbers[i] + " - " + numbers[j] + "\t|");
						count--;
					}else {
						System.out.print("\n\t|");
						System.out.print(numbers[i] + " - " + numbers[j] + "\t|");
						count = 5;
					}
					
				}//closing the if statement
			}//closing the nested for loop
		}//closing the main for loop
	}//closing the printComb method



}//closing the class_7_28
