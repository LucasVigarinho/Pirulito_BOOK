package chapter_8;
/** 
 * 
 * 		(Pattern recognition: four consecutive equal numbers) Write the following
 * 		method that tests whether a two-dimensional array has four consecutive numbers
 * 		of the same value, either horizontally, vertically, or diagonally.
 * 
 * 		public static boolean isConsecutiveFour(int[][] values)
 * 		
 * 		Write a test program that prompts the user to enter the number of rows and columns
 * 		of a two-dimensional array and then the values in the array and displays
 * 		true if the array contains four consecutive numbers with the same value. Otherwise,
 * 		display false. Here are some examples of the true cases:
 * 
 * 		0 1 0 3 1 6 1     0 1 0 3 1 6 1    0 1 0 3 1 6 1    0 1 0 3 1 6 1
 * 		0 1 6 8 6 0 1     0 1 6 8 6 0 1    0 1 6 8 6 0 1    0 1 6 8 6 0 1
 * 		5 6 2 1 8 2 9     5|5|2 1 8 2 9    5 6 2 1|6 2 9   |9|6 2 1 8 2 9
 * 		6 5 6 1 1 9 1     6|5|6 1 1 9 1    6 5 6|6|1 9 1    6|9|6 1 1 9 1
 * 		1 3 6 1 4 0 7     1|5|6 1 4 0 7    1 3|6|1 4 0 7    1 3|9|1 4 0 7
 * 		3-3-3-3 4 0 7     3|5|3 3 4 0 7    3|6|3 3 4 0 7    3 3 3|9|4 0 7
 * 															--------------		
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_19{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects Scanner 
		Scanner input = new Scanner (System.in);

		/** Print out the message to the user know steps */
		System.out.print("\n\n\tPlease input the size of the two dimensional array -> ");
		/** Created a variable in order to absorb the user insertion - variable size which is going to define the size of the two dimensional array */
		int size = input.nextInt();
		/** Created the variable multidimensional array using the variable size created before */
		int [][] matrix = new int [size][size];

		/** calling the method in order to fill the matrix created */
		myArrayFilled(matrix);

		/** Print out the matrix now filled */
		printMatrix(matrix);

		/** print out message if the matrix has a consecutive four numbers */
		System.out.print("\n\n\t" + ((isConsecutiveFour(matrix))?"The matrix has four consecutive numbers":"The matrix has NO four consecutive numbers"));

		input.close();
	}//closing the main method

	/**  Created a method in order to fill all the positions of the array created using numbers from 0 to 9 randomly */
	public static void myArrayFilled(int [][] matrix) {
		// Created a main for loop in order to run all the rows
		for (int row = 0; row < matrix.length; row++) {
			//created a nested for loop in order to run all the columns
			for (int column = 0; column < matrix[row].length; column++) {
				//fill randomly from 0 to 9 all the positions 
				matrix[row][column] = (int) (Math.random()*5);
			}//closing nested for loop
		}//closing the main for loop
		System.out.print("\n\t");

	}//closing myArrayFilled method



	/** Created a method in order to test a matrix, if n number has repeated minimum of 4 times followed in a row, column or diagonals */
	public static boolean isConsecutiveFour(int[][] values) {

		//created the necessary variables
		int countRow1 = 1, countColumn1 = 1, countDiagonal1 = 1, countSubDiagonal = 1;
		int lastNRow = 0, lastNColumn = 0, lastNDiagonal = 0, lastNSubDiagonal = 0;


		/** Created a main for loop in order to verify all the rows */
		for (int c = 0; c < values.length; c++) {
			for(int d = 0; d < values[c].length; d++) {
				//testing the rows repeated numbers
				if(values[c][d] == lastNRow) {
					countRow1++;
				}else {
					lastNRow = values[c][d];
					countRow1 = 1;
				}

				//testing the columns repeated numbers
				if(values[c][d] == lastNColumn) {
					countColumn1++;
				}else {
					lastNColumn = values[c][d];
					countColumn1 = 1;
				}

				//created an if statement in order to test if has any winner
				if(countRow1 == 4 || countColumn1 == 4) {
					return true;
				}else {


				}//closing if statement

			}//closing nested for loop

		}//closing main for loop




		/** Created a for loop in order to test the diagonal values */
		for(int e = 0; e < values.length; e++) {

			//created an if statement in order to test the diagonal properly
			if(values[e][e] == lastNDiagonal) {
				countDiagonal1++;
			}else {
				lastNDiagonal= values[e][e];
				countDiagonal1 = 1;
			}
			//created an if statement in order to test if has any winner
			if(countDiagonal1 == 4) {
				return true;
			}else {


			}//closing if statement


		}//closing the for loop of diagonal test

		/** Created a for loop in order to test the sub diagonal values */
		for(int f = 0; f < values.length; f++) {
			for(int g = values.length-1; g >= 0; g--) {
				//created an if statement in order to test the diagonal properly
				if(values[f][g] == lastNSubDiagonal) {
					countSubDiagonal++;
				}else {
					lastNSubDiagonal = values[f][g];
					countSubDiagonal = 1;
				}
				//created an if statement in order to test if has any winner
				if(countSubDiagonal == 4) {
					return true;
				}else {


				}//closing if statement
			}

		}//closing the for loop of sub diagonal test

		return false;
	}//closing test matrix method called isConsecutive four

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


}//closing the class_8_19

