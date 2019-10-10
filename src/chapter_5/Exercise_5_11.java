package chapter_5;


/**    ************* Description of the Exercise_5_11 *************
 * 
 * 		
 * 		(Find numbers divisible by 5 or 6, but not both) Write a program that displays
 * 		all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not
 * 		both. Numbers are separated by exactly one space.
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_11 */
public class Exercise_5_11 {
	/** Creating the main method */
	public static void main(String[] arg) {


		//create the necessary variables
		int count = 0;

		System.out.print("\n\n\tFind numbers divisible by 5 and 6 - between 100 and 1000.");
		System.out.print("\n\n\t");

		//create a for loop to show the column numbers
		for(int i = 1; i <= 10; i++) {
			System.out.print(" " + i + "  ");
		}//closing for loop numbering

		System.out.print("\n\t");

		//open for loop to define the range
		for(int i = 100; i <= 200; i++) {

			//open if statement in order to test the divisible by 5 and 6
			if ((i % 5) == 0 || (i % 6 ) == 0)   {

				//open if statement in order to test the numbers of numbers printed
				if(count == 10) {
					System.out.println();
					System.out.print("\t" + i + " ");
					count = 1;
				}else {
					System.out.print(i + " ");
					count++;
				}//closing if statement

			}//closing if statement

		}//closing for loop

	}//closing the main method



}//closing the class_5_11
