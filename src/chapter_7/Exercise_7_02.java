package chapter_7;
/** 
 * 
 * 		(Reverse the numbers entered) Write a program that reads ten integers and displays
 * 		them in the reverse of the order in which they were read.
 * 		
 * @author lucasmaximo
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/** Necessary imports */


/** Creating the class named Exercise_7_02 */
public class Exercise_7_02{

	/** Creating the main method */
	public static void main(String[] arg) {
		//create the necessary objects
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####");
		
		/** Print out the message to be a guide of the user interaction */
		System.out.print("\n\n\tEnter the integers: ");
		/** Created the necessary variables */
		
		int studentsN = 10;
		double [] students = new double [studentsN];


		//create a while loop in order to absorb all the students scores
		for(int l = 0; l < studentsN; l++) {
			students[l] = input.nextDouble();

		}//closing while loop

		int t = studentsN;
		/** Print the students scores */
		for(int j = studentsN-1; j >= 0; j--) {

			//print out the messages 
			System.out.print("\nreverse " + t  + "\tinteger \t-> " + df.format(students[j]));
			t -= 1;
		}//close for loop

		input.close();
	}//closing the main method





}//closing the class_7_02
