package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 * 			
 * 			 v1 - v0
 * 		a = ---------
 * 			    t
 * 
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration. Here is a sample run:
 * 				
 * 						Enter v0, v1, and t: 5.5 50.9 4.5
 * 						The average acceleration is 10.0889	
 * 
 * 
 * */
public class Exercise_2_09{

	/** Constructor not utilized */
	public Exercise_2_09() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.####");
		
		//Asking to the user inform 
		System.out.print("\n\tPlease, Enter v0, v1, and t:  \t--> ");
		
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		// milliseconds since midnight, Jan 1, 1970
		double averageA = (v1 - v0) / t;
			
				
		//Printing out the result of the transformation
		System.out.println("\n\tThe average acceleration is \t--> " + df.format(averageA));

		input.close();
		
		
	}//close main method

}//close class Exercise_2_9
