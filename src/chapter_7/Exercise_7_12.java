package chapter_7;
/** 
 * 
 * 
 * 		(Reverse an array) The reverse method in Section 7.7 reverses an array by
 * 		copying it to a new array. Rewrite the method that reverses the array passed in
 * 		the argument and returns this array. Write a test program that prompts the user to
 * 		enter ten numbers, invokes the method to reverse the numbers, and displays the
 * 		numbers.
 * 		
 * @author lucasmaximo
 *
 */


/** Necessary imports */

import java.util.Scanner;


/** Creating the class named Exercise_7_12 */
public class Exercise_7_12{

	public static void main(String[] args) {
		//create the necessary objects
		Scanner input = new Scanner (System.in);

		//creating the necessary variables
		double [] numbers = new double [10];
		int quantNumb = 0;



		//print out the interaction with the user, in order to absorb the numbers
		System.out.print("\n\n\tEnter ten numbers: ");

		//creating an while loop in order to populate the array 
		while(quantNumb < 10) {
			numbers[quantNumb] = input.nextDouble();
			quantNumb +=1;

		}//closing the while loop

		printOutArray(numbers);
		printOutArray(reverse(numbers));


		input.close();
	}//closing the main method


	// Compute the deviation of double values 
	public static double [] reverse(double[] myArray) {
		double [] newArray = new double [10];
		int index = 0;
		for(int i = myArray.length-1; i >= 0 ; i--) {
			newArray[index] = myArray[i];
			index++;
		}

		return newArray;
	}//closing deviation method

	/** creating a method in order to print the array numbers */
	public static void printOutArray(double [] numbersArray) {

		/** Printing out the rsults */
		System.out.print("\n\n\tMy Array numbers -> " );
		for(int m = 0; m < numbersArray.length; m++) {
			System.out.print(" " + ((numbersArray[m] != 0)?numbersArray[m]: " "));

		}//closing for loop main
	}//closing printOutArray method



}//closing the class_7_12
