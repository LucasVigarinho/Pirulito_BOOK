package chapter_8;
/** 
 * 			
 * 
 * 		(Sum elements column by column) Write a method that returns the sum of all the
 * 		elements in a specified column in a matrix using the following header:
 * 
 * 		public static double sumColumn(double[][] m, int columnIndex)
 * 		
 * 		Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * 		column. Here is a sample run:
 * 
 * 		Enter a 3-by-4 matrix row by row:
 * 											_________________
 * 											|1.5 | 2 | 3 | 4 |
 * 											|5.5 | 6 | 7 | 8 |
 * 											|9.5 | 1 | 3 | 1 |
 * 											------------------
 * 											16.5   9   13  13
 * 		
 * 		Sum of the elements at column 0 is 16.5
 * 		Sum of the elements at column 1 is 9.0
 * 		Sum of the elements at column 2 is 13.0
 * 		Sum of the elements at column 3 is 13.0
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_8_01 */
public class Exercise_8_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variable
		double [][] matrix = new double [3][4];

		matrix [0][0] = 1.5;
		matrix [0][1] = 2;
		matrix [0][2] = 3;
		matrix [0][3] = 4;
		matrix [1][0] = 5.5;
		matrix [1][1] = 6;
		matrix [1][2] = 7;
		matrix [1][3] = 8;
		matrix [2][0] = 9.5;
		matrix [2][1] = 1;
		matrix [2][2] = 3;
		matrix [2][3] = 1;



		System.out.println(sumColumn(matrix, 0));
		System.out.println(sumColumn(matrix, 1));
		System.out.println(sumColumn(matrix, 2));
		System.out.println(sumColumn(matrix, 3));


	}//closing the main method

	/** Created a method following the initials instructions, in order to sum all the values of the columns */
	public static double sumColumn(double[][] m, int columnIndex) {

		//created the necessary variable to sum the numbers
		double result = 0;
		
		/** Created a for loop in order to sum all the rows from the specific column */
		for(int b = 0; b < 3; b++) {
			result += m[b][columnIndex];
		}

		return result;
	}//closing the sumColumn method
}//closing the class_8_01

