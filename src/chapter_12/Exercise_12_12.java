package chapter_12;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Reformat Java source code) Write a program that converts the Java source
 * 		code from the next-line brace style to the end-of-line brace style. For example,
 * 		the following Java source in (a) uses the next-line brace style. Your program
 * 		converts it to the end-of-line brace style in (b).		
 * 
 *       ____________________________________________  _______________________________________________
 * 		|					                        |  |                                             |
 * 		|  public class Test                        |  |  public class Test {                        |
 * 		|  {                                        |  |    public static void main(String[] args) { |
 * 		|	public static void main(String[] args)  |  |       // Some statements                    |
 * 		|	{                                       |  |	}                                        |
 * 		|		// Some statements                  |  |  }                                          |
 * 		|	}                                       |  |                                             |
 * 		|  }	                                    |  |                                             |
 * 		|___________________________________________|  |_____________________________________________|
 * 				(a) Next-line brace style                        (b) End-of-line brace style
 * 
 * 		Your program can be invoked from the command line with the Java source-code
 * 		file as the argument. It converts the Java source code to a new format. For
 * 		example, the following command converts the Java source-code file Test.java
 * 		to the end-of-line brace style.
 * 
 * 		java Exercise12_12 Test.java
 * 
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (12) in a compose name */
public class Exercise_12_12 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) throws Exception {
		
		/** testing all the classes and methods */
		if(args.length != 1) {
			System.out.println("Usage: java Exercise_12_12 file");
			System.exit(1);
		}
		
		File file = new File (args[0]);
		
		if(!file.exists()) {
			System.out.println("File "+ args[0] + " does not exist");
			System.exit(2);
		}
		
		ArrayList<String> list = new ArrayList<>();
		String string1 = "";
		String string2 = "";
				
		try (
			
			Scanner input = new Scanner (file);
			
		){
			
			string1 = input.nextLine();
			while (input.hasNext()) {
				string2 = input.nextLine();
				if(string2.length() > 0 && string2.charAt(string2.length() - 1) =='{') {
					list.add(string1.concat(" }"));
					string1 = input.nextLine();
				}else {
					list.add(string1);
					string1 = string2;
				}
				
			}
			list.add(string1);
		}
		try(
				PrintWriter output = new PrintWriter(file);
				){
			for(int i =0; i < list.size(); i++) {
				output.println(list.get(i));
			}
		}
		
		
	}//closing the mains method

	
}//closing class exercise_12_12
