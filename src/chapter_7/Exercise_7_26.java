package chapter_7;
/** 
 * 
 * 		(Strictly identical arrays) The arrays list1 and list2 are strictly identical
 * 		if their corresponding elements are equal. Write a method that returns true if
 * 		list1 and list2 are strictly identical, using the following header:
 * 
 * 		public static boolean equals(int[] list1, int[] list2)
 * 
 * 		Write a test program that prompts the user to enter two lists of integers and displays
 * 		whether the two are strictly identical. Here are the sample runs. Note that
 * 		the first number in the input indicates the number of the elements in the list. This
 * 		number is not part of the list.
 * 		
 * 		Enter list1: 5 2 5 6 1 6
 * 		Enter list2: 5 2 5 6 1 6
 * 		Two lists are strictly identical
 * 
 * 		Enter list1: 5 2 5 6 6 1
 * 		Enter list2: 5 2 5 6 1 6
 * 		Two lists are not strictly identical
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_26 */
public class Exercise_7_26{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);


		//Print out a message to be the guide for the user.
		System.out.print("\n\n\tEnter list1: ");
		//Created the variables that are going to be used, including the arrays 
		int size1 = input.nextInt();
		int [] list1 = new int [size1+1];

		//created a for loop in order to populate all the positions according with the inputs 
		for(int a = 1; a < list1.length; a++) {
			list1[a] = input.nextInt();
		}//closing for loop

		//Print out a message to be the guide for the user.
		System.out.print("\n\n\tEnter list1: ");
		//Created the variables that are going to be used, including the arrays 
		int size2 = input.nextInt();
		int [] list2 = new int [size2+1];

		//created a for loop in order to populate all the positions according with the inputs 
		for(int b = 1; b < list2.length; b++) {
			list2[b] = input.nextInt();
		}//closing for loop

		/** Printing out the resulting, according to the boolean method queals */
		System.out.print(((equals(list1, list2)?"\n\tTwo lists are strictly identical":"\n\tTwo lists are not strictly identical")));

	}//closing the main method



	/** Created a method in order to verify if the two arrays are identical */
	public static boolean equals(int[] list1, int[] list2) {

		//created a for loop in order to populate all the positions according with the inputs 
		for(int c = 0; c < list2.length; c++) {
			//created a if statement in order to verify if are strictly identical
			if(list1[c] == list2[c]) {

			}else {
				return false;//if is not equal, return false here
			}
		}//closing for loop

		return true;//if nothing happened before in the if statement, it means that are identical, returning true
	}//closing the method equals


}//closing the class_7_26
