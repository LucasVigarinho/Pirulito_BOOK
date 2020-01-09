package chapter_05;


/**    ************* Description of the Exercise_5_27 *************
 * 
 * 		(Display leap years) Write a program that displays all the leap years, ten per line,
 * 		from 101 to 2100, separated by exactly one space. Also display the number of
 * 		leap years in this period.
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_27 */
public class Exercise_5_27 {

	/** Creating the main method */
	public static void main(String[] arg) {

	 	//print waht is the years displead below
		System.out.println("All the leap years from 101 to 2100:");

			//create the variables to be uses in the for loop and for the if statement
			int count = 0;
		
			//create the for loop to limit
			for (int year = 101; year <= 2100; year++) {
				
				//Create the if method to test the for leap year
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					count++;

					// Ten results per line separated by exactly one space
					System.out.print(year + (count % 10 == 0 ? "\n" : " "));
				} //closing if statement
			}
			System.out.println();
	    	
	
		//create the necessary variables

	}//closing the main method


}//closing the class_5_27
