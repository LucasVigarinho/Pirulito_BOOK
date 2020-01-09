package chapter_05;




/**    ************* Description of the Exercise_5_32 *************
 * 
 * 		(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two digit
 * 		number. The two digits in the number are distinct. (Hint: Generate the first
 * 		digit. Use a loop to continuously generate the second digit until it is different
 * 		from the first digit.)
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;
import java.util.Random;

/** Creating the class named Exercise_5_32 */
public class Exercise_5_32 {

	/** Creating the main method */
	public static void main(String[] args) {
		// Generate a lottery number
		Random rn = new Random();
		
		int lottery1 = (int) rn.nextInt(10) + 1;
		int lottery2 = (int) rn.nextInt(10) + 1;
		
		for(boolean x = false; x != true; x = false) {
			
			if(lottery2 != lottery1 && lottery1 != 0 && lottery2 != 0 && lottery1 != 10 && lottery2 != 10 ) {
				x = true;
				break;
			}
			lottery1 = (int) rn.nextInt(10) + 1;
			lottery2 = (int) rn.nextInt(10) + 1;
			
		}//closing for loop
	
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n\tEnter your lottery pick (two digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery1 / 10;
		int lotteryDigit2  = lottery1 % 10;


		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

		// Check the guess
		if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");

		else
			System.out.println("Sorry, no match");

		input.close();

	}//closing the main method


}//closing the class_5_32
