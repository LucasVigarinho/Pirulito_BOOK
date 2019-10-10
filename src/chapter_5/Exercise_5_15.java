package chapter_5;


/**    ************* Description of the Exercise_5_15 *************
 * 
 * 		(Display the ASCII character table) Write a program that prints the characters in
 * 		the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * 		table is shown in Appendix B. Characters are separated by exactly one space.
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_15 */
public class Exercise_5_15 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		
		//create the necessary variables
		int count = 0;
		System.out.print("\n\n\t" );

		for (char i = '!'; i <= '~'; i++) {
			System.out.print(i + " ");
			count++;
			if(count == 10) {
				System.out.print("\n" );
				System.out.print("\t" );
				count = 0;
			}else {
				
			}//closing if statement

		}//closing for loop
	}//closing the main method


}//closing the class_5_15
