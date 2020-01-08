package chapter_2;

import java.util.Scanner;

/** 
 * 
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 * 		a double value from the console, then converts it to Fahrenheit and displays the
 * 		result. The formula for the conversion is as follows:
 * 		fahrenheit = (9 / 5) * celsius + 32
 * 
 * 		Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * 		Here is a sample run:
 * 		
 * 		Enter a degree in Celsius: 43
 * 		43 Celsius is 109.4 Fahrenheit		
 * 			
 * */
public class Exercise_2_01{

	/** Constructor not utilized */
	public Exercise_2_01() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		
		
		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, inform the Celsiu degree to be converted \t--> ");
		
		//Naming the first scanner object as Celsius
		String celsius = input.nextLine();
		
		//Confirming the value informed
		System.out.println("\n\tThe value informed is \t\t--> " + celsius);
		
		//Creating the variable Fahrenheit using the formula informed
		double fahrenheit = ((9.0/5) * Double.parseDouble(celsius)) + 32;
		
		//Printing out the result of the transformation
		System.out.println("\n\tThe Fahrenheit of " + celsius + " Celsius is " + fahrenheit + " Fahrenheit degrees");
		
		
		input.close();
	}//close main method

}//close class Exercise_2_1
