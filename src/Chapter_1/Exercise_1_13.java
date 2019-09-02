package Chapter_1;

import java.text.DecimalFormat;
/** 
 * 
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
 * 2 * 2 system of linear equation:
 * 
 * 					ax + by = e			 ed - bf		 af - ec
 * 									x = ---------   y = ---------
 * 					cx + dy = f			 ad - bc		 ad - bc
 * 
 *
 * Write a program that solves the following equation and displays the value for x and y:
 * 
 * 					3.4x + 50.2y = 44.5
 * 
 * 					2.1x + .55y = 5.9
 * 							
 * */
public class Exercise_1_13{

	/** Constructor not utilized */
	public Exercise_1_13() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat ("###.#");
		
		//Creating the necessary variables 
		double x = ((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1));
		double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1));
		String testFirst =  df.format((3.4 * x) + ( 50.2 * y));
		String testSecond = df.format((2.1 * x) + (   .55 * y));
		String xResult = df.format(x);
		String yResult = df.format(y);
		String firstF = "44.5";
		String secondF = "5.9";
		
		
		System.out.println("\n" + "\t\t X Value \t\t= " + xResult);
		System.out.println("\n" + "\t\t Y Value \t\t= " + yResult);
		
		if(testFirst.equals(firstF) && testSecond.equals(secondF)){
			System.out.println("\n" + "\t\t X and Y test Value \t= " + "OK");
			
		}else {
			System.out.println("\n" + "\t\t X test Value \t= " + "WRONG!");
		}
		System.out.println("\nTest of the first fraction \t\t= " + testFirst);
		System.out.println("Test of the second fraction \t\t= " + testSecond);

	}//close main method

}//close class Exercise_1_13
