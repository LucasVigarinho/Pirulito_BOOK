package chapter_7;
/** 
 * 
 * 			(Pattern recognition: consecutive four equal numbers) Write the following
 * 			method that tests whether the array has four consecutive numbers with the same
 * 			value.
 * 
 * 			public static boolean isConsecutiveFour(int [] values)
 * 
 * 			Write a test program that prompts the user to enter a series of integers and displays
 * 			if the series contains four consecutive numbers with the same value. Your
 * 			program should first prompt the user to enter the input size—i.e., the number of
 * 			values in the series. Here are sample runs:
 * 		
 * 			
 * 			Enter the number of values: 8
 * 			Enter the values: 3 4 5 5 5 5 4 5
 * 			The list has consecutive fours
 * 		
 * 
 * 			Enter the number of values: 9
 * 			Enter the values: 3 4 5 5 6 5 5 4 5
 * 			The list has no consecutive fours
 * 
 * 
 * @author lucasmaximo
 *
 */


/** Necessary imports */
import java.util.Scanner;


/** Creating the class named Exercise_7_30 */
public class Exercise_7_30{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		/** print out the message to interact with the user and allow the user 
		 * insert the size of the array or how many integers he is going to input */
		System.out.print("\n\n\tEnter the number of values: ");

		/** created variable to absorb the size of the array inserted by the user 
		 * and creating the properly array */
		int size = input.nextInt();
		int[] myArray = new int [size];

		/** print out the message to guide the user to insert the number of integers */
		System.out.print("\n\n\tEnter the number of values: ");

		//Created a for loop in order to insert all the integers inputed by the user, following the limit stipulated by the user
		for(int a = 0; a < myArray.length; a++) {
			myArray[a] = input.nextInt();
		}//closing for loop

		System.out.print(((isConsecutiveFour(myArray))?"\n\t\t\t\tThe list has consecutive fours":"\n\t\t\t\tThe list has NO consecutive fours"));

	}//closing the main method
	/** Created a method in order to verify all the positions of the array, following instructions */
	public static boolean isConsecutiveFour(int [] values) {
		//created the variable to count repetitions of values and the index number to be checked
		int count = 1;
		
		/** Created a for loop in order to verify all the positions in a linear search */
		for(int b = 0; b < (values.length-1); b++) {
			
			//Created a if statement in order to count repetitions
			if(values[b] == values[b+1]) {
				
				count+=1;//sum every repetitions
				
				//created a nested if statement to verify if any number four times 
				if(count == 4) {
					return true;
				}//closing nested if statement
		
			}else {
				count = 1;
			}//closing main if statement
			
		}//closing for loop
		return false;
	}//closing isConsecutiveFour method

	
//	/** Created a method in order to verify all the positions of the array, following instructions */
//	public static boolean isConsecutiveFour(int [] values) {
//		//created the variable to count repetitions of values and the index number to be checked
//		int count = 0;
//		int index = 0;
//		/** Created a for loop in order to verify all the positions in a linear search */
//		for(int b = 0; b < (values.length-1); b++) {
//			index = values[b];
//			/** created a nested for loop in order to check all the positions */
//			for(int c = 0; c < values.length; c++){
//				//Created a if statement in order to count repetitions
//				if(values[c] == values[b+1]) {
//
//					count++;//sum every repetitions
//
//					//created a nested if statement to verify if any number four times 
//					if(count == 4) {
//						return true;
//					}//closing nested if statement
//
//				}else {
//					count = 0;
//				}//closing main if statement
//			//closing the nested for loop
//		}//closing for loop
//		return false;
//	}//closing isConsecutiveFour method
	
}//closing the class_7_30
