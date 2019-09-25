package chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is
 * on the left of the line, on the right, or on the same line (see Figure 3.11):
 * 
 *                                                         | >0 p2 is on the left side of the line 
 *                                                         |
 *     		(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) <   = 0 p2 is on the same line
 *     													   |
 *                                                         | <0 p2 is on the right side of the line
 *                                                         
 * 								 *           * p1          * p1				
 * 								/           /             /
 * 					* 		   /           /             /
 * 							  /           /      p2     * p2
 * 	                         /           /       *     /
 * 							*p0         * p0          * p0
 * 
 * 							(a)         (b)          (c)
 * 
 * (a) p2 is on the left of the line. (b) p2 is on the right of the line. (c) p2 is on
 * the same line.
 * 
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
 * the same line. Here are some sample runs:
 * 
 * 
 * Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
 * (-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)
 * 
 * Enter three points for p0, p1, and p2: 1 1 5 5 2 2
 * (2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)
 * 
 * 
 * Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
 * (5.v0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
 * 
 * 
 * 
 */

/** Defining the main class*/
public class Exercise_3_32 {

	/** Defining the constructor of the class */
	public Exercise_3_32() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		//creating the objects to absorb the user informations and to print out in a good format
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.0");
		
		//Printing out the message to be the user guide
		System.out.print("\n\n\tEnter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
		//calculation
		double p2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
                                                   
		//if statement to control the right answer
		if (p2 > 0) {
			System.out.print("\n\n\t(" + x2 + ", " + y2 + " is on the left side of the line from(" + x0 + ", " + y0 + ") to (" +  x1 + ", " + y1  + ")");
		}else if (p2 == 0) {
			System.out.print("\n\n\t(" + x2 + ", " + y2 + " is on the line from (" + x0 + ", " + y0 + ") to (" +  x1 + ", " + y1  + ")");
		}else {
			System.out.print("\n\n\t(" + x2 + ", " + y2 + " is on the right side of the line from (" + x0 + ", " + y0 + ") to (" +  x1 + ", " + y1  + ")");
		}
		
		input.close();
	}//closing the main method

}//closing class exercise_3_29
