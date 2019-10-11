package chapter_5;


/**    ************* Description of the Exercise_5_18 *************
 * 
 * 		(Display four patterns using loops) Use nested loops that display the following
 * 		patterns in four separate programs:
 * 		Pattern A 		Pattern B 			Pattern C 			Pattern D
 * 		1 				1 2 3 4 5 6 				1 			1 2 3 4 5 6
 * 		1 2 			1 2 3 4 5 				  2 1 			1 2 3 4 5
 * 		1 2 3 			1 2 3 4 			    3 2 1 			1 2 3 4
 * 		1 2 3 4 		1 2 3 				  4 3 2 1 			1 2 3
 * 		1 2 3 4 5 		1 2 				5 4 3 2 1 			1 2
 * 		1 2 3 4 5 6 	1 				  6 5 4 3 2 1 			1
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_18 */
public class Exercise_5_18 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the object to absorb the useri insertions

		Scanner input = new Scanner(System.in);
		//printing out the message to let the user interact 
		System.out.print("\n\n\tDefine the size of the patterns -> ");
		int number = input.nextInt();

		//create the necessary variables
		System.out.print("\n\n\tPattern A 		Pattern B 	    	  Pattern C 		Pattern D");
		System.out.print("\n\t");

		int pB = number; //Auxiliary of Pattern B variable
		int pD = number; //Auxiliary of Pattern D variable

		//open the first and main for loop, to define the size of all patterns
		for (int i = 1; i <= number; i++) {

			/**************** PATTERN A ****************/

			//open the first nested for loop (PATERN A)
			for(int a = 1; a <= number; a++) {

				//create the if statement of the PATERN A
				if(a <= i) {
					System.out.print(a + " ");
				}//closing if statement
				
			}//closing first nested for loop (PATERN A)

			//open an if statement to support the right space between patterns
			if(i <= 3) {
				System.out.print("\t\t\t");
			}else {
				System.out.print("\t\t");
			}//close if statement

			/**************** PATTERN B ****************/

			//open the second nested for loop (PATERN B)
			for(int b = 1; b <= pB; b++) {
				//print out the right sequence of the inverted pyramid using the auxiliary PATERN B variable
				System.out.print( b + " ");
			}//closing second nested for loop (PATERN B)
			pB--;//subtraction of the pattern B variable

			
			//open an if statement to support the right space between patterns
			if(i <= 3) {
				System.out.print("\t\t");
			}else {
				System.out.print("\t\t\t");
			}//close if statement


			/**************** PATTERN C ****************/

			//open the third nested for loop (PATERN C)
			for(int c = number; c >= 1; c--) {
				////create the if statement of the PATERN C
				if(c <= i) {
					System.out.print( c + " ");
				}else{
					System.out.print("  ");
				}//closing if statement
			}//closing third nested for loop (PATERN C)

			//printing out space support
			System.out.print("\t\t");

			/**************** PATTERN D ****************/

			//open the third nested for loop (PATERN D), utilizing variable support
			for(int c = 1; c <= pD; c++) {
				//printing out the correct numbers, utilizing the support of the pattern D variable
				System.out.print( c + " ");
			}//closing third nested for loop (PATERN D)
			pD--;//Subtracting from the variable support

			//printing out space support
			System.out.print("\n\t");
		}//closing the main for loop

	}//closing the main method


}//closing the class_5_18
