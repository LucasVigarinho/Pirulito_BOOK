package chapter_6;


/** 
 * 
 * 		(Generate random characters) Use the methods in RandomCharacter in Listing
 * 		6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
 * 
 * @author lucasmaximo
 *
 */

import java.util.Random;

/** Created the exerciese_6_38 class*/
public class Exercise_6_38 {


	/** Created the main method */
	public static void main(String [] args) {
		/** Creating the necessary variable */
		int count = 0;

		System.out.print("\n\n\t");
		/** Creating a for loop calling the methods following the instruction */
		for (int i = 0; i < 200; i++) {
			if(i < 100) {
				System.out.print(upperLetters());
				count++;
			}else {
				System.out.print(digit());
				count++;
			}
			if(count % 10 == 0 && i != 0) {
				System.out.print("\n\n\t");
			}

		}


	}//closing the main method

	/** Created the method following the instructions */
	public static char upperLetters() {

		/** Created the necessary variables */
		Random r = new Random();
		/** Created a do loop in order to crate the random letter uppercase */
		int letter = '0';
		do{
			letter = r.nextInt(90)+64;

		}while(letter < 65 || letter >90);

		char letterT = (char) letter;

		return letterT;

	}//close the method

	/** Created the method following the instructions */
	public static char digit() {

		/** Created the necessary variables */
		Random r = new Random();
		/** Created a do loop in order to crate the random letter uppercase */
		int letter = '0';
		do{
			letter = r.nextInt(57)+47;
		}while(letter < 48 || letter > 57);


		char letterT = (char) letter;

		return letterT;


	}//close the method
}//closing the exercise_6_38 class
