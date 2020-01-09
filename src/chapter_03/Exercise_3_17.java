package chapter_03;

import java.util.Random;
import java.util.Scanner;

/** 
 * 
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws. Here are sample runs:
 * 
 * 
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won
 * 
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 * 
 * 
 * */

public class Exercise_3_17{

	/** Constructor not utilized */
	public Exercise_3_17() {

	}//close constructor


	/** Automatic generated main method */
	public static void main(String[] args) {
		int computer;

		Scanner in = new Scanner(System.in);


		//present the name of the game
		System.err.println("\n\n\t************** THE SCISSOR-ROCK-PAPER GAME!!!! **************");
		//The program prompts the user to enter a number 0, 1, or 2 
		System.out.print("\n\n\tEnter a number - Scissor (0) - Rock (1) - Paper (2) : ");
		int user = in.nextInt();

		//The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
		Random rand = new Random();
		computer = rand.nextInt(3);

		//create an if to displays a message indicating whether the user or the computer wins, loses, or draws.
		if (user == 0 && computer==1) 
			System.out.println("\n\n\tThe computer is rock." +"You are scissor. " + " - You loose");

		else if (user == 0 && computer==2) 
			System.out.println("\n\n\tThe computer is Paper." + " and " +" You are Scissor. " + " - You won");

		else if (user == 1 && computer==0) 
			System.out.println("\n\n\tThe computer is scissor. " +"You are rock. " + " - You won");

		else if (user == 1 && computer==2) 
			System.out.println("The computer is paper. " +"You are rock. " + " - You loose");

		else if (user == 2 && computer==0) 
			System.out.println("\n\n\tThe computer is scissor. " +"You are paper. " + " - You loose");

		else if (user == 2 && computer==1) 
			System.out.println("\n\n\tThe computer is rock. " +"You are paper. " + " - You won");

		else if (user == 0 && computer==0) 
			System.out.println("\n\n\tThe computer is scissor. " +"You are scissor. " + " - It is a draw");

		else if (user == 1 && computer==1) 
			System.out.println("\n\n\tThe computer is rock. "+"You are rock. " + " - It is a draw");				

		else if (user == 2 && computer==2) 
			System.out.println("\n\n\tThe computer is paper. " +"You are paper too. " + " - It is a draw");

		//closing input
		in.close();	


	}//close main method

}//close class Exercise_3_17
