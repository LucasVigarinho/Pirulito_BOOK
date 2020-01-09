package chapter_02;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is				  __
 * 						    3 V3   2
 * 					Area = ------ s
 * 						      2
 * 
 * where s is the length of a side. Here is a sample run:
 * 
 * 				
 * 						Enter the side: 5.5
 * 						The area of the hexagon is 78.5895
 * 
 * */
public class Exercise_2_16{

	/** Constructor not utilized */
	public Exercise_2_16() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.####");
		
		System.out.print("\n\t\tEnter the side:  ");
		double s = input.nextDouble();
		
		//calculations
		double area = ((3 * (Math.pow((3), 0.5)) / (2 / Math.pow((s), 2))));

		
		
		System.out.println("\n\t\tThe area of the hexagon is  \t" + df.format(area));

		input.close();
	}//close main method

}//close class Exercise_2_16
