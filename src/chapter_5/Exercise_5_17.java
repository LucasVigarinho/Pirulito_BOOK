package chapter_5;


/**    ************* Description of the Exercise_5_17 *************
 * 
 * 		(Display pyramid) Write a program that prompts the user to enter an integer from
 * 		1 to 15 and displays a pyramid, as shown in the following sample run:
 * 
 * 
 * 		Enter the number of lines: 7
 * 					    1
 * 					  2 1 2
 * 					3 2 1 2 3
 * 				  4 3 2 1 2 3 4
 * 			    5 4 3 2 1 2 3 4 5
 * 			  6 5 4 3 2 1 2 3 4 5 6
 * 			7 6 5 4 3 2 1 2 3 4 5 6 7
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_17 */
public class Exercise_5_17 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the object Scanner
		Scanner input = new Scanner(System.in);
		//print out the message to let the user know the necessary interaction
		System.out.print("\n\n\tEnter the number of lines: ");
		//create the necessary variables
		int number = input.nextInt();


		//creating auxiliary variables
		int a = number;
		int r = 2;
		
		//creating a for loop which is going to define which number are going to be printed
		for (int q = 1; q <= number; q++) {
			
			//creating a first nested for loop to print the first part of the pyramid to be printed from number to 1
			for(int w = number; w > 0 ; w--) {
				
				//open the if statement to define the number lower them the number of the first for loop to be printed
				if(w <= q) {
					System.out.print(a-- + " ");
				//the negative part of the first question, has to print the necessary spaces
				}else {
					System.out.print("  ");//printing the spaces
					a--;//Subtracting the auxiliary variable during the spaces, until the positive answer for the if statement
				}//clsoing if statement
					
			}//closing for loop
			
			//creating the second nested for loop to print the second part of the pyramid from 2 to number
			for(int k = 1; k <= number ; k++) {
				
				//open the if statement to define the number lower them the number of the first for loop to be printed
				if(k < q) {
					System.out.print(r++ + " ");
				}//closing if statement
			}//closing for loop
			
			//starting again the auxiliary variables
			r = 2;
			a = number;
			
			//print junping a line
			System.out.println();	
			
		}//closing the maun for loop
		input.close();
	
	}//closing the main method


}//closing the class_5_17
