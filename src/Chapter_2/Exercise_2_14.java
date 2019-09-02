package Chapter_2;

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
		DecimalFormat df = new DecimalFormat("$###.##");
		
		System.out.print("\n\t\tEnter the monthly saving amount:  ");
		double amount = input.nextDouble();
		
		//calculation of minimum length
		double firstMonth = (amount * (1 + (0.05/12)));
		double secondMonth = amount + (firstMonth * (1 + (0.05/12)));
		double thirdMonth = amount + (secondMonth * (1 + (0.05/12)));
		double fourthMonth = amount + (thirdMonth * (1 + (0.05/12)));
		double fifthMonth = amount + (fourthMonth * (1 + (0.05/12)));
		double sixthMonth = amount + (fifthMonth * (1 + (0.05/12)));
		
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(firstMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(secondMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(thirdMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(fourthMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(fifthMonth));
		System.out.println("\n\t\tAfter the sixth month, the account value is -> " + df.format(sixthMonth));
		
	}//close main method

}//close class Exercise_2_14
