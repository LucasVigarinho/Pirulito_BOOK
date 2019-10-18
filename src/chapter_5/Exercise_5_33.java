package chapter_5;


/**    ************* Description of the Exercise_5_33 *************
 * 
 * 		(Perfect number) A positive integer is called a perfect number if it is equal to
 * 		the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 * 		perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
 * 		+ 1. There are four perfect numbers less than 10,000. Write a program to find all
 * 		these four numbers.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */



/** Creating the class named Exercise_5_33 */
public class Exercise_5_33 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		System.out.print("\n\n\t There are four perfect numbers less than 10,000 ");
		
		int test = 0;

		//calculation
		//create a for loop to test all the numbers between 1 and 10000
		for (int x = 1; x <=10000; x++) {
			
			//create a for loop to be able to sum the number divisors by the number x from the main for loop
			for (int y = 1; y < x; y++ ) {
				
				//create the if statement in order to summarize the divisors numbers to test in the follow if statement
				if (x % y == 0) {
					test += y;
				}//closing if statement
				
			}//closing nested for loop
			
			//if statement in order to print the number which match the necessary status
			if(test == x) {
				System.out.print("\n\t" + test);
			}//closing if statement
			
			//Start from zero the test variable, to be able to calculate the next number
			test = 0;
		}//closing main for loop
		
		
	}//closing the main method


}//closing the class_5_33
