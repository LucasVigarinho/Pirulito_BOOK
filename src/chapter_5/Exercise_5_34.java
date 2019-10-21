package chapter_5;



/**    ************* Description of the Exercise_5_34 *************
 * 
 * 		(Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * 		plays the scissor-rock-paper game. Revise the program to let the user continuously
 * 		play until either the user or the computer wins more than two times than its
 * 		opponent.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Random;
import java.util.Scanner;


/** Creating the class named Exercise_5_34 */
public class Exercise_5_34 {

	/** Automatic generated main method */
	public static void main(String[] args) {

		//creating the necessary variables
		int computer = 0;
		int userCount = 0;
		int compCount = 0;

		Scanner in = new Scanner(System.in);


		//present the name of the game
		System.err.println("\n\n\t************** THE SCISSOR-ROCK-PAPER GAME!!!! **************");
		//The program prompts the user to enter a number 0, 1, or 2 
		System.out.print("\n\n\tEnter a number - Scissor (0) - Rock (1) - Paper (2) : ");
		
		while(compCount < 2 && userCount < 2) {

			int user = in.nextInt();

			//The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
			Random rand = new Random();
			computer = rand.nextInt(3);

			//create an if to displays a message indicating whether the user or the computer wins, loses, or draws.
			if (user == 0 && computer==1) {
				System.out.println("\n\tThe computer is rock." +" You are scissor. " + " - You loose");
				compCount+=1;
			}else if (user == 0 && computer==2) {
				System.out.println("\n\tThe computer is Paper." + " and " +" You are Scissor. " + " - You won");
				userCount+=1;
			}else if (user == 1 && computer==0) {
				System.out.println("\n\tThe computer is scissor." +" You are rock. " + " - You won");
				userCount+=1;
			}else if (user == 1 && computer==2) {
				System.out.println("\n\tThe computer is paper." +"You are rock. " + " - You loose");
				compCount+=1;
			}else if (user == 2 && computer==0) {
				System.out.println("\n\tThe computer is scissor." +" You are paper. " + " - You loose");
				compCount+=1;
			}else if (user == 2 && computer==1) {
				System.out.println("\n\tThe computer is rock." +" You are paper. " + " - You won");
				userCount+=1;
			}else if (user == 0 && computer==0) {
				System.out.println("\n\tThe computer is scissor." +" You are scissor. " + " - It is a draw");
 
			}else if (user == 1 && computer==1) {
				System.out.println("\n\tThe computer is rock."+" You are rock. " + " - It is a draw");				

			}else if (user == 2 && computer==2) {
				System.out.println("\n\tThe computer is paper." +" You are paper too. " + " - It is a draw");
			}
		}
		
		//closing input
		in.close();	

		System.out.print("\n\n\t" + ((userCount>compCount)?"You won!" + userCount + " times":"The computer won!" + compCount + " times"));

	}//close main method


}//closing the class_5_34
