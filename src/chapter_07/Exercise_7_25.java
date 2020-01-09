package chapter_07;
/** 
 * 
 * 		(Algebra: solve quadratic equations) Write a method for solving a quadratic
 * 		equation using the following header:
 * 
 * 		public static int solveQuadratic(double[] eqn, double[] roots)
 * 
 * 		The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 * 		array eqn and the real roots are stored in roots. The method returns the number
 * 		of real roots. See Programming Exercise 3.1 on how to solve a quadratic
 * 		equation.
 * 
 * 		Write a program that prompts the user to enter values for a, b, and c and displays
 * 		the number of real roots and all real roots.
 * 		
 * 		Exercise_3_01
 * 					    __2_______ 					 __2_______
 * 				  -b + V b - 4ac 			   -b - V b - 4ac
 * 			r1 = ------------------  and r2 = -------------------
 * 						2a 							 2a
 * 		
 * 		 2
 * 		b - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * 		equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * 		the equation has no real roots.
 * 		
 * 		    Enter a, b, c: 1.0 3 1
 * 			The equation has two roots -0.381966 and -2.61803
 * 
 * 			Enter a, b, c: 1 2.0 1
 * 			The equation has one root -1
 * 
 * 			Enter a, b, c: 1 2 3
 * 			The equation has no real roots
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.text.DecimalFormat;
import java.util.Scanner;


/** Creating the class named Exercise_7_25 */
public class Exercise_7_25{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Created an object necessary to make possible the user interaction */
		Scanner input = new Scanner(System.in);

		/** Created two arrays to make possible to absorb the user interaction and 
		 * the manipulation of the numbers through methods */
		double [] eqn = new double [3];
		double [] roots = new double [2];

		/** Created the message to be a guide for the user during the interaction */
		System.out.print("\n\n\tEnter a, b, c:");

		/** Created a for loop in order to absorb all the numbers inserted by the user */
		for(int a = 0; a < eqn.length; a++) {
			//absorbing the user inserction
			eqn[a] = input.nextDouble();
		}//closing for loop

		/** calculated the quadractic formula inputed by the user */
		int rootNumber = solveQuadratic(eqn, roots);

		//Created an if statement in order to print the roots only in case of there is any root
		if(rootNumber == 0) {
			System.out.print("\n\tThe equation has one root "+ rootNumber );
		}else{
			printRoots(roots, rootNumber);
		}//closing if statement

		//closing the object
		input.close();	
	}//closing the main method

	/** Created an print Roots, for this exercise, uzing the numbers manipulated in the roots array by
	 * the method solveQuadratic */
	private static void printRoots(double[] roots, int numberOfRoots) {

		//Created the object to format the numbers 
		DecimalFormat df = new DecimalFormat("##.######");

		//Created a for loop in order to print all the number in the array, except the 0
		for (int i = 0; i < numberOfRoots; i++) {
			if(roots[i] == 0) {

			}else {
				System.out.print("\n\tRoot " + (i + 1) + " = " + df.format(roots[i]));
			}
		}//closing for loop 
	}//closing print method

	/** method for solving a quadratic equation */
	public static int solveQuadratic(double[] eqn, double[] roots) {

		/** Created the variable for the discriminat calculation */
		double discriminant = ((Math.pow(eqn[1],2)) - (4 * eqn[0] * eqn[2]));

		/** , as the instructions on exercise_3_01 - If it is positive, the equation has two real roots. 
		 * If it is zero, the equation has one root. If it is negative,the equation has no real roots. */
		if(discriminant > 0) {
			roots[0] = ((- eqn[1] + Math.pow(discriminant, 0.5))/(2*eqn[0]));

			roots[1] = ((- eqn[1] - Math.pow(discriminant, 0.5))/(2*eqn[0]));
			return 2;
		}else if (discriminant == 0) {
			roots[0] = ((- eqn[1] + Math.pow(discriminant, 0.5))/(2*eqn[0]));
			return 1;
		}else {
			System.out.print("\n\tThe equation has no real roots" );
			return 0;
		}//closing if statement

	}//closing method

}//closing the class_7_25
