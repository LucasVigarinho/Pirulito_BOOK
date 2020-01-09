package chapter_06;

/** 
 * 
 * 		(Math: approximate the square root) There are several techniques for implementing
 * 		the sqrt method in the Math class. One such technique is known as the
 * 		Babylonian method. It approximates the square root of a number, n, by repeatedly
 * 		performing a calculation using the following formula:
 * 
 * 		nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * 		When nextGuess and lastGuess are almost identical, nextGuess is the
 * 		approximated square root. The initial guess can be any positive value (e.g., 1).
 * 
 * 		This value will be the starting value for lastGuess. If the difference between
 * 		nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * 		you can claim that nextGuess is the approximated square root of n. If not, next-
 * 		Guess becomes lastGuess and the approximation process continues. Implement
 * 		the following method that returns the square root of n.
 * 
 * 		public static double sqrt(long n)
 * 
 * @author lucasmaximo
 * */
/** importing the necessary libraries */
import java.util.Scanner;

public class Exercise_6_22 {
	public static void main(String[] args) {
		//created the object
		Scanner input = new Scanner(System.in);

		// Print out the message to be a guide to the user
		System.out.print("Enter a number: ");
		//create the variable to absorb the user interaction
		long number = input.nextLong();

		// Print out the message using the method created
		System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
		
		//closing object
		input.close();
		
	}//close the main method

	/** Method squrt approximates the square root of n */
	public static double sqrt(long n) {
		//created the necessary variables
		long lastGuess = 1;	
		//variable calculation
		long nextGuess = (lastGuess + n / lastGuess) / 2; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// return nextGuess as the approximated square root of n.
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}//closing while loop
		
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}//closing the sqrt method 
}
