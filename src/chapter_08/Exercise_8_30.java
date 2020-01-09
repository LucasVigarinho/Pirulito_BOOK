package chapter_08;
/** 
 * 
 * 		
 * 		(Algebra: solve linear equations) Write a method that solves the following 2 * 2 system of linear equations:
 * 		a00x + a01y = b0
 * 		a10x + a11y = b1
 * 
 * 		x =		b0a11 - b1a01   			y =		b1a00 - b0a10
 * 			    ---------------                     ----------------
 * 				a00a11 - a01a10						a00a11 - a01a10
 * 
 * 		The method header is
 * 
 * 		public static double[] linearEquation(double[][] a, double[] b)
 * 
 * 		The method returns null if a00a11 - a01a10 is 0. Write a test program that
 * 		prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
 * 		a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is
 * 		similar to Programming Exercise 3.3.
 * 
 * 		Programming Exercise 3.3 -> 9.0  4.0   3.0 -5.0 -6.0 -21.0
 * 
 * 		Enter a, b, c, d, e, f: 	9.0  4.0   3.0 
 * 						  			-5.0 -6.0 -21.0
 * 
 * 				 	 	 ed - bf           af - ec
 * 				    x = ---------     y = ----------
 * 				  	 	 ad - bc		   ad - bc	
 * 
 * 						x is -2.0 and y is 3.0
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_30 */
public class Exercise_8_30{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Created a object Scanner */
		Scanner input = new Scanner(System.in);
		

		double [][] a = new double [2][2];
		double [] 	b = new double [2];
		//Creating the necessary variables 
		System.out.print("\n\n\tEnter a00x, a01y, a10x, a11y, b0, b1 ->   ");
		a = fillMatrix(input, a.length);
		b[0] = input.nextDouble();
		b[1] = input.nextDouble();

		double x = ((b[0] * a[1][1]) - (a[0][1] * b[1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
//		double x = ((  e   *    d   ) - (    b   *  f  )) / ((    a   *    d   ) - (    b   *     c  ));
		
		double y = ((a[0][0] * b[1]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
//		double y = ((  a     *  f  ) - ( e   *     c  )) / ((   a     *    d   ) - (   b    *    c   ));
		
		double testFirst = (((a[0][0] * x) + (a[0][1] * y)) );
//		double testFirst =  ((   a    * x) + (  b     * y));
		
		double testSecond = ((a[1][0] * x) + ( a[1][1] * y));
//		double testSecond = ((   c    * x) + (    d    * y));
		
		String xResult = String.format("%.1f", x);
		String yResult = String.format("%.1f", y);
		String firstF = String.format("%.1f", b[0]);
		String secondF = String.format("%.1f",b[1]);
		
		
		System.out.println("\n" + "\t X Value \t\t= " + xResult);
		System.out.println("\n" + "\t Y Value \t\t= " + yResult);
		
		if(String.format("%.1f",testFirst).equals(firstF) && String.format("%.1f",testSecond).equals(secondF)){
			System.out.println("\n" + "\t X and Y test Value \t= " + "OK");
			
		}else {
			System.out.println("\n" + "\t X test Value \t= " + "WRONG!");
		}
		System.out.println("\n\tTest of the first fraction \t\t= " + testFirst);
		System.out.println("\tTest of the second fraction \t\t= " + testSecond);
		

		input.close();

	}//close main method
	
	/** Created a method in order to fill all positions of the matrix */
	public static double [][] fillMatrix(Scanner input, int size){
	
		double [][] m = new double [size][size];
		/** created a for loop in order to absorb the user insertions to the matrix */
		for (int row = 0; row < size; row++) {
			//created the nested for loop in order to run all the columns
			for(int columns = 0; columns < size; columns++) {
				m[row][columns] = input.nextDouble();
			}//closing the nested for loop
		}//closing the main for loop
		
		
		return m;
	}//closing method fill Matrix
}//closing the class_8_30

