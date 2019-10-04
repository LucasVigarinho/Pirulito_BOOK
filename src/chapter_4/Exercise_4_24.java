package chapter_4;

/**    ************* Description of the Exercise_4_24 *************
 * 
 * 		(Order three cities) Write a program that prompts the user to enter three cities and
 * 		displays them in ascending order. Here is a sample run:
 * 
 * 
 * 		Enter the first city: Chicago
 * 		Enter the second city: Los Angeles
 * 		Enter the third city: Atlanta
 * 		The three cities in alphabetical order are Atlanta Chicago Los Angeles
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_24 */
public class Exercise_4_24 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//creating the object in order to give the opportunity to the user interact with the system
		Scanner input = new Scanner(System.in);

		//print out the interaction with the user
		System.out.print("\n\n\tEnter the first city: ");
		String city1 = input.nextLine();
		System.out.print("\n\n\tEnter the second city: ");
		String city2 = input.nextLine();
		System.out.print("\n\n\tEnter the third city: ");
		String city3 = input.nextLine();

		System.out.print("\n\n\tThe three cities in alphabetical order are ");
		ascend(city1, city2, city3);
	}//closing the main method

	//create the method in order to print the cities in ascendent order
	public static void ascend (String city1, String city2, String city3 ) {
		if (city1.charAt(0) < city2.charAt(0) &&  city1.charAt(0) < city3.charAt(0) &&
				city2.charAt(0) < city3.charAt(0)) {
			System.out.print(city1 + " " + city2 + " " + city3);

		}else if (city1.charAt(0) < city3.charAt(0) &&  city1.charAt(0) < city2.charAt(0) &&
				city3.charAt(0) < city2.charAt(0)) {
			System.out.print(city1 + " " + city3 + " " + city2);

		}else if(city2.charAt(0) < city1.charAt(0) &&  city2.charAt(0) < city3.charAt(0) &&
				city1.charAt(0) < city3.charAt(0)) {
			System.out.print(city2 + " " + city1 + " " + city3);

		}else if (city2.charAt(0) < city3.charAt(0) &&  city2.charAt(0) < city1.charAt(0) &&
				city3.charAt(0) < city1.charAt(0)) {
			System.out.print(city2 + " " + city3 + " " + city1);

		}else if (city3.charAt(0) < city1.charAt(0) &&  city3.charAt(0) < city2.charAt(0) &&
				city1.charAt(0) < city2.charAt(0)) {
			System.out.print(city3 + " " + city1 + " " + city2);
			
		}else {
			System.out.print(city3 + " " + city2 + " " + city1);
		}

	}//closing the method ascend

}//closing the class_4_24
