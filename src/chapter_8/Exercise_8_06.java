package chapter_8;
/** 
 * 
 * 		(Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * 		header of the method is:
 * 
 * 		public static double[][] multiplyMatrix(double[][] a, double[][] b)
 * 
 * 		To multiply matrix a by matrix b, the number of columns in a must be the same as
 * 		the number of rows in b, and the two matrices must have elements of the same or
 * 		compatible types. Let c be the result of the multiplication. Assume the column size
 * 		of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * 		
 * 		For example, for two 3 * 3 matrices a and b, c is
 * 		
 * 		a11 a12 a13  	b11 b12 b13		c11 c12 c13
 * 		a21 a22 a23  +	b21 b22 b23	 =	c21 c22 c23
 * 		a31 a32 a33  	b31 b32 b33		c31 c32 c33
 * 
 * 		where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * 		Write a test program that prompts the user to enter two 3 * 3 matrices and displays
 * 		their product. Here is a sample run:
 * 
 * 		Enter matrix1: 1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0
 * 		Enter matrix2: 0   2   4   1   4.5 2.2 1.1 4.3 5.2
 * 		The multiplication of the matrices is
 * 		1 2 3 	0 2.0 4.0 		5.3 23.9 24
 * 		4 5 6 * 1 4.5 2.2 	= 	11.6 56.3 58.2
 * 		7 8 9 	1.1 4.3 5.2 	17.9 88.7 92.4
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_8_06 */
public class Exercise_8_06{

	/** Creating the main method */
	public static void main(String[] arg) {


		//create the necessary objects
		Scanner input = new Scanner (System.in);


		//created the necessary matrices
		double [][] matrix1 = new double [3][3];
		double [][] matrix2 = new double [3][3];
		double [][] matrix3 = new double [3][3];

		//print out the message in order to be the user guide
		System.out.print("\n\n\tEnter matrix1: ");


		//created a for loop in order to absorb the input
		for(int a = 0; a < matrix1.length; a++) {
			//created a nested for loop in order to input items in each row
			for(int b = 0; b < matrix1[a].length; b++) {

				//giving the values of the user input
				matrix1[a][b] = input.nextDouble();
			}//closing nested for loop

		}//closing main for loop

		System.out.print("\n\n\tEnter matrix2: ");
		//created a for loop in order to absorb the input
		for(int a = 0; a < matrix1.length; a++) {
			//created a nested for loop in order to input items in each row
			for(int b = 0; b < matrix1[a].length; b++) {

				//giving the values of the user input
				matrix2[a][b] = input.nextDouble();
			}//closing nested for loop

		}//closing main for loop


		matrix3 = multiplyMatrix(matrix1, matrix2);

		printMultiArray(matrix3);

		input.close();
	}//closing the main method

	/** Created a method to print all the positions of the multidimensional array */
	public static void printMultiArray(double [][] myDArray) {

		//created a object
		DecimalFormat df = new DecimalFormat("####.##");
		
		System.out.print("\n\t");
		//created the main for loop in order to sum both matrices
		for(int e = 0; e < myDArray.length; e++) {

			//created a nested for loop in order to sum every position
			for(int f = 0; f < myDArray[e].length; f++) {
				System.out.print(df.format(myDArray[e][f]) + "\t");
			}//closing nested for loop
			System.out.print("\n\t");
		}//closing main for loop

	}//closing the print out multi array method

	/** Created a method in order to summing two matrices, following the initial instructions */
	public static double[][] multiplyMatrix(double[][] a, double[][] b){

		//created a variable matrix myDArray
		double [][] myDArray = new double[a.length][a.length];

		//created the main for loop in order to sum both matrices
		for(int c = 0; c < a.length; c++) {

			//created a nested for loop in order to sum every position
			for(int d = 0; d < a[c].length; d++) {
				
				//created a sencond nested for loop in order to run all the positions of the positions
				for(int e = 0; e < a.length; e++) {
					myDArray[c][d] += (a[c][e] * b[e][d]);
					
				}
				
//				cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
			}//closing nested for loop
		}//closing main for loop
		return myDArray;
	}//closing the method

	


}//closing the class_8_06

