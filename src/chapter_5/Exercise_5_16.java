package chapter_5;


/**    ************* Description of the Exercise_5_16 *************
 * 
 * 		(Find the factors of an integer) Write a program that reads an integer and displays
 * 		all its smallest factors in increasing order. For example, if the input integer is
 * 		120, the output should be as follows: 2, 2, 2, 3, 5.
 * 
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_16 */
public class Exercise_5_16 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		//creating the Scanenr object
		Scanner input = new Scanner(System.in);
		
		//create the necessary variables
		System.out.print("\n\n\tInsert the integer number to be anilysed -> ");
		int number = input.nextInt();
		int count = 1;
		System.out.print("\n\n\t");
		
		do{
			if(number % count == 0  && count != 1) {
				System.out.print(count + ", ");
				number /= count;
			}else {
				count++;
			}
			
		}while(number / count  != 1);
		
		System.out.println(number + ".");
	}//closing the main method


}//closing the class_5_16
