package chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * 				area = radius * radius * pi
 * 			  volume = area * length
 * 
 * 		Here is a sample run:
 * 		
 * 		Enter the radius and length of a cylinder: 5.5 12
 * 
 * 										 The area is 95.0331
 * 							  		     The volume is 1140.4	
 * 			
 * */
public class Exercise_2_02{

	/** Constructor not utilized */
	public Exercise_2_02() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating a new Scanner object
		Scanner input = new Scanner(System.in);
		DecimalFormat df1 = new DecimalFormat ("##.####");
		DecimalFormat df2 = new DecimalFormat ("####.#");
		
		//Asking to the user inform Celsius degree
		System.out.print("\n\tPlease, Enter the radius and length of a cylinder: \t--> ");
		
		//Naming the first scanner object as Celsius
		Double radius = input.nextDouble();
		Double length = input.nextDouble();
		
		//Confirming the value informed
		System.out.println("\n\tThe value informed is \t\t--> " + radius + "radius" + " and " + length + " length.");
		
		//Creating the variable Fahrenheit using the formula informed
		double area = ((radius) * radius) * Math.PI;
		double volume = area * length;
				
		//Printing out the result of the transformation
		System.out.println("\n\tThe area is " + df1.format(area) );
		System.out.println("\n\tThe volume is " + df2.format(volume) );
		
		input.close();
		
	}//close main method

}//close class Exercise_2_2
