package chapter_4;

/**    ************* Description of the Exercise_4_22 *************
 * 
 * 		(Check substring) Write a program that prompts the user to enter two strings and
 * 		reports whether the second string is a substring of the first string.
 * 
 * 		Enter string s1: ABCD
 * 		Enter string s2: BC
 * 		BC is a substring of ABCD
 * 
 * 		Enter string s1: ABCD
 * 		Enter string s2: BDC
 * 		BDC is not a substring of ABCD
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_22 */
public class Exercise_4_22 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//Create the object to make possible absorb the user inserction
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		//print out the question to be answered by the user
		System.out.print("\n\n\tEnter string s1: ");
		String str1 = input1.nextLine();
		System.out.print("\n\n\tEnter string s2: ");
		String str2 = input2.nextLine();
		
		//create an if statement in order to print out the right question
		if(str1.indexOf(str2) != -1) {
			System.out.print("\n\n\t" + str1 + " IS a substring of " + str1);
		}else {
			System.out.print("\n\n\t" + str1 + " is NOT a substring of " + str1);
		}//closing if statement
		
		input1.close();
		input2.close();
		
		
	}//closing the main method


}//closing the class_4_22
