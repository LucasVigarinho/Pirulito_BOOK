package chapter_06;
/** 
 * 
 * 
 * 		(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
 * 		n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 * 		Write a method with the following header that returns a pentagonal number:
 * 
 * 		public static int getPentagonalNumber(int n)
 * 
 * 		Write a test program that uses this method to display the first 100 pentagonal
 * 		numbers with 10 numbers on each line.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_6_01 */
public class Exercise_6_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		System.out.print("\n\t");
		//create a for loop in order to test all the letters
		for(int i = 1; i <= 100; i++) {
		
			System.out.print((i%10==0)?"\n\t":getPentagonalNumber(i) + "\t");

		}//close for loop
		//print out the messages 
		
		input.close();
	}//closing the main method

	/** Method defined on the instructions */
	public static int getPentagonalNumber(int n) {
		n = (n * (3*n-1))/2;
		
		return n;
		
	}//closing method getPentagonal

}//closing the class_6_01

