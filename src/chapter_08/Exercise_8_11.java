package chapter_08;
/** 
 * 
 * 		(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 * 		face up and some face down. You can represent the state of the coins using a
 * 		3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
 * 		
 * 		0 0 0 	1 0 1 	1 1 0 	1 0 1 	1 0 0
 * 		0 1 0 	0 0 1 	1 0 0 	1 1 0 	1 1 1
 * 		0 0 0 	1 0 0 	0 0 1 	1 0 0 	1 1 0
 * 		
 * 
 * 		Each state can also be represented using a binary number. For example, the preceding
 * 		matrices correspond to the numbers
 * 		
 * 		000010000 101001100 110100001 101110100 100111110
 * 		
 * 		There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 * 		. . . , and 511 to represent all states of the matrix. Write a program that prompts
 * 		the user to enter a number between 0 and 511 and displays the corresponding
 * 		matrix with the characters H and T. Here is a sample run:
 * 		
 * 
 * 		Enter a number between 0 and 511: 7
 * 		H H H
 * 		H H H
 * 		T T T
 * 		
 * 		The user entered 7, which corresponds to 000000111. Since 0 stands for H and
 * 		1 for T, the output is correct.
 * 
 * 	
 * @author lucasmaximo
 * 
 * solved by LuizGsa21 - from git hub
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_11{

	/** Creating the main method */
	public static void main(String[] arg) {
			
		//created an object in order to make possible the user insert the number
		Scanner input = new Scanner(System.in);

		//created a variable array of 3 by 3
		int[][] m = new int[3][3];

		//print out the number guide to the user interaction possibility
		System.out.print("\n\tEnter a number between 0 and 511: ");

		//created a variable in order to absorb the user insertion
		int n = input.nextInt();

		//created the variable string to give the decimal to binary modified using the method created
		String binary = decimalToBinaryModified(n);




		// put 1's and 0's using binary string
		int bIndex = 0; // binary string index
		//created a for loop in order to fill all the positions using the right 0 or 1, according with the binary result of the number in the position
		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < m[i].length; k++) {
				int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
				m[i][k] = coinSide;
			}
		}
		System.out.print("\n\n\t");
		//created a for loop in order to print out the matrix
		for (int i = 0; i < m.length; i++) {
			for (int k = 0; k < m[i].length; k++) {
				char ch = (m[i][k] == 0) ? 'H' : 'T';
				System.out.print(ch + " ");
			}
			System.out.print("\n\t");
		}
		input.close();
	}//closing the main method


	/** Created the method in order to modify decimal to binary */
	public static String decimalToBinaryModified(int n) {

		//created a string builder variable in order to append 
		StringBuilder s = new StringBuilder();

		//created a while loop in order to manipulate the binary number 
		while (n != 0) {
			//appending to the string builder n and 1 in every loop
			s.append(n & 1);
			//change the bit and the value number moving one bit to the right
			n = n >> 1;

		}//closing while loop

		//created a while loop in order to manipulate the string created using "0" as a key
		while (s.length() < 9) {
			s.insert(0, "0");
		}//closing while loop

		return s.toString();
	}//closing the method

}//closing the class_8_11

