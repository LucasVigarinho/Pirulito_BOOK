package chapter_8;
/** 
 * 
 * 		(Column sorting) Implement the following method to sort the columns in a twodimensional
 * 		array. A new array is returned and the original array is intact.
 * 
 * 		public static double[][] sortColumns(double[][] m)
 * 		
 * 		Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * 		values and displays a new column-sorted matrix. Here is a sample run:
 * 	
 * 		Enter a 3-by-3 matrix row by row:  0.15 0.875 0.375 0.55 0.005 0.225 0.30 0.12 0.4
 * 		0.15 0.875 0.375
 * 		0.55 0.005 0.225
 * 		0.30 0.12 0.4
 * 
 * 		The column-sorted array is
 * 		0.15 0.0050 0.225
 * 		0.3 0.12 0.375
 * 		0.55 0.875 0.4
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_27 */
public class Exercise_8_27{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		//printing out the first line of the game
		System.out.print("\n\n\t**************** SORTING COLUMN - MATRIX ****************");

		/** print out the user guide message in order to give the instructions to the user to insert the matrix size */
		System.out.print("\n\n\tPlease, insert here the size of the Matrix -> ");
		/** Created an matrix according to the size of the matrix defined by the user */
		int size = input.nextInt();
		double [][] matrix = new double [size][size];
		/** print out the user guide message in order to give the instructions to the user to insert the numbers  */
		System.out.print("\n\tPlease, insert here the numbers of the Matrix -> ");

		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < matrix.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < matrix[row].length; columns++) {
				matrix[row][columns] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop

		System.out.print("\n\tPrinting  matrix before sorting columns");
		/** Printed the matrix before sorted columns */
		printMatrix(matrix);

		/** Called the method sortRow in order to sort the columns of the matrix  */
		double [][] newMatrix = sortRows(matrix);

		System.out.print("\n\n\tPrinting  matrix before sorting columns");
		/** Printed the matrix after sorted rows */
		printMatrix(newMatrix);

		input.close();
	}//closing the main method

	/** Created a method following the initial instructions of a sorting column matrix exercise */
	public static double[][] sortRows(double[][] matrix){

		double [][] m = matrix.clone();
		
		/** Created a for loop in order to check the sum of all numbers of all columns - matching 1 */
		for (int row = 0; row < m.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < m[row].length; columns++) {
				//created a nested for loop inside the nested for loop in order to verify all possibilities of the row
				for(int extra = 0; extra < m.length;extra++) {
					//created a if statement to change numbers of the row in order to sort
					if( m[columns][row] < m[extra][row]) {
						//created a temporary variable in order to swipe the numbers
						double temp = m[columns][row];
						m[columns][row] = m[extra][row];
						m[extra][row] = temp;
					}//closing if statement
					
				}//closing second nested for loop 
		
			}//closing the nested for loop
	
		}//closing the main for loop

	return m;
	}//closing the is sorting row Matrix method

	/** Created a method to print the values positions of the Matrix array*/
	public static void printMatrix(double [][] matrix) {

		//printing the first part of the matrix
		System.out.print("\n\n\t");
		for(int t = 0; t < matrix.length ; t++) {
			System.out.print("      " + t);
		}
		System.out.print("\n\t  ");
		for(int x = 0; x < matrix.length ; x++) {
			System.out.print("————----");
		}

		//created a main for loop in order to print the rows of the matrix
		for(int a = 0; a < matrix.length; a++) {

			System.out.print("\n\t" + a +" | ");
			//created a nested for loop in order to print the columns of the matrix
			for(int b = 0; b < matrix[a].length; b++) {

				System.out.print(matrix[a][b] + " | ");

			}//closing the nested for loop 

			//printing the first part of the matrix array
			System.out.print("\n\t  ");
			for(int q = 0; q < matrix.length ; q++) {
				System.out.print("————---");
			}
		}//closing the main for loop 
	}//closing method print matrix

	

	


}//closing the class_8_27

