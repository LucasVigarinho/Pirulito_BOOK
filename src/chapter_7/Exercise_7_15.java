package chapter_7;

import java.util.Scanner;

/** 
 * 
 * 		(Eliminate duplicates) Write a method that returns a new array by eliminating the
 * 		duplicate values in the array using the following method header:
 * 
 * 
 * 		public static int[] eliminateDuplicates(int[] list)
 * 
 * 
 * 		Write a test program that reads in ten integers, invokes the method, and displays
 * 		the result. Here is the sample run of the program:
 * 		
 * 		Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 * 		The distinct numbers are: 1 2 3 6 4 5
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_7_15 */
public class Exercise_7_15{

	/** Creating the main method */
	public static void main(String[] arg) {


		//create the necessary objects
		Scanner input = new Scanner(System.in);


		/** Create a communication guide between user interaction and system */
		System.out.print("\n\n\tEnter ten numbers -> ");
		//Create the variable to absorb the argument
		int argument [] = new int [10];
	
		//created a for loop in order to populate all the places of the array
		for(int i = 0; i < argument.length; i++) {
			argument[i] = input.nextInt();
		}//closing the for loop
		


		//print out the messages 
		Exercise_7_05.printOutArray(argument);
		
		//Created the variable which is going to absorb the number from getRandom
		int [] number = eliminateDuplicates(argument);
		
		/** using a print Out method from the exercise_7_05, printing all the numbers except zeros
		 * followed by the method to organize the numbers inside the array 
		 * followed by the method to create a new array with a new size in order to print only the numbers in the array and no zeros */
		Exercise_7_05.printOutArray(Exercise_7_04.organizeArray(Exercise_7_04.newArray(number)));
		
		
		input.close();
	}//closing the main method


	/** Created a method following the instructions, in order 
	 * to eliminate the du;licate values in the array */
	public static int[] eliminateDuplicates(int[] list) {
		/** Created a variable to absorb the array sent in order to compare both*/
		int [] myArray = list;

		/** Created a main for loop in order to run all the positions of the array sent */
		for (int i = 0; i < list.length; i++) {
			/** Created a nested loop in order to manipulate the array created inside the method 
			 * eliminating the duplicated numbers */
			for (int j = (i+1); j < list.length; j++) {
				
				//compare the two arrays in order to eliminate the numbers if duplicated
				if(list[i] == myArray[j]) {
					//fill the position with the number 0 if duplicated, eliminating the number
					myArray[i] = 0;
					
				}//closing the if statement that is comparing 
			}//closing the nested for loop
		}//closing the main for loop
		return myArray;
	}//closing the method eliminateDuplicates

}//closing the class_7_15
