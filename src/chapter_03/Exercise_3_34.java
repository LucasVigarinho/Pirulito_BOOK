package chapter_03;

import java.util.Scanner;

/**
 * 
 *(Geometry: point on line segment) Programming Exercise 3.32 shows how to test
 * whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
 * test whether a point is on a line segment. Write a program that prompts the user
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
 * segment from p0 to p1. Here are some sample runs:
 * 
 * 
 * Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
 * (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)
 * 
 * Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
 * (3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
 * 
 */

/** Defining the main class*/
public class Exercise_3_34 {

	/** Defining the constructor of the class */
	public Exercise_3_34() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		//creating the objects to absorb the user informations and to print out in a good format
		Scanner input = new Scanner (System.in);
		
		//Printing out the message to be the user guide
		System.out.print("\n\n\tEnter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
                                                   
		//if statement to control the right answer
		if (x2 > x1 && x2 > x0) {
			System.out.print("\n\n\t(" + x2 + ", " + y2 + " is not on the line segment from  (" + x0 + ", " + y0 + ") to (" +  x1 + ", " + y1  + ")");
		}else {
			System.out.print("\n\n\t(" + x2 + ", " + y2 + " is on the line segment from (" + x0 + ", " + y0 + ") to (" +  x1 + ", " + y1  + ")");
		}
		
		input.close();
	}//closing the main method

}//closing class exercise_3_29
