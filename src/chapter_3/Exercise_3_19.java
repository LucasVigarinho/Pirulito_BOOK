package chapter_3;


import java.text.DecimalFormat;
import java.util.Scanner;
/** 
 * 
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 * 
 * */

public class Exercise_3_19{

	/** Constructor not utilized */
	public Exercise_3_19() {

	}//close constructor


	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##.##");
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n\tEnter three edges for a triangle -->");
		double e1 = input.nextDouble();
		double e2 = input.nextDouble();
		double e3 = input.nextDouble();
		

		//opening if statement to test the triangle and calculate it
		if(((e1 + e2) < e3) || ((e3 + e2) < e1) || ((e3 + e1) < e2)){
			System.out.print("\tThe input is not valid");
		}else {
			System.out.print("\tThe perimeter of the tringle is : " + df.format(e1+e2+e3));
		}//closing if statement
		
		input.close();

	}//close main method

}//close class Exercise_3_19
