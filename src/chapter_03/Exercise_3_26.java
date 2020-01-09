package chapter_03;



/**
 * 
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
 * of this program:
 * 
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 * 
 */

/** Defining the main class*/
public class Exercise_3_26 {

	/** Defining the constructor of the class */
	public Exercise_3_26() {
		
	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
	
		int x = 10;
		int y = x % 5;
		int z = x % 6;
		
		boolean ans = false;
		
		if(y == 0 && z == 0) {
			ans = true;
		}
		System.out.print("\n\n\tIs 10 divisible by 5 and 6? " + ans);
		
		if(y == 0 || z == 0) {
			ans = true;
		}
		System.out.print("\n\n\tIs 10 divisible by 5 or 6? " + ans);
		
		if(y == 0 ^ z == 0) {
			ans = true;
		}
		System.out.print("\n\n\tIs 10 divisible by 5 or 6,  but not both? " + ans);
	}//closing the main method

}//closing class exercise_3_26
