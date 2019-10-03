package chapter_4;

/**    ************* Description of the Exercise_4_14 *************
 * 
 * 		(Convert letter grade to number) Write a program that prompts the user to enter a
 * 		letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 * 		1, or 0. Here is a sample run:
 * 
 * 		Enter a letter grade: B
 * 		The numeric value for grade B is 3
 * 
 * 		Enter a letter grade: T
 * 		T is an invalid grade
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_14 */
public class Exercise_4_14 {


	/** Creating the main method */
	public static void main (String[] arg) {

		/** Creating the new object to absorb the user input*/
		Scanner input = new Scanner (System.in);

		/** Printing out the information in order to obtain the user answer */
		System.out.print("\n\n\tEnter a letter grade: ");

		String letter = input.nextLine();//Creating the variable utilizing the objected created, to keep in memory user answer
		char c = Character.toUpperCase(letter.charAt(0));

		/** Creating the switch statement in order to give the right answer based on the user choice */
		switch(c) {
		case('A'):
			System.out.print("\n\n\tThe numeric value for grade A is 4");
		break;
		case('B'):
			System.out.print("\n\n\tThe numeric value for grade B is 3");
		break;
		case('C'):
			System.out.print("\n\n\tThe numeric value for grade C is 3");
		break;
		case('D'):
			System.out.print("\n\n\tThe numeric value for grade D is 2");
		break;
		case('E'):
			System.out.print("\n\n\tThe numeric value for grade E is 1");
		break;
		case('F'):
			System.out.print("\n\n\tThe numeric value for grade F is 0");
		break;
		default:
			System.out.print("\n\n\t" + c + " is an invalid grade");;


		}//closing switch statement


		//closing the object used
		input.close();
	}//closing main method



}//closing the class_4.14

