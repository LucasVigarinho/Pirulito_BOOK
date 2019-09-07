package chapter_2;

import java.util.Scanner;


/** 
 * 
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 * 				
 * 		 		Here is a sample run:
 * 		
 * 				Enter the subtotal and a gratuity rate: 10 15
 * 				The gratuity is $1.5 and total is $11.5
 * 			
 * */
public class Exercise_2_5{

	/** Constructor not utilized */
	public Exercise_2_5() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);

		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, Enter the subtotal and a gratuity rate: \t--> ");
		
		//Naming the first scanner object as Celsius
		Double subTotal = input.nextDouble();
		Double rate = input.nextDouble();

		//Confirming the value informed
		System.out.println("\n\tThe value informed of subtotal is \t\t--> " + subTotal + " and of the Gratuity rate is --> " + rate + "%");
		
		//Creating the variable Fahrenheit using the formula informed
		double gratuity = (subTotal * (rate/100));

				
		//Printing out the result of the transformation
		System.out.println("\n\tThe gratuity is $"+ gratuity  +" and total is $" + (subTotal+gratuity) );

		input.close();
		
		
	}//close main method

}//close class Exercise_2_5
