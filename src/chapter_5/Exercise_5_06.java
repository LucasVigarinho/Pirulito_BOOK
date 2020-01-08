package chapter_5;



/**    ************* Description of the Exercise_5_6 *************
 * 
 * 		(Conversion from miles to kilometers) Write a program that displays the following
 * 		two tables side by side:
 * 
 * 		Miles Kilometers | Kilometers 	Miles
 * 		1 	  1.609 	 | 20 			12.430
 * 		2 	  3.218 	 | 25 		  	15.538
 * 		...
 * 		9 	  14.481	 | 60 			37.290
 * 		10 	  16.090	 | 65 			40.398
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_6 */
public class Exercise_5_06 {

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df = new DecimalFormat("####.000");

		//Create the necessary variables
		int miles = 1;
		int kilometers = 20;
		double milesXkm = 0;

		//printing out the first message
		System.out.print("\n\n\tMiles\tKilometers\t |\tKilometers\tMiles");

		//initiate for loop in order to fill the results expect
		for(int i = 1; i <= 65 ; i++) {
			miles = i;
			
			
			double km = miles * 1.609;
			milesXkm = kilometers / (1.609);
			if(kilometers <= 65) {
			System.out.print("\n\t"+ (miles<=10? miles + "\t" + df.format(km):"\t ")+ "\t\t | \t"+ kilometers + "\t\t" + df.format(milesXkm));
			kilometers += 5;
			}else {
				
			}
		}//close for loop


	}//closing the main method


}//closing the class_5_6
