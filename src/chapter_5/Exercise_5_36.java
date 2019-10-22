package chapter_5;

import java.util.Scanner;

/**    ************* Description of the Exercise_5_36 *************
 * 
 * 		(Business application: checking ISBN ) Use loops to simplify Programming
 * 		Exercise 3.9.
 * 
 * 
 * testing 3.9
 * 
 *  * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 * 
 * 					Enter the first 9 digits of an ISBN as integer: 013601267
 * 					The ISBN-10 number is 0136012671
 * 
 * 					Enter the first 9 digits of an ISBN as integer: 013031997
 * 					The ISBN-10 number is 013031997X
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */



/** Creating the class named Exercise_5_36 */
public class Exercise_5_36 {

	/** Creating the main method */
	public static void main(String[] arg) {


		Scanner input = new Scanner(System.in);

		System.out.print("\n\n\tEnter the first 9 digits of an ISBN as integer:");
		String nineDigits = input.nextLine();
		

		

		int d10 = 0;

		for(int x = 0; x < 9; x++ ) {
			d10 += Integer.parseInt(nineDigits.charAt(x) + "") * (x+1);
		}
		d10 %= 11;

		
		if (d10==10){
			System.out.print("\n\n\tThe ISBN-10 number is ");
			for(int c = 0; c < 9; c++) {
				System.out.print(nineDigits.charAt(c));
			}
			System.out.print("X");
		}else {
			System.out.print("\n\n\tThe ISBN-10 number is ");
			for(int c = 0; c < 9; c++) {
				System.out.print((nineDigits.charAt(c)));
			}
			System.out.print(d10);
		}




		input.close();





	}//closing the main method


}//closing the class_5_36
