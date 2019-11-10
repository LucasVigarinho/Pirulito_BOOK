package chapter_3;

import java.util.Scanner;

/** 
 * 
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 * that “The equation has no solution.”
 * 				
 * Enter a, b, c, d, e, f: 9.0  4.0   3.0 
 * 						  -5.0 -6.0 -21.0
 * 
 * 				 	 	 ed - bf           af - ec
 * 				    x = ---------     y = ----------
 * 				  	 	 ad - bc		   ad - bc	
 * 
 * 						x is -2.0 and y is 3.0
 * 
 * */
public class Exercise_3_3{

	/** Constructor not utilized */
	public Exercise_3_3() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {


		
		
		Scanner input = new Scanner(System.in);

		//Creating the necessary variables 
		System.out.println("\n\n\tEnter a, b, c, d, e, f :");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		double testFirst =  ((a * x) + ( b * y));
		double testSecond = ((c * x) + ( d * y));
		String xResult = String.format("%.1f", x);
		String yResult = String.format("%.1f", y);
		String firstF = String.format("%.1f", e);
		String secondF = String.format("%.1f",f);
		
		
		System.out.println("\n" + "\t\t X Value \t\t= " + xResult);
		System.out.println("\n" + "\t\t Y Value \t\t= " + yResult);
		
		if(String.format("%.1f",testFirst).equals(firstF) && String.format("%.1f",testSecond).equals(secondF)){
			System.out.println("\n" + "\t\t X and Y test Value \t= " + "OK");
			
		}else {
			System.out.println("\n" + "\t\t X test Value \t= " + "WRONG!");
		}
		System.out.println("\nTest of the first fraction \t\t= " + testFirst);
		System.out.println("Test of the second fraction \t\t= " + testSecond);
		

		input.close();

	}//close main method

}//close class Exercise_3_3
