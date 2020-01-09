package chapter_06;
/** 
 * 
 * 		(Display characters) Write a method that prints characters using the following
 * 		header:
 * 
 * 		public static void printChars(char ch1, char ch2, int
 * 		numberPerLine)
 * 
 * 		This method prints the characters between ch1 and ch2 with the specified numbers
 * 		per line. Write a test program that prints ten characters per line from 1 to Z.
 * 		Characters are separated by exactly one space.
 * 		
 * @author lucasmaximo
 *
 */
import java.util.Scanner;

/** Create the class*/
public class Exercise_6_12 {

	/** Create the main method */
	public static void main(String[] arg) {


		//Create the objects necessary to the insertions
		Scanner input = new Scanner(System.in);

		//Print out the message to communicate with the user
		System.out.print("\n\n\tPlease, insert first character to begin -> ");
		//Create the variables to absorb the user interaction
		String character1 = input.nextLine();
		char ch1 = character1.charAt(0);
		System.out.print("\n\n\tPlease, insert second character to begin -> ");
		//Create the variables to absorb the user interaction
		String character2 = input.nextLine();
		char ch2 = character2.charAt(0);

		System.out.print("\n\n\tPlease, specify the number of characters per line -> ");
		//Create the variables to absorb the user interaction
		int lines = input.nextInt();

		//call the method putting inside the user insertions
		printChars(ch1, ch2, lines);

		input.close();
	}//closing the main method

	/** Create the method specified on the instructions */
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		//create a variable to count lines
		int count = 0;
		System.out.print("\n\t");
		//create the for loop in order to read all the characters
		for(char char1 = ch1; char1<=ch2; char1++) {
			if(count == numberPerLine) {
				System.out.print("\n\t");
				count = 0;
			}
			System.out.print(char1 + " ");
				count+=1;
		
			//create the if statement to jump every 10 characters printed
			
		}//closing for loop
	}//closing method printChars


}//close the class
