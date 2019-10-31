package chapter_5;



/**    ************* Description of the Exercise_5_49 *************
 * 
 * 
 * 		(Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
 * 		Write a program that prompts the user to enter a string and displays the number
 * 		of vowels and consonants in the string.
 * 
 * 		Enter a string: Programming is fun
 * 		The number of vowels is 5
 * 		The number of consonants is 11
 *
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_49 */
public class Exercise_5_49 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		

		
		//print out the message to be the user guide in the interaction
		System.out.print("\n\n\tEnter a string: ");
		//Create a variable to absorb the user insertion
		String userInsertion = input.nextLine();
		
		//create a variable necessary to count
		int vowels = 0, consonants = 0;
		
		//create a for loop in order to test all the letters
		for(int i = 0; i < userInsertion.length(); i++) {
			int charNumb = (int) userInsertion.charAt(i);
			
			if (charNumb == 65 || charNumb == 69  || charNumb == 73 || charNumb == 79 || charNumb == 85 ||
				charNumb == 97 || charNumb == 101  || charNumb == 105 || charNumb == 111 || charNumb == 117 ) {
				vowels += 1;
			}else if(charNumb == 32) {
				
			}else {
				consonants += 1;
			}
			
		}//closing for loop
		
		//print out the messages 
		System.out.print("\n\tThe number of vowels is: " + vowels);
		System.out.print("\n\tThe number of consonants is: " + consonants);

		
		input.close();
		
	}//closing the main method


}//closing the class_5_49
