package chapter_06;



/** 
 * 
 * 		(The MyTriangle class) Create a class named MyTriangle that contains the
 * 		following two methods:
 * 		// Return true if the sum of any two sides is
 * 
 * 		* greater than the third side. *
 * 
 * 		public static boolean isValid(double side1, double side2, double side3)
 * 		
 * 		/* Return the area of the triangle. /
 * 
 * 		public static double area(double side1, double side2, double side3)
 * 
 * 		Write a test program that reads three sides for a triangle and computes the area if
 * 		the input is valid. Otherwise, it displays that the input is invalid. The formula for
 * 		computing the area of a triangle is given in Programming Exercise 2.19.
 * 
 * @author lucasmaximo
 *
 */

/** Importing the libraries needed */
import java.text.DecimalFormat;
import java.util.Scanner;

/** Created the public class for the exercise 6 19*/
public class Exercise_6_19 {

	/** Created the main method */
	public static void main (String[] args) {

		//created the objects needed
		DecimalFormat df = new DecimalFormat("##.#");
		Scanner input = new Scanner(System.in);

		//created the variables needed
		double side1, side2, side3, count = 0;
		double x1, y1, x2, y2, x3, y3 = 0;
		//create a do loop in order to interact with the user while the test realized by the isValid method did not pass
		do {
			//create a if statement in order to give the message asked above at the instructions, if the input was invalid
			if(count >= 1) {
				System.out.print("\n\n\t\tThe input is invalid. TRY AGAIN!\n");
			}//closing the if statement
			
			//print out the message to interact with the user
			System.out.print("\n\n\tEnter three points for a triangle: ");
			//absorb the user insertion
			 x1 = input.nextDouble();
			 y1 = input.nextDouble();
			 x2 = input.nextDouble();
			 y2 = input.nextDouble();
			 x3 = input.nextDouble();
			 y3 = input.nextDouble();

			 //calculation of sides
			side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
			side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
			side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
			//System.out.print("\n\n\tSide1 " + df.format(side1) + "\n\tside2 " + df.format(side2) + "\n\tside3 "+ df.format(side3));
			
			//count, in order to give the information of wrong inputed message
			count+=1;

		}while(isValid(side1, side2, side3) == false);

		System.out.print("\n\n\tThe area of the triangle is " + df.format(area(side1, side2, side3)));
		
		input.close();

	}//closing the main method

	/** Return true if the sum of any two sides is 
	 * greater than the third side.                */
	public static boolean isValid(double side1, double side2, double side3) {

		//if statement created in order to realizes the test
		if (((side1 + side2) > side3) || ((side1 + side3) > side2) || ((side2 + side3) > side1)) {
			return true;
		}else {
			return false;
		}//closing if statement
	}//closing the method following the instructions

	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {

		//calculation of area
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		return area;
	}//closing the method following the instructions

}//closing the class 
