package chapter_8;
/** 
 * 
 * 		(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 * 		matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 * 		every column have an even number of 1s.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_8_01 */
public class Exercise_8_22{

	/** Creating the main method */
	public static void main(String[] arg) {

		
		/** Following the initial instructions, created a 6-by-6 two-dimensional matrix */
		int [][] matrix = new int [6][6] ;
		
		/** Print out the empty matrix and a message explaining that is an empty matrix */
		System.out.print("\n\n\tPrinting out an empty matrix");
		printMatrix(matrix);
		
		//calling a method to filled the matrix with 0s and 1s
		myArrayFilled(matrix);

		/** Print out the empty matrix and a message explaining that is an empty matrix */
		System.out.print("\n\n\tPrinting out the matrix filled");
		printMatrix(matrix);
		
		/** Verifying if the matrix has all the columns and rows with a even number of 1s */
		System.out.print("\n\n\t" + ((evenNumbers(matrix))?"All the rows and columns HAVE an even number of 1s":"All the rows and columns have NOT an even number of 1s"));
		
		
	}//closing the main method

	/** Created a method to print the values positions of the Matrix array*/
	public static void printMatrix(int [][] matrix) {

		//printing the first part of the matrix
		System.out.print("\n\n\t");
		for(int t = 0; t < matrix.length ; t++) {
			System.out.print("   " + t);
		}
		System.out.print("\n\t  ");
		for(int x = 0; x < matrix.length ; x++) {
			System.out.print("————");
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
				System.out.print("————");
			}
		}//closing the main for loop 
	}//closing method print matrix

	/**  Created a method in order to fill all the positions of the array created using numbers from 0 to 9 randomly */
	public static void myArrayFilled(int [][] matrix) {
		// Created a main for loop in order to run all the rows
		for (int row = 0; row < matrix.length; row++) {
			//created a nested for loop in order to run all the columns
			for (int column = 0; column < matrix[row].length; column++) {
				//fill randomly from 0 to 9 all the positions 
				matrix[row][column] = (int) (Math.random()*2);
			}//closing nested for loop
		}//closing the main for loop
		System.out.print("\n\t");

	}//closing myArrayFilled method
	/** Created a method in order to test a matrix, if n number has repeated minimum of 4 times followed in a row, column or diagonals */
	public static boolean evenNumbers(int[][] values) {

		//created the necessary variables
		int countRow1 = 1, countColumn1 = 1;



		/** Created a main for loop in order to verify all the rows */
		for (int c = 0; c < values.length; c++) {
			//initiating variables every loop 
			countRow1 = 0;
			countColumn1 = 0;
			/** Created a nested for loop in order to check the rows or columns */
			for(int d = 0; d < values[c].length; d++) {
				//summarizing quantity of 1s in each row
				if(values[c][d] == 1) {
					countRow1++;
				}//closing if statement
				

				//summarizing quantity of 1s in each column
				if(values[d][c] == 1) {
					countColumn1++;
				}//closing if statement
				
				

			}//closing nested for loop
			//created an if statement in order to test if has any row or column with odd number
			if((countRow1 % 2) != 0 || (countColumn1 % 2) != 0) {
				return false;
			}//closing if statement

		}//closing main for loop

		return true;
	}//closing test matrix method called evenNumbers 1s


}//closing the class_8_01

