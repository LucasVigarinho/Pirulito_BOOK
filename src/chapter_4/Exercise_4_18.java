package chapter_4;

/**    ************* Description of the Exercise_4_18 *************
 * 
 * 		(Student major and status) Write a program that prompts the user to enter two
 * 		characters and displays the major and status represented in the characters. The first
 * 		character indicates the major and the second is number character 1, 2, 3, 4, which
 * 		indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * 		the following chracters are used to denote the majors:
 * 		M: Mathematics
 * 		C: Computer Science
 * 		I: Information Technology
 * 		Here is a sample run:		
 * 
 * 
 * 		Enter two characters: M1
 * 		Mathematics Freshman
 * 		
 * 
 * 		Enter two characters: C3
 * 		Computer Science Junior
 * 		
 * 		
 * 		Enter two characters: T3
 * 		Invalid input
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_18 */
public class Exercise_4_18 {

	/** Creating the main method */
	public static void main (String[] args) {

		//Creating the object in order to absorb the user insertions
		Scanner input = new Scanner(System.in);


		System.out.print("\n\n\tM: Mathematics, C: Computer Science and I: Information Technology ");
		System.out.print("\n\n\t1, 2, 3, or 4 indicates freshman, sophomore, junior, or senior ");
		System.out.print("\n\n\tEnter two characters: ");
		String letter1 = input.nextLine();
		char c1 = Character.toUpperCase(letter1.charAt(0));
		char c2 = Character.toUpperCase(letter1.charAt(1));


		boolean test = testing(c1, c2);


		if(test){
			
			switch(c1) {
			case('M'):
				System.out.print("\n\n\tMathematics ");
			break;
			case('C'):
				System.out.print("\n\n\tComputer Science ");
			break;
			case('I'):
				System.out.print("\n\n\tInformation Technology ");
			break;
			default:
				System.err.print("\n\n\t");

			}//closing switch statement

			switch(c2) {
			case('1'):
				System.out.print("freshman ");
			break;
			case('2'):
				System.out.print("sophomore ");
			break;
			case('3'):
				System.out.print("junior ");
			break;
			case('4'):
				System.out.print("senior ");
			break;
			default:
				System.err.print("\n\n\t");

			}//closing switch statement

		}else {
			System.err.print("\n\n\tInvalid input");

		}//closing if statement


	}//closing the main method

	public static boolean testing(char c1, char c2) {

		int count = 0;

		char [] array =  {'1', '2', '3', '4', 'M', 'C', 'I'};
		for(int i = 0; i < array.length; i++ ) {
			if(c1 == array[i] || c2 == array[i]) {
				count++;
			}else {

			}//closing fi statement

		}//closing for loop

		return count == 2 ? true : false;

	}//closing testing method

}//closing the class_4_18
