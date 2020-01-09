package chapter_08;
/** 
 * 
 * 		(Latin square) A Latin square is an n-by-n array filled with n different Latin letters,
 * 		each occurring exactly once in each row and once in each column. Write a
 * 		program that prompts the user to enter the number n and the array of characters,
 * 		as shown in the sample output, and checks if the input array is a Latin square.
 * 		The characters are the first n characters starting from A.
 * 
 * 		Enter number n: 4
 * 		Enter 4 rows of letters separated by spaces:
 * 		A B C D
 * 		B A D C
 * 		C D B A
 * 		D C A B
 * 		The input array is a Latin square
 * 
 * 		Enter number n: 3
 * 		Enter 3 rows of letters separated by spaces:
 * 		A F D
 * 		Wrong input: the letters must be from A to C
 * 			
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_36 */
public class Exercise_8_36{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		/** Print out the guide message to the user interact with the system and insert the aray size */
		System.out.print("\n\n\tEnter number n: ");
		
		/** created the variable size in order to absorb the user insertion */
		int size = input.nextInt();
		char [] answer = new char [size];
		int matrix [][] = new int [size][size];
		/** Print out the guide message to the user interact with the system and define if he wants to try or let the system show off */
		System.out.print("\n\n\tPlease, Enter " + size + " rows of letters separated by spaces:-> ");
		
		/** created a for loop in order to absorb the user insertion */
		for(int a = 0; a < answer.length; a++) {
			answer [a] = input.next().charAt(0);
		}//closing for loop 
		
		if(checkInsertion(answer)) {
			myArrayFilled(matrix);
			printMatrix(matrix);
			System.out.print("\n\tThe input array is a Latin square");
		}else {
			System.out.print("\n\tWrong input: the letters must be from A" + " to " +  (char) (64 + matrix.length));
	
		}
		


		/** Created an if statement in order to give the right answer based on the boolean method created to verify if the 
		 * matrix created if or not Latin Square */

		input.close();
	}//closing the main method

	/** Created a method to return if the insertions are or not correct */
	public static boolean checkInsertion(char [] answer) {
		char index = 65;
		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < answer.length; row++) {
			 
			if(answer[row] == index) {
				
			}else {
				return false;
			}
			index++;
		}
		return true;
	}
	/** Created a method in order to fill all positions of the matrix */
	public static double [][] fillMatrix(Scanner input, double [][] matrix){
	
		double [][] m = matrix.clone();
		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < m.length; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < m[row].length; columns++) {
				m[row][columns] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop
		
		
		return m;
	}//closing method fill Matrix
	
	
	
	/**  Created a method in order to fill all the positions of the array created using numbers from 0 to 9 randomly */
	public static void myArrayFilled(int [][] matrix) {
		int index = 63;
		
		// Created a main for loop in order to run all the rows
		for (int row = 0; row < matrix.length; row++) {
			 index += 1;
			 int temp = index;
			//created a nested for loop in order to run all the columns
			for (int column = 0; column < matrix[row].length; column++) {
				
				temp += 1;
				//fill randomly from 0 to 9 all the positions 
				matrix[row][column] = (int) temp;
			}//closing nested for loop
		}//closing the main for loop
		System.out.print("\n\t");

	}//closing myArrayFilled method

	/** Created a method to print the values positions of the Matrix array*/
	public static void printMatrix(int [][] matrix) {

		//printing the first part of the matrix
		System.out.print("\n\t");
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

				System.out.print((char) matrix[a][b] + " | ");

			}//closing the nested for loop 

			//printing the first part of the matrix array
			System.out.print("\n\t  ");
			for(int q = 0; q < matrix.length ; q++) {
				System.out.print("————");
			}
		}//closing the main for loop 
	}//closing method print matrix
	

}//closing the class_8_36

