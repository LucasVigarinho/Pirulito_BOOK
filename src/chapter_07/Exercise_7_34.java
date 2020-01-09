package chapter_07;
/** 
 * 		(Sort characters in a string) Write a method that returns a sorted string using the
 * 		following header:
 * 
 * 		public static String sort(String s)
 * 
 * 		For example, sort("acb") returns abc.
 * 		Write a test program that prompts the user to enter a string and displays the sorted
 * 		string.
 * 
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_34 */
public class Exercise_7_34{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		//print out the message to be the user guide in order to input the necessary String which is going to be sorted
		System.out.print("\n\n\tInsert a String to be sorted \t-> ");
		
		//created the variable to absorb the String sorted
		String nonSorted = input.nextLine();
		
		//print out the result
		System.out.print("\n\tThe String sorted is \t\t-> "+ sort(nonSorted));
		
		input.close();
	}//closing the main method

	/** Created a method sort in order to organize the String */
	public static String sort(String s) {
		
		/**Created a variable to absorb the String dividing in array position */
		int [] myArray = new int[s.length()];
		
		/** Created a for loop in order to populate all positions of the arrays */
		for(int a = 0; a < myArray.length; a++) {
			
			//first populate all the positions with integers numbers of which character from the ascii table
			myArray[a] = (int) s.charAt(a);
		
		}//closing for loop
		
		
		
		//Create the algorithm bubble sort to organize the integers ascii numbers representing all the character
		for (int j = 0; j <= myArray.length-2; j++) {
			
			for (int i = 0; i <= myArray.length-j-2; i++) {
				
				if(myArray[i] > myArray[i+1]) {
					int temp = myArray[i];
					myArray[i] = myArray[i+1];
					myArray[i+1] = temp;
					
				}//close if
				
			}//close for 
			
		}//close for
		
		String sorted = "";
		/** Created a for loop in order to populate all positions of the arrays */
		for(int b = 0; b < myArray.length; b++) {
			//change the integer value of each position for character back and build the string
			String temp = String.valueOf((char)(myArray[b]));
			
			sorted += temp + "";//sum the new string for all new character
		}//closing for loop
		
		
		
		return sorted;//return the sorted String
	}
}//closing the class_7_34
