package chapter_5;


/**    ************* Description of the Exercise_5_20 *************
 * 
 * 		(Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
 * 		the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 * 		per line. Numbers are separated by exactly one space.
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_20 */
public class Exercise_5_20 {

	/** Creating the main method */
	public static void main(String[] arg) {

		int count=0;
		System.out.print("\n\n\t ");
	
		//create the necessary variables
		for (int i = 2; i <= 1000; i++) {
			boolean prime = true;

			//open for loop in order to check if is or not prime
			for (int a = 2; a <= i/2; a++) {
				//create an if statement to test the correct number and print out
				if (i % a == 0 ) {
					prime = false;
					break;
				}//closing if statement
			}//closing for loop
			

			//open if statement 
			if(prime) {
				System.out.print(i + "\t");
				count++;
				//open if statement to jump to the next line
				if(count == 8) {
					count = 0;
					System.out.println();
					System.out.print("\t ");
				}//closing if statement jumping line
			}//closing if statement printing prime
			
		}//closing for loop of a test

	}//closing the main method


}//closing the class_5_20
