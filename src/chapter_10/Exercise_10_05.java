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
 * 		
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
 * 			|						StackOfIntegers  					|
 * 			|-----------------------------------------------------------|	
 * 			| - value: int   				  							|
 * 			| - storeFactors: int []		  							|
 * 			|-----------------------------------------------------------|
 * 			| + StackOfIntegers (value: int)							|
 * 			| + getStoreFactors(): int []								|
 * 			| + retrieve (getStoreFactores ())							|
 * 			| + toString() : void										|
 * 			|___________________________________________________________| 
 * */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_05{

	/** Creating the main method */
	public static void main(String[] arg) {

		do{
			if(number % count == 0  && count != 1) {
				System.out.print(count + ", ");
				number /= count;
			}else {
				count++;
			}
			
		}while(number / count  != 1);
		

	}//closing the main method

	

}//closing the Exercise_10_01 method (used as driver method)



