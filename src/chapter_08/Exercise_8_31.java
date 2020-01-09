package chapter_08;
/** 
 * 
 * 		(Geometry: intersecting point) Write a method that returns the intersecting point of
 * 		two lines. The intersecting point of the two lines can be found by using the formula
 * 		shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 * 		two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
 * 
 * 		public static double[] getIntersectingPoint(double[][] points)
 * 
 * 		The points are stored in a 4-by-2 two-dimensional array points with
 * 		(points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
 * 		point or null if the two lines are parallel. Write a program that prompts
 * 		the user to enter four points and displays the intersecting point. See Programming
 * 		Exercise 3.25 for a sample run.
 * 		
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
 *    
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;
/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_31 */
public class Exercise_8_31{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("####.0");

		/** Created the necessary variable array of 4 by 2 following initial instruction */
		double [][] matrix = new double [4][2];
		
		//Creating the necessary variables 
		System.out.print("\n\n\tEnter x1, y1, x2, y2, x3, y3, x4, y4 -> ");
		matrix = fillMatrix(input, matrix);
		

		double [] result = getIntersectingPoint(matrix);

		if ( result[0] > 100000 || result[1] > 100000) {

			System.out.println("\n\tTwo lines are parallel in (c). \t\t" );

		}else {
			System.out.println("\n\tTwo lines intersect in (" + df.format(result[0]) + " and " + df.format(result[1]) + "). \t\t" );
		}
		
		input.close();
		
	}//closing the main method

	/** Created a method in order to follow all the initial instructions */
	public static double[] getIntersectingPoint(double[][] points) {
//		x1, y1, 
//		x2, y2, 
//		x3, y3, 
//		x4, y4:

//		double a = y1 - y2;
		double a = points[0][1] - points[1][1];
		
//		double b = x1 - x2;
		double b = points[0][0] - points[1][0];
		
//		double c = y3 - y4;
		double c = points[2][1] - points[3][1];
		
//		double d = x3 - x4;
		double d = points[2][0] - points[3][0];
		
//		double e = (a * x1) - (b * y1);
		double e = (a * points[0][0]) - (b * points[0][1]);
		
//		double f = (c * x3) - (d * y3);
		double f = (c * points[2][0]) - (d * points[2][1]);

		double [] answer = new double [2];
		
		answer[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
		answer[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		return answer;
		
	}//closing method get Intersecting Point

	/** Created a method in order to fill all positions of the matrix */
	public static double [][] fillMatrix(Scanner input, double [][] matrix){
	
		double [][] m = matrix.clone();
		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < matrix.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < matrix[row].length; columns++) {
				m[row][columns] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop
		
		
		return m;
	}//closing method fill Matrix
}//closing the class_8_31

