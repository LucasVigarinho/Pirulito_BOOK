package chapter_6;

/**
 * 
 * 		(Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
 * 		and display the number of winning games.
 * 
 * @author lucasmaximo
 *
 */

/** 
 * 
 * 
 * 		(Game: craps) Craps is a popular dice game played in casinos. Write a program
 * 		to play a variation of the game, as follows:
 * 
 * 		Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * 		Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * 		lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * 		(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * 		a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * 
 * 		Your program acts as a single player. Here are some sample runs.
 * 
 * 		You rolled 5 + 6 = 11
 * 		You win
 * 
 * 
 * 		You rolled 1 + 2 = 3
 * 		You lose
 * 
 * 
 * 		You rolled 4 + 4 = 8
 * 		point is 8
 * 		You rolled 6 + 2 = 8
 * 		You win
 * 
 * 
 * 		You rolled 3 + 2 = 5
 * 		point is 5
 * 		You rolled 2 + 5 = 7
 * 		You lose
 * 
 * @author lucasmaximo
 *
 */
/** Import necessary libraries */
import java.util.Random;
import java.text.DecimalFormat;

/** Created the exercise_6_32 class */
public class Exercise_6_32 {

	/** Created the main method */
	public static void main (String[] args) {

		DecimalFormat df = new DecimalFormat("####");
		//print out visual 
		System.out.print("\n\n\t");
		double total = 10000.0;
		/** Created the necessary variables to manipulate inside the loops and to absorb the count record and calculate after all */
		int sum = 0, dice1 = 0, dice2 = 0;
		int wins = 0;
		
		
		//created the for loop in order to run the game 10000 times
		for(int i = 0; i < total; i++) {
			//created a do loop in order to the game make possible roll the dices limiting number summarized 
			do {
				//Roll the two dices 
				dice1 = rollDice();
				dice2 = rollDice();
				//summarize the two results
				sum = summ(dice1, dice2);
				//Print the two results of dices
				System.out.print("\n\tYou rolled " + dice1 + " + " + dice2);
				//print the summarize of the two dices
				System.out.print("\n\tpoint is " + sum);

			}while(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10);//define the numbers to stop the roll dices

			//give the result of the game 
			if((crapsGame(sum))){
				System.out.print("\n\t" + "You win"); 
				wins += 1;
			}else {
				System.out.print("\n\t" + "You lose");	
			}
		}//closing for loop
		
		System.out.print("\n\n\tTotal Games \t-> " + df.format(total)  + "\t" + df.format(((total/total)*100))  + "%" + 
						 "\n\tGames lose \t-> " + df.format(total-wins) + "\t\t " + df.format((((total-wins)/total)*100)) + "%" + 
						 "\n\tGames win \t-> " + wins + "\t\t " + df.format((((wins)/total)*100))  + "%");
		
	}//the main method closed

	/** Created the integer mehtod to summ the dice rolled and print the point */
	public static int summ(int dice1, int dice2) {

		return dice1+dice2;

	}//closing the summ method

	/** Created the boolean method to decide win or loose - for the game Craps */
	public static boolean crapsGame(int summ) {

		/** Created the boolean variable to absorb the boolean answer */
		boolean result = false;

		/** Created if statement to test if win or loose */
		if (summ == 2 || summ == 3 || summ == 12) {
			result = false;
		}else if (summ == 7 || summ == 11) {
			result = true;
		}//closed if statement

		return result;

	}//close boolean crapsGame
	/** Created the method to roll the dice */
	public static int rollDice() {
		/** Created the random object */
		Random diceys = new Random();
		/** Created integer variable to absorb the random rolled dices */
		int dic = diceys.nextInt(6)+1;

		return dic;
	}//the dices method rolled

}//exercise_6_32 class closed
