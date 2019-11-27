package chapter_7;
/** 
 * 
 * 		(Execution time) Write a program that randomly generates an array of 100,000
 * 		integers and a key. Estimate the execution time of invoking the linearSearch
 * 		method in Listing 7.6. Sort the array and estimate the execution time of invoking
 * 		the binarySearch method in Listing 7.7. You can use the following code
 * 		template to obtain the execution time:
 * 
 * 		long startTime = System.currentTimeMillis();
 * 		perform the task;
 * 		long endTime = System.currentTimeMillis();
 * 		long executionTime = endTime - startTime;
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Random;

/** Creating the class named Exercise_7_16 */
public class Exercise_7_16{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Created the objects necessary to generate random numbers */
		Random r = new Random ();
		Random rKey = new Random();

		/** Created the necessary variables to absorb the random numbers generated,
		 * the array variable and the long type variable for the timing and generating the key */
		int [] myArray = new int [100000];
		int number = r.nextInt(1000000) + 1, i = 0;
		long startTime = 0, endTime = 0, executionTime = endTime - startTime;
		
		
		startTime = System.currentTimeMillis();
		/** Created a while loop to generate all the random numbers*/
		while(i < 100000 ) {
			/** Created a while loop to generate all the numbers not duplicated in the array */
			while(Exercise_7_05.arrayNotRepetedN(myArray, number) == false) {
				/** Cegerated a new number */
				number = r.nextInt(1000000) + 1;
			}//closing while nested loop 
				/** Populating the position of the myArray with the random number not repeted*/
				myArray[i] = number;
				i++;
		}//closing main while loop 
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.print("\n\n\tThe time to generate the array of 100.000 positions with no repeted numbers is -> " + executionTime);
		
		/** Generated the key */
		int key = myArray[rKey.nextInt(100000)];
		
		/** Started the time to organize the array computating */
		startTime = System.currentTimeMillis();
		myArray = Exercise_7_04.organizeArray(myArray);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.print("\n\n\tThe time to organize the array of 100.000 positions with no repeted numbers is -> " + executionTime);
		
		/** Started the time to utilize the LinearSearch with the the array and key computating */
		startTime = System.currentTimeMillis();
		System.out.print("\n\n\tThe Linear Search result is -> " + linearSearch(myArray, key));
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.print("\n\tThe time to search one number in a array of 100.000 positions with no repeted numbers, using LinearSearch is -> " + executionTime);
		
		/** Started the time to utilize the BinarySearch with the the array and key computating */
		startTime = System.currentTimeMillis();
		System.out.print("\n\n\tThe Binary Search result is -> " + binarySearch(myArray, key));
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.print("\n\tThe time to search one number in a array of 100.000 positions with no repeted numbers, using BinarySearch is -> " + executionTime);
		
		
	}//closing the main method



	/**
	 * CREATING 1.5 - A public method called search with accepts a variable
	 * valueToBeFound as a parameter.
	 */
	public static int linearSearch(int arr[], int n) {

		// Creating the local variable
		int i = 0;

		// creating while statement to define for how long the variable í is going to
		// increase
		while (i < arr.length && arr[i] != n) {
			i++;
		} // close while statement

		// creating an if statement to give the return number of the search
		if (i == arr.length) {
			return -1; //if the number was not located in the array
		} else {
			return i; //if the number was located, showing the number reference position
		} // closing the if statement
	}// closing search method

	/** CREATING 1.5 - A public method called binarySearch with accepts a variable valueToBeFound as a parameter. */
	public static int binarySearch(int arr [],int n) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start +end)/2;
		int loc = 0;

		while( start < end && arr[mid] != n){
			if(n < arr[mid] ){
				end = mid-1;
			}else {
				start = mid +1;
			}//closing if statement
			mid = (start+end)/2;
		}//closing while

		if(arr[mid]==n) {
			loc = mid;
		}else {
			loc = - 1;
		}//closing if statement
		return loc;
	}//closign the search method


}//closing the class_7_16
