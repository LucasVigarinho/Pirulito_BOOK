package chapter_3;

import java.util.Scanner;

/** 
 * 
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
 * inches, you will enter 5 for feet and 10 for inches. Here is a sample run:
 * 
 * 			Here is a sample run:
 * 				
 * 			Enter weight in pounds: 140
 * 			Enter feet: 5
 * 			Enter inches: 10
 * 			BMI is 20.087702275404553
 * 			Normal
 * 
 * */
public class Exercise_3_6{

	/** Constructor not utilized */
	public Exercise_3_6() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double kgXpounds = 0.45359237; 
		double meterXinch= 0.0254; 
		double meterXfeet = 0.3048;
		

		System.out.print("\n\n\tEnter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("\n\n\tEnter feet: ");
		double feet = input.nextDouble();
		
		System.out.print("\n\n\tEnter inches: ");
		double inches = input.nextDouble();




		double weightKg = weight * kgXpounds;
		double heightMt = (inches * meterXinch)+(feet * meterXfeet);
		double bmi = weightKg / (heightMt * heightMt);

		// Display result
		System.out.println("\n\n\tBMI is " + bmi);
		if (bmi < 18.5) {
			System.out.println("\n\n\tUnderweight");
		}else if (bmi < 25) {
			System.out.println("\n\n\tNormal");
		}else if (bmi < 30) {
			System.out.println("\n\n\tOverweight");
		}else {
			System.out.println("\n\n\tObese");
		}

		input.close();


}//close main method

}//close class Exercise_3_6
