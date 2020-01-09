package chapter_06;
/** 
 * 
 * 		(Sort three numbers) Write a method with the following header to display three
 * 		numbers in increasing order:
 * 
 * 
 * 		public static void displaySortedNumbers(double num1, double num2, double num3)
 * 		
 * 		
 * 		Write a test program that prompts the user to enter three numbers and invokes the
 * 		method to display them in increasing order.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_05*/
public class Exercise_6_05{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tEnter three numbers -> ");
		//Create a variable to absorb the user insertion
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		
		displaySortedNumbers(number1, number2, number3);
		
		//print out the messages 
		input.close();
	}//closing the main method
	/** Create a method following the instructions 
	 * the method print the numbers inserted in a increasing order */
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		if(num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.print("\n\n\tFirst\t" + num1 + "\n\tSecond\t" + num2 + "\n\tThird\t" + num3);
			
		}else if (num2 < num1 && num2 < num3 && num3 < num1) {
			System.out.print("\n\n\tFirst\t" + num2 + "\n\tSecond\t" + num3 + "T\n\third\t" + num1);
			
		}else if(num3 < num1 && num3 < num2 && num1 < num2) {
			System.out.print("\n\n\tFirst\t" + num3 + "\n\tSecond\t" + num1 + "\n\tThird\t" + num2);
			
		}else if(num3 < num2 && num3 < num1 && num2 < num1) {
			System.out.print("\n\n\tFirst\t" + num3 + "\n\tSecond\t" + num2 + "\n\tThird\t" + num1);
			
		}else if (num2 < num1 && num2< num3 && num1 < num3) {
			System.out.print("\n\n\tFirst\t" + num2 + "\n\tSecond\t" + num1 + "\n\tThird\t" + num3);
			
		}else  {
			System.out.print("\n\n\tFirst\t" + num1 + "\n\tSecond\t" + num3 + "\n\tThird\t" + num2);
		}

	}//closing method
}//closing the class_6_05
