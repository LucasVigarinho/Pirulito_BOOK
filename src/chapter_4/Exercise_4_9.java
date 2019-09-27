package chapter_4;


/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 * 
 * 
 * Enter a character: E
 * The Unicode for the character E is 69
 * 
 */

//necessary imports
import java.util.Scanner;

//creating a public class
public class Exercise_4_9 {

	//Creating a constructor of the public class described above
	public Exercise_4_9() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		
		//creating an object to absorb the user information
		Scanner input = new Scanner (System.in);

		//print out the asking for the user input 
		System.out.print("\n\n\tEnter an ASCII code (between 0 and 127: ");
		String code = input.nextLine();
		char codeASCII = code.charAt(0); //transform the code in character ASCII

//		int code = input.nextInt();
		//printing out the message and the code ASCII
		System.out.print("\n\n\tThe character for ASCII code 69 is " + codeASCII);

		//closing the object input
		input.close();
	}//closing the main method


}//closing the public class Exercise_4_9
