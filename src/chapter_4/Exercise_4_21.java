package chapter_4;

/**    ************* Description of the Exercise_4_21 *************
 * 
 * 		(Check SSN) Write a program that prompts the user to enter a Social Security
 * 		number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * 		check whether the input is valid. Here are sample runs:
 * 
 * 
 * 		Enter a SSN: 232-23-5435
 * 		232-23-5435 is a valid social security number
 * 
 * 
 * 		Enter a SSN: 23-23-5435
 * 		23-23-5435 is an invalid social security number
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_21 */
public class Exercise_4_21 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//Create the object to absorb the user interaction
		Scanner input = new Scanner(System.in);

		//Print out the message to the user know what has to be inserted.
		System.out.print("\n\n\tEnter a SSN: ");
		String ssn = input.nextLine();//create the variable to utilize the object input to absorb the user interaction

		boolean ans = testSSN(ssn);

		if(ans) {
			System.out.print("\n\n\t" + ssn + " is a valid social security number");
		}else {
			System.out.print("\n\n\t" + ssn + " is an invalid social security number");
		}

		input.close();
		//		System.out.print(test ? "\n\n\t" + ssn + " is a valid social security number" : ssn + " is an invalid social security number" );

	}//closing the main method

	/** Creating a external method in order to test SSN */
	public static boolean testSSN (String test) {

		if(test.length() == 11) {

			char a = test.charAt(0);
			char b = test.charAt(1);
			char c = test.charAt(2);
			char d = test.charAt(3);
			char e = test.charAt(4);
			char f = test.charAt(5);
			char g = test.charAt(6);
			char h = test.charAt(7);
			char i = test.charAt(8);
			char j = test.charAt(9);
			char k = test.charAt(10);


			if(testNum(a) && testNum(b) && testNum(c) && d == '-' && testNum(e) && testNum(f) && g == '-' && testNum(h) && testNum(i) && testNum(j) && testNum(k)) {
				return true;
			}else {
				return false;
			}//closing if statement
		}else {
			return false;
		}
	}//closing the test method

	/** Creating a external method in order to test if is number */
	public static boolean testNum (char num) {
		if (num >= '0' && num <= '9') {
			return true;
		}else {
			return false;
		}

	}//closing testNum
}//closing the class_4_21
