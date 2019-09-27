package chapter_4;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 * 
 * Enter an ASCII code: 69
 * The character for ASCII code 69 is E
 * 
 */

//necessary imports
import java.util.Scanner;


//creating a public class
public class Exercise_4_8 {

	//Creating a constructor of the public class described above
	public Exercise_4_8() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		
		//creating an object to absorb the user information
		Scanner input = new Scanner (System.in);
		
		//print out the asking for the user input 
		System.out.print("\n\n\tEnter an ASCII code (between 0 and 127: ");
		int code = input.nextInt();
		char codeASCII = (char) code; //transform the code in character ASCII
		
		//printing out the message and the code ASCII
		System.out.print("\n\n\tThe character for ASCII code 69 is " + codeASCII);
		
		//closing the object input
		input.close();
		
	}//closing the main method
	
	
}//closing the public class Exercise_4_8

