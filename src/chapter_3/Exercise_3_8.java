package chapter_3;

import java.util.Scanner;


/** 
 * 
 * (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 * 
 * 
 * */
public class Exercise_3_8{

	/** Constructor not utilized */
	public Exercise_3_8() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {



		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter three integers ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		if((number1 < number2) && (number2 < number3)) {
			System.out.print("\n\n\t" + number1 + " " + number2  + " " + number3);
		}else if ((number2 < number1) && (number1 < number3)){
			System.out.print("\n\n\t" + number2 + " " + number1  + " " + number3);
		}else {
			System.out.print("\n\n\t" + number3 + " " + number2  + " " + number1);
		}
		
		

		input.close();



}//close main method

}//close class Exercise_3_8
