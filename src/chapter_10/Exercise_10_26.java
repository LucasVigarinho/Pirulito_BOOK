package chapter_10;


/** 
 * 			
 * 	(Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as
 * 	a string in which the operands and operator are separated by zero or more
 * 	spaces. For example, 3+4 and 3 + 4 are acceptable expressions. Here is a
 * 	sample run:
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_26{

	/** Creating the main method */
	public static void main(String[] arg) {


		calculator(new String[] {"3  ? 4"});

	}//closing the main method

	public static void calculator(String[] test) {

		String[] input = test[0].split("\\s+");

		double result = 0.0;
		double firstP = Double.parseDouble(input[0]);
		char signal = input[1].charAt(0);
		double secondP = Double.parseDouble(input[2]);

		if(input.length != 3 || input[1].length() != 1 || Character.valueOf(signal) < 42 || Character.valueOf(signal) > 47 ) {
			try {
				Double.parseDouble(input[0]);
				Double.parseDouble(input[2]);
			} catch (Exception e) {
				System.out.print("The numbers are not possible to be transformed in double.");
			}
			System.out.print("\n\tAny right signal was used -- the signal is ---> " + Character.toString(signal));

		}else {
			// Determine the operator
			switch (signal) {
			case '+': result = firstP + secondP;
			break;
			case '-': result = firstP - secondP;
			break;
			case '*': result = firstP * secondP;
			break;
			case '/': result = firstP / secondP;
			break;
			default:
				System.out.print("\n\tAny right signal was used -- the signal is ---> " + Character.toString(signal));
			}//closed switch statement 

			// Display result
			System.out.println(firstP + " " + signal + " " + secondP + " = " + result);
		}//closed if statement
	}

}//closing the Exercise_10_01 method (used as driver method)
