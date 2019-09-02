package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Geometry: distance of two points) Write a program that prompts the user to enter
 * two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note that
 * you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter x1 and y1: 1.5 -3.4
 * 						Enter x2 and y2: 4 5
 * 						The distance between the two points is 8.764131445842194
 * 
 * 
 * */
public class Exercise_2_15{

	/** Constructor not utilized */
	public Exercise_2_15() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##############");
		
		System.out.print("\n\t\tEnter x1 and y1:  ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("\n\t\tEnter x2 and y2:  ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
		//calculations
		double delta = ((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
		double distance = Math.pow(delta, 0.5);
		
		
		System.out.println("\n\t\tThe distance between the two points is -> \t" + df.format(distance));

		
	}//close main method

}//close class Exercise_2_15
