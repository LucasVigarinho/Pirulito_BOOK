package chapter_02;

import java.util.Scanner;


/** 
 * 
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days. Here is a sample run:
 * 				
 * 		 		Here is a sample run:
 * 		
 * 				Enter the number of minutes: 1000000000
 * 											 1000000000 minutes is approximately 1902 years and 214 days
 * 			
 * */
public class Exercise_2_07{

	/** Constructor not utilized */
	public Exercise_2_07() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		
		
		//Asking to the user inform
		System.out.print("\n\tPlease, Enter the number of minutes: \t--> ");
		
		
		long minutes = input.nextLong();
		
		//Confirming the value informed
		System.out.println("\n\tThe number informed is \t\t--> " + minutes);
		
		//Creating the variable Fahrenheit using the formula informed
		long calcOfDays = ((minutes/60)/24);
		long calcOfYears = calcOfDays/365;
				
		//Printing out the result of the transformation
		System.out.println("\n\t" + minutes + " minutes is approximately " + calcOfYears + " years and " + (calcOfDays % 365) + " days");

		input.close();
		
		
	}//close main method

}//close class Exercise_2_7
