package chapter_6;
/** 
 * 
 * 		(Conversions between Celsius and Fahrenheit) Write a class that contains the following
 * 		two methods:
 * 		
 * 		// Convert from Celsius to Fahrenheit 
 * 		public static double celsiusToFahrenheit(double celsius)
 * 		
 * 		// Convert from Fahrenheit to Celsius 
 * 		public static double fahrenheitToCelsius(double fahrenheit)
 * 		
 * 		The formula for the conversion is:
 * 		
 * 		fahrenheit = (9.0 / 5) * celsius + 32
 * 		celsius = (5.0 / 9) * (fahrenheit – 32)
 * 		
 * 
 * 		Write a test program that invokes these methods to display the following tables:
 * 
 * 		Celsius Fahrenheit | Fahrenheit Celsius
 * 		40.0         104.0 | 120.0       48.89
 * 		39.0         102.2 | 110.0       43.33
 * 		...
 * 		32.0          89.6 | 40.0         4.44
 * 		31.0          87.8 | 30.0        -1.11
 * 		
 * 		
 * @author lucasmaximo
 *
 */


/** Necessary imports */
import java.text.DecimalFormat;
/** Creating the class named Exercise_6_08*/
public class Exercise_6_08{

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df1 = new DecimalFormat("##0.0");
		DecimalFormat df2 = new DecimalFormat("##0.00");
		
		System.out.print("\n\tCelsius\tFahrenheit\t\tFahrenheit\tCelsius" );
		double count = 130;
		//creating a for loop 
		for(int i = 40; i > 30; i--) {
			
			System.out.print("\n\t" + ((double)i) + "\t" + df1.format(celsiusToFahrenheit((double)(i))) + "\t\t|\t"
									+ (count-=10) + "\t\t" + df2.format(fahrenheitToCelsius((count))));
			
		}//closing for loop

	}//closing the main method

	// Convert from feet to meters 
	public static double celsiusToFahrenheit(double celsius){
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		return fahrenheit;
		
	}//closing the main method

	// Convert from meters to feet 
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		return celsius;
	

	}//closing the main method


}//closing the class_6_08
