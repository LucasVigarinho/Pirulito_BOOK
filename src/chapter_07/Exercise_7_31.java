package chapter_07;
/** 
 * 
 * 
 * 			(Merge two sorted lists) Write the following method that merges two sorted lists
 * 			into a new sorted list.
 * 
 * 			public static int[] merge(int[] list1, int[] list2)
 * 
 * 			Implement the method in a way that takes at most list1.length + list2.
 * 			length comparisons. Write a test program that prompts the user to enter two
 * 			sorted lists and displays the merged list. Here is a sample run. Note that the first
 * 			number in the input indicates the number of the elements in the list. This number
 * 			is not part of the list.
 * 		
 * 			Enter list1: 5 1 5 16 61 111
 * 			Enter list2: 4 2 4 5 6
 * 			The merged list is 1 2 4 5 5 6 16 61 111
 * 		
 * @author lucasmaximo
 *
 */

import java.util.Scanner;

/** Necessary imports */


/** Creating the class named Exercise_7_31 */
public class Exercise_7_31{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);


		//Print out a message to be the guide for the user.
		System.out.print("\n\n\tEnter list1: ");
		//Created the variables that are going to be used, including the arrays 
		int size1 = input.nextInt();
		int [] list1 = new int [size1];

		//created a for loop in order to populate all the positions according with the inputs 
		for(int a = 0; a < list1.length; a++) {
			list1[a] = input.nextInt();
		}//closing for loop


		//Print out a message to be the guide for the user.
		System.out.print("\tEnter list2: ");
		//Created the variables that are going to be used, including the arrays 
		int size2 = input.nextInt();
		int [] list2 = new int [size2];

		//created a for loop in order to populate all the positions according with the inputs 
		for(int b = 0; b < list2.length; b++) {
			list2[b] = input.nextInt();
		}//closing for loop

		int [] myArray = merge(sortArray(list1), sortArray(list2));

		/** Printing out the resulting, according to the merge method using the print method */
		System.out.print("\tThe merged list is "); printArray(myArray);

		input.close();
	}//closing the main method

	/** Created a print array method, in order to print the method merged */
	public static void printArray(int [] myArray) {

		//created a for loop in order to print all positions of the array
		for(int c = 0; c < myArray.length; c++) {
			System.out.print(myArray[c] + " ");
		}//closing for loop 

	}//closing the print Array method

	/** Created a method in order to merge two arrays inputed by the user */
	public static int[] merge(int[] list1, int[] list2) {

		/** created the new array unifying the list1 and list2 arrays */
		int [] myArray = new int [(list1.length) + ((list2.length))];

		/** created a variable index in order to populate the right position of the myArray, 
		 * index1 for the list1 and list2. index2 for the myArray */
		int index1 = list1.length;
		int index2 = -1;
		int index3 = list1.length - 1;

		/** Created a first for loop in order to fill all the positions of myArray, extracting all the positions from the list1 and list2 */
		for(int d = 0; d <= index1; d++) {
			index2++;
			/** Created an if statement in order to absorb all the numbers from both either list1 and list2*/
			if(index2 < list1.length) {
				myArray[index2] = list1[d];

			}else {
				myArray[index2] = list2[d];

			}//closing if statement

			/** Created an if statement in order to initialize the variables necessary to absorb the right positions to the right positions*/
			if(d == index3) {
				index1 = list2.length-1;
				d = -1;
				index3 = list2.length;
			}//closing an if statement


		}//closing the for loop
		return sortArray(myArray);

	}//closing merge method

	/** Creating the static void method in order to sort myArray, using the bubble sort data structure */ 
	public static int [] sortArray(int [] myArray ) {


		//Creating a variable b, array, to receive myArray.
		int [] a = myArray;

		//Create the algorithm 
		for (int j = 0; j <= a.length-2; j++) {

			for (int i = 0; i <= a.length-j-2; i++) {

				if(a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

				}//close if

			}//close for 

		}//close for

		return a;

	}//method bubble sort

}//closing the class_7_31
