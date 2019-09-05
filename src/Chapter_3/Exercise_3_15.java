package Chapter_3;

import java.util.Scanner;


/** 
 * 
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
 * number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 
 * 
 * 3.12 - Case Study: Lottery - Suppose you want to develop a program to play lottery. The program randomly generates a
 * lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
 * whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 * 
 * 
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 
 * 2. If all digits in the user input match all digits in the lottery number, the award is
 * $3,000.
 * 
 * 3. If one digit in the user input matches a digit in the lottery number, the award is
 * $1,000.
 * 
 * Enter your lottery pick (two digits): 15
 * The lottery number is 15
 * Exact match: you win $10,000
 * 
 * Enter your lottery pick (two digits): 45
 * The lottery number is 54
 * Match all digits: you win $3,000
 * 
 * Enter your lottery pick: 23
 * The lottery number is 34
 * Match one digit: you win $1,000
 * 
 * Enter your lottery pick: 23
 * The lottery number is 14
 * Sorry: no match
 * 
 * */

public class Exercise_3_15{

	/** Constructor not utilized */
	public Exercise_3_15() {

	}//close constructor


	/** Automatic generated main method */
	public static void main(String[] args) {


		// Generate a lottery number
		int lottery = (int)((Math.random() * 900)+100);

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("\n\n\t************** LOTTERY ************** ");
		System.out.print("\n\n\tEnter your lottery pick (three digits): ");
		int guess = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = (lottery / 10) % 10;
		int lotteryDigit3 = lottery % 10;

		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = guess % 10;


		System.out.println("\n\n\tThe lottery number is " + lottery);

		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if ((guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit3) && (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) && 
				guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2) {
			System.out.println("\n\n\tMatch all digits: you win $3,000");
		}

		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit1 == lotteryDigit3
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2
				|| guessDigit2 == lotteryDigit3
				|| guessDigit3 == lotteryDigit1
				|| guessDigit3 == lotteryDigit2
				|| guessDigit3 == lotteryDigit3) {
			System.out.println("\n\n\tMatch one digit: you win $1,000");

		}else {
			System.out.println("\n\n\tSorry, no match");
		}


		input.close();

	}//close main method

}//close class Exercise_3_15
