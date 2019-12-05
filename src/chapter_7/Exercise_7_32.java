package chapter_7;



/** 
 * 
 * 		(Partition of a list) Write the following method that partitions the list using the
 * 		first element, called a pivot.
 * 
 * 		public static int partition(int[] list)
 * 
 * 		After the partition, the elements in the list are rearranged so that all the elements
 * 		before the pivot are less than or equal to the pivot and the elements after the pivot
 * 		are greater than the pivot. The method returns the index where the pivot is located
 * 		in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * 		the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
 * 		at most list.length comparisons. Write a test program that prompts the user
 * 		to enter a list and displays the list after the partition. Here is a sample run. Note
 * 		that the first number in the input indicates the number of the elements in the list.
 * 		This number is not part of the list.
 * 		
 * 		Enter list: 8 10 1 5 16 61 9 11 1
 * 		After the partition, the list is 9 1 5 1 10 61 11 16
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_32 */
public class Exercise_7_32{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		/** print out the message to interact with the user and allow the user 
		 * insert the size of the array or how many integers he is going to input */
		System.out.print("\n\n\tEnter list: ");

		/** created variable to absorb the size of the array inserted by the user 
		 * and creating the properly array */
		int size = input.nextInt();
		int[] list = new int [size];

		/** print out the message to guide the user to insert the number of integers */
		System.out.print("\n\n\tEnter the number of values: ");

		//Created a for loop in order to insert all the integers inputed by the user, following the limit stipulated by the user
		for(int a = 0; a < list.length; a++) {
			list[a] = input.nextInt();
		}//closing for loop

		partition(list);
		printArray(list);

		input.close();
		
	}//closing the main method

	/** Created the method which partition the list/array and give new array 
	 * based on the partition as the first position as a pivot */
	public static int partition(int[] list) {

		//created the variable pivot and the index;
		int pivot = list[0];
		int index = 0;
		int [] myArray = list;
		boolean hasBig = true;
		boolean hasSmall = true;
		int indexBig = 0;
		int indexSmall = 0;

		/** Created a for loop in order to verify if the number of the position is on the right place */
		for(int a = 1; a < list.length; a++) {
			if(list[a] <= pivot) {
				index++;
			}//closing if statement
		}//closing for loop 

		/** Changed the index value to the right position */
		int temp = myArray[index];
		myArray[index] = myArray[0];
		myArray[0] = temp;

		/** Created a while loop in order to check if has on the left a big value or on the right a big value */
		while(hasBig && hasSmall) {
			
			/** Created the first for loop to check the left side */
			for(int d = 0; d < index; d++) {
				//created an if statement in order if any value is bigger them value of the index
				if(myArray[d] > myArray[index]) {
					hasBig = true;
					indexBig = d;
				}else {
					hasBig =false;
				}//closing the if statement
			}//closing for loop
			
			/** Created the first for loop to check the right side */
			for(int e = index+1; e < myArray.length; e++) {
				//created an if statement in order if any value is smaller them value of the index
				if(myArray[e] < myArray[index]) {
					hasSmall = true;
					indexSmall = e;
				}else {
					hasSmall = false;
				}//closing the if statement
			}//closing for loop
			
			//swap the big value with the small
			temp = myArray[indexSmall];
			myArray[indexSmall] = myArray[indexBig];
			myArray[indexBig] = temp;
		}//closing the while loop

		list = myArray;

		return index;

	}//closing the partition method
	/** Created a print array method, in order to print the method merged */
	public static void printArray(int [] myArray) {

		//created a for loop in order to print all positions of the array
		for(int c = 0; c < myArray.length; c++) {
			System.out.print(myArray[c] + " ");
		}//closing for loop 

	}//closing the print Array method

}//closing the class_7_32
