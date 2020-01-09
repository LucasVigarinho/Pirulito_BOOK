package chapter_05;


/**    ************* Description of the Exercise_5_2 *************
 * 
 * 		(Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
 * 		subtraction questions. Revise the program to generate ten random addition questions
 * 		for two integers between 1 and 15. Display the correct count and test time.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_2 */
public class Exercise_5_02 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//generate random questions based on number of questions
		int numberOfQuestions = 5; 
		
		//create necessary variables
		int correctCount = 0; 
		int count = 0; 
		long startTime = System.currentTimeMillis();
		String output = " "; 
		Scanner input = new Scanner(System.in);

		while (count < numberOfQuestions) {
			
			// 1. Generate two random single-digit integers
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			
			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}//closing if statement

			// 3. Prompt the student to answer "What is number1 – number2?"
			System.out.print(
					"What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++; // Increase the correct answer count
			}else
				System.out.println("Your answer is wrong.\n" + number1
						+ " - " + number2 + " should be " + (number1 - number2));

			// Increase the question count
			count++;

			output += "\n" + number1 + "-" + number2 + "=" + answer +
					((number1 - number2 == answer) ? " correct" : " wrong");

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount +
				"\nTest time is " + testTime / 1000 + " seconds\n" + output);

		//closing input object 
		input.close();
		
	}//closing the main method


}//closing the class_5_2
