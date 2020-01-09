package chapter_03;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * 
 *  (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * 
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * 										      _________2___________2_
 * The formula for computing the distance is V(x2 - x1) + (y2 - y1)   . Test your
 * 
 * program to cover all cases.) Two sample runs are shown below.
 * 
 * 	     y-axis |										 y-axis |
 * 				|												|
 *            ' |   '                            _______________|_________________
 *       '      |       '  *(9,9)               |               |                 |  * (6,4)
 *     '        | (4,5)   '                     |               |    (2,2)        |
 *   '          |   *       '                   |               |      *          |
 *  '           |            '                  |               |                 |
 *  '___________|_____________'____         ____|_______________|_________________|___ 
 *  '           |(0,0)        '   x-axis        |               |(0,0)	          |   x-axis 
 *  '           |            '                  |               |                 |
 *   '          |           '                   |		        |                 |
 *    '         |          '                    |_______________|_________________|
 *      '       |        '                                      |                             
 *        '     |     '                                         |                                
 *            ' '  '                                            |                       
 *              |                                              (b)                       
 *              |                                                                               
 *             (a)                                                                          
 * 
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 * 
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 * 
*/

/** Defining the main class*/
public class Exercise_3_22 {

	/** Defining the constructor of the class */
	public Exercise_3_22() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
		/**  Creating the object scanner to absorb the user information */
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.0");
		
		System.out.print("\n\n\tEnter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double calc = Math.pow((Math.pow((x * 2 - x * 1),2) + Math.pow((y * 2 - y * 1),2)), 0.5);
		
		if(calc < 10)
		System.out.print("\n\n\tPoint (" + df.format(x) + ", " + df.format(y) + ") is in the circle");
		else
		System.out.print("\n\n\tPoint (" + df.format(x) + ", " + df.format(y) + ") is not in the circle");
		
		input.close();
	}//closing the main method
	
}//closing class exercise_3_22
