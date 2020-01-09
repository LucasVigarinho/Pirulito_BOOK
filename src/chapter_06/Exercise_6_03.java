package chapter_06;
/** 
 * 
 * 
 * 		(Palindrome integer) Write the methods with the following headers
 * 
 * 		// Return the reversal of an integer, i.e., reverse(456) returns 654
 * 
 * 		public static int reverse(int number)
 * 
 * 		// Return true if number is a palindrome
 * 
 * 		public static boolean isPalindrome(int number)
 * 
 * 		Use the reverse method to implement isPalindrome. A number is a palindrome
 * 		if its reversal is the same as itself. Write a test program that prompts the
 * 		user to enter an integer and reports whether the integer is a palindrome.		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_03*/
public class Exercise_6_03{

	/** Creating the main method */
	public static void main(String[] arg) {
		Scanner input = new Scanner (System.in);

		System.out.print("\n\n\tType the number to be test as Palindrome -> ");
		int number = input.nextInt();
		System.out.print("\n\n\t" + (isPalindrome(number)? "The number " + number + " is Palindrome " : 
														   "The number " + number + " is NOT Palindrome "));

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

	/** isPalindrome method */
	public static boolean isPalindrome(int number) {

		return (number == reverse(number))?true:false;

	}//close isPalindrome
}//closing the class_6_03
