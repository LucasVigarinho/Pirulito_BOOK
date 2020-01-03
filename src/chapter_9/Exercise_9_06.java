package chapter_9;

/** 
 * 			
 * 		(Stopwatch) Design a class named StopWatch. The class contains:
 * 		■ Private data fields startTime and endTime with getter methods.
 * 		■ A no-arg constructor that initializes startTime with the current time.
 * 		■ A method named start() that resets the startTime to the current time.
 * 		■ A method named stop() that sets the endTime to the current time.
 * 		■ A method named getElapsedTime() that returns the elapsed time for the
 * 		stopwatch in milliseconds.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that measures the execution time of sorting 100,000 numbers using
 * 		selection sort.
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.  
 * 
 * 			|                       Exercise_9_06						|		
 * 			|-----------------------------------------------------------|
 * 			|							Account     					|
 * 			|-----------------------------------------------------------|	
 * 			| - startTime: long					  						|
 * 			| - endTime: long           								|       							
 * 			|-----------------------------------------------------------|
 * 			| + StopWatch ()           								    |
 * 			| + start(): void										  	|
 * 			| + stop(): long								       		|
 * 			| + getElapsedTime(): long									|
 * 			|___________________________________________________________|  
 * 
 * 
 * 
 * */
/** Necessary imports */


/** Creating the class named Exercise_9_06 */
public class Exercise_9_06{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variable array
		int [] testArray = new int [100000];
		System.out.print("\n\n\t");
		//created a for loop in order to fill all the positions of the array created
		for(int a = 0; a < testArray.length; a++) {
			testArray[a] = (int) (Math.random() * 100);
//			//created an if statement in order to print and check the array created
//			if(a != 0 && (a % 20) == 0) {
//				System.out.print("\n\t"+ testArray[a] + "\t");
//			}else {
//				System.out.print(testArray[a] + "\t");
//			}
		}//closing for loop

		//created an object StopWatch in order to verify the time taken to sort the array using selction Sort
		StopWatch selectionSortTest = new StopWatch();

		//calling the method selection Sort in order to sort the array
		testArray = selectionSort(testArray);

		//endTime of the selection
		selectionSortTest.stop();

		System.out.print("\n\n\n\t");
//		//Created a for loop in order to print the array created
//		for(int a = 0; a < testArray.length; a++) {
//
//			if(a != 0 && (a % 20) == 0) {
//				System.out.print("\n\t"+ testArray[a] + " ");
//			}else {
//				System.out.print(testArray[a] + " ");
//			}
//		}//closing for loop
		System.out.print("\n\n\tThe Elapse time of a selection sort method takes to sort "
				+ "an array of 100.000 positions is -> " + selectionSortTest.getElapsedTime() + " + or -");


	}//closing the main method

	/** Creating the selection sort method - static */
	public static int[] selectionSort(int myArray[]) {

		//create the smallestPlace variable and initiate it to be used in the algorithm
		int smallestPlace = 0;

		// Create the for loop, in order to analyze every space of the myArray
		for (int i = 0; i < myArray.length; i++) {
			smallestPlace = i; //define the smallestPlace variable everytime which the for loop turn
			//create a nested for loop to use the info of the last for loop and compare values in every space every loop
			for(int j = i+1; j < myArray.length; j++ ) {
				//compare the space of the loop with the space defined for the smallestplace
				if(myArray[j] < myArray[smallestPlace]) {
					smallestPlace = j;//if find a new smallest place, define a new space
				}//close if statement
			}//close for loop nested
			//Swap the smallest number 
			int temp = myArray[i];
			myArray[i] = myArray[smallestPlace];
			myArray[smallestPlace] = temp;

		}//close main for loop
		int [] b = myArray;
		return b; //if the number was located, showing the number reference position
	}//close the method selectionSort

}//closing the class_9_06

/** 
 * 		(Stopwatch) Design a class named StopWatch. The class contains:
 * 		■ Private data fields startTime and endTime with getter methods.
 * 		■ A no-arg constructor that initializes startTime with the current time.
 * 		■ A method named start() that resets the startTime to the current time.
 * 		■ A method named stop() that sets the endTime to the current time.
 * 		■ A method named getElapsedTime() that returns the elapsed time for the
 * 		stopwatch in milliseconds. */
class StopWatch{

	//■ Private data fields startTime and endTime with getter methods.
	private long startTime;
	private long endTime;

	//■ A no-arg constructor that initializes startTime with the current time.
	StopWatch(){
		startTime = System.currentTimeMillis();
	}//closing constructor StopWatch


	//■ A method named start() that resets the startTime to the current time.
	public void start() {
		this.startTime = System.currentTimeMillis();
	}//closing the start method

	//■ A method named stop() that sets the endTime to the current time.
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}//closing the stop method

	//■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
	public long getElapsedTime() {	
		return (endTime - startTime);
	}//closing the getElapsedTime method

}//closing the StopWatch class