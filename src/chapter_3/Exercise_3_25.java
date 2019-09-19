package chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following
 * linear equation:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise
 * 3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * 
 * Write a program that prompts the user to enter four points and displays the intersecting
 * point. Here are sample runs:
 * 
 * 			   (x2,y2)		
 * 			     /		  (x2,y2)				(x2,y2)		(x3,y3)
 *  (x3,y3)     /            /                     /		   /
 * 		\      /            /\                    /			  /	
 * 		 \    /            /  \                  /			 /
 * 		  \  /            /    \(x3,y3)         /			/
 *         \/            /      \              /		   /
 *         /\           /        \            /			  /
 *        /  \         /          \			 /			 /
 *       /    \		(x1,y1)	    (x4,y4)		/			/
 *      /    (x4,y4)					(x1,y1)		(x4,y4)
 *   (x1,y1)
 * 
 * Two lines intersect in (a and b) and two lines are parallel in (c).
 * 
 *    1 1 4 4 1 8 2 4 - result 2.4 and -2.4
 *    
 *    0 1 0 4 1 8 1 4 - Parallel
 * 
 */

/** Defining the main class*/
public class Exercise_3_25 {

	/** Defining the constructor of the class */
	public Exercise_3_25() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("####.0");

		//Creating the necessary variables 
		System.out.println("\n\n\tEnter x1, y1, x2, y2, x3, y3, x4, y4:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();


		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (a * x1) - (b * y1);
		double f = (c * x3) - (d * y3);



		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));


		if ( x > 100000 || y > 100000) {

			System.out.println("\nTwo lines are parallel in (c). \t\t" );

		}else {
			System.out.println("\nTwo lines intersect in (" + df.format(x) + " and " + df.format(y) + "). \t\t" );
		}

	}//closing the main method

}//closing class exercise_3_25
