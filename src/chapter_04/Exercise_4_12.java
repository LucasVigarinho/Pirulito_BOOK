package chapter_04;



/**    ************* Description of the Exercise_4_12 *************
 * 
 * 		(Hex to binary) Write a program that prompts the user to enter a hex digit and
 * 		displays its corresponding binary number. 
 * 
 * 
 * 		Here is a sample run:
 * 
 * 		Enter a hex digit: B
 * 		The binary value is 1011
 * 
 * 		Enter a hex digit: G
 * 		G is an invalid input
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_12 */
public class Exercise_4_12 {


	/** Creating the main method */
	public static void main (String[] arg) {
	
	/** Creating the new object to absorb the user input*/
	Scanner input = new Scanner (System.in);
	
	/** Printing out the information in order to obtain the user answer */
	System.out.print("\n\n\tEnter a heximal digit: ");
	
		String number = input.nextLine();//Creating the variable utilizing the objected created, to keep in memory user answer
		
		
	/** Creating the switch statement in order to give the right answer based on the user choice */
	switch(number) {
		case("0"):
			System.out.print("\n\n\tThe hex value is 0000");
			break;
		case("1"):
			System.out.print("\n\n\tThe hex value is 0001");
			break;
		case("2"):
			System.out.print("\n\n\tThe hex value is 0010");
			break;
		case("3"):
			System.out.print("\n\n\tThe hex value is 0011");
			break;
		case("4"):
			System.out.print("\n\n\tThe hex value is 0100");
			break;
		case("5"):
			System.out.print("\n\n\tThe hex value is 0101");
			break;
		case("6"):
			System.out.print("\n\n\tThe hex value is 0110");
			break;
		case("7"):
			System.out.print("\n\n\tThe hex value is 0111");
			break;
		case("8"):
			System.out.print("\n\n\tThe hex value is 1000");
			break;
		case("9"):
			System.out.print("\n\n\tThe hex value is 1001");
			break;
		case("A"):
			System.out.print("\n\n\tThe hex value is 1010");
			break;
		case("a"):
			System.out.print("\n\n\tThe hex value is 1010");
			break;
		case("B"):
			System.out.print("\n\n\tThe hex value is 1011");
			break;
		case("b"):
			System.out.print("\n\n\tThe hex value is 1011");
			break;
		case("C"):
			System.out.print("\n\n\tThe hex value is 1100");
			break;
		case("c"):
			System.out.print("\n\n\tThe hex value is 1100");
			break;
		case("D"):
			System.out.print("\n\n\tThe hex value is 1101");
			break;
		case("d"):
			System.out.print("\n\n\tThe hex value is 1101");
			break;
		case("E"):
			System.out.print("\n\n\tThe hex value is 1110");
			break;
		case("e"):
			System.out.print("\n\n\tThe hex value is 1110");
			break;
		case("F"):
			System.out.print("\n\n\tThe hex value is 1111");
			break;
		case("f"):
			System.out.print("\n\n\tThe hex value is 1111");
			break;
		default:
			System.out.print("\n\n\t" + number + " is an invalid input");;
			
	}//closing switch statement
	
	

	
		//closing the object used
		input.close();
		
		
	}//closing the main method
	
}//closing the class_4.12
