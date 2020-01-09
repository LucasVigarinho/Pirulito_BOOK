package chapter_04;

import java.util.Scanner;

/**    ************* Description of the Exercise_4_15 *************
 * 
 * 		(Phone key pads) The international standard letter/number mapping found on the
 * 		telephone is shown below:
 * 		
 * 		Write a program that prompts the user to enter a letter and displays its corresponding
 * 		number.
 * 		
 * 		Enter a letter: A
 * 		The corresponding number is 2
 * 		
 * 		Enter a letter: a
 * 		The corresponding number is 2
 * 		
 * 		Enter a letter: +
 * 		+ is an invalid input
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */

/** Creating the class named Exercise_4_15 */
public class Exercise_4_15 {

	/** Creating the main method */

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
		//Reference to number 2
		case('A'):
			System.out.print("\n\n\tThe corresponding number is 2");
		break;
		case('B'):
			System.out.print("\n\n\tThe corresponding number is 2");
		break;
		case('C'):
			System.out.print("\n\n\tThe corresponding number is 2");
		break;
		
		//Reference to number 3
		case('D'):
			System.out.print("\n\n\tThe corresponding number is 3");
		break;
		case('E'):
			System.out.print("\n\n\tThe corresponding number is 3");
		break;
		case('F'):
			System.out.print("\n\n\tThe corresponding number is 3");
		break;
		
		//Reference to number 4
		case('G'):
			System.out.print("\n\n\tThe corresponding number is 4");
		break;
		case('H'):
			System.out.print("\n\n\tThe corresponding number is 4");
		break;
		case('I'):
			System.out.print("\n\n\tThe corresponding number is 4");
		break;
		
		//Reference to number 5
		case('J'):
			System.out.print("\n\n\tThe corresponding number is 5");
		break;
		case('K'):
			System.out.print("\n\n\tThe corresponding number is 5");
		break;
		case('L'):
			System.out.print("\n\n\tThe corresponding number is 5");
		break;
		
		//Reference to number 6
		case('M'):
			System.out.print("\n\n\tThe corresponding number is 6");
		break;
		case('N'):
			System.out.print("\n\n\tThe corresponding number is 6");
		break;
		case('O'):
			System.out.print("\n\n\tThe corresponding number is 6");
		break;
		
		//Reference to number 7
		case('P'):
			System.out.print("\n\n\tThe corresponding number is 7");
		break;
		case('Q'):
			System.out.print("\n\n\tThe corresponding number is 7");
		break;
		case('R'):
			System.out.print("\n\n\tThe corresponding number is 7");
		break;
		case('S'):
			System.out.print("\n\n\tThe corresponding number is 7");
		break;
		
		//Reference to number 8
		case('T'):
			System.out.print("\n\n\tThe corresponding number is 8");
		break;
		case('U'):
			System.out.print("\n\n\tThe corresponding number is 8");
		break;
		case('V'):
			System.out.print("\n\n\tThe corresponding number is 8");
		break;
		
		//Reference to number 9
		case('W'):
			System.out.print("\n\n\tThe corresponding number is 9");
		break;
		case('X'):
			System.out.print("\n\n\tThe corresponding number is 9");
		break;
		case('Y'):
			System.out.print("\n\n\tThe corresponding number is 9");
		break;
		case('Z'):
			System.out.print("\n\n\tThe corresponding number is 9");
		break;
		default:
			System.out.print("\n\n\t" + c + " is an invalid input");;


		}//closing switch statement


		//closing the object used
		input.close();
	}//closing main method
	
}//closing the class_4.15
