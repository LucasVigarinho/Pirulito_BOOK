package chapter_08;
/** 
 * 
 * 		(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * 		have the same contents. Write a method that returns true if m1 and m2 are identical,
 * 		using the following header:
 * 
 * 		public static boolean equals(int[][] m1, int[][] m2)
 * 
 * 		Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * 		and displays whether the two are identical. Here are the sample runs.
 * 		
 * 		Enter list1: 51 25 22 6 1 4 24 54 6
 * 		Enter list2: 51 22 25 6 1 4 24 54 6
 * 		The two arrays are identical
 * 		
 * 		Enter list1: 51 5 22 6 1 4 24 54 6
 * 		Enter list2: 51 22 25 6 1 4 24 54 6
 * 		The two arrays are not identical
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_29 */
public class Exercise_8_29{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
				Scanner input1 = new Scanner (System.in);

				//printing out the first line of the game
				System.out.print("\n\n\t**************** Identical - MATRICES ****************");

				/** print out the user guide message in order to give the instructions to the user to insert the matrix size */
				System.out.print("\n\n\tPlease, insert here the size of the Matrices -> ");
				/** Created an matrix according to the size of the matrix defined by the user */
				int size = input1.nextInt();
				int [][] matrix1 = new int [size][size];
				int [][] matrix2 = new int [size][size];
				/** print out the user guide message in order to give the instructions to the user to insert the numbers  */
				System.out.print("\n\tPlease, enter the list1 -> ");
				matrix1 = fillMatrix(input1, size);

				/** print out the user guide message in order to give the instructions to the user to insert the numbers  */
				System.out.print("\n\tPlease, enter the list2 -> ");
				matrix2 = fillMatrix(input1, size);
				
				System.out.print("\n\tPrinting  matrix 1 ");
				/** Printed the matrix to visualize */
				printMatrix(matrix1);
				System.out.print("\n\n\tPrinting  matrix 2 ");
				/** Printed the matrix to visualize */
				printMatrix(matrix2);

				

			
				/** Printed the answer */
				System.out.print("\n\n\t" + ((equals(matrix1, matrix2))?"The two arrays ARE identical":"The two arrays ARE NOT identical"));

				input1.close();
			}//closing the main method

			/** Created a method in order to fill all positions of the matrix */
			public static int [][] fillMatrix(Scanner input, int size){
			
				int [][] m = new int [size][size];
				/** created a for loop in order to absorb the user insertions to the matrix */
				for (int row = 0; row < size; row++) {
					//created the nested for loop in order to run all the columns
					for(int columns = 0; columns < size; columns++) {
						m[row][columns] = input.nextInt();
					}//closing the nested for loop
				}//closing the main for loop
				
				
				return m;
			}//closing method fill Matrix
			/** Created a method following the initial instructions of a sorting column matrix exercise */
			public static boolean equals(int[][] m1, int[][] m2){

			
				/** Created a for loop in order to check the sum of all numbers of all columns - matching 1 */
				for (int row = 0; row < m1.length; row++) {
					//created the nested for loop in order to run all the columns
					for(int columns = 0; columns < m1[row].length; columns++) {
						
							//created a if statement to compare matrices
							if( m1[row][columns] == m2[row][columns]) {
								
							}else{
								return false;
							}//closing if statement
					}//closing the nested for loop
				}//closing the main for loop

				return true;
			}//closing the is sorting row Matrix method

			/** Created a method to print the values positions of the Matrix array*/
			public static void printMatrix(int [][] matrix) {

				//printing the first part of the matrix
				System.out.print("\n\n\t");
				for(int t = 0; t < matrix.length ; t++) {
					System.out.print("    " + t);
				}
				System.out.print("\n\t  ");
				for(int x = 0; x < matrix.length ; x++) {
					System.out.print("————-");
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
						System.out.print("————-");
					}
				}//closing the main for loop 
			}//closing method print matrix

		}//closing the class_8_29
