package chapter_07;
/** 
 * 
 * 		(Sorted?) Write the following method that returns true if the list is already sorted
 * 		in increasing order.
 * 
 * 		public static boolean isSorted(int[] list)
 * 
 * 		Write a test program that prompts the user to enter a list and displays whether
 * 		the list is sorted or not. Here is a sample run. Note that the first number in the
 * 		input indicates the number of the elements in the list. This number is not part
 * 		of the list.
 * 		
 * 		Enter list: 8 10 1 5 16 61 9 11 1
 * 		The list is not sorted
 * 		
 * 
 * 		Enter list: 10 1 1 3 4 4 5 7 9 11 21
 * 		The list is already sorted
 * 
 * @author lucasmaximo
 *
 */



/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_19 */
public class Exercise_7_19{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);



		//printed out the message to guide the user interaction
		System.out.print("\n\n\tEnter list: -> ");

		//created the necessary variables Array and the first variable 
		//to absorb the first number to define the array size
		int size = input.nextInt();
		int [] list = new int[size+1];
		list[0] = size;

		//created a for loop in order to absorb all the user insertions 
		for (int i = 1; i < size+1; i++) {
			list[i] = input.nextInt();

		}//closing for loop

		//organize the array uzing the bubble sort
		System.out.print("\n\n\tThe list is " + ((isSorted(list))?"already sorted":"not sorted"));



		input.close();




	}//closing the main method

	//method that returns true if the list is already sorted in increasing order.
	public static boolean isSorted(int[] list) {
		boolean test = true;

		//created a for loop in order to check all the positions
		for(int i = 1; i < list.length-1; i++) {
			if(list[i] <= list[i+1]) {
				test = true;
			}else {
				return false;
			}
		}//closing for loop

		return test;
	}//closing method

}//closing the class_7_19
