package chapter_07;
/** 
 * 
 * 		(Average an array) Write two overloaded methods that return the average of an
 * 		array with the following headers:
 * 
 * 		public static int average(int[] array)
 * 
 * 		public static double average(double[] array)
 * 
 * 		Write a test program that prompts the user to enter ten double values, invokes this
 * 		method, and displays the average value.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_08 */
public class Exercise_7_08{

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
	
		//print out the average number using the second method
		System.out.print("\n\n\tAverage number -> " + average(numbers));
	
		input.close();

	}//closing the main method


	/** Created the first method following the instructions - method to be overload */
	public static int average(int[] array) {
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum/array.length;
		
	}//closing the first method
	
	/** Created the second and the overloaded method following the instrutions */
	public static double average(double[] array) {
		
		double sum = 0.00;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum/array.length;
	}//closing the second and overloaded method
}//closing the class_7_08
