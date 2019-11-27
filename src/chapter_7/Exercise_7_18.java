package chapter_7;
/** 
 * 
 * 		(Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
 * 		algorithm makes several passes through the array. On each pass, successive
 * 		neighboring pairs are compared. If a pair is not in order, its values are swapped;
 * 		otherwise, the values remain unchanged. The technique is called a bubble sort or
 * 		sinking sort because the smaller values gradually “bubble” their way to the top
 * 		and the larger values “sink” to the bottom. Write a test program that reads in ten
 * 		double numbers, invokes the method, and displays the sorted numbers.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */



/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_18 */
public class Exercise_7_18{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//created the necessary variables
		double [] numbers = new double[10];
		
		//printed out the message to guide the user interaction
		System.out.print("\n\n\tInsert 10 double numbers -> ");
		
		//created a for loop in order to absorb all the user insertions 
		for (int count = 0; count < 10; count++) {
			numbers[count] = input.nextDouble();
			
		}//closing for loop
	
		//organize the array uzing the bubble sort
		bubbleSort(numbers);
		
		//print out the array numbers using the second method printOut
		printOutArray(numbers);
	
		input.close();

		
	
	}//closing the main method

	/** Created the method in order to organize the arrays */
	public static void bubbleSort( double [] myArray) {
		

		//Creating a variable b, array, to receive myArray.
		double [] scores = myArray;
		
		
		//Create the algorithm 
		for (int j = 0; j <= scores.length-2; j++) {
			
			for (int i = 0; i <= scores.length-j-2; i++) {
				
				if(scores[i] > scores[i+1]) {
					double tempScore = scores[i];
					
					
					scores[i] = scores[i+1];
					
							
					scores[i+1] = tempScore;
					
				}//close if
				
			}//close for 
			
		}//close for
		
		myArray = scores;
		
	}
	
	/** creating a method in order to print the array numbers */
	public static void printOutArray(double [] numbersArray) {

		/** Printing out the rsults */
		System.out.print("\n\n\tMy Array numbers -> " );
		for(int m = 0; m < numbersArray.length; m++) {
			System.out.print(" " + ((numbersArray[m] != 0)?numbersArray[m]: " "));

		}//closing for loop main
	}//closing printOutArray method


}//closing the class_7_18
