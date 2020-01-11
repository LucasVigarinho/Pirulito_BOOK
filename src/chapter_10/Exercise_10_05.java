package chapter_10;

/** 
 * 		(Displaying the prime factors) Write a program that prompts the user to enter
 * 		a positive integer and displays all its smallest factors in decreasing order. 
 * 		
 * 		For example, 
 * 
 * 					if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 		2. 
 * 
 * 		Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * 		retrieve and display them in reverse order.	
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
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
 * 
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_10_05 */
public class Exercise_10_05{

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

		smallFactor(value, test);
		System.out.print("\n\n\t");

		System.out.print(toString(retrieve(test)));


		input.close();
	}//closing the main method
	public static void smallFactor(int value, StackOfIntegers test) {
		int count = 1;

		do{
			if(value % count == 0  && count != 1) {

				test.push(count);
				value /= count;
			}else {
				count++;
			}

		}while(value / count  != 1);
		test.push(value);
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



}//closing the Exercise_10_05 method (used as driver method)



class StackOfIntegers{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	/** Construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}

	/** Construct a stack with the specified maximum capacity */
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	/** Push a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	/** Return and remove the top element from the stack */
	public int pop() {
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return elements[size - 1];
	}

	/** Test whether the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int getSize() {
		return size;
	}
}
