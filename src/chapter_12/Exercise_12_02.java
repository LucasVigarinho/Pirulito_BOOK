package chapter_12;


/**			EXERCISE DESCRIPTION 
 * 
 * 		(InputMismatchException) Write a program that prompts the user to read
 * 		two integers and displays their sum. Your program should prompt the user to
 * 		read the number again if the input is incorrect.		
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */
import java.util.Scanner;
import java.util.InputMismatchException;

/** Created the main class, using the name of the package (12) and the exercise (02) in a compose name */
public class Exercise_12_02 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		/** testing all the classes and methods */
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		while(true) {
			System.out.print("Please enter in 2 integers to get their sum: ");        
			try {
				n1 = in.nextInt();
				n2 = in.nextInt();

				break;
			} 
			catch (InputMismatchException e) {
				System.out.printf("You must enter 2 integers!%n%n");
				in.nextLine(); 
			}

		} 
		System.out.printf("The sum is %d%n", (n1+n2));


		in.close();


	}//closing the mains method


}//closing class exercise_12_02
