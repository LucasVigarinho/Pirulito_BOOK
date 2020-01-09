package chapter_08;
/** 
 * 
 * 		
 * 		(Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 * 		0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 * 		one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 * 		cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 * 		with 0s and 1s and find the first row r and first column c where the even number
 * 		of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 * 		is at (r, c). Here is a sample run:
 * 		
 * 
 * 		Enter a 6-by-6 matrix row by row:
 * 		1 1 1 0 1 1
 * 		1 1 1 1 0 0
 * 		0 1 0 1 1 1
 * 		1 1 1 1 1 1
 * 		0 1 1 1 1 0
 * 		1 0 0 0 0 1
 * 		The flipped cell is at (0, 1)
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_23{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** created the necessary object in order to change or flip the position */
		Scanner input = new Scanner(System.in);

		/** Following the initial instructions, created a 6-by-6 two-dimensional matrix already with the values 1s and 0s */
		int [][] matrix = { {1, 1, 0, 0, 1, 1},
							{1, 1, 1, 1, 0, 0},
							{0, 1, 0, 1, 1, 1},
							{1, 1, 1, 1, 1, 1},
							{0, 1, 1, 1, 1, 0},
							{1, 1, 1, 0, 0, 1}};

		/** Print out the matrix and a message explaining that the actual matrix */
		System.out.print("\n\n\tPrinting out an empty matrix");
		printMatrix(matrix);

		/** Print out the message to let the user flip one position */
		System.out.print("\n\n\tUser - indicate a position to be changed - row and column ");
		int row = input.nextInt();
		int column = input.nextInt();

		//created an if statement in order to change the value of the position choose by the user
		if(matrix[row][column] == 1) {
			matrix[row][column] = 0;
		}else {
			matrix[row][column] = 1;
		}//closed the if statement

		int [] flipedPosition = positionFlipped(matrix);

		printMatrix(matrix);
		/** Call the method in order to find the position changed */


		/** Verifying if the matrix has all the columns and rows with a even number of 1s */
		System.out.print("\n\n\t" +  "( Row: " + flipedPosition[0] + " Column: " + flipedPosition[1] + " )");


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

	/** Created a method in order to test a matrix, if n number has repeated minimum of 4 times followed in a row, column or diagonals */
	public static int [] positionFlipped(int[][] values) {

		//created the necessary variables
		

		int [] list = new int [2];

		/** Created a main for loop in order to verify all the rows */
		for (int c = 0; c < values.length; c++) {
			int countRow1 = 0;
			int countColumn1 = 0;
			/** Created a nested for loop in order to check the rows or columns */
			for(int d = 0; d < values[c].length; d++) {
				//summarizing quantity of 1s in each row
				if(values[c][d] == 1) {
					countRow1+=1;
				}//closing if statement
				//summarizing quantity of 1s in each column
				if(values[d][c] == 1) {
					countColumn1+=1;
				}//closing if statement
			}//closing nested for loop
			
			//created an if statement in order to test if has any row  with odd number
			if((countRow1 % 2) != 0) {
				list[0] = c;
				
			}else {
				countRow1 = 0;
			}//closing if statement
			//created an if statement in order to test if has any column with odd number
			if((countColumn1 % 2) != 0) {
				list[1] = c;
				
			}else{
				countColumn1 = 0;
			}//closing if statement

		}//closing main for loop


		return list;
	}//closing test matrix method called evenNumbers 1s





}//closing the class_8_23

