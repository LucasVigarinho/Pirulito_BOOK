package chapter_06;
/** 
 * 
 * 		(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * 		isPrime(int number) method for testing whether a number is prime. Use this
 * 		method to find the number of prime numbers less than 10000.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */

/** Creating the class named Exercise_6_10*/
public class Exercise_6_10{

	/** Creating the main method */
	public static void main(String[] arg) {

		System.out.println("The first prime numbers less then 1000 are \n");
		printPrimeNumbers(1000);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		// Repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// Print the prime number and increase the count
			if (isPrime(number) && number < 1000) {
				count++; // Increase the count
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// Print the number and advance to the new line
					System.out.printf("%-5s\n", number);
				}
				else
					System.out.printf("%-5s", number); 
			}

			// Check whether the next number is prime
			number++;
		}
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime


	}
}//closing the class_6_10
