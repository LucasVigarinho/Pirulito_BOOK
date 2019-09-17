package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and
 * dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note
 * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
 * a sample run:
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter weight in pounds: 95.5
 * 						Enter height in inches: 50
 * 						BMI is 26.8573
 * 
 * 
 * */
public class Exercise_2_14{

	/** Constructor not utilized */
	public Exercise_2_14() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.####");
		
		System.out.print("\n\t\tEnter weight in pounds:  ");
		double pounds = input.nextDouble();
		System.out.print("\n\t\tEnter height in inches:  ");
		double inches = input.nextDouble();
		
		
		//calculations
		double weightKg = (pounds * (0.45359237));
		double heightM = inches *  0.0254;
		double bmi = weightKg / (Math.pow(heightM, 2));
		
		
		System.out.println("\n\t\tBMI is  -> \t" + df.format(bmi));

		input.close();
	}//close main method

}//close class Exercise_2_14
