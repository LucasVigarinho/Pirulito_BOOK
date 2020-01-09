package chapter_05;



/**    ************* Description of the Exercise_5_41 *************
 * 
 * 
 * 		(Occurrence of max numbers) Write a program that reads integers, finds the largest
 * 		of them, and counts its occurrences. Assume that the input ends with number
 * 		0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 * 		is 5 and the occurrence count for 5 is 4.
 * 		(Hint: Maintain two variables, max and count. max stores the current max number,
 * 		and count stores its occurrences. Initially, assign the first number to max
 * 		and 1 to count. Compare each subsequent number with max. If the number is
 * 		greater than max, assign it to max and reset count to 1. If the number is equal to
 * 		max, increment count by 1.)
 * 
 * 		Enter numbers: 3 5 2 5 5 5 0
 * 		The largest number is 5
 * 		The occurrence count of the largest number is 4
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_41 */
public class Exercise_5_41 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		
		//create the necessary objects
		Scanner input = new Scanner (System.in);
		int count = 0;
		int last = 0;
		int number = 0;
		//calculation
		System.out.print("\n\n\t" + "Write a program that reads integers, finds the largest of them,\n" + 
				"\tand counts its occurrences. Assume that the input ends with number 0.\n" + 
				"\t ");
		System.out.print("\n\n\t" + "Enter numbers: ");
		
		//create the while loop in order to test the insertions
		while ((number = input.nextInt())!= 0) {
		
			//create an if statement in order to test all the possibilities
			if (number > last) {
				last = number;
				count = 1;
			}else if (number == last) {
				count++;
			}else {
				
			}//closing if statement
	
		}//closing while loop
		
		//print out the correct answer
		System.out.print("\n\n\tThe large number is \t\t\t\t-> " + last);
		System.out.print("\n\tThe occurrence count of the largest number is \t-> " + count);
		
		//closing the object
		input.close();
		
	}//closing the main method


}//closing the class_5_41
