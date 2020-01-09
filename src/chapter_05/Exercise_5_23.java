package chapter_05;


/**    ************* Description of the Exercise_5_23 *************
 * 
 * 		(Demonstrate cancellation errors) A cancellation error occurs when you are
 * 		manipulating a very large number with a very small number. The large number
 * 		may cancel out the smaller number. For example, the result of 100000000.0 +
 * 		0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 * 		more accurate results, carefully select the order of computation. For example, in
 * 		computing the following series, you will obtain more accurate results by computing
 * 		from right to left rather than from left to right:
 * 
 *				1	 1          1
 * 			1 + -- + -- + ... + --
 *	 			2    3          n
 * 
 * 		 Write a program that compares the results of the summation of the preceding
 * 		series, computing from left to right and from right to left with n = 50000.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_23 */
public class Exercise_5_23 {

	/** Creating the main method */
	public static void main(String[] arg) {



		//create the necessary variable
		double rightToLeft = 0.0;
		double leftToRight = 0.0;

		//create a for loop to start count and summarize from the right to the left
		for (int i = 100000000; i >= 1; i--) {
			rightToLeft += 1.0 / i;
		}//closing the right to the left for loop
		
		//create a for loop to start count and summarize from the left to the right
		for (int i = 1; i <= 100000000; i++) {
			leftToRight += 1.0 / i;
		}//closing the right to the left for loop

		//difference variable to identify the difference between the two sums
		double difference = rightToLeft - leftToRight;
		
		//print out the answers
		System.out.print("\n\n\tComputing from right to left " + rightToLeft);
		System.out.print("\n\tComputing from left to right " + leftToRight);
		
		//print out the difference
		System.out.println("\n\tThe difference is " + ((rightToLeft < leftToRight)? (difference + " (Right to the left is smaller them left to the right)." ): (difference + " (Right to the left is bigger them left to the right).")));

	}//closing the main method

}//closing the class_5_23
