package chapter_6;

/**
 * 
 * 
 * 		(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * 		in which all sides are of the same length and all angles have the same degree (i.e.,
 * 		the polygon is both equilateral and equiangular). The formula for computing the
 * 		area of a regular polygon is
 *		  										     2
 *		  								Area = (n x S ) / (4 x tan(pi/n))
 *
 *		Write a method that returns the area of a regular polygon using the following header:
 *
 *		public static double area(int n, double side)
 *
 *		Write a main method that prompts the user to enter the number of sides and the
 *		side of a regular polygon and displays its area. Here is a sample run:
 *
 *		Enter the number of sides: 5
 *		Enter the side: 6.5
 *		The area of the polygon is 72.69017017488385
 *
 * @author lucasmaximo
 *
 */

/** Importing the necessary libraries */
import java.util.Scanner;

/** Created the exercise_6_36 class */
public class Exercise_6_36 {

	/** Created the main method */
	public static void main(String [] args) {
		
		/** Created the objects needed */
		Scanner input = new Scanner(System.in);
		
		/** Print out the message to be the user guide interaction - sides */
		System.out.print("\n\n\tEnter the number of sides: ");
		
		/** Created the variables to absorb the user interaction - sides */
		double sides = input.nextDouble();
	
		/** Print out the message to be the user guide interaction - side */
		System.out.print("\n\n\tEnter the side: ");
		
		/** Created the variables to absorb the user interaction - side */
		double side = input.nextDouble();
		
		/** Calling the method */
		System.out.print("\n\n\tThe area of the pentagon is " + area(sides, side));
		
	}//closing main method
	
	/** Created the method following the instructions */
	public static double area(double sides, double side) {
		
		 double area = (sides * Math.pow(side, 2) ) / (4 * Math.tan(Math.PI/sides));
		 
		 return area;
	}//closing the method area of the pentagon
	
}//closing the class