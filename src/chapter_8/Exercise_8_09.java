package chapter_8;
/** 
 * 		
 * 		(Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 * 		marking an available cell in a 3 * 3 grid with their respective tokens (either
 * 		X or O). When one player has placed three tokens in a horizontal, vertical, or
 * 		diagonal row on the grid, the game is over and that player has won. A draw (no
 * 		winner) occurs when all the cells on the grid have been filled with tokens and
 * 		neither player has achieved a win. Create a program for playing tic-tac-toe.
 * 		The program prompts two players to enter an X token and O token alternately.
 * 		Whenever a token is entered, the program redisplays the board on the
 * 		console and determines the status of the game (win, draw, or continue). Here
 * 		is a sample run:
 * 		
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		
 * 		Enter a row (0, 1, or 2) for player X: 1
 * 		Enter a column (0, 1, or 2) for player X: 1
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		|   | X |   |
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		
 * 		Enter a row (0, 1, or 2) for player O: 1
 * 		Enter a column (0, 1, or 2) for player O: 2
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		|   | X | O |
 * 		——————-——————
 * 		|   |   |   |
 * 		——————-——————
 * 		
 * 		Enter a row (0, 1, or 2) for player X:
 * 		. . .
 * 		——————-——————
 * 		| X |   |   |
 * 		——————-——————
 * 		| O | X | O |
 * 		——————-——————
 * 		|   |   | X |
 * 		——————-——————
 * 
 * 		X player won
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_09 */
public class Exercise_8_09{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		int option = 0;

		//printing out the first line of the game
		System.out.print("\n\n\t*************** TIC-TAC-TOE - GAME **************");

		/** Print out the menu Game */
		System.out.print("\n\t*************************************************");
		System.out.print("\n\t* Option 1 - Start New Game \t\t\t*");
		System.out.print("\n\t* Option 2 - Exit Game\t\t\t\t*");
		System.out.print("\n\t*************************************************");
		System.out.print("\n\tType here your option -> ");
		option = input.nextInt(); //using the variable option to absorb the user input during UI (User Interaction).

		/** Created the switch statement in order to make the menu of the game interact with the user options */
		switch(option) {
		/** OPTION 1 */
		/** In the option 1 the new game is going to be started using one random category */
		case(1):
			/** calling new game in order to start the game */
			System.out.print("\n\n\t************** STARTING A NEW GAME **************");
		newGame();
		break;
		case(2):
			System.err.print("\n\n\t\t\tTHE END");
		break;
		default:
			System.out.print("wrong choice");

		}
		input.close();
	}//closing the main method
	/** Created a method to start a new game following the category chosen */
	public static void newGame() {

		//create the necessary objects
		Scanner input1 = new Scanner (System.in);

		//created the necessary board game using a matrix of 3 by 3
		int [][] board = new int [3][3];
		int positions = 0, row = 0, column = 0;
		boolean turn = false, ticTacToe = true;

		//print the start game using the empty board
		printTicTacToe(board);

		//created a do loop in order to give opportunity for two players
		do {

			//created a do loop in order to give the opportunity to the player play again if the position was already marked
			do {

				//printing out the player turn
				System.out.print("\n\n\t" + ((turn == false)?"Player 1 - make your mark":"Player 2 - make your mark"));

				//print out the message to start the game
				System.out.print("\n\n\t" + ((turn)?"Enter a row (0, 1, or 2) for player X: ":"Enter a row (0, 1, or 2) for player O: "));
				row = input1.nextInt();
				System.out.print("\n\t" + ((turn)?"Enter a column (0, 1, or 2) for player X: ":"Enter a column (0, 1, or 2) for player O: "));
				column = input1.nextInt();

			}while(board[row][column] != 0 );

			//created an if statement in order to fill the position with the right player mark
			if(turn) {
				board[row][column] = 1;
				turn = false;
			}else {
				board[row][column] = 2;
				turn = true;
			}//closing if statement

			//printing the board game situation
			printTicTacToe(board);
			positions++;
			ticTacToe = testeTicTacToe(board);

		}while(positions < 8 && ticTacToe);

		System.out.print((turn)?"\n\n\tPlayer 1 - YOU WIN\n\n":"\n\n\tPlayer 2 - YOU WIN\n\n");

		input1.close();
	}//closing new game method 

	/** Created a method in order to test the tic tac toe game, if any player won */
	public static boolean testeTicTacToe(int[][] matrix) {

		//created the necessary variables
		int countRow1 = 0, countColumn1 = 0, countDiagonal1 = 0;
		int countRow2 = 0, countColumn2 = 0, countDiagonal2 = 0;

		/** Created a main for loop in order to verify all the rows */
		for (int c = 0; c < matrix.length; c++) {
			for(int d = 0; d < matrix[c].length; d++) {
				if(matrix[c][d] == 1) {
					countRow1++;
				}else if(matrix[c][d] == 2) {
					countRow2++;
				}
				if(matrix[d][c] == 1) {
					countColumn1++;
				}else if(matrix[d][c] == 2) {
					countColumn2++;
				}

			}//closing nested for loop
			//created an if statement in order to test if has any winner
			if(countRow1 == 3 || countRow2 == 3 || countColumn1 == 3 || countColumn2 == 3) {
				return false;
			}else {
				countRow1 = 0;
				countRow2 = 0;
				countColumn1 = 0;
				countColumn2 = 0;
			}//closing if statement
		}//closing main for loop

		/** Created a for loop in order to test the diagonal values */
		for(int e = 0; e < matrix.length; e++) {

			//created an if statement in order to test the diagonal properly
			if(matrix[e][e] == 1) {
				countDiagonal1++;
			}else if(matrix[e][e] == 2){
				countDiagonal2++;
			}

		}//closing the for loop of diagonal test

		if(countDiagonal1 == 3 || countDiagonal2 == 3) {
			return false;
		}else {
			return true;
		}

	}//closing tic tac toe method
	/** Created a method to print the results of the table tic tac toy */
	public static void printTicTacToe(int [][] matrix) {

		//printing the first part of the game
		System.out.print("\n\n\t    0   1   2");
		System.out.print("\n\t  ——————-——————");

		//created a main for loop in order to print the rows of the game
		for(int a = 0; a < matrix.length; a++) {

			System.out.print("\n\t" + a +" | ");
			//created a nested for loop in order to print the columns of the game
			for(int b = 0; b < matrix[a].length; b++) {
				if(matrix[a][b] == 0) {
					System.out.print(" " + " | ");
				}else {
					System.out.print(((matrix[a][b] == 1)? "X":"O") + " | ");
				}


			}//closing the nested for loop 

			//printing the first part of the game
			System.out.print("\n\t  ——————-——————");
		}//closing the main for loop 
	}//closing method print tic-tac-toe
}//closing the class_8_09

