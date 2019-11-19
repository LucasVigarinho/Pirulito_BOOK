package chapter_7;
/** 
 * 
 * 		(Print distinct numbers) Write a program that reads in ten numbers and displays
 * 		the number of distinct numbers and the distinct numbers separated by exactly one
 * 		space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 * 		Read a number and store it to an array if it is new. If the number is already in the
 * 		array, ignore it.) After the input, the array contains the distinct numbers. Here is
 * 		the sample run of the program:
 * 		
 * 		Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 * 		The number of distinct number is 6
 * 		The distinct numbers are: 1 2 3 6 4 5
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_05 */
public class Exercise_7_05{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		/** Print out the message to be a guide for the user interaction */
		System.out.print("\n\n\tEnter ten numbers: -> ");

		/** Created the variables necessary to manipulate and absorb the inserction */
		int [] numbers = new int [10];
		int num = 0;
		int count = 0;
		int loopDo = 0;


		/** Created the do loop to absorb all the integers */
		do {
			num = input.nextInt();

			if(arrayNotRepetedN(numbers, num)) {
				numbers[count++] = num;
			}

			loopDo++;
		}while(loopDo < 10);

		System.out.print("\n\n\tThe number of distinct number is -> " + count);

		printOutArray((numbers));

		input.close();
	}//closing the main method

	/** creating a method in order to print the array numbers */
	public static void printOutArray(int [] numbersArray) {

		/** Printing out the rsults */
		System.out.print("\n\n\tMy Array numbers -> " );
		for(int m = 0; m < numbersArray.length; m++) {
			System.out.print(" " + ((numbersArray[m] != 0)?numbersArray[m]: " "));

		}//closing for loop main
	}//closing printOutArray method

	/** Created a method in order to verify if the numbers are noto repeted */
	public static boolean arrayNotRepetedN(int [] numbersArray, int number) {

		/** Created a for loop nested to check the numbers already in the array */
		for(int j = 0; j < numbersArray.length; j++) {

			if(number == numbersArray[j]) {
				return false;
			}

		}//closing for loop nested

		return true;
	}//closing arrayNotRepetedN method

}//closing the class_7_05
