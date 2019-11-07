package chapter_6;

/** 
 * 
 * 		(Check password) Some websites impose certain rules for passwords. Write a
 * 		method that checks whether a string is a valid password. Suppose the password
 * 		rules are as follows:
 * 
 * 		■ A password must have at least eight characters.
 * 		■ A password consists of only letters and digits.
 * 		■ A password must contain at least two digits.
 * 
 * 		Write a program that prompts the user to enter a password and displays Valid
 * 		Password if the rules are followed or Invalid Password otherwise.
 * 
 * @author lucasmaximo
 *
 */

/** Import library necessary */
import java.util.Scanner;

/** Created the class of exercise_6_18 */
public class Exercise_6_18 {

	/** Create the main method */
	public static void main (String[] args) {
		/** Create the object */
		Scanner input = new Scanner(System.in);

		/** Print out the message to instruct the user */
		System.out.print("\n\n\tInsert the password: ");
		String password = input.nextLine();

		//created a while loop in order to print the message and let the user insert a new passaword to be tested
		while (passwordTester(password) == false){

			System.out.print("\n\t■ A password must have at least eight characters.\n" + 
					"\t■ A password consists of only letters and digits.\n" + 
					"\t■ A password must contain at least two digits.");
			System.out.print("\n\n\tInsert the password: ");
			password = input.nextLine();
		}//close while loop


		System.out.print("\n\tPassword OK!");

	}//close the main method

	/** Created a passwordTeste method following the instructions */
	public static boolean passwordTester(String password) {
		int digits = 0;
		int count = 0;

		
		for(int i = 0; i < password.length(); i++) {

			digits = password.charAt(i);

			if(digits < 48) {
				return false;
			}else if (digits > 57 && digits < 65 ) {
				return false;
			}else if (digits > 90 && digits < 97 ) {
				return false;
			}else if (digits > 122) {
				return false;
			}//close if statement

			count+=1;
		}//close for loop 

		if (password.length() < 8 || count < 2) {
			return false;
		}
		return true;
	}//close the method for testing the password

}//close class 
