package chapter_08;
/** 
 * 
 * 			(Markov matrix) An n * n matrix is called a positive Markov matrix if each
 * 			element is positive and the sum of the elements in each column is 1. Write the
 * 			following method to check whether a matrix is a Markov matrix.
 * 
 * 			public static boolean isMarkovMatrix(double[][] m)
 * 
 * 			Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * 			values and tests whether it is a Markov matrix. Here are sample runs:
 * 
 * 			Enter a 3-by-3 matrix row by row: 0.15 0.875 0.375 0.55 0.005 0.225 0.30 0.12 0.4
 * 			0.15 0.875 0.375
 * 			0.55 0.005 0.225
 * 			0.30 0.12 0.4
 * 			It is a Markov matrix
 * 
 * 			Enter a 3-by-3 matrix row by row: 0.95 -0.875 0.375 0.65 0.005 0.225 0.30 0.22 -0.4
 * 			0.95 -0.875 0.375
 * 			0.65 0.005 0.225
 * 			0.30 0.22 -0.4
 * 			It is not a Markov matrix
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_25 */
public class Exercise_8_25{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		//printing out the first line of the game
		System.out.print("\n\n\t**************** MARKOV - MATRIX ****************");

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

		/** calling a method created in order to print the matrix */
		printMatrix(matrix);
		
		/** Called the method created by following the initial instructions in order to check if this matrix IS or IS NOT a Markov Matrix */
		//printing out the first line of the game
		System.out.print("\n\n\t" + ((isMarkovMatrix(matrix))?"IT IS a Markov matrix":"IT IS NOT a Markov matrix"));




		input.close();
	}//closing the main method

	/** Created a method following the initial instructions of a Makrov matrix exercise */
	public static boolean isMarkovMatrix(double[][] m) {

		double sum = 0;
		
		/** Created a for loop in order to check the sum of all numbers of all columns - matching 1 */
		for (int row = 0; row < m.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < m[row].length; columns++) {
				sum += m[columns][row];
			}//closing the nested for loop
			if(sum != 1) {
				return false;
			}else {
				sum = 0;
			}
		}//closing the main for loop

		return true;
	}//closing the is Markov Matrix method

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

}//closing the class_8_25

