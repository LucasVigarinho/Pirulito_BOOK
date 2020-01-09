package chapter_03;

import java.util.Scanner;


/** 
 * 
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome
 * if it reads the same from right to left and from left to right. Here is a sample
 * run of this program:
 * 
 * 					Enter a three-digit integer: 121
 * 					121 is a palindrome
 * 
 * 					Enter a three-digit integer: 123
 * 					123 is not a palindrome
 * 
 * */

public class Exercise_3_12{

	/** Constructor not utilized */
	public Exercise_3_12() {

	}//close constructor

	// create a method to test boolean isPalindrome returns true if number is a palindrome 
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	// create a method to make the reverse to returns the reversal of an integer 
	public static int reverse(int number) {
		// keep the reverse number
		String reverse = ""; 
		// make a conversion of the number to a string
		String n = number + ""; 
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		// give the return to reversed integer
		return Integer.parseInt(reverse); // Return reversed integer

	}
	/** Automatic generated main method */
	public static void main(String[] args) {
		//create the header using the specified methods
		Scanner input = new Scanner(System.in); // Create a Scanner

		// print out the possibility to the user input an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// print out whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		input.close();




	}//close main method

}//close class Exercise_3_12
