package chapter_06;

/**
 * 
 * 
 * 		(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 * 		whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
 * 		and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
 * 		numbers per line, separated by exactly one space, as follows:
 * 
 * 		13 17 31 37 71 73 79 97 107 113
 * 		149 157 167 179 199 311 337 347 359 389
 * 		...
 * 
 * @author lucasmaximo
 *
 */

public class Exercise_6_27 {


	/** Created the main method */
	public static void main (String[] args) {

		int count = 0;
		System.out.print("\n\n\t********** Prime numbers, where its reverse is also prime but nonPalindrome ****************");
		System.out.print("\n\n");
		//created a for loop in order to print out 100 numbers
		for (int i = 0; count < 100; i++) {

			/** created an if statement in order to define the limits as the number analyzed has to be prime, 
			 * and the inverse of its number also has to be prime, but the reverse of its number can't be the 
			 * equal to the number. (nonpalindromic).
			 */
			if (isPrime(i) && i > 10 && isPrime(reverse(i)) && reverse(i) != i) {
			
					System.out.printf("%10d", i);
					count++;
					//created an if statement in order to jump to the next line
					if (count % 10 == 0 && i != 0) {
						System.out.println();
					}//closing nested if statement
				
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

	//created a method to invert the number
	public static int reverse(int number) {
		String reverse = ""; 
		// make a conversion of the number to a string
		String n = number + ""; 
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		int compare = Integer.parseInt(reverse);
		return compare;
	}//closing reverse method
	/** Created the method in order to find out if the number is palindorme */
	public static boolean isPalindrome(int number) {

		// give the return to reversed integer
		return (number == reverse(number)) ? true : false; // Return reversed integer


	}//closing isPalindrome method

}
