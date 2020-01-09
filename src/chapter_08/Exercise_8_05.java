package chapter_08;
/** 
 * 
 * 		(Algebra: add two matrices) Write a method to add two matrices. The header of
 * 		the method is as follows:
 * 
 * 		public static double[][] addMatrix(double[][] a, double[][] b)
 * 		
 * 		In order to be added, the two matrices must have the same dimensions and the
 * 		same or compatible types of elements. Let c be the resulting matrix. Each element
 * 		cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is
 * 		
 * 
 * 		
 * 		a11 a12 a13  	b11 b12 b13		a11 + b11 a12 + b12 a13 + b13
 * 		a21 a22 a23  +	b21 b22 b23	 =	a21 + b21 a22 + b22 a23 + b23
 * 		a31 a32 a33  	b31 b32 b33		a31 + b31 a32 + b32 a33 + b33
 * 
 * 		Write a test program that prompts the user to enter two 3 * 3 matrices and
 * 		displays their sum. Here is a sample run:
 * 
 * 		Enter matrix1: 1 2 3 4 5   6   7   8   9
 * 		Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 * 
 * 		The matrices are added as follows
 * 		1.0 2.0 3.0 	0.0 2.0 4.0 	1.0 4.0 7.0
 * 		4.0 5.0 6.0 + 	1.0 4.5 2.2 = 	5.0 9.5 8.2
 * 		7.0 8.0 9.0 	1.1 4.3 5.2 	8.1 12.3 14.2
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_05 */
public class Exercise_8_05{

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


		matrix3 = addMatrix(matrix1, matrix2);

		printMultiArray(matrix3);

		input.close();
	}//closing the main method

	/** Created a method to print all the positions of the multidimensional array */
	public static void printMultiArray(double [][] myDArray) {

		System.out.print("\n\t");
		//created the main for loop in order to sum both matrices
		for(int e = 0; e < myDArray.length; e++) {

			//created a nested for loop in order to sum every position
			for(int f = 0; f < myDArray[e].length; f++) {
				System.out.print(myDArray[e][f] + "\t");
			}//closing nested for loop
			System.out.print("\n\t");
		}//closing main for loop

	}//closing the print out multi array method

	/** Created a method in order to summing two matrices, following the initial instructions */
	public static double[][] addMatrix(double[][] a, double[][] b){

		//created a variable matrix myDArray
		double [][] myDArray = new double[a.length][a.length];

		//created the main for loop in order to sum both matrices
		for(int c = 0; c < a.length; c++) {

			//created a nested for loop in order to sum every position
			for(int d = 0; d < a[c].length; d++) {
				myDArray[c][d] = a[c][d] + b[c][d];
			}//closing nested for loop
		}//closing main for loop
		return myDArray;
	}//closing the method

	//	/** Created a method in order to absorb all the user inputs */
	//	public static double [][] absorbInput(double [][] matrix){
	//
	//		//create the necessary objects
	//		Scanner input = new Scanner (System.in);
	//
	//		//created necessary variable matrix
	//		double [][] newMatrix = matrix;
	//
	//		//created a for loop in order to absorb the input
	//		for(int a = 0; a < matrix.length; a++) {
	//			//created a nested for loop in order to input items in each row
	//			for(int b = 0; b < matrix[a].length; b++) {
	//
	//				//giving the values of the user input
	//				newMatrix[a][b] = input.nextDouble();
	//			}//closing nested for loop
	//
	//		}//closing main for loop
	//
	//		input.close();
	//
	//		return newMatrix;
	//	}//closing the method assistance for input


}//closing the class_8_05

