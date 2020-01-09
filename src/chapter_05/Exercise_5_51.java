package chapter_05;


/**    ************* Description of the Exercise_5_51 *************
 * 
 * 
 * 		(Longest common prefix) Write a program that prompts the user to enter two
 * 		strings and displays the largest common prefix of the two strings. Here are some
 * 		sample runs:
 * 
 * 		Enter the first string: Welcome to C++
 * 		Enter the second string: Welcome to programming
 * 		The common prefix is Welcome to
 * 
 * 		Enter the first string: Atlanta
 * 		Enter the second string: Macon
 * 		Atlanta and Macon have no common prefix
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_51 */
public class Exercise_5_51{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);


		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tEnter the first string: ");
		//Create a variable to absorb the user insertion
		String firstString = input1.nextLine();
		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tEnter the second string: ");
		//Create a variable to absorb the user insertion
		String secondString = input2.nextLine();


		//create a variable necessary to count
		int	numb = 0;
		boolean test = false;
		String builder = "";

		
		if(firstString.length() < secondString.length()) {
			numb = firstString.length();
		}else {
			numb = secondString.length();
		}
		//create a for loop in order to test all the letters
		for(int i = 0; i < numb; i++) {
			
			int charNumb1 = (int) firstString.charAt(i);
			int charNumb2 = (int) secondString.charAt(i);
			
			if (charNumb1 == charNumb2 && test != true) {
				builder += String.valueOf(firstString.charAt(i));
			}else {
				test = true;
			}

		}//closing for loop
		
		//print out the messages 
		if(builder.length() <= 0) {
			System.out.print("\n\t" + firstString + " and " + secondString + "have no common prefix");
		}else {
			System.out.print("\n\tThe number of uppercase letters is: " + builder);
		}
		
		input1.close();
		input2.close();
	}//closing the main method


}//closing the class_5_51
