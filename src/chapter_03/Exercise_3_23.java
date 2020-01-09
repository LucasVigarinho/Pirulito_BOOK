package chapter_03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 * a point (x, y) and checks whether the point is within the rectangle centered at
 * (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 * (6, 4) is outside the rectangle, as shown in Figure 3.7b. 
 * 
 * (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
 * vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
 * cover all cases.) Here are two sample runs.
 * 
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 * 
 * 
 * Enter a point with two coordinates: 6 4
 * Point (6.0, 4.0) is not in the rectangle
 * 
*/

/** Defining the main class*/
public class Exercise_3_23 {

	/** Defining the constructor of the class */
	public Exercise_3_23() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		/**  Creating the object scanner to absorb the user information */
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.0");
		
		System.out.print("\n\n\tEnter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double xT = 10.0/2;
		double yT = 5.0/2;
		
		if((x < xT) && (y < yT))
		System.out.print("\n\n\tPoint (" + df.format(x) + ", " + df.format(y) + ") is in the rectangle");
		else
		System.out.print("\n\n\tPoint (" + df.format(x) + ", " + df.format(y) + ") is not in the rectangle");
		
		input.close();
		
	}//closing the main method
	
}//closing class exercise_3_23
