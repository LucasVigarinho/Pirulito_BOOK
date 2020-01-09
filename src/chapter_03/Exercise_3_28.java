package chapter_03;


import java.util.Scanner;
/**
 * 
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as shown
 * in Figure 3.9. Test your program to cover all cases.
 * 
 * 
 * (a) A rectangle is inside another one. (b) A rectangle overlaps another one.
 * 
 * Here are the sample runs:
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 * 
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 * 
 * 
 */

/** Defining the main class*/
public class Exercise_3_28 {

	/** Defining the constructor of the class */
	public Exercise_3_28() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		//Print out the message for the user insert coordinates coordinates of the first rectangle
		System.out.print("\n\n\tEnter a point's x- and y- coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		//Print out the message for the user insert coordinates of the second rectangle
		System.out.print("\n\n\tEnter a point's x- and y- coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();

		//calculation
		double rec1 = (Math.pow(Math.pow(y2 - y1, 2), .05)) + height1 / 2;
		double rec2 = (Math.pow(Math.pow(x2 - x1, 2), .05)) + width2 / 2;

		//Determine whether the second rectangle is inside the first
		if	((rec1 <= (height1 / 2)) && (rec2 <= (width1 / 2)) && ((height1 / 2 + height2 / 2) <= height1) &&	((width1 / 2 + width2 / 2) <= width1))

				
			System.out.println("\n\n\tRectangle 2 is inside Rectangle 1");

		else if ((x1 + width1 / 2 > x2 - width2) ||  (y1 + height1 / 2 > y2 - height2))

			System.out.println("\n\n\tRectangle 2 overlaps Rectangle 1");

		else

			System.out.println("\n\n\tRectangle 2 does not overlap Rectangle 1");

		input.close();
		
	}//closing the main method


}//closing class exercise_3_28
//
//((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) && 
//		(Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
//		(r1Height / 2 + r2Height / 2 <= r1Height) &&
//		(r1Width / 2 + r2Width / 2 <= r1Width))