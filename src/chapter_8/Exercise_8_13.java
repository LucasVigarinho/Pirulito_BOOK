package chapter_8;
/** 
 * 
 * 			(Locate the largest element) Write the following method that returns the location
 * 			of the largest element in a two-dimensional array.
 * 
 * 			public static int[] locateLargest(double[][] a)
 * 
 * 			The return value is a one-dimensional array that contains two elements. These
 * 			two elements indicate the row and column indices of the largest element in the
 * 			two-dimensional array. Write a test program that prompts the user to enter a twodimensional
 * 			array and displays the location of the largest element in the array.
 * 			Here is a sample run:
 * 		
 * 		
 * 			Enter the number of rows and columns of the array: 3 4
 * 			Enter the array:
 * 			23.5 35 2 10
 * 			4.5 3 45 3.5
 * 			35 44 5.5 9.6
 * 			The location of the largest element is at (1, 2)
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_13{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);
		
		//printing out the message in order to guide the user during its interaction
		System.out.print("\n\n\tEnter the number of rows and columns of the array: ");
		//created the variable to absorb the insertion of the user row and column
		double [][] myArray = new double [input.nextInt()][input.nextInt()];
		
		//print out the message in order to let the user know the moment to insert the numbers telling the quantity necessary to be inserted
		System.out.print("\n\tEnter the array ( " + (myArray.length * myArray[0].length )+ " numbers ) :");
				
		//created the necessary variable array with only 2 positions, in order to verify each number is the biggest and the position
		int [] position = new int [2];
		double lastBigger = 0;
		
		//created a for loop in order to absorb all the numbers imputed by the user and fill it in the array positions
		for(int a = 0; a < myArray.length; a++) {
			for (int b = 0; b < myArray[a].length; b++) {
				myArray[a][b] = input.nextDouble();
				if(myArray[a][b] > lastBigger ) {
					lastBigger = myArray[a][b];
					position[0] = a;
					position[1] = b;
				}
			}
		}
		//print out the position of the biggest number in the array
		System.out.print("\n\n\tThe location of the largest element is at (" + position[0] + " ," + position[1] + ")");

		input.close();
	}//closing the main method

	


}//closing the class_8_01

