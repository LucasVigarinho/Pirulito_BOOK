package chapter_10;

/** 
 * 			
 * 	(Large prime numbers) Write a program that finds five prime numbers larger
 * 	than Long.MAX_VALUE.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.math.BigDecimal;
import java.math.BigInteger;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_18{

	/** Creating the main method */
	public static void main(String[] arg) {

		
		
		final int NUMBER_OF_PRIMES = 5; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
//		int number = 2; // A number to be tested for primeness
		BigInteger number = BigInteger.ONE;

		System.out.print("\n\n\tThe first 5 prime numbers are larger than Long.MAX_VALUE ->");

		System.out.print("\t");
		// Repeatedly find prime numbers
		while (count < NUMBER_OF_PRIMES) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?

			// Test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // If true, number is not prime
					isPrime = false; // Set isPrime to false
					break; // Exit the for loop
				}
			}
			
			// Display the prime number and increase the count
			if (isPrime) {
				

				if ((count % NUMBER_OF_PRIMES_PER_LINE == 0) && (count != 0)) {
					// Display the number and advance to the new line
					System.out.print("\n\t\t\t\t\t\t" + number + "\t");
				}else {
					System.out.print(number + "\t");
				}
				count++; // Increase the count
			}

			// Check if the next number is prime
			number++;
		}


	}//closing the main method

}//closing the Exercise_10_01 method (used as driver method)



