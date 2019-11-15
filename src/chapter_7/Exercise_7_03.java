package chapter_7;
/** 
 * 
 * 		(Count occurrence of numbers) Write a program that reads the integers between 1
 * 		and 100 and counts the occurrences of each. Assume the input ends with 0. Here
 * 		is a sample run of the program:
 * 		
 * 		Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
 * 		2 occurs 2 times
 * 		3 occurs 1 time
 * 		4 occurs 1 time
 * 		5 occurs 2 times
 * 		6 occurs 1 time
 * 		23 occurs 1 time
 * 		43 occurs 1 time
 * 
 * 		Note that if a number occurs more than one time, the plural word “times” is used
 * 		in the output.
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.text.DecimalFormat;
import java.util.Scanner;


/** Creating the class named Exercise_7_03 */
public class Exercise_7_03{

	/** Creating the main method */
	public static void main(String[] arg) {
		//create the necessary objects
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####");

		/** Print out the message to be a guide of the user interaction */
		System.out.print("\n\n\tEnter the integers between 1 and 100: ");
		/** Created the necessary variables */

		int studentsN = 1000;
		int [] students = new int [studentsN];
		int number = 0, l = 0;

		//create a while loop in order to absorb all the students scores
		do {
			number = input.nextInt();
			students[l] = number;
			l += 1;
		}while(number != 0);//closing while loop

		int count = 0;

		/** Print the students scores */
		for(int j = 0; j < 100 ; j++) {

			for(int t = 0; t < students.length; t++ ) {
				if(j == students[t]) {
					count += 1;
				}else {

				}
			}
			if(count > 0 && j != 0) {
				//print out the messages 
				System.out.print("\n\t" + j + "\toccurs \t-> " + count + ((count > 1)? " times":" time"));
			}
			count = 0;
		}//close for loop

		input.close();
	}//closing the main method




}//closing the class_7_03
