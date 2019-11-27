package chapter_7;
/** 
 * 
 * 		(Computing gcd) Write a method that returns the gcd of an unspecified number
 * 		of integers. The method header is specified as follows:
 * 
 * 		public static int gcd(int... numbers)
 * 
 * 		Write a test program that prompts the user to enter five numbers, invokes the
 * 		method to find the gcd of these numbers, and displays the gcd.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */



/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_14 */
public class Exercise_7_14{

	/** Creating the main method */
	public static void main(String[] arg) {


		//create the necessary objects
		Scanner input = new Scanner(System.in);


		/** Create a communication guide between user interaction and system */
		System.out.print("\n\n\tInput five integers to be analysed the gcd -> ");
		//Create the variable to absorb the argument
		int argument [] = new int [5];
	
		//created a for loop in order to populate all the places of the array
		for(int i = 0; i < argument.length; i++) {
			argument[i] = input.nextInt();
		}//closing the for loop
		
		//Created the variable which is going to absorb the number from getRandom
		int number = gcd(argument);

		//print out the messages 
		Exercise_7_05.printOutArray(argument);
		System.out.print("\n\n\tThe Random number is -> "+ number);
		input.close();
	
	}//closing the main method

	/** Created a method following the instructions above */
	public static int gcd(int... numbers) {
		
		//created a variable in order to verify all the number if are possible to divide for all the numbers in all the positions
		int greater = greaterNumber(numbers);
		int div = 0;
		
		/** Created a for loop in order to run all the number from the greater to the smaller */
		for(int i = greater; i > 0 ; i--) {
			/** Created a nested for loop in order to run all the positions using all the numbers */
			for(int j = 0; j < numbers.length; j++) {
				/** Open an if statement in order to test all the numbers divisor */
				if(numbers[j] % i == 0) {
					div++;
				}//closing if statement
			}//closing the nested for loop 
			/** Created an if statement in order to test if all the numbers were divisors */
			if(div == numbers.length) {
				return i;
			}else{
				div = 0;
			}//closing if statement
		}//closing the main for loop
		return 0;
	}//closing the method gcd
	
	/** Created a method to find the greater number of the array */
	public static int greaterNumber(int... numbers) {
		
		//created the variable to be used in order to find the greater number in the array
		int greater = 0;
		
		//created the for loop in order to run all the positions of the array
		for(int i = 0; i < numbers.length; i++) {
			
			//Created an if statement in order to absorb only if the number is greater
			if(greater < numbers[i]) {
				greater = numbers[i];
				
			}//closing an if statement
		}//closing for loop
		
		return greater;
	}//closing method greaterNumber
}//closing the class_7_14
