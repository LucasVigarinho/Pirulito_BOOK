package chapter_12;


/**			EXERCISE DESCRIPTION 
 * 		
 * 		(NumberFormatException) Listing 7.9, Calculator.java, is a simple command line
 * 		calculator. Note that the program terminates if any operand is non numeric.
 * 		Write a program with an exception handler that deals with non numeric operands;
 * 		then write another program without using an exception handler to achieve the
 * 		same objective. Your program should display a message that informs the user of
 * 		the wrong operand type before exiting (see Figure 12.12).
 * 
 * 
 * 	FIGURE 12.12 The program performs arithmetic operations and detects input errors.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (01) in a compose name */
public class Exercise_12_01 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
					"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator
		switch (args[1].charAt(0)) {
		case '+': result = Integer.parseInt(args[0]) +
				Integer.parseInt(args[2]);
		break;
		case '-': result = Integer.parseInt(args[0]) -
				Integer.parseInt(args[2]);
		break;
		case '.': result = Integer.parseInt(args[0]) *
				Integer.parseInt(args[2]);
		break;
		case '/': result = Integer.parseInt(args[0]) /
				Integer.parseInt(args[2]);
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);




	}//closing the mains method


}//closing class exercise_12_01

