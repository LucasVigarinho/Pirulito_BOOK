package chapter_09;

/** 
 * 			
 * 
 * 		(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 		2 * 2 system of linear equations:
 * 
 *		Exercise_3_03
 *
 *		 * Enter a, b, c, d, e, f: 9.0  4.0   3.0 
 * 						  -5.0 -6.0 -21.0
 * 
 * 				 	 	 ed - bf           af - ec
 * 				    x = ---------     y = ----------
 * 				  	 	 ad - bc		   ad - bc	
 * 
 * 		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

 * 						x is -2.0 and y is 3.0
 * 
 * 		The class contains:
 * 		■ Private data fields a, b, c, d, e, and f.
 * 		■ A constructor with the arguments for a, b, c, d, e, and f.
 * 		■ Six getter methods for a, b, c, d, e, and f.
 * 		■ A method named isSolvable() that returns true if ad - bc is not 0.
 * 		■ Methods getX() and getY() that return the solution for the equation.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * 		If ad - bc is 0, report that “The equation has no solution.” See Programming
 * 		Exercise 3.3 for sample runs.
 * 
 * 		@author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|					   LinearEquation  														|
 * 			|-------------------------------------------------------------------------------------------|	
 * 			| - a: double   				  															|
 * 			| - b: double      	    																	|
 * 			| - c: double   																			|
 * 			| - d: double   																			|
 * 			| - e: double   																			|
 * 			| - f: double   																			|
 * 			|-------------------------------------------------------------------------------------------|
 * 			| + LinearEquation (a: double, b: double, c: double, d: double, e: double, f: double)		|
 * 			| + getA (): double																			|
 * 			| + getB (): double																			|
 * 			| + getC (): double																			|
 * 			| + getD (): double																			|
 * 			| + getE (): double																			|
 * 			| + getF (): double																			|
 * 			| + isSolvable (): boolean																	|
 * 			| + getX (): double																		|
 * 			| + getY (): double																		|
 * 			|___________________________________________________________________________________________|	 
 * */
/** Necessary imports */

/** Creating the class named Exercise_9_11 */
public class Exercise_9_11{

	/** Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result.
	 * 	If ad - bc is 0, report that “The equation has no solution.” See Programming 
	 * 	Exercise 3.3 for sample runs.*/
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary variable
		LinearEquation test1 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
		
			testLinearEquation(test1);
		
	}//closing the main method

	public static void testLinearEquation(LinearEquation test1) {
		if(test1.isSolvable()){
			System.out.println("\n\n\tX and Y test Value \t=> " + "OK");
			System.out.println("\n\tValue of X \t\t=> " + test1.getX());
			System.out.println("\n\tValue of Y \t\t=> " + test1.getY());

		}else {
			System.out.println("\n" + "\t\t X test Value \t= " + "The equation has no solution.");
		}
	}
}//closing the class_9_11


/** Design a class named LinearEquation for a 2 * 2 system of linear equations: */
class LinearEquation{

	/** ■ Private data fields a, b, c, d, e, and f. */
	private double a, b, c, d, e, f;

	/** ■ A constructor with the arguments for a, b, c, d, e, and f.*/
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	/** ■ Six getter methods for a, b, c, d, e, and f. */
	public double getA() {return a;}
	public double getB() {return b;}
	public double getC() {return c;}
	public double getD() {return d;}
	public double getE() {return e;}
	public double getF() {return f;}

	/** ■ A method named isSolvable() that returns true if ad - bc is not 0. */
	public boolean isSolvable() {
		return (((getA()*getD())-(getB()*getC()) != 0)?true:false);
	}

	/** ■ Methods getX() and getY() that return the solution for the equation. */
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}
	public double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));
	}


}//closing Linear Equation class