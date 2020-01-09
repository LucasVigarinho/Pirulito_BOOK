package chapter_03;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange
 * .java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such
 * as 2 dollars and 3 pennies.
 * 
 * For example, the input 1156 represents 11 dollars and 56 cents.
 * 
 * 
 * */
public class Exercise_3_07{

	/** Constructor not utilized */
	public Exercise_3_07() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {


		DecimalFormat df = new DecimalFormat("$####.##");
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter the value to be transformed: ");
		int number = input.nextInt();


		double transform = number / 100.0;
		int dollars = (int) transform;
		int penny = (int) number % 100;
		
		
		System.out.print("\n\tThe value transformed is " + df.format(transform));
		
		if (dollars < 2) {
			System.out.print("\n\tThe value transformed is " + dollars + " dollar");
		}else {
			System.out.print("\n\tThe value transformed is $" + dollars + " dollares");
		}
		if (penny < 2) {
			System.out.print(" and " + penny + " penny");
		}else {
			System.out.print(" and " + penny + " pennies");
		}
		

		input.close();



}//close main method

}//close class Exercise_3_7
