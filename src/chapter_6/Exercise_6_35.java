package chapter_6;

/**
 * 
 * 		(Geometry: area of a pentagon) The area of a pentagon can be computed using the
 * 		following formula:                   2
 * 								Area = (5 x S ) / (4 x tan(pi/5))
 * 					
 * 		Write a method that returns the area of a pentagon using the following header:
 * 
 * 		public static double area(double side)
 * 
 * 		Write a main method that prompts the user to enter the side of a pentagon and
 * 		displays its area. Here is a sample run:
 * 
 * 		Enter the side: 5.5
 * 		The area of the pentagon is 52.04444136781625
 * 
 * @author lucasmaximo
 *
 */

/** Importing the necessary libraries */
import java.util.Scanner;

/** Created the exercise_6_35 class */
public class Exercise_6_35 {

	/** Created the main method */
	public static void main(String [] args) {
		
		/** Created the objects needed */
		Scanner input = new Scanner(System.in);
		
		/** Print out the message to be the user guide interaction */
		System.out.print("\n\n\tEnter the side: ");
		
		/** Created the variables to absorb the user interaction */
		double side = input.nextDouble();
		
		
		/** Calling the method */
		System.out.print("\n\n\tThe area of the pentagon is " + area(side));
		
	}//closing main method
	
	/** Created the method following the instructions */
	public static double area(double side) {
		
		 double area = (5 * Math.pow(side, 2) ) / (4 * Math.tan(Math.PI/5));
		 
		 return area;
	}//closing the method area of the pentagon
	
}//closing the class
