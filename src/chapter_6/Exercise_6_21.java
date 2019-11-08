package chapter_6;
/**
 * 
 * 		(Phone keypads) The international standard letter/number mapping for telephones
 * 		is shown in Programming Exercise 4.15. Write a method that returns a number,
 * 		given an uppercase letter, as follows:
 * 
 * 		int getNumber(char uppercaseLetter)
 * 
 * 		Write a test program that prompts the user to enter a phone number as a string.
 * 		The input number may contain letters. The program translates a letter (uppercase
 * 		or lowercase) to a digit and leaves all other characters intact. Here is a sample run
 * 		of the program:
 * 
 * 		Enter a string: 1-800-Flowers
 * 		1-800-3569377
 * 
 * 		Enter a string: 1800flowers
 * 		18003569377
 * 
 * @author lucasmaximo
 *
 */

/** Imported the libraries */
import java.util.Scanner;


//creating the class
public class Exercise_6_21 {

	/** created the main method **/
	public static void main (String[] args) {

		/** Created the objects needed */
		Scanner input = new Scanner(System.in);
		Exercise_6_21 in = new Exercise_6_21();

		/** Print out the message to be a guide for the user interaction */
		System.out.print("\n\n\tEnter a string: ");
		/** Created the variable to absorb the user insertion */
		String uppercaseLetter = input.nextLine();

		System.out.print("\n\n\t");

		/** Created a for loop in order to read all the substrings */
		for (int i = 0; i < uppercaseLetter.length(); i++) {

			if(Character.isLetter(uppercaseLetter.charAt(i))){
				System.out.print(in.getNumber(uppercaseLetter.charAt(i)));
			}else {
				System.out.print(uppercaseLetter.charAt(i));
			}

		}//closing the for loop
		/** closing the object opened  */
		input.close();
	}//closing the main method

	/** Method created following the instructions, in order to give an upper case letter */
	int getNumber(char uppercaseLetter) {
		if (uppercaseLetter == 'a' || uppercaseLetter == 'b' || uppercaseLetter == 'c' ||
				uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			return 2;
		}else if(uppercaseLetter == 'd' || uppercaseLetter == 'e' || uppercaseLetter == 'f' ||
				uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			return 3;
		}else if(uppercaseLetter == 'g' || uppercaseLetter == 'h' || uppercaseLetter == 'i' ||
				uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			return 4;
		}else if (uppercaseLetter == 'j' || uppercaseLetter == 'k' || uppercaseLetter == 'l' ||
				uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			return 5;
		}else if(uppercaseLetter == 'm' || uppercaseLetter == 'n' || uppercaseLetter == 'o' ||
				uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			return 6;
		}else if (uppercaseLetter == 'p' || uppercaseLetter == 'q' || uppercaseLetter == 'r' || uppercaseLetter == 's' ||
				uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S' ) {
			return 7;
		}else if(uppercaseLetter == 't' || uppercaseLetter == 'u' || uppercaseLetter == 'v' ||
				uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			return 8;
		}else {
			return 9;
		}

	}//close get Number method

}//closing the class
