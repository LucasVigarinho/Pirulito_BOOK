package chapter_08;
/** 
 * 
 * 		(Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * 		in the major diagonal in an n * n matrix of double values using the following
 * 		header:
 * 
 * 		public static double sumMajorDiagonal(double[][] m)
 * 
 * 		Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * 		elements on the major diagonal. Here is a sample run:
 * 		
 * 		Enter a 4-by-4 matrix row by row:
 * 											1 	2 	3 	4.0 ----    
 * 											5 	6.5 7 	8
 * 											9 	10 	11 	12
 * 											13 	14 	15 	16
 * 
 * 			test numbers 1 	2 	3 	4.0 5 	6.5 7 	8 9 	10 	11 	12 13 	14 	15 	16
 * 		Sum of the elements in the major diagonal is 34.5
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_02 */
public class Exercise_8_02{

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		double [][] matrix = new double [4][4];
		System.out.println("Enter a 4-by-4 matrix: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		//create the necessary variable
		


		System.out.println(sumMajorDiagonal(matrix));

		input.close();

	}//closing the main method

	/** Created a method following the initials instructions, in order to sum all the values of the major diagonal */
	public static double sumMajorDiagonal(double[][] m) {

		//created the necessary variable to sum the numbers
		double result = 0;

		/** Created a for loop in order to sum all the rows from the specific column */
		for(int b = 0; b < m.length; b++) {
			result += m[b][b];
		}

		return result;
	}//closing the sumColumn method

}//closing the class_8_02

