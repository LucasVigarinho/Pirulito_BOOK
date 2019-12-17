package chapter_8;
/** 
 * 
 * 		(Game: connect four) Connect four is a two-player board game in which the
 * 		players alternately drop colored disks into a seven-column, six-row vertically
 * 		suspended grid, as shown below.		
 * 		
 * 		The objective of the game is to connect four same-colored disks in a row, a column,
 * 		or a diagonal before your opponent can do likewise. The program prompts
 * 		two players to drop a red or yellow disk alternately. In the preceding figure, the
 * 		red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 * 		is dropped, the program redisplays the board on the console and determines the
 * 		status of the game (win, draw, or continue). Here is a sample run:
 * 
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		———————————————
 * 		Drop a red disk at column (0–6): 0
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		|R| | | | | | |
 * 		———————————————
 * 		Drop a yellow disk at column (0–6): 3
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		|R| | |Y| | | |
 * 		. . .
 * 		. . .
 * 		. . .
 * 		Drop a yellow disk at column (0–6): 6
 * 		| | | | | | | |
 * 		| | | | | | | |
 * 		| | | |R| | | |
 * 		| | | |Y|R|Y| |
 * 		| | |R|Y|Y|Y|Y|
 * 		|R|Y|R|Y|R|R|R|
 * 		———————————————
 * 		The yellow player won
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_20{

	/** Creating the main method */
	public static void main(String[] arg) {


		//create the necessary objects
		Scanner input = new Scanner (System.in);

		int option = 0;

		//printing out the first line of the game
		System.out.print("\n\n\t************** Game: connect four *************");

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
		int [][] board = new int [6][7];
		int column = 0;
		boolean turn = false, game = false, win = false;

		//print the start game using the empty board

		printMatrix(board);

		//created a do loop in order to give opportunity for two players
		do {

			//print out the message to start the game
			System.out.print("\n\n\t" + ((turn)?"Player 2 - Drop a red disk at column (0–6):":"Player 1 - Drop a yellow disk at column (0–6): "));
			column = input1.nextInt();



			//created an if statement in order to fill the position with the right player mark
			if(turn) {
				board[rowPosition(board, column)][column] = 1;
				turn = false;
			}else {
				board[rowPosition(board, column)][column] = 2;
				turn = true;
			}//closing if statement

			//printing the board game situation
			printMatrix(board);

			win = isConsecutiveFour(board);
			game = positions(board);

		}while(!win && !game);

		System.out.print((turn)?"\n\n\tPlayer 1 - YOU WIN\n\n":"\n\n\tPlayer 2 - YOU WIN\n\n");

		input1.close();
	}//closing new game method 

	/** Created a method in order to verify if the table game is full */
	public static boolean positions(int [][] matrix) {
		int count = 0;
		//created a main for loop in order to verify the rows of the matrix
		for(int a = 0; a < matrix.length; a++) {
			//created a nested for loop in order to verify the columns of the matrix
			for(int b = 0; b < matrix[a].length; b++) {

				if(matrix[a][b] != 0) {
					count++;
				}else {

				}

			}//closing the nested for loop 

		}//closing the main for loop 

		if(count > ((matrix.length * matrix.length)-1)){
			return true;
		}else {
			return false;
		}

	}//closing method

	/** Created a method in order to drop the disk in the right position*/
	public static int rowPosition(int[][] board, int column) {

		/** Created a for loop in order to check if the position has already a disk to insert a new disk */
		for(int w = board.length - 1; w >= 0; w-- ) {
			//created a if statement in order to return the first position of the specific column which is empty
			if(board[w][column] != 0) {
			}else {
				return w;
			}
		}//closing for loop 
		return 0;
	}//closing method

	/** Created a method in order to test a matrix, if n number has repeated minimum of 4 times followed in a row, column or diagonals */
	public static boolean isConsecutiveFour(int[][] values) {

		//created the necessary variables
		int countRow1 = 1, countColumn1 = 1, countDiagonal1 = 1, countSubDiagonal = 1;
		int lastNRow = 0, lastNColumn = 0, lastNDiagonal = 0, lastNSubDiagonal = 0;


		/** Created a main for loop in order to verify all the rows */
		for (int c = 0; c < values.length; c++) {
			for(int d = 0; d < values[c].length; d++) {
				//testing the rows repeated numbers
				if(values[c][d] == lastNRow && values[c][d] != 0) {
					countRow1++;
				}else {
					lastNRow = values[c][d];
					countRow1 = 1;
				}


				//created an if statement in order to test if has any winner
				if(countRow1 == 4 ) {
					return true;
				}else {


				}//closing if statement

			}//closing nested for loop

		}//closing main for loop


		/** Created a main for loop in order to verify all the columns */
		for (int c = 0; c < values.length; c++) {
			for(int d = 0; d < values.length; d++) {
				
				//testing the columns repeated numbers
				if(values[d][c] == lastNColumn && values[d][c] != 0) {
					countColumn1++;
				}else {
					lastNColumn = values[d][c];
					countColumn1 = 1;
				}

				//created an if statement in order to test if has any winner
				if(countColumn1 == 4) {
					return true;
				}else {


				}//closing if statement

			}//closing nested for loop

		}//closing main for loop


		/** Created a for loop in order to test the diagonal values */
		for(int e = 0; e < values.length; e++) {

			//created an if statement in order to test the diagonal properly
			if(values[e][e] == lastNDiagonal && values[e][e] != 0) {
				countDiagonal1++;
			}else {
				lastNDiagonal= values[e][e];
				countDiagonal1 = 1;
			}
			//created an if statement in order to test if has any winner
			if(countDiagonal1 == 4) {
				return true;
			}else {


			}//closing if statement


		}//closing the for loop of diagonal test

		/** Created a for loop in order to test the sub diagonal values */
		for(int f = 0; f < values.length; f++) {
			for(int g = values.length-1; g >= 0; g--) {
				//created an if statement in order to test the diagonal properly
				if(values[f][g] == lastNSubDiagonal && values[f][g] != 0) {
					countSubDiagonal++;
				}else {
					lastNSubDiagonal = values[f][g];
					countSubDiagonal = 1;
				}
				//created an if statement in order to test if has any winner
				if(countSubDiagonal == 4) {
					return true;
				}else {


				}//closing if statement
			}

		}//closing the for loop of sub diagonal test

		return false;
	}//closing test matrix method called isConsecutive four


	/** Created a method to print the values positions of the Matrix array*/
	public static void printMatrix(int [][] matrix) {

		//printing the first part of the matrix
		System.out.print("\n\n\t");
		for(int t = 0; t < matrix[0].length; t++) {
			System.out.print("   " + t);
		}
		System.out.print("\n\t  ");
		for(int x = 0; x < matrix[0].length ; x++) {
			System.out.print("————");
		}

		//created a main for loop in order to print the rows of the matrix
		for(int a = 0; a < matrix.length; a++) {

			System.out.print("\n\t" + a +" | ");
			//created a nested for loop in order to print the columns of the matrix
			for(int b = 0; b < matrix[a].length; b++) {

				if(matrix[a][b] == 0) {
					System.out.print(" " + " | ");
				}else {
					if(matrix[a][b] == 2) {
						System.out.print("Y" + " | ");
					}else {
						System.out.print("R" + " | ");
					}

				}


			}//closing the nested for loop 

			//printing the first part of the matrix array

		}//closing the main for loop 
		System.out.print("\n\t  ");
		for(int q = 0; q < matrix[0].length ; q++) {
			System.out.print("————");
		}
	}//closing method print matrix

}//closing the class_8_01

