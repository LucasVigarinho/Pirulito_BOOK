package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
 * 		if an answer is entered again. Hint: use an array list to store answers. Here is a
 * 		sample run:
 * 
 * 
 * 		What is 5 + 9? 12
 * 		Wrong answer. Try again. What is 5 + 9? 34
 * 		Wrong answer. Try again. What is 5 + 9? 12
 * 		You already entered 12
 * 		Wrong answer. Try again. What is 5 + 9? 14
 * 		You got it!
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.Scanner;
import java.util.ArrayList;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_16 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		ArrayList<Integer> answers = new ArrayList<>();
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print(
				"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		answers.add(answer);
		
		while (number1 + number2 != answer) {
			
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();
			if(answers.contains(answer)) {
				System.out.println("You already entered "+  answer);
			}
			answers.add(answer);
		}

		System.out.println("You got it!");

		input.close();
	}//closing the mains method


}//closing class exercise_11_01
