package chapter_6;
/** 
 * 
 * 		(Conversions between feet and meters) Write a class that contains the following
 * 		two methods:
 * 
 * 		// Convert from feet to meters 
 * 		public static double footToMeter(double foot)
 * 
 * 		// Convert from meters to feet 
 * 		public static double meterToFoot(double meter)
 * 
 * 		The formula for the conversion is:
 * 
 * 		meter = 0.305 * foot
 * 		foot = 3.279 * meter
 * 
 * 		Write a test program that invokes these methods to display the following tables:
 * 		
 * 		Feet Meters | Meters Feet
 * 		1.0   0.305 | 20.0   65.574
 * 		2.0   0.610 | 25.0   81.967
 * 		...
 * 		9.0   2.745 | 60.0  196.721
 * 		10.0  3.050 | 65.0  213.115
 * 		
 * @author lucasmaximo
 *
 */
import java.text.DecimalFormat;

/** Creating the class named Exercise_6_09*/
public class Exercise_6_09{

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df1 = new DecimalFormat("##0.0");
		DecimalFormat df3 = new DecimalFormat("##0.000");
		
		System.out.print("\n\tFeet\tMeters\t\tMeters\tFeet" );
		int count = 15;
		//creating a for loop 
		for(int i = 1; i <= 10; i++) {
			System.out.print("\n\t" + df1.format(i) + "\t" + df3.format(footToMeter(i)) + "\t|\t"
									+ df1.format(count+=5) + "\t" + df3.format(meterToFoot(count)));
			
		}//closing for loop



		//create a variable necessary to count


		//create a for loop in order to test all the letters
		//closing for loop

		//print out the messages 

	}//closing the main method

	// Convert from feet to meters 
	public static double footToMeter(double foot) {
		
		double meter = 0.305 * foot;
		
		return meter;
		
	}

	// Convert from meters to feet 
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		
		return foot;
	}

}//closing the class_6_09
