package chapter_9;

/** 
 * 			
 * 		(Algebra: quadratic equations) Design a class named QuadraticEquation for
 * 		a quadratic equation ax2 + bx + x = 0. The class contains:
 * 		■ Private data fields a, b, and c that represent three coefficients.
 * 		■ A constructor for the arguments for a, b, and c.
 * 		■ Three getter methods for a, b, and c.
 * 		■ A method named getDiscriminant() that returns the discriminant, which is
 * 		b2 - 4ac.
 * 		■ The methods named getRoot1() and getRoot2() for returning two roots of
 * 		the equation
 *					    __2_______ 					 __2_______
 * 				  -b + V b - 4ac 			   -b - V b - 4ac
 * 			r1 = ------------------  and r2 = -------------------
 * 						2a 							 2a
 * 
 * 		These methods are useful only if the discriminant is nonnegative. Let these methods
 * 		return 0 if the discriminant is negative.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that prompts the user to enter values for a, b, and c and displays the result
 * 		based on the discriminant. If the discriminant is positive, display the two roots. If
 * 		the discriminant is 0, display the one root. Otherwise, display “The equation has
 * 		no roots.” See Programming Exercise 3.1 for sample runs.
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|					QuadraticEquation  						|
 * 			|-----------------------------------------------------------|	
 * 			| - a: double   				  							|
 * 			| - b: double      	    									|
 * 			| - c: double   											|
 * 			|-----------------------------------------------------------|
 * 			| + getA (): double											|
 * 			| + getB (): double											|
 * 			| + getC (): double											|
 * 			| + getDiscriminant (): double 								|
 * 			| + getRoot1 (): double										|
 * 			| + getRoot2 (): double										|
 * 			|___________________________________________________________| 
 * */
/** Necessary imports */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_9_10 */
public class Exercise_9_10{

	/** Write a test program that prompts the user to enter values for a, b, and c and displays the result
	 * 		based on the discriminant. If the discriminant is positive, display the two roots. If
	 * 		the discriminant is 0, display the one root. Otherwise, display “The equation has
	 * 		no roots.”
	 * 		
	 * 		 See Programming Exercise 3.1 for sample runs.
	 * 
	 * 			Enter a, b, c: 1.0 3 1
	 * 			The equation has two roots -0.381966 and -2.61803
	 * 
	 * 			Enter a, b, c: 1 2.0 1
	 * 			The equation has one root -1
	 * 
	 * 			Enter a, b, c: 1 2 3
	 * 			The equation has no real roots
	 * */
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variable
		DecimalFormat df = new DecimalFormat("###0.00");

		QuadraticEquation test1 = new QuadraticEquation(1.0, 3, 1);
		QuadraticEquation test2 = new QuadraticEquation(1, 2.0, 1);
		QuadraticEquation test3 = new QuadraticEquation(1, 2.0, 3);


		printTest(df, test1);
		printTest(df, test2);
		printTest(df, test3);

	}//closing the main method

	public static void printTest(DecimalFormat df, QuadraticEquation test) {

		if(test.getDiscriminant() > 0) {
			System.out.print("\n\tThe equation has two roots "+ df.format(test.getRoot1()) + " and " + df.format(test.getRoot2()) );
		}else if (test.getDiscriminant() == 0) {
			System.out.print("\n\tThe equation has one root "+ df.format(test.getRoot1()) );
		}else {
			System.out.print("\n\tThe equation has no real roots" );
		}
	}

}//closing the class_9_10

/** (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * 		a quadratic equation ax2 + bx + x = 0. The class contains:
 * 		■ Private data fields a, b, and c that represent three coefficients.
 * 		■ A constructor for the arguments for a, b, and c.
 * 		■ Three getter methods for a, b, and c.
 * 		■ A method named getDiscriminant() that returns the discriminant, which is
 * 		b2 - 4ac.
 * 		■ The methods named getRoot1() and getRoot2() for returning two roots of
 * 		the equation
 * 		r1 =
 * 		-b + 2b2 - 4ac
 * 		2a
 * 		and r2 =
 * 		-b - 2b2 - 4ac
 * 		2a
 * */
class QuadraticEquation{

	/** ■ Private data fields a, b, and c that represent three coefficients. */
	private double a, b, c;

	/** ■ A constructor for the arguments for a, b, and c. */
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}//closing the main constructor 

	/** ■ Three getter methods for a, b, and c. */
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}

	/** ■ A method named getDiscriminant() that returns the discriminant, which is b2 - 4ac. */
	public double getDiscriminant() {
		return ((Math.pow(this.b,2)) - (4 * this.a * this.c));
	}//closing getDiscriminant method

	/** ■ The methods named getRoot1() and getRoot2() for returning two roots of the equation */
	public double getRoot1() {
		return ((- b + Math.pow(getDiscriminant(), 0.5))/(2*a));
	}
	public double getRoot2() {
		return ((- b - Math.pow(getDiscriminant(), 0.5))/(2*a));
	}

}//closing QuadraticEquation class