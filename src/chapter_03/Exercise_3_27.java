package chapter_03;

import java.util.Scanner;

/**
 * 
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle. Here are the sample runs:
 * 
 * 
 * 
 * Enter a point's x- and y- coordinates: 100.5 25.5
 * The point is in the triangle
 * 
 * Enter a point's x- and y- coordinates: 100.5 50.5
 * The point is not in the triangle
 * 
 */

/** Defining the main class*/
public class Exercise_3_27 {

	/** Defining the constructor of the class */
	public Exercise_3_27() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		//Creating the objects to absorb and format the print out numbers
		Scanner input = new Scanner(System.in);
		
		
		//Print out the message for the user insert coordinates
		System.out.print("\n\n\tEnter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		//calculation
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		//if statement for the right answer
		if ( (intersectx < x || intersecty < y)) 
			System.out.print("\n\n\tThe point is not in the triangle");
		else
			System.out.print("\n\n\tThe point is in the triangle");
		
		//closing object
		input.close();
		
	}//closing the main method

}//closing class exercise_3_27
