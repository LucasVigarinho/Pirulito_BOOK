package chapter_4;

/**    ************* Description of the Exercise_4_11 *************
 * 
 * 		(Decimal to hex) Write a program that prompts the user to enter an integer between
 * 		0 and 15 and displays its corresponding hex number. 
 * 
 * 		Here are some sample runs:
 * 
 * 		Enter a decimal value (0 to 15): 11
 * 		The hex value is B
 * 
 * 
 * 		Enter a decimal value (0 to 15): 5
 * 		The hex value is 5
 * 
 * 
 * 		Enter a decimal value (0 to 15): 31
 * 		31 is an invalid input
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_11 */
public class Exercise_4_11 {

	/** Creating the main method */
	public static void main (String[] arg) {
	
	/** Creating the new object to absorb the user input*/
	Scanner input = new Scanner (System.in);
	
	/** Printing out the information in order to obtain the user answer */
	System.out.print("\n\n\tEnter a decimal value (0 to 15): ");
	
		int number = input.nextInt();//Creating the variable utilizing the objected created, to keep in memory user answer
		
		
	/** Creating the switch statement in order to give the right answer based on the user choice */
	switch(number) {
		case(0):
			System.out.print("\n\n\tThe hex value is 0");
			break;
		case(1):
			System.out.print("\n\n\tThe hex value is 1");
			break;
		case(2):
			System.out.print("\n\n\tThe hex value is 2");
			break;
		case(3):
			System.out.print("\n\n\tThe hex value is 3");
			break;
		case(4):
			System.out.print("\n\n\tThe hex value is 4");
			break;
		case(5):
			System.out.print("\n\n\tThe hex value is 5");
			break;
		case(6):
			System.out.print("\n\n\tThe hex value is 6");
			break;
		case(7):
			System.out.print("\n\n\tThe hex value is 7");
			break;
		case(8):
			System.out.print("\n\n\tThe hex value is 8");
			break;
		case(9):
			System.out.print("\n\n\tThe hex value is 9");
			break;
		case(10):
			System.out.print("\n\n\tThe hex value is A");
			break;
		case(11):
			System.out.print("\n\n\tThe hex value is B");
			break;
		case(12):
			System.out.print("\n\n\tThe hex value is C");
			break;
		case(13):
			System.out.print("\n\n\tThe hex value is D");
			break;
		case(14):
			System.out.print("\n\n\tThe hex value is E");
			break;
		case(15):
			System.out.print("\n\n\tThe hex value is F");
			break;
		default:
			System.out.print("\n\n\t" + number + " is an invalid input");;
			
	}//closing switch statement
	
	

	
		//closing the object used
		input.close();
		
		
	}//closing the main method
	
}//closing the class_4.11
