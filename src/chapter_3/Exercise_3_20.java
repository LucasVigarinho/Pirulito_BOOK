package chapter_3;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures in
 * the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is
 * invalid.
 * 
 * 
 * */
public class Exercise_3_20{

	/** Constructor not utilized */
	public Exercise_3_20() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.#####");
		
		System.out.print("\n\t\tEnter the temperature in Fahrenheit between -58°F and 41°F:  ");
		double ta = input.nextDouble();
		System.out.print("\n\t\tEnter the wind speed (>=2) in miles per hour:  ");
		double v = input.nextDouble();
		
		//calculations
		double twc = 35.74 + (0.6215 * ta) - ((35.75 * Math.pow(v, 0.16))) + ((0.4275*ta)*Math.pow(v, 0.16));

		if((ta < -58 || ta > 41) || (v < 2)) {
			
			if((v < 2) && (ta < -58 || ta > 41) ){
			System.out.println("\n\t\tThe temperature should be whithin the range -58°F and 41°F" + " never - " + ta );
			System.out.println("\n\t\tThe wind speed should be (>=2) in miles per hour" + " never - " + v );
			}else if (ta < -58 || ta > 41) {
				System.out.println("\n\t\tThe temperature should be whithin the range -58°F and 41°F" + " never - " + ta );
				System.out.println("\n\t\tThe wind speed   - " + df.format(v) + " OK!" );
			}else {
				System.out.println("\n\t\tThe wind speed should be (>=2) in miles per hour" + " never - " + v );
				System.out.println("\n\t\tThe temperature  - " + df.format(ta) + " OK!" );
			}
		}else {
			System.out.println("\n\t\tThe temperature  - " + df.format(ta) + " OK!" );
			System.out.println("\n\t\tThe wind speed   - " + df.format(v) + " OK!" );
			System.out.println("\n\t\tThe wind chill index is \t" + df.format(twc));
		}
		
		

		input.close();
		
	}//close main method

}//close class Exercise_2_19
