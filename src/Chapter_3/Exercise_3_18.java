package Chapter_3;


import java.util.Scanner;
/** 
 * 
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in
 * pounds).
 * 				  |	3.5, if 0 < w <= 1
 * 				  |	5.5, if 1 < w <= 3	
 * 		c(w) = d <		
 * 				  |	8.5, if 3 < w <= 10
 * 				  |	10.5, if 10 < w <= 20
 * 
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 50, display a message “the
 * package cannot be shipped.”
 * 
 * */

public class Exercise_3_18{

	/** Constructor not utilized */
	public Exercise_3_18() {

	}//close constructor


	/** Automatic generated main method */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("\n\n\tEnter the weight of the package -->");
		double weight = input.nextDouble();


		double cost = 0 ;

		if( 0 < weight && weight <= 1) {
			cost = 3.5;
			System.out.print("\n\n\t shipping cost. --> " + cost);
		}else if( 1 < weight && weight <= 3) {
			cost = 5.5;
			System.out.print("\n\n\t shipping cost. --> " + cost);
		}else if (3 < weight && weight <= 10) {
			cost = 8.5;
			System.out.print("\n\n\t shipping cost. --> " + cost);
		}else if (10 < weight && weight <= 50) {
			cost = 10.5;
			System.out.print("\n\n\t shipping cost. --> " + cost);
		}else {
			System.out.print("\n\n\tThe package cannot be shipped.");

		}



	}//close main method

}//close class Exercise_3_16
