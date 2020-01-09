package chapter_05;



/**    ************* Description of the Exercise_5_47 *************
 * 
 * 
 * 		(Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
 * 		uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * 		which is calculated from the other digits using the following formula:
 * 		10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * 		If the checksum is 10, replace it with 0. Your program should read the input as a
 * 		string. Here are sample runs:
 * 
 * 
 * 		Enter the first 12 digits of an ISBN-13 as a string: 978013213080
 * 		The ISBN-13 number is 9780132130806
 * 
 * 		Enter the first 12 digits of an ISBN-13 as a string: 978013213079
 * 		The ISBN-13 number is 9780132130790
 * 
 * 		Enter the first 12 digits of an ISBN-13 as a string: 97801320
 * 		97801320 is an invalid input
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_47 */
public class Exercise_5_47 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//create the necessary variable
		int numberChar = 0, summ = 0;
		boolean count = false;

		//print out the user interaction possibility
		System.out.print("\n\n\tEnter the first 12 digits of an ISBN-13 as a string: ");
		String first12 = input.nextLine();//absorb the user input

		switch(first12.length()) {
		case(12):
			//create a for loop in order to make possible the calculation
			for(int i = 0; i < first12.length(); i++) {
				if(count == true) {
					numberChar = (int) Integer.parseInt(String.valueOf(first12.charAt(i)));
					summ += numberChar*3;
					count = false;
				}else {
					numberChar = (int) Integer.parseInt(String.valueOf(first12.charAt(i)));
					summ += numberChar;
					count = true;
				}

			}//closing for loop 
		/** Complete the calculation in order to test the final number */
		summ = 10 - (summ%10);

		/** Print out the answer message for the two possibilities */
		System.out.print((summ == 10)?("\n\n\tThe ISBN-13 number is" + first12 + "0" ):
						              ("\n\n\tThe ISBN-13 number is" + first12 + summ)); 
		break;
		default:
			System.out.print("\n\n\t" + first12 + "is an invalid input");
		}//closing switch statement

		input.close();
	}//closing the main method


}//closing the class_5_47
