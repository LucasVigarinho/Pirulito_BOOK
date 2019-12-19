package chapter_8;
/** 
 * 
 * 		
 * 		(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 * 		array using the following header:
 * 
 * 		public static void shuffle(int[][] m)
 * 
 * 		Write a test program that shuffles the following matrix:
 * 		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_18{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		/** Created an array multidimensional following the initial instructions */
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		System.out.print("\n\tPRINTING OUT THE MULTIDIMENSIONAL MATRIX BEFORE SHUFFLE");
		//printed out the matrix before the shuffle
		print(m);
		
		
		//call the method in order to shuffle the multidimensional matrix
		shuffle(m);
		
		System.out.print("\n\tPRINTING OUT THE MULTIDIMENSIONAL MATRIX AFTER SHUFFLE");
		//printed out the matrix after the shuffle
		print(m);
		
		input.close();
	}//closing the main method


	/** Created a method following the initial instructions */
	public static void shuffle(int[][] m) {

		// Created a main for loop in order to run all the rows
		for (int i = 0; i < m.length; i++) {
			//created a nested for loop in order to run all the columns
			for (int j = 0; j < m[i].length; j++) {
				//absorb the value of the position using a temporary variable
				int temp = m[i][j];
				int row = (int) (Math.random()*5); //created a randomly row position in order to shuffle randomly
				int column = (int) (Math.random()*2);//created a randomly column position in order to shuffle randomly
				m[i][j] = m[row][column];//the position that already passed its value to the temporary variable receives now the value from the randomly position
				m[row][column] = temp;//the randomly position receives the value absorbed in the temporary variable
			}//closing nested for loop
			//printing out for a visual motive a jump to the next line the next line to be printed 
			
		}//closing the main for loop
		System.out.print("\n\t");
	}//closing the method shuffle

	/** Created a method in order to print the matrix multidimensional */
	public static void print(int [][]matrix) {
		System.out.print("\n\n\t");
		// Display sorted array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n\t");
		}
	}
}//closing the class_8_18

