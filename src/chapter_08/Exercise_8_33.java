package chapter_08;
/** 
 * 
 * 		(Geometry: polygon sub areas) A convex 4-vertex polygon is divided into four
 * 		triangles, as shown in Figure 8.9.
 * 		Write a program that prompts the user to enter the coordinates of four vertices and
 * 		displays the areas of the four triangles in increasing order. Here is a sample run:
 * 
 * 		Enter x1, y1, x2, y2, x3, y3, x4, y4:
 * 		-2.5 2 4 4 3 -2 -2 -3.5
 * 		The areas are 6.17 7.96 8.08 10.42
 * 		
 * 		
 * @author lucasmaximo
 *
 */

import java.text.DecimalFormat;
/** Necessary imports */
import java.util.Scanner;

import chapter_07.Exercise_7_04;
import chapter_07.Exercise_7_05;
import chapter_07.Exercise_7_06;
import chapter_07.Exercise_7_07;
import chapter_07.Exercise_7_14;

/** Creating the class named Exercise_8_33 */
public class Exercise_8_33{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("####.00");

		/** Created the necessary variable array of 4 by 2 following initial instruction */
		double [][] matrix = new double [4][2];

		/** Printed out the user guide in order to let the user insert the polygon points */
		System.out.print("\n\n\tEnter four points for a polygon -> ");

		/** Calling the method fill Matrix in order to fill the Matrix Multidimensional */
		matrix = fillMatrix(input, matrix);

		/** Created the area array variable in order to absorb the area results after calculation*/
		double [] area = new double [4];
		/** Created the triangle area variable in order to build in every loop the triangle to be calculated the area */
		double [] [] triangle = new double [3][2];
		/** Created a for loop in order to verify the area of the four triangles */
		for(int a = 0; a < 4 ; a++) {
			//defined the first point of all the triangle as 0.0
			triangle[0][0] = -0.1;
			triangle[0][1] = -0.0;

			/** Created a nested for loop specific for populate the triangle array, in order to absorb all triangles and calculate each individually */
			for(int row = 1; row < triangle.length; row++) {
				for(int columns = 0; columns < triangle[row].length; columns++) {
					triangle[row][columns] = matrix[(Math.abs((a + row)-1)> 3)?0:Math.abs((a + row)-1)][columns];
				}//closing the internal nested for loop
			}//closing a nested for loop
			//created necessary variable in order to absorb the area calculation through the getTriangleAre method
			area [a] = getTriangleArea(triangle);
		}//closing the main for loop

		//call method created in order to organize the array  before print it
		area = organizeArray(area);
		
		System.out.print("\n\n\t\t\t  The areas are ->");
		/** Print out the area founded using a for loop  */
		for(int i = 0; i < area.length; i++) {
			System.out.print("   " + df.format(area[i]));
		}//closing a for loop

		input.close();

	}//close main method
	
	/** Created a method to organize the array numbers - bubble sort and create new array with the right size */
	public static double [] organizeArray(double[] myArray) {

		double [] a = myArray.clone();


		//Create the algorithm 
		for (int j = 0; j <= a.length-2; j++) {

			for (int i = 0; i <= a.length-j-2; i++) {

				if(a[i] > a[i+1]) {
					double temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

				}//close if

			}//close for 

		}//close for

		return a ;
	}//closing organize array Method

	/** Created a get Triangle Area following the initial instructions */
	public static double getTriangleArea(double[][] points) {

		//				x1, y1,
		//				x2, y2, 
		//				x3, y3,


		//				double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
		//				System.out.println(side1); //test values

		//				double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2), 0.5);
		//				System.out.println(side2); //test values

		//				double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2), 0.5);
		//				System.out.println(side3); //test values

		double s = (side1 + side2 + side3) / 2;
		//				System.out.println(s);//test values

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



}//closing the class_8_33

