package chapter_7;
/** 
 * 		(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
 * 		n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 * 		is found, n is not prime. A more efficient approach is to check whether any of the
 * 		prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
 * 		Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 * 		You need to use an array to store the prime numbers and later use them to check
 * 		whether they are possible divisors for n.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_7_06 */
public class Exercise_7_06{

	/** Creating the main method */
	public static void main(String[] arg) {


		final int NUMBER_OF_PRIMES = 50; // Number of primes to display
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		System.out.print("\n\n\tThe first 50 prime numbers are  ->");

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



}//closing the class_7_06
