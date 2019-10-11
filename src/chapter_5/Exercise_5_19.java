package chapter_5;

import java.util.Scanner;

/**    ************* Description of the Exercise_5_19 *************
 * 
 * 		
 * 		(Display numbers in a pyramid pattern) Write a nested for loop that prints the
 * 		following output:
 * 									   1
 * 									 1 2 1
 * 								   1 2 4 2 1
 * 								 1 2 4 8 4 2 1
 * 		     	 		      1 2 4 8 16 8 4 2 1
 * 						   1 2 4 8 16 32 16 8 4 2 1
 * 					   	1 2 4 8 16 32 64 32 16 8 4 2 1
 * 					1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_19 */
public class Exercise_5_19 {

	/** Creating the main method */
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		// Get user input = number of lines to print in a pyramid
		System.out.println("Enter a number between 1 and 15: ");
		int numLines = s.nextInt();
		//boolean statement with do loop and if statement to make sure that the limit between 1 and 15 is being followed by the user
		boolean valid = false;
		//create a do loop to keep the user inputing information in case that it had insert a different number out of the range
		do {
			if (numLines < 1 || numLines > 15) {
				System.out.println("Number incorrect, enter again a number between 1 and 15: ");
				numLines = s.nextInt();
				valid = false;
			} else {
				valid = true;
				printPyramid(numLines);
				//closing Scanner
				s.close();
			}
		} while (!valid);
	}

	// creating the private class to make the pyramid
	private static void printPyramid(int numLines) {
		int row = 1;
		int col = 1;
		int counter = 1;
		// creating the loop rows 
		while (row <= numLines) {
			// loop tabulation before print digits
			while (col <= (numLines - row)) {
				System.out.print(" \t");
				col++;
			}
			if (row == 1) {
				System.out.print(row + "\t");
			} else {
				// loop first half pyramid
				int digit = 1;
				while (counter <= row) {
					digit = digit * 2;
					if (counter == 1) {
						System.out.print(counter + "\t");
					} else {
						System.out.print(digit / 2 + "\t");
					}
					counter++;
				}
				// print second half pyramid
				counter--;
				digit = digit / 2;
				while (counter > 1) {
					counter--;
					digit = digit / 2;
					System.out.print(digit + "\t");
				}
			}
			row++;
			col = 1;
			counter = 1;
			// jump one line
			System.out.println();

		}
	}



}//closing the class_5_19
