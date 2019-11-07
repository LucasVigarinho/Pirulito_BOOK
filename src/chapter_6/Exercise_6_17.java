package chapter_6;


/** 
 * 
 * 		(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
 * 		the following header:
 * 
 * 		public static void printMatrix(int n)
 * 
 * 		Each element is 0 or 1, which is generated randomly. Write a test program that
 * 
 * 		prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
 * 
 * 
 * 		Enter n: 3
 * 		0 1 0
 * 		0 0 0
 * 		1 1 1
 * 
 * @author lucasmaximo
 *
 */
/** importing the necessary library */
import java.util.Scanner;
import java.util.Random;

/** create the class exercise_6_17 */
public class Exercise_6_17 {

	/** Created the main method */
	public static void main(String[] args) {
		/** Created the object Scanner */
		Scanner input = new Scanner (System.in);
		/** Print out the necessary message to be the guide of the user interaction  */
		System.out.print("\n\n\tInsert the size of the matrix -> ");
		/** Create the variable to absorb the user insertion */
		int n = input.nextInt();
		/** Call the printMatrix method */
		printMatrix(n);
	}//closing the main method 

	/** Created the printMatrix method following the instructions */
	public static void printMatrix(int n) {
		/** Created the necessary object, in order to generate randomly 0 and 1 */
		Random r = new Random();
		//Print out the space to start the new dimensional array which is going to be printed
		System.out.print("\n\n\t\t\t");
		/** Created a multidimensional array utilizing the n, inserted by the user */
		int [][] j = new int [n][n];
		/** Create the main for loop in order to print the matrix lines */
		for (int i = 0; i < n; i++) {
			//jumping the lines
			System.out.print("\n\t\t\t\t");
			/** Create the nested for loop in order to print the matrix columns */
			for(int t = 0; t < n; t++) {
				j [i][t] = r.nextInt(2);
				System.out.print(j[i][t] + " ");
			}//closing nested for loop 
		}//close main for loop 
	}

}//closing the class exercise_6_17
