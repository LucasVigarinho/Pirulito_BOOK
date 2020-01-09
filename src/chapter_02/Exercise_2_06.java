package chapter_02;

import java.util.Scanner;

/** 
 * 
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * Here is a sample run:
 * 				
 * 		 		Here is a sample run:
 * 		
 * 				Enter a number between 0 and 1000: 999
 * 				The sum of the digits is 27
 * 			
 * */
public class Exercise_2_06{

	/** Constructor not utilized */
	public Exercise_2_06() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		
		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, Enter a number between 0 and 1000: \t--> ");
		
		//Naming the first scanner object as Celsius
		int number = input.nextInt();
		int a = (number % 10);
		int b = ((number / 10) % 10);
		int c = ((number / 100));
		
		//Confirming the value informed
		System.out.println("\n\tThe number informed is \t\t--> " + number);
		
		//Creating the variable Fahrenheit using the formula informed
		int sum = (a + b + c);

				
		//Printing out the result of the transformation
		System.out.println("\n\tThe sum of the digits is "+ sum );

		input.close();
		
		
	}//close main method

}//close class Exercise_2_6
