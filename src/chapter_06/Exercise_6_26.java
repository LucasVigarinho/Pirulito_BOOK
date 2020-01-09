package chapter_06;

/**
 * 
 * 		(Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * 		For example, 131 is a prime and also a palindromic prime, as are 313 and
 * 		757. Write a program that displays the first 100 palindromic prime numbers. Display
 * 		10 numbers per line, separated by exactly one space, as follows:
 * 
 * 		2 3 5 7 11 101 131 151 181 191
 * 		313 353 373 383 727 757 787 797 919 929
 * 		...
 * @author lucasmaximo
 *
 */
/** Importing the necessary libraries */

/** Created the class */
public class Exercise_6_26 {

	/** Created the main method */
	public static void main (String[] args) {

		int count = 0;
		for (int i = 0; count < 100; i++) {

			if (isPrime(i) && isPalindrome(i)) {
				System.out.printf("%10d", i);
				count++;
				if (count % 10 == 0 && i != 0) {
					System.out.println();
				}
			}
		}//closing a while loop
	}//closing the main method
	/** Created the method in order to find out if the number is a prime */
	public static boolean isPrime(int test) {

		if (test < 2) return false;

		for (int i = 2; i <= test / 2; i++) {

			if (test % i == 0) return false;
		}

		return true;



	}//closing isPrime
	
	/** Created the method in order to find out if the number is palindorme */
	public static boolean isPalindrome(int number) {

		String reverse = ""; 
		// make a conversion of the number to a string
		String n = number + ""; 
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		int compare = Integer.parseInt(reverse);
		// give the return to reversed integer
		return (number == compare) ? true : false; // Return reversed integer


	}//closing isPalindrome method

}//closing the class
