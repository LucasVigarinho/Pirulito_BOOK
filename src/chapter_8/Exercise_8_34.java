package chapter_8;
/** 
 * 
 * 		(Geometry: rightmost lowest point) In computational geometry, often you need
 * 		to find the rightmost lowest point in a set of points. Write the following method
 * 		that returns the rightmost lowest point in a set of points.
 * 
 * 		public static double[] getRightmostLowestPoint(double[][] points)
 * 
 * 		Write a test program that prompts the user to enter the coordinates of six points
 * 		and displays the rightmost lowest point. Here is a sample run:
 * 
 * 		Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
 * 		The rightmost lowest point is (6.5, -7.0)
 * 		
 * 		1.5 2.5 
 * 		-3 	4.5 
 * 		5.6 -7 
 * 		6.5 -7 
 * 		8 	1 
 * 		10 2.5
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_34 */
public class Exercise_8_34{



	/** Created the main method */
	public static void main(String[] args) {

		/** Created the necessary Scanner object in order to create an interaction between system and user */
		Scanner input = new Scanner(System.in);

		/** Created an array variable of points */
		double[][] points = new double[6][2];

		/** print out the message to the user insert points values */
		System.out.print("\n\n\tEnter 6 points: ");

		/** Fill the array points, absorbing the user inputs, using the fillMatrix method */
		points = fillMatrix(input, points);


		double[] point = getRightMostLowestPoint(points);

		System.out.println("\n\tThe rightmost lowest point is (" + point[0] + ", " + point[1] + ")");


		//closing the scanner object
		input.close();

	}//closing the main method


	/** Created a method in order to fill all positions of the matrix */
	public static double [][] fillMatrix(Scanner input, double [][] matrix){

		double [][] m = matrix.clone();
		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < m.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < m[row].length; columns++) {
				m[row][columns] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop


		return m;
	}//closing method fill Matrix

	/** Created a method following the initial instructions in order to find the lowest point */
	public static double[] getRightMostLowestPoint(double[][] p) {


		//created a right Most array variable of multidimensional row array size
		double[] rightMost = p[0];

		//created a for loop in order to put in 
		for (int i = 1; i < p.length; i++) {
			//created an if statement in order to put the lowest point of the column in the position as a lowest right most
			if (p[i][1] < rightMost[1]) {

				rightMost = p[i];
			} else if (p[i][1] == rightMost[1] && p[i][0] > rightMost[0]) {

				rightMost = p[i];
			}//closing if statement
		}//closing for loop
		
		return rightMost;

	}//closing get Right Most Lowest Point method



}//closing the class_8_34

