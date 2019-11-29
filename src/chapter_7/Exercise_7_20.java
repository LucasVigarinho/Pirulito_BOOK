package chapter_7;
/** 
 * 
 * 		(Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 * 		The selection-sort method repeatedly finds the smallest number in the current
 * 		array and swaps it with the first. Rewrite this program by finding the largest number
 * 		and swapping it with the last. Write a test program that reads in ten double
 * 		numbers, invokes the method, and displays the sorted numbers.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;


/** Creating the class named Exercise_7_20*/
public class Exercise_7_20{

	/** Creating the main method */
	public static void main(String[] arg) {
		//create the necessary objects
				Scanner input = new Scanner(System.in);



				//printed out the message to guide the user interaction
				System.out.print("\n\n\tEnter list: -> ");

				//created the necessary variables Array and the first variable 
				//to absorb the first number to define the array size
				int [] list = new int[10];
				//created a for loop in order to absorb all the user insertions 
				for (int i = 0; i < list.length; i++) {
					list[i] = input.nextInt();

				}//closing for loop

				Exercise_7_05.printOutArray(selectionSort(list));
				
				input.close();
	
	}//closing the main method

	/** Creating the selection sort method - static */
	public static int[] selectionSort(int myArray[]) {

		//create the biggestPlace variable and initiate it to be used in the algorithm
		int biggestPlace = 0;
		
		// Create the for loop, in order to analyze every space of the myArray
		for (int i = myArray.length-1; i >= 0; i--) {
			biggestPlace = i; //define the smallestPlace variable everytime which the for loop turn
			//create a nested for loop to use the info of the last for loop and compare values in every space every loop
			for(int j = i-2; j >= 0 ; j-- ) {
				//compare the space of the loop with the space defined for the smallestplace
				if(myArray[j] > myArray[biggestPlace]) {
					biggestPlace = j;//if find a new smallest place, define a new space
				}//close if statement
			}//close for loop nested
			//Swap the smallest number 
			int temp = myArray[i];
			myArray[i] = myArray[biggestPlace];
			myArray[biggestPlace] = temp;
			
		}//close main for loop
		int [] b = myArray;
		return b; //if the number was located, showing the number reference position
	}//close the method selectionSort

}//closing the class_7_20
