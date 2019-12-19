package chapter_8;
/** 
 * 
 * 		(Geometry: area of a triangle) Write a method that returns the area of a triangle
 * 		using the following header:
 * 
 * 		public static double getTriangleArea(double[][] points)
 * 
 * 		The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * 		[0] and points[0][1] for (x1, y1). The triangle area can be computed using the
 * 		formula in Programming Exercise 2.19. The method returns 0 if the three points
 * 		are on the same line. Write a program that prompts the user to enter three points of
 * 		a triangle and displays the triangle's area. Here is a sample run of the program:
 * 		
 * 		Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
 * 		The area of the triangle is 2.25
 * 		
 * 		Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
 * 		The three points are on the same line
 * 
 * 			S = (side1 + side2 + side3) /2;
 * 
 * 						    ___________________________________
 * 					area = V s(s - side1)(s - side2)(s - side3)
 * 
 * 					Here is a sample run:
 * 
 * 					Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
 * 					The area of the triangle is 33.6
 * 
 * 
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;
/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_32 */
public class Exercise_8_32{

	/** Creating the main method */
	public static void main(String[] arg) {
		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("####.00");

		/** Created the necessary variable array of 3 by 2 following initial instruction */
		double [][] matrix = new double [3][2];

		/** Printed out the user guide in order to let the user insert the triangle points */
		System.out.print("\n\n\tEnter three points for a triangle -> ");
		
		/** Calling the method fill Matrix in order to fill the Matrix Multidimensional */
		matrix = fillMatrix(input, matrix);

		//created necessary variable in order to absorb the area calculation through the getTriangleAre method
		double area  = getTriangleArea(matrix);
		
		/** Print out the area founded */
		System.out.print("\n\t" + ((area == 0)?"The three points are on the same line":"The area of the triangle is " + df.format(area)));

		input.close();

	}//close main method

	/** Created a get Triangle Area following the initial instructions */
	public static double getTriangleArea(double[][] points) {

//		x1, y1,
//		x2, y2, 
//		x3, y3:
//		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
//		System.out.println(side1); //test values
		
//		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);
//		System.out.println(side2); //test values
		
//		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2), 0.5);
//		System.out.println(side3); //test values
		
		double s = (side1 + side2 + side3) / 2;
//		System.out.println(s);//test values
		
		double result = 0;
		
		/** Created an if statement in order to avoid the NaN */
		if(Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5) >= 0) 
			
			 result = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		return result;
	}//close get Triangle Area method

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
}//closing the class_8_32

