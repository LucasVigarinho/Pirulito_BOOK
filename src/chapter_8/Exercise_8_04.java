package chapter_8;
/** 
 * 
 * 		(Compute the weekly hours for each employee) Suppose the weekly hours for all
 * 		employees are stored in a two-dimensional array. Each row records an employee’s
 * 		seven-day work hours with seven columns. For example, the following
 * 		array stores the work hours for eight employees. Write a program that displays
 * 		employees and their total hours in decreasing order of the total hours.
 * 		
 * 				   Su M T W Th F Sa
 * 		Employee 0  2 4 3 4  5 8 8
 * 		Employee 1  7 3 4 3  3 4 4
 * 		Employee 2  3 3 4 3  3 2 2
 * 		Employee 3  9 3 4 7  3 4 1
 * 		Employee 4  3 5 4 3  6 3 8
 * 		Employee 5  3 4 4 6  3 4 4
 * 		Employee 6  3 7 4 8  3 8 4
 * 		Employee 7  6 3 5 9  2 7 9
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_04 */
public class Exercise_8_04{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Students' answers to the questions
		int[][] employee = {
				{0, 2, 4, 3, 4, 5, 8, 8},
				{1, 7, 3, 4, 3, 3, 4, 4},
				{2, 3, 3, 4, 3, 3, 2, 2},
				{3, 9, 3, 4, 7, 3, 4, 1},
				{4, 3, 5, 4, 3, 6, 3, 8},
				{5, 3, 4, 4, 6, 3, 4, 4},
				{6, 3, 7, 4, 8, 3, 8, 4},
				{7, 6, 3, 5, 9, 2, 7, 9}};

		//calling the method to summing all elements
		int [][] employeeWeekHours = summarizeMatriz(employee);

		//printed description of the printed values
		System.out.println("\n\n\tPrinting before organized \n");

		//calling method in order to print before organization with all hours summarized
		printMultArray(employeeWeekHours);

		//printed description of the printed values
		System.out.println("\n\n\tPrinting after organized (decreasing)\n");

		//calling method in order to print after organization week summarized
		printMultArray(organizeArray(organizeArray(organizeArray(organizeArray(employeeWeekHours)))));


	}//closing the main method

	/** Created a method in order to summarize the week hour */
	public static int [][] summarizeMatriz(int [][] matrix){
		//Created the necessary variable in order to give back a matrix to put organize and print
		int [][] totalWeekHour = new int [2][8];

		//created a for loop in order to receive the matrix and sum all the numbers, referring to each employee.
		for (int i = 0; i < matrix.length; i++) {
			//created the internal variabl to sum all the numbers for each row
			int weekHour = 0;
			//created a nested loop to count the number in each position of this specific row
			for (int j = 1; j < matrix[i].length; j++) {
				//summing every number apart from the first position '0' what is the number of the employee
				weekHour += matrix[i][j];
			}//closing the nested for loop
			totalWeekHour[0][i] = i+1;
			totalWeekHour[1][i] = weekHour;
		}//closing the main for loop
		return totalWeekHour;
	}//closing summarize Matriz

	/** Created a method to organize the array numbers - bubble sort and create new array with the right size and organized in a decrizing order */
	public static int [][] organizeArray(int[][] myArray) {

		int [][] a = myArray;


		//Create the algorithm 
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i <= myArray[j].length-j-2; i++) {

				if(a[1][i] < a[1][i+1]) {
					int temp1 = a[1][i];
					a[1][i] = a[1][i+1];
					a[1][i+1] = temp1;
					int temp0 = a[0][i];
					a[0][i] = a[0][i+1];
					a[0][i+1] = temp0;

				}//close if

			}//close for 

		}//close for

		return a ;
	}//closing organize array Method


	/** Created a method in order to print a multidimensional array */
	public static void printMultArray(int [][] myArray) {
		
		//created a for loop in order to print out the 
		for(int a = 0; a < 8; a++) {
			System.out.println("\tEmployee -> " + myArray[0][a] + "   Total week hour -> _____" + myArray[1][a]);
		}

	}//closing multidimensional array print method





}//closing the class_8_04

