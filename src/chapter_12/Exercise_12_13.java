package chapter_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Count characters, words, and lines in a file) Write a program that will count
 * 		the number of characters, words, and lines in a file. Words are separated by
 * 		whitespace characters. The file name should be passed as a command-line
 * 		argument, as shown in Figure 12.13.
 * 
 * 
 * 	FIGURE 12.13 The program displays the number of characters, words, and lines in the given file.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (13) in a compose name */
public class Exercise_12_13 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user 
	 * @throws FileNotFoundException */
	public static void main(String[] args) throws Exception {
		
		/** testing all the classes and methods */
		// Check command line parameter usage
				if (args.length != 1) {
					System.out.println("Usage: java filename");
					System.exit(1);
				}	
				File file = new File(args[0]);

				if (!file.exists()) {
					System.out.println("File " + args[0] + " does not exist");
					System.exit(2);
				}
				
				int characters = 0;	// Number of character
				int words = 0;			// Number of words
				int lines = 0;			// Number of lines

				try (
						// Create input file
						Scanner input = new Scanner(file);
					) {
						while (input.hasNext()) {
							lines++;
							String line = input.nextLine();
							characters += line.length();
						}
					}

					try (
						// Create input file
						Scanner input = new Scanner(file);
					) {
						while (input.hasNext()) {
							String line = input.next();
							words++;
						}
					}

					// Display results
					System.out.println("File " + file.getName() + " has");
					System.out.println(characters + " characters");
					System.out.println(words + " words");
					System.out.println(lines + " lines");
				

		
	}//closing the mains method

	
}//closing class exercise_12_13
