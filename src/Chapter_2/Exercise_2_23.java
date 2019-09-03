package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Cost of driving) Write a program that prompts the user to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 * and displays the cost of the trip. 
 * 
 * 					Here is a sample run:
 * 			
 * 					Enter the driving distance: 900.5
 * 					Enter miles per gallon: 25.5
 * 					Enter price per gallon: 3.55
 * 					The cost of driving is $125.36
 * 				
 * */
public class Exercise_2_23{

	/** Constructor not utilized */
	public Exercise_2_23() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("$####.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("\n\n\tEnter miles per gallon: ");
		double miles = input.nextDouble();
		System.out.print("\n\n\tEnter price per gallon: ");
		double price = input.nextDouble();

		double cost = (distance * price) / miles;
		
		
		System.out.print("\n\tThe area of the triangle is " + df.format(cost));

		input.close();

	}//close main method

}//close class Exercise_2_23
