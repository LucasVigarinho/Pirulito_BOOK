package chapter_8;
/** 
 * 
 * 		(Explore matrix) Write a program that prompts the user to enter the length of a
 * 		square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 * 		finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
 * 		the program:
 * 		
 * 		Enter the size for the matrix: 4
 * 		0111
 * 		0000
 * 		0100
 * 		1111
 * 		All 0s on row 1
 * 		All 1s on row 3
 * 		No same numbers on a column
 * 		No same numbers on the major diagonal
 * 		No same numbers on the sub-diagonal
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_14{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		//print out the guide message to the user insert the size of the multidimensional array
		System.out.print("\n\n\tEnter the size for the matrix: ");
		//Created the variable in order to absorb the user insertion
		int size = input.nextInt();
		//created the multidimensional array and use the variable created with the user insertion to define its size
		int [][] matrix = new int [size][size];
		//created the main for loop in order to run all the rows of the array created
		for(int a = 0; a < matrix.length; a++) {
			//created the nested for loop in order to run all the columns of the array created
			for(int b = 0; b < matrix[a].length; b++) {
				//fill all the positions of the array randomly with 1 and 0
				matrix[a][b] = (int) (Math.random()*2);
			}//closing the nested for loop
		}//closing the main for loop

		printArray(matrix);

		int row0 = verifyNumber(matrix, 0, 0);
//		System.out.print("\n\t" + row0);  //printing result to test the answers
		int row1 = verifyNumber(matrix, 1, 0);
//		System.out.print("\n\t" + row1);  //printing result to test the answers
		int column0 = verifyNumber(matrix, 0, 1);
//		System.out.print("\n\t" + column0);  //printing result to test the answers
		int column1 = verifyNumber(matrix, 1, 1);
//		System.out.print("\n\t" + column1);  //printing result to test the answers
		int diagonal0 = verifyNumber(matrix, 0, 2);
//		System.out.print("\n\t" + diagonal0);  //printing result to test the answers
		int diagonal1 = verifyNumber(matrix, 1, 2);
//		System.out.print("\n\t" + diagonal1);  //printing result to test the answers
		int subDiagonal0 = verifyNumber(matrix, 0, 3);
//		System.out.print("\n\t" + subDiagonal0);  //printing result to test the answers
		int subDiagonal1 = verifyNumber(matrix, 1, 3);
//		System.out.print("\n\t" + subDiagonal1);  //printing result to test the answers
		
		
		//printing the final result/answers
		System.out.print("\n\n\t" + (((row0 < 0)?"No row with all positions with 0":"All 0s on row " + row0)));
		System.out.print("\n\n\t" + (((row1 < 0)?"No row with all positions with 0":"All 1s on row " + row1)));
		System.out.print("\n\n\t" + (((column0 < 0)?"No column with all positions with 0":"All 0s on column " + column0)));
		System.out.print("\n\n\t" + (((column1 < 0)?"No column with all positions with 0":"All 1s on column " + column1)));
		System.out.print("\n\n\t" + (((diagonal0 < matrix.length )?"No same numbers on the major diagonal 0":"All 0s on major diagonal ")));
		System.out.print("\n\n\t" + (((diagonal1 < matrix.length )?"No same numbers on the sub-diagonal 1":"All 1s on diagonal ")));
		System.out.print("\n\n\t" + (((subDiagonal0 < matrix.length )?"No same numbers on the major diagonal 0":"All 0s on sub-diagonal ")));
		System.out.print("\n\n\t" + (((subDiagonal1 < matrix.length )?"No same numbers on the sub-diagonal 1":"All 1s on sub-diagonal ")));

		input.close();
	}//closing the main method

	public static int verifyNumber(int [][] myArray, int number, int each) {

		int count = 0;

		//created an if statement in order to change the for loop to be used 
		if(each < 2) {
			//created the main for loop in order to run all the rows of the array created
			for(int c = 0; c < myArray.length; c++) {
				//created the nested for loop in order to run all the columns of the array created
				for(int d = 0; d < myArray[c].length; d++) {
					//Created a if statement in order to check if columns or rows
					if(each == 0) {
						count += myArray[c][d];
					}else {
						count += myArray[d][c];
					}
				}//closing the nested for loop

				//created an if statement in order to return result if the number was founded 
				if(count == myArray.length && number == 1) {
					return c;
				}else if (count == 0 && number == 0){
					return c;
				}else {
					count = 0;
				}
			}//closing the main for loop
			
		}else if (each == 2) {
			
			//created the nested for loop in order to run all the columns of the array created
			for(int e = 0; e < myArray.length; e++) {
				//Created a if statement in order to check if columns or rows

				count += myArray[e][e];
			}//closing the nested for loop
			//created an if statement in order to return result if the number was founded 
			if(count == myArray.length && number == 1) {
				return myArray.length + 1;
			}else if (count == 0 && number == 0){
				return myArray.length + 1;
			}else {
				count = 0;
			}
			
		}else if (each > 2) {
			
			int inverse = myArray.length-1;
			//created the nested for loop in order to run all the columns of the array created
			for(int f = 0; f < myArray.length; f++) {
				//Created a if statement in order to check if columns or rows

				count += myArray[f][inverse--];
			}//closing the nested for loop
			//created an if statement in order to return result if the number was founded 
			if(count == myArray.length && number == 1) {
				return myArray.length + 2;
			}else if (count == 0 && number == 0){
				return myArray.length + 2;
			}else {
				count = 0;
			}
		}
		
		return -1;
	}
	/** Created a method in order to print a multidimensional array */
	public static void printArray(int [][] matrix) {
		System.out.print("\n\t");
		//created a for loop in order to print out the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				
				System.out.print(matrix[i][k] + " ");
			}
			System.out.print("\n\t");
		}
	}

}//closing the class_8_01

