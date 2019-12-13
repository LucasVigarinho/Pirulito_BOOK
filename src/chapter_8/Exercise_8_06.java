package chapter_8;
/** 
 * 
 * 		(Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * 		header of the method is:
 * 
 * 		public static double[][]
 * 		multiplyMatrix(double[][] a, double[][] b)
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
 * 		Enter matrix1: 1 2 3 4 5 6 7 8 9
 * 		Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
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

/** Creating the class named Exercise_8_06 */
public class Exercise_8_06{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		input.close();
	}//closing the main method

	


}//closing the class_8_06

