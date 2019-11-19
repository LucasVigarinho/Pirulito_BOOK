package chapter_7;
/** 
 * 
 * 		(Find the smallest element) Write a method that finds the smallest element in an
 * 		array of double values using the following header:
 * 
 * 		public static double min(double[] array)
 * 
 * 		Write a test program that prompts the user to enter ten numbers, invokes this
 * 		method to return the minimum value, and displays the minimum value. Here is a
 * 		sample run of the program:
 * 		
 * 
 * 		Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 * 		The minimum number is: 1.5
 * 		
 * 		
 * @author lucasmaximo
 *
 */



/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_7_09 */
public class Exercise_7_09{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.0");

		//created the necessary variables
		double [] numbers = new double[10];
		
		//printed out the message to guide the user interaction
		System.out.print("\n\n\tInsert 10 numbers -> ");
		
		//created a for loop in order to absorb all the user insertions 
		for (int count = 0; count < 10; count++) {
			numbers[count] = input.nextDouble();
			
		}//closing for loop
	
		//print out the average number using the second method
		System.out.printf("\n\n\tThe minimum number is -> " + df.format(min(numbers)));
	

	}//closing the main method


	/** Created the  method following the instructions - in order to find the minimum value */
	public static double min(double[] array) {
		double numb = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(numb > array[i] && numb != 0) {
				numb = array[i];
			}
			
		}//closing for loop
		
		return numb;
		
	}//closing the first method
	
	

}//closing the class_7_09
