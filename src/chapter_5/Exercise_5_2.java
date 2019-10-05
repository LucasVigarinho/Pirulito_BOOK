package chapter_5;


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


/** Creating the class named Exercise_5_2 */
public class Exercise_5_2 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		//generate random
		
		final int NUMBER_OF_QUESTIONS = 5; // Number of questions
		6 int correctCount = 0; // Count the number of correct answers
		7 int count = 0; // Count the number of questions
		8 long startTime = System.currentTimeMillis();
		9 String output = " "; // output string is initially empty
		10 Scanner input = new Scanner(System.in);
		11
		12 while (count < NUMBER_OF_QUESTIONS) {
		13 // 1. Generate two random single-digit integers
		14 int number1 = (int)(Math.random() * 10);
		15 int number2 = (int)(Math.random() * 10);
		16
		17 // 2. If number1 < number2, swap number1 with number2
		18 if (number1 < number2) {
		19 int temp = number1;
		20 number1 = number2;
		21 number2 = temp;
		22 }
		23
		24 // 3. Prompt the student to answer "What is number1 – number2?"
		25 System.out.print(
		26 "What is " + number1 + " - " + number2 + "? ");
		27 int answer = input.nextInt();
		28
		29 // 4. Grade the answer and display the result
		30 if (number1 - number2 == answer) {
		31 System.out.println("You are correct!");
		32 correctCount++; // Increase the correct answer count
		33 }
		34 else
		35 System.out.println("Your answer is wrong.\n" + number1
		36 + " - " + number2 + " should be " + (number1 - number2));
		37
		38 // Increase the question count
		39 count++;
		40
		41 output += "\n" + number1 + "-" + number2 + "=" + answer +
		42 ((number1 - number2 == answer) ? " correct" : " wrong");
		VideoNote
		Multiple subtraction quiz
		get start time
		loop
		display a question
		grade an answer
		increase correct count
		increase control variable
		prepare output
		}
		44
		45 long endTime = System.currentTimeMillis();
		46 long testTime = endTime - startTime;
		47
		48 System.out.println("Correct count is " + correctCount +
		49 "\nTest time is " + testTime / 1000 + " seconds\n" + output);

		
	}//closing the main method


}//closing the class_5_2
