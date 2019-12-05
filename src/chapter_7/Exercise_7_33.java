package chapter_7;
/** 
 * 
 * 		(Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
 * 		the animal names.
 * 		
 * 		Now let us write a program to find out the Chinese Zodiac sign for a given year. The
 * 		Chinese Zodiac is based on a twelve-year cycle, with each year represented by an animal—
 * 		monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep—in this cycle,
 * 		as shown in Figure 3.6.
 * 
 * 		Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900
 * 		% 12 is 4. Listing 3.9 gives a program that prompts the user to enter a year and displays the
 * 		animal for the year.
 * 
 * 							0: monkey
 * 							1: rooster
 * 							2: dog
 * 							3: pig
 * 							4: rat
 * 			year % 12 =		5: ox
 * 							6: tiger
 * 							7: rabbit
 * 							8: dragon
 * 							9: snake
 * 							10: horse
 * 							11: sheep
 * 		FIGURE 3.6 The Chinese Zodiac is based on a twelve-year cycle.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_33 */
public class Exercise_7_33{

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		/** Create an array with all the animal inside of which position of the array, using 12 positions 0 to 11 */
		String [] chineseZodiac =  {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "horse", "sheep"};
		/** Created a variable in order to verify the right position in the array, according with the year inserted by the user */
		int position = (year % 12);
		String animal = chineseZodiac[position];

		//print out the animal
		System.out.println(animal);

		//closing object
		input.close();

	}//closing the main method



}//closing the class_7_33
