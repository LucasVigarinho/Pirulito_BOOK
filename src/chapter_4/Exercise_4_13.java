package chapter_4;

/**    ************* Description of the Exercise_4_13 *************
 * 
 * 		(Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * 		check whether the letter is a vowel or consonant. Here is a sample run:
 * 
 * 		Enter a letter: B
 * 		B is a consonant
 * 		
 * 		Enter a letter grade: a
 * 		a is a vowel
 * 		
 * 		Enter a letter grade: #
 * 		# is an invalid input
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_13 */
public class Exercise_4_13 {

	/** Creating the main method */
	public static void main (String[] args) {
		
		/** Creating the object to absorb the user answer */
		Scanner input = new Scanner (System.in)
				;
		//printin out the question to be answer by the user
		System.out.print("\n\n\tEnter a letter: ");
		/** Creating the variable to use the object created and keep in memory to be analyzed/manipulate */
		String letter = input.nextLine();
		char l = Character.toLowerCase(letter.charAt(0));
		
		//create an if statement in order to analyze the user insertion
		if(Character.isLetter(l)) {
			
			if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
			//print out the right answer if the user goes right, in case of vowel
			System.out.print("\n\n\t" + l + " is a vowel ");
			} else {
			//print out the right answer if the user goes right, in case of consonant
			System.out.print("\n\n\t" + l + " is a consonant");
			}//close if statement
			
		}else {
			//print out in case the user goes wrong with the insertion
			System.out.print("\n\n\t" + l + " is an invalid input ");
			
		}//close if statement
	
		input.close();
		
	}//closing main method
	
}//closing the class_4.13
