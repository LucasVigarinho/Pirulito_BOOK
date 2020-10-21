package chapter_12;
import java.io.File;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Process scores in a text file) Suppose that a text file contains an unspecified
 * 		number of scores separated by blanks. Write a program that prompts the user
 * 		to enter the file, reads the scores from the file, and displays their total and
 * 		average.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (14) in a compose name */
public class Exercise_12_14 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) throws Exception{

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to a file
		System.out.print("Enter a file of scores: ");
		File file = new File(input.nextLine());

		// Check if file exists 
		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}

		int count = 0; 		// Counts scores
		double total = 0;	// Accumulates total

		try (
				// Create input file
				Scanner inputFile = new Scanner(file);
				) {
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}
		input.close();
		// Display results
		System.out.println("File " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));



	}//closing the mains method


}//closing class exercise_12_14
