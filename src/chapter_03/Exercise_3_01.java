package chapter_03;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained using the following formula:
 *					    __2_______ 					 __2_______
 * 				  -b + V b - 4ac 			   -b - V b - 4ac
 * 			r1 = ------------------  and r2 = -------------------
 * 						2a 							 2a
 *  2
 * b - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 * Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
 * sample runs.
 * 				
 * 			Enter a, b, c: 1.0 3 1
 * 			The equation has two roots -0.381966 and -2.61803
 * 
 * 			Enter a, b, c: 1 2.0 1
 * 			The equation has one root -1
 * 
 * 			Enter a, b, c: 1 2 3
 * 			The equation has no real roots
 * 
 * */
public class Exercise_3_01{

	/** Constructor not utilized */
	public Exercise_3_01() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.######");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter a, b, c:");
		double a = input.nextDouble();
		
		double b = input.nextDouble();

		double c = input.nextDouble();

		double discriminant = ((Math.pow(b,2)) - (4 * a * c));
		
		double r1 = ((- b + Math.pow(discriminant, 0.5))/(2*a));
		double r2 = ((- b - Math.pow(discriminant, 0.5))/(2*a));
		
		
		if(discriminant > 0) {
			System.out.print("\n\tThe equation has two roots "+ df.format(r1) + " and " + df.format(r2) );
		}else if (discriminant == 0) {
			System.out.print("\n\tThe equation has one root "+ df.format(r1) );
		}else {
			System.out.print("\n\tThe equation has no real roots" );

		}
		

		input.close();

	}//close main method

}//close class Exercise_3_1
