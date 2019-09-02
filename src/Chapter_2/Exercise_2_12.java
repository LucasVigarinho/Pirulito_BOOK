package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 *                                 2
 * 						length =  v
 * 								 ---
 * 								  2a	
 * 
 * Write a program that prompts the user to enter v in meters/second (m/s) and the
 * acceleration a in meters/second squared (m/s2), and displays the minimum runway
 * length. Here is a sample run:	
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter speed and acceleration: 60 3.5
 * 						The minimum runway length for this airplane is 514.286
 * 
 * 
 * */
public class Exercise_2_12{

	/** Constructor not utilized */
	public Exercise_2_12() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		
		System.out.print("\n\t\tEnter speed and acceleration: ");
		double speed = input.nextDouble();
		double accel = input.nextDouble();
		
		//calculation of minimum length
		double length = (Math.pow(speed, 2))/ ( 2 * accel);
		
		System.out.println("\n\t\tThe minimum runway length for this airplane is -> " + df.format(length));
		
	}//close main method

}//close class Exercise_2_12
