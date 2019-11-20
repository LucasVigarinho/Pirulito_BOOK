package chapter_7;
/** 
 * 
 * 			(Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 * 			deviation of numbers. This exercise uses a different but equivalent formula to
 * 			compute the standard deviation of n numbers.
 * 			
 * 				
 * 			mean = (X1 + X2 + X3 + .... + Xn) / n    deviation = sqrt((pow(Xi - mean), 2)/(n-1))
 * 		
 * 			To compute the standard deviation with this formula, you have to store the individual
 * 			numbers using an array, so that they can be used after the mean is obtained.
 * 			Your program should contain the following methods:
 * 
 * 			// Compute the deviation of double values 
 * 			public static double deviation(double[] x)
 *
 * 			//Compute the mean of an array of double values 
 * 			public static double mean(double[] x)
 *
 * 			Write a test program that prompts the user to enter ten numbers and displays the
 * 			mean and standard deviation, as shown in the following sample run:
 * 		
 * 
 * 			Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
 * 			The mean is 3.11
 * 			The standard deviation is 1.55738
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.text.DecimalFormat;
import java.util.Scanner;


/** Creating the class named Exercise_7_11 */
public class Exercise_7_11{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);
		DecimalFormat df2 = new DecimalFormat("####.00");
		DecimalFormat df5 = new DecimalFormat("####.00000");

		//creating the necessary variables
		double [] numbers = new double [10];
		double summ = 0;
		int quantNumb = 0;



		//print out the interaction with the user, in order to absorb the numbers
		System.out.print("\n\n\tEnter ten numbers: ");

		//creating an while loop in order to populate the array 
		while(quantNumb < 10) {
			numbers[quantNumb] = input.nextDouble();
			summ += numbers[quantNumb];
			quantNumb +=1;

		}//closing the while loop


		System.out.print("\n\n\tThe mean is " + df2.format(mean(numbers)));

		

		System.out.print("\n\tThe standard deviation is " + df5.format(deviation(numbers)));

		input.close();
	}//closing the main method


	// Compute the deviation of double values 
	public static double deviation(double[] x) {
		double deviationP1 = 0.0;
		for(int i = 0; i < x.length; i++) {
			deviationP1 += (Math.pow((x[i] - mean(x)), 2));
		}
		
		return Math.sqrt((deviationP1/(x.length-1)));
	}//closing deviation method

	//Compute the mean of an array of double values 
	public static double mean(double[] x) {
		double xSum = 0.0;
		//calculation
		for(int i = 0; i < x.length; i++) {
			xSum += x[i];
		}
		//return calculation
		return xSum/x.length;
		
	}//closing mean method

}//closing the class_7_11
