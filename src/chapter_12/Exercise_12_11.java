package chapter_12;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Remove text) Write a program that removes all the occurrences of a specified
 * 		string from a text file. For example, invoking
 * 
 * 		java Exercise12_11 John filename
 * 
 * 		removes the string John from the specified file. Your program should get the
 * 		arguments from the command line.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (01) in a compose name */
public class Exercise_12_11 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** testing all the classes and methods */
		String removeS = "John";
		String fileN = "/Users/lucasmaximo/git/Pirulito_BOOK/src/chapter_12/Exercise_12_11_text";

//		String fileN = "laishfap oaspoihasddf John apsofihas John apsoifaspoasiufasiudf "
//				+ "a;lsidfa;soijsa;i;alsifa;sifj John a;slifjasifj John  as;lfijasfij John "
//				+ ";lias;ajd;sijJohn ;asifja;sdij John";
		
		StringBuffer til = new StringBuffer();

		try (
			Scanner in = new Scanner(new java.io.File(fileN));
		){while(in.hasNext()) {
			String line = in.nextLine();
			if(line.indexOf(removeS) != -1) {
				line.replace(removeS, " ");
				til.append(line.replace(removeS, ""));
			}else {
				til.append(line);
			}
		}
		System.out.println(til.toString());
		}catch(java.io.FileNotFoundException f) {
			System.out.println("File not found.");
		}
		
	}//closing the mains method

	
}//closing class exercise_12_01
