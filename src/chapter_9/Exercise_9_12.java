package chapter_9;

import java.text.DecimalFormat;
import java.util.Scanner;

/** 
 * 			
 * 		(Geometry: intersecting point) Suppose two line segments intersect. The two end  points
 * 		for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * 		segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * 		these four endpoints and displays the intersecting point. As discussed in Programming
 * 		Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * 		Use the LinearEquation class in Programming Exercise 9.11 to solve this
 * 		equation. See Programming Exercise 3.25 for sample runs.
 * 
 * 		 * Write a program that prompts the user to enter four points and displays the intersecting
 * 		point. Here are sample runs:
 * 
 * 				   (x2,y2)		
 * 				     /		  (x2,y2)				(x2,y2)		(x3,y3)
 *  	(x3,y3)     /            /                     /		   /
 * 			\      /            /\                    /			  /	
 * 			 \    /            /  \                  /			 /
 * 			  \  /            /    \(x3,y3)         /			/
 *      	   \/            /      \              /		   /
 *         	   /\           /        \            /			  /
 *        	  /  \         /          \			 /			 /
 *       	 /    \		(x1,y1)	    (x4,y4)		/			/
 *      	/    (x4,y4)					(x1,y1)		(x4,y4)
 *   	(x1,y1)
 * 
 * 		Two lines intersect in (a and b) and two lines are parallel in (c).
 * 
 *    	1 1 4 4 1 8 2 4 - result 2.4 and -2.4
 *    
 *    	0 1 0 4 1 8 1 4 - Parallel
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_9_12 */
public class Exercise_9_12{

	/** The two end  points	for the first line segment are (x1, y1) and (x2, y2) and for the second line
	 *	segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
	 *	these four endpoints and displays the intersecting point. */
	
	/** Use the LinearEquation class in Programming Exercise 9.11 to solve this
	 *	equation. See Programming Exercise 3.25 for sample runs. */
	
	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);


		//Creating the necessary variables 
		System.out.print("\n\n\tEnter x1, y1, x2, y2, x3, y3, x4, y4: ");
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

		//create the necessary variable
		LinearEquation testing = new LinearEquation(a, b, c, d, e, f);

		Exercise_9_11.testLinearEquation(testing);


		input.close();

	}//closing the main method

	
}//closing the class_9_12

