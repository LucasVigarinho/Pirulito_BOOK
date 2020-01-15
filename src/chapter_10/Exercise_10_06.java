package chapter_10;

import java.util.Scanner;

/** 
 * 	(Displaying the prime numbers) Write a program that displays all the prime
 * 	numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * 	to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * 	reverse order.
 * 	The MyPoint class			
 * 
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.

 * 			|						StackOfIntegers  					|
 * 			|-----------------------------------------------------------|	
 * 			| - elements: int[]  				  						|
 * 			| - size: int		  										|
 * 			|-----------------------------------------------------------|
 * 			| + StackOfIntegers()										|
 * 			| + StackOfIntegers(capacity: int)							|
 * 			| + empty(): boolean										|	
 * 			| + peek(): int												|
 * 			| + push(value: int): void									|
 * 			| + pop(): int												|
 * 			| + getSize(): int											|
 * 			|___________________________________________________________| 
 */

/** Necessary imports */
import chapter_10.Exercise_10_05;

/** Creating the class named Exercise_10_06 */
public class Exercise_10_06{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Create the necessary object */
		Scanner input = new Scanner(System.in);

		/** Write a program that prompts the user to enter
		 * 	a positive integer and displays all its smallest factors in decreasing order. */
		/**	For example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2, 2. */

		System.out.print("\n\n\tInsert the positive integer to be analysed -> ");
		int value = input.nextInt();
		StackOfIntegers test = new StackOfIntegers();

		primeNumbers(value, test);
		System.out.print("\n\n\t");

		System.out.print(toString(retrieve(test)));


		input.close();
	}//closing the main method
	public static void primeNumbers(int value, StackOfIntegers test) {

		for (int i = 2; i < value; i++) {

			boolean flag = true;
			
			if (i == 2) { 
				flag = true;
			}else if (i == 0 || i == 1 || i % 2 == 0) { 
				flag = false; 
			}
			for (int c = 3; i <= Math.sqrt(i); c++) {
				if (i % c == 0) { 
					flag = false; 
				}
			}
			
			if(flag == true) {
				test.push(i); 
			}else {

			}
		}
	}

	public static int [] retrieve(StackOfIntegers test){

		int [] temp = new int [test.getSize()];
		for(int a = 0; a < temp.length; a++) {
			temp [a] = test.pop();
			
		}
		return temp;
	}


	public static String toString(int [] test) {
		System.out.print("\n\n\t");
		String s = "";
		for(int b = 0; b < test.length ; b++) {
			if(b == test.length-1) {
				s += (test[b]);
			}else {
				s += (test[b] + ", ");
			}
		}
		return s;
	}

}//closing the Exercise_10_06 method (used as driver method)




