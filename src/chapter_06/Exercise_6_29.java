package chapter_06;

/**
 * 
 * 		(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
 * 		3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
 * 
 * 		Write a program to find all twin primes less than 1,000. Display the output as follows:
 * 		
 * 		(3, 5)
 * 		(5, 7)
 * 		...
 * 
 * @author lucasmaximo
 *
 */
/** Created the exercise_6_29 class*/ 
public class Exercise_6_29 {

	/** Created the main method */
	public static void main(String[] args) {
		//created the necessary variables
		int count = 0;
		//print out the ennunciate
		System.out.print("\n\n\titem\tp\t2ˆp -1");
		for (int i = 0; count < 1000; i++) {
			if(Exercise_6_27.isPrime(i) && Exercise_6_27.isPrime(i+2)) {
				count+=1;
				System.out.print("\n\t" + count + "\t"+ i + "\t" + (i+2));
				
			}
		}
	}//closing the main method
	
}//closing the exercise_6_29 class
