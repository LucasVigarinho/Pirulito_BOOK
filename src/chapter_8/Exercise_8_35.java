package chapter_8;
/** 
 * 
 * 		(Largest block) Given a square matrix with the elements 0 or 1, write a program
 * 		to find a maximum square submatrix whose elements are all 1s. Your program
 * 		should prompt the user to enter the number of rows in the matrix. The program
 * 		then displays the location of the first element in the maximum square submatrix
 * 		and the number of the rows in the submatrix. Here is a sample run:
 * 		
 * 		Enter the number of rows in the matrix: 5
 * 		Enter the matrix row by row:
 * 		1 0 1 0 1
 * 		1 1 1 0 1
 * 		1 0 1 1 1
 * 		1 0 1 1 1
 * 		1 0 1 1 1
 * 		The maximum square submatrix is at (2, 2) with size 3
 * 
 * 		Your program should implement and use the following method to find the maximum
 * 		square submatrix:
 * 
 * 		public static int[] findLargestBlock(int[][] m)
 * 
 * 		The return value is an array that consists of three values. The first two values are
 * 		the row and column indices for the first element in the submatrix, and the third
 * 		value is the number of the rows in the submatrix.
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_35 */
public class Exercise_8_35{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects Scanner 
		Scanner input = new Scanner (System.in);

		/** Print out the message to the user know steps */
//		System.out.print("\n\n\tPlease input the size of the two dimensional array -> ");
		
		/** Created a variable in order to absorb the user insertion - variable size which is going to define the size of the two dimensional array */
//		int size = input.nextInt();
		
		/** Created the variable multidimensional array using the variable size created before */
//		int[][] matrix = new int [size][size];
		
		int [][] matrix = {{1, 0, 1, 0, 1},
		  				   {1, 1, 1, 0, 1},
		  				   {1, 0, 1, 1, 1},
		  				   {1, 0, 1, 1, 1},
		  				   {1, 0, 1, 1, 1}};
		int [] points = new int [3];

		/** calling the method in order to fill the matrix created in order to allow the user created random array */
//		myArrayFilled(matrix);  
		
		
		

		/** Print out the matrix now filled */
		printMatrix(matrix);

		/** Print out the message */
		points = findLargestBlock(matrix);
		
		/** Created an if statement in order to print out the answer for no square sub-matrix and for square sub-matrix founded */
		if(points[2] == 0) {
			System.out.print("\n\n\tThe maximum square submatrix is at ( " + points[0] + ", " + points[1] + " ) with size "  + points[2]);
			System.out.print("\n\tIT MEANS HAS NO SUBMATRIX");
		}else {

			System.out.print("\n\n\tThe maximum square submatrix is at ( " + points[0] + ", " + points[1] + " ) with size "  + points[2]);
		}//closing if statement

		input.close();
	}//closing the main method


	/** Created a method in order to test a matrix, if n number has repeated minimum of 4 times followed in a row, column or diagonals */
	public static int[] findLargestBlock(int[][] m) {

		//created the necessary variables
		int [] pts = new int [3];//variable pts array in order to absorb the final answer and return to the main method
		int [] start = new int [2];//variable start array in order to absorb the start point
		int count = 0, end = 0, size = 0; //count in order to sum positions and define the size 


		/** Created a main for loop in order to verify all the rows and columns */
		for (int row = 0; row < m.length; row++) {
			/** Created a nested for loop in order to verify all the rows and columns */
			for(int column = 0; column < m[row].length; column++) {
				//created an if statement to define the start point position that has a number 1 
				//in the first part of the statement verify  if has 1 in the position and if the count variable still 0
				//in order to define the start variable positions absorbing the row and column of the possible sub-matrix
				if(m[row][column] == 1 && count == 0 ) {
					start[0] = row;
					start[1] = column;
					count++;
					size = count;
				//the second part or comparison of this if statement is in case of the count variable started already sum positions 
				//with numbers 1 following, but only if row position and column position having followed number 1
				}else if(m[row][column] == 1 && m[column][row] == 1 && count > 0) {
					count++;
					size = count;
					end = column;

					//creating the temporary array variable to absorb the result of the method created to test the sub-matrix of the loop
					//and compare with the variable array pts and verify if this array is bigger or lower
					int [] tempPoint = testingBlock(m, start, end, size);

					//created an if statement in order to check if the sub-matrix of this loop is or not bigger them the last analyzed
					if(tempPoint[2] > pts[2]){
						pts = tempPoint ;//if this loop sub-matrix analyzed is bigger, the pts array variable receives its details
					}else {

					}//closing if statement
					
				//the third and last part of the if statement, was created with the intention of reset the variables start, count and size
				//in order to make possible analyze another possible sub-matrix
				}else if (m[row][column] == 0 || m[column][row] == 0 && count > 0){
					start[0] = 0;
					start[1] = 0;
					count = 0;
					size = 0;
				}//closing if statement



			}//closing nested for loop

		}//closing main for loop

		return pts;
	}//closing test matrix method called isConsecutive four

	/** Created a method in order to check the block of the loop turn */
	public static int [] testingBlock(int [][] matrix, int [] start, int end, int size) {

		//created the necessary variables
		int [] point = new int [3];//variable point array in order to absorb the final answer and return to the method find large block method
		int [][] testArray = new int [size][size];//created the testArray array variable to be created a new block as the sub-matrix of the main matrix in order to analyze it
		int count = 0;

		/** Created a main for loop in order to fill all the positions of the new testArray with information from the main matrix sent */
		for (int row = start[0], a = 0 ; row <=  end && a < testArray.length; row++, a++) {
			/** Created a nested loop in order to run all the positions of the two multidimensional arrays */
			for(int column = start[1], b = 0; column <= end && b < testArray[a].length; column++, b++) {

				//filling the testArray positions
				testArray[a][b] = matrix[row][column];

			}//closing nested for loop

		}//closing main for loop


		/** Created a main for loop in order to verify all the row */
		for (int c = 0 ; c < testArray.length;  c++) {
			/** Created a nested for loop in order to verify all the columns */
			for(int d = 0;  d < testArray[c].length;  d++) {

				//created an if statement in order to count only if in this position has an one number
				if(testArray[c][d] == 1) {
					count++;
				}//closing if statement

			}//closing nested for loop

		}//closing main for loop
		
		/** Created an if statement in order to verify if the count sum has the same value
		 * of the size multiply by size */
		if(count == (size * size)) {
			//fill the point array variable with the sub-matrix information only if the sub-matrix was full filled with 1's
			point[0] = start[0];
			point[1] = start[1];
			point[2] = (size);
		}else {
			point[0] = 0;
			point[1] = 0;
			point[2] = 0;
		}//closing if statement

		return point;
	}//closing testingBlock
	

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

}//closing the class_8_35

