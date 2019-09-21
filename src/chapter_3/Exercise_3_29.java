package chapter_3;

import java.util.Scanner;

/**
 * 
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radius of two circles and determines whether the second circle is
 * inside the first or overlaps with the first, as shown in Figure 3.10. 
 * 
 * (Hint: circle2 is inside circle1 if the distance between the two centers <= |r1 - r2| and circle2
 * overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
 * program to cover all cases.)
 * Here are the sample runs:
 * 
 * 
 * Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
 * Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
 * circle2 is inside circle1
 * 
 * 
 * (a) A circle is inside another circle. (b) A circle overlaps another circle.
 * 
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
 * Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
 * circle2 overlaps circle1
 * 
 * Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
 * Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
 * circle2 does not overlap circle1
 * 
 */

/** Defining the main class*/
public class Exercise_3_29 {

	/** Defining the constructor of the class */
	public Exercise_3_29() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {

		//Creating the objects to absorb and format the print out numbers
		Scanner input = new Scanner(System.in);


		//Print out the message for the user insert coordinates
		System.out.print("\n\n\tEnter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();

		//Print out the message for the user insert coordinates
		System.out.print("\n\n\tEnter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		//calculation
		double areaC1 = (Math.pow(((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2))), 0.5) );

		//Creating if statement in order to answer the questions asked
		if (areaC1 <= Math.abs(r1 - r2)) {
			
			System.out.print("\n\n\tCircle 2 is inside Circle 1");
		}else if (areaC1 <= r1 + r2) {
			
			System.out.print("\n\n\tCircle 2 overlaps Circle 1");
		}else {
			
			System.out.print("\n\n\tCircle 2 does not overlap Circle 1");
		}//close if statement
		
		//closing object
		input.close();


	}//closing the main method

}//closing class exercise_3_29
