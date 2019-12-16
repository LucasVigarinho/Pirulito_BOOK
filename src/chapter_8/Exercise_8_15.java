package chapter_8;
/** 
 * 
 * 		(Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 * 		whether three points are on the same line.
 * 		Write the following method to test whether all the points in the array points are
 * 		on the same line.
 * 
 * 		public static boolean sameLine(double[][] points)
 * 
 * 		Write a program that prompts the user to enter five points and displays whether
 * 		they are on the same line. Here are sample runs:
 * 		
 * 		Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
 * 		The five points are not on the same line
 * 		
 * 		Enter five points: 1 1 2 2 3 3 4 4 5 5
 * 		The five points are on the same line
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_15{

	/** Creating the main method */
	public static void main(String[] arg) {

		//creating the objects to absorb the user informations and to print out in a good format
		Scanner input = new Scanner (System.in);

		//Printing out the message to be the user guide
		System.out.print("\n\n\tEnter three points for p0, p1, p2, p3 and p4: ");


		//Created the variable in order to absorb the user insertion
		int size = 5;
		//created the multidimensional array and use the variable created with the user insertion to define its size
		double [][] matrix = new double [size][2];
		//created the main for loop in order to run all the rows of the array created
		for(int a = 0; a < matrix.length; a++) {
			//created the nested for loop in order to run all the columns of the array created
			for(int b = 0; b < matrix[a].length; b++) {
				//fill all the positions of the array randomly with 1 and 0
				matrix[a][b] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop

		printArray(matrix);

		// Display whether the point in an array are on the same line
		System.out.println("\n\tThe five points are" + (onTheLineSegment(matrix) ? " " : " not ") + "on the same line");

		input.close();
	}//closing the main method

	/** Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
	public static boolean onTheLineSegment(double [][] matrix) {
		for (int i = 0; i < matrix.length - 2; i += 3) {
			if (calculationPoint(matrix[i][0], matrix[i][1], matrix[i + 1][0], 
					matrix[i + 1][1], matrix[i + 2][0], matrix[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}

	/** Created the method to calculate the necessary point location in order to avoid repetition */ 
	public static double calculationPoint(double x0, double y0, double x1, double y1, double x2, double y2) {
		// Calculate point position
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}

	/** Created a method in order to print a multidimensional array */
	public static void printArray(double [][] matrix) {
		System.out.print("\n\t");
		//created a for loop in order to print out the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {

				System.out.print(matrix[i][k] + " ");
			}
			System.out.print("\n\t");
		}
	}

}//closing the class_8_01

