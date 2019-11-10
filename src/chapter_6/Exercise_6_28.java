package chapter_6;

/**
 * 
 * 		(Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * 		in the form 2p - 1 for some positive integer p. Write a program that finds all
 * 		Mersenne primes with p … 31 and displays the output as follows:
 * 
 * 		p 		2^p –1
 * 		2 		3
 * 		3 		7
 * 		5 		31
 * 		...
 * 
 * @author lucasmaximo
 *
 */
/** import the necessary libraries */

/** Created the exercise_6_28 class*/ 
public class Exercise_6_28 {

	/** Created the main method */
	public static void main(String[] args) {
		//created the necessary variables
		int count = 0;
		//print out the ennunciate
		System.out.print("\n\n\titem\tp\t2ˆp -1");
		for (int i = 0; count < 31; i++) {
			if(Exercise_6_27.isPrime(i) && Exercise_6_27.isPrime((int) (Math.pow(2, i) -1))) {
				count+=1;
				System.out.print("\n\t" + count + "\t"+ i + "\t" + (int) (Math.pow(2, i) -1));
				
			}
		}
	}//closing the main method
	
}//closing the exercise_6_28 class
