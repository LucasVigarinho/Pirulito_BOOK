package chapter_7;
/** 
 * 
 * 
 * 		(Find the index of the smallest element) Write a method that returns the index of
 * 		the smallest element in an array of integers. If the number of such elements is
 * 		greater than 1, return the smallest index. Use the following header:
 * 
 * 		public static int indexOfSmallestElement(double[] array)
 * 		
 * 		Write a test program that prompts the user to enter ten numbers, invokes this
 * 		method to return the index of the smallest element, and displays the index.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */

import java.util.Scanner;


/** Creating the class named Exercise_7_10 */
public class Exercise_7_10{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		
		//created the necessary variables
		double [] numbers = new double[10];

		//printed out the message to guide the user interaction
		System.out.print("\n\n\tInsert 10 numbers -> ");

		//created a for loop in order to absorb all the user insertions 
		for (int count = 0; count < 10; count++) {
			numbers[count] = input.nextDouble();

		}//closing for loop

		//print out the average number using the second method
		System.out.printf("\n\n\tThe index of the array is -> " + (indexOfSmallestElement(numbers)));

		input.close();

	}//closing the main method


	/** Created the  method following the instructions - in order to find the minimum value */
	public static int indexOfSmallestElement(double[] array){
		if(array.length <= 1) {
			return 0;
		}
		double numb = array[0];
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			if(numb > array[i] && numb != 0) {
				numb = array[i];
				index = i;
			}

		}//closing for loop

		return index;

	}//closing the  method



}//closing the class_7_10
