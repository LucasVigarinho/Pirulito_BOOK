package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
 * .java, to fix the possible loss of accuracy when converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * 			
 * 				
 * */
public class Exercise_2_22{

	/** Constructor not utilized */
	public Exercise_2_22() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("$####.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter the value to be transformed: ");
		int number = input.nextInt();


		double transform = number / 100.0;
		
		
		System.out.print("\n\tThe value transformed is " + df.format(transform));

		input.close();

	}//close main method

}//close class Exercise_2_22
