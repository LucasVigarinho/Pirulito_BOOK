package chapter_05;


/**    ************* Description of the Exercise_5_14 *************
 * 
 * 		(Compute the greatest common divisor) Another solution for Listing 5.9 to find
 * 		the greatest common divisor of two integers n1 and n2 is as follows: First find d
 * 		to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 * 		a divisor for both n1 and n2 in this order. The first such common divisor is the
 * 		greatest common divisor for n1 and n2. Write a program that prompts the user to
 * 		enter two positive integers and displays the gcd.
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_14 */
public class Exercise_5_14 {

	/** Creating the main method */
	public static void main(String[] arg) {




		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		int gcd = 1; // Initial gcd is 1
		int k = 2; // Possible gcd
		
		//create a do loop
		do {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k; // Update gcd
			k++;
		}while (n1 >= k && n2 >= k) ;

		System.out.println("The greatest common divisor for " + n1 +
				" and " + n2 + " is " + gcd);


		input.close();
		 
	}//closing the main method


}//closing the class_5_14
