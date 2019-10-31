package chapter_6;
/** 
 * 
 * 
 * 		(Display an integer reversed) Write a method with the following header to display
 * 		an integer in reverse order:
 * 		
 * 		
 * 		public static void reverse(int number)
 * 		
 * 
 * 		For example, reverse(3456) displays 6543. Write a test program that prompts
 * 		the user to enter an integer and displays its reversal.		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_04*/
public class Exercise_6_04{

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner (System.in);

		System.out.print("\n\n\tType the number to be test as Palindrome -> ");
		int number = input.nextInt();
		System.out.print("\n\n\t" + (reverse(number)));

		input.close();
	}//closing the main method

	/** reverse method */
	public static int reverse(int number) {
		String numb = Integer.toString(number);
		String rev = "";
		//create a for loop in order to reverse the String
		for (int i = (numb.length()-1); i >= 0; i--) {
			rev += numb.charAt(i);
		}//closing for loop

		return Integer.parseInt(rev);
	}//close reverse method

		
		//create a for loop in order to test all the letters
		//closing for loop
		
		//print out the messages 
		



}//closing the class_6_04
