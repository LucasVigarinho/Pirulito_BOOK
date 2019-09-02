package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Science: calculating energy) Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 * and energy Q is measured in joules. Here is a sample run:
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter the amount of water in kilograms: 55.5
 * 						Enter the initial temperature: 3.5
 * 						Enter the final temperature: 10.5
 * 						The energy needed is 1625484.0
 * 
 * 
 * */
public class Exercise_2_10{

	/** Constructor not utilized */
	public Exercise_2_10() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#######.0");
		
		//Asking to the user inform
		System.out.print("\n\tPlease, Enter the amount of water in kilograms: \t--> ");
		double m = input.nextDouble();
		System.out.print("\n\tPlease, Enter the initial temperature: \t--> ");
		double t0 = input.nextDouble();
		System.out.print("\n\tPlease, Enter the final temperature: \t--> ");
		double t1 = input.nextDouble();
		
		// milliseconds since midnight, Jan 1, 1970
		double q = m * (t1 - t0) * 4184;
			
				
		//Printing out the result of the transformation
		System.out.println("\n\tThe average acceleration is \t--> " + df.format(q));

		input.close();
		
		
	}//close main method

}//close class Exercise_2_10
