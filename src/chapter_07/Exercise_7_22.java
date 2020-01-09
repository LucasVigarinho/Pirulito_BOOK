package chapter_07;
/** 
 * 		(Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 * 		on a chessboard such that no two queens can attack each other (i.e., no two queens
 * 		are on the same row, same column, or same diagonal). There are many possible
 * 		solutions. Write a program that displays one such solution. A sample output is
 * 		shown below:
 * 	
 * 		|Q| | | | | | | |
 * 		| | | | |Q| | | |
 * 		| | | | | | | |Q|
 * 		| | | | | |Q| | |
 * 		| | |Q| | | | | |
 * 		| | | | | | |Q| |
 * 		| |Q| | | | | | |
 * 		| | | |Q| | | | |	
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Random;

/** Creating the class named Exercise_7_22 */
public class Exercise_7_22{

	private int queen;

	public Exercise_7_22(int queen) {
		this.queen = queen;
	}


	public  int getQueen() {
		return queen;
	}


	public void setQueen(int queen) {
		this.queen = queen;
	}


	/** Creating the main method */
	public static void main(String[] arg) {


		Exercise_7_22 v = new Exercise_7_22(8);

		//Created the necessary variables
		char [][] chessBoard = new char [8][8];


		//Calling the startGame
		startEightQuuens(chessBoard, v.getQueen());
		//create a for loop in order to test all the letters
		//close for loop
		//print out the messages 

		printBoard(chessBoard);


	}//closing the main method

	/** Created the start Eight Queens game method, to fill all the board Randomly with the Queens */
	public static void startEightQuuens(char [][] chessBoard, int queen) {

		Exercise_7_22 v = new Exercise_7_22(8);

		/** Created the main for loop to verify all the lines */
		for(int a = 0; a < chessBoard.length; a++) {

			/** Created the nested for loop to verify all the columns on each line */
			for(int b = 0; b < chessBoard.length; b++) {

				//created the if statement in order to utilize the while only for those situations where has a queen
				if(((columnTest(chessBoard, a, b) == true) && (rowTest(chessBoard, a, b) == true) && (diagonalTest(chessBoard, a, b) == true) ) )		{

					chessBoard[a][b] = randomQueen();
					v.setQueen(v.getQueen()-1);

				}else {

					chessBoard[a][b] = ' ';

				}//closing if statement which is responsible to verify if is possible have a queen in this place

				//in order to subtract the quantity necessary of Queens in the game EIGHT

			}//closing nested for loop
		}//closing main for loop
		
	}//closing the start Eight Queens game method

	/** Created the method to guess if goes queen or not */
	public static char randomQueen() {
		//create the necessary objects
		Random r = new Random();
		int guess = r.nextInt(5);
		//		System.out.print(guess);
		if(guess == 0) {
			return ' ';
		}else {
			return 'Q';
		}

	}//closing method
	/** Created a boolean method to verify if there is no Queen in the same Column */
	public static boolean columnTest(char [][] chessBoard, int a, int b) {

		int count = 0;

		/** Created the main for loop to verify all the lines */
		for(int c = 0; c < chessBoard.length; c++) {

			//Created an if statement in order to count if more them one Queen in this column
			if(chessBoard[c][b] == 'Q') {
				count++;

			}//closing if statement that is going to count how many Queens are in this lane


		}//closing main for loop

		//Create an if statement in order to to give the final answer if there are more them one Queen
		if (count > 0) {
			return false;
		}else {
			return true;
		}//closing if statement

	}//closing columnTest

	/** Created a boolean method to verify if there is no Queen in the same Row */
	public static boolean rowTest(char [][] chessBoard, int a, int b) {
		int count = 0;

		/** Created the main for loop to verify all the lines */
		for(int c = 0; c < chessBoard.length; c++) {

			//Created an if statement in order to count if more them one Queen in this row
			if(chessBoard[a][c] == 'Q') {
				count++;
			}//closing if statement that is going to count how many Queens are in this lane



		}//closing main for loop

		//Create an if statement in order to to give the final answer if there are more them one Queen
		if (count > 0) {
			return false;
		}else {
			return true;
		}//closing if statement

	}//closing rowTest

	/** Created a boolean method to verify if there is no Queen in the same Diagonal */
	public static boolean diagonalTest(char [][] chessBoard, int a, int b) {

		int index = a - b;
		int count = 0;



		/** First verify diagonal to the right - equals sum column and row */
		/** Created the main for loop to verify all the lines */
		for(int c = 0; c < chessBoard.length; c++) {


			/** Created the nested for loop to verify all the columns on each line */
			for(int d = 0; d < chessBoard.length; d++) {

				//Created an if statement in order to count if more them one Queen in this row
				if(  (((index == (c - d))) ||  ((a + b) == (c + d)))  && (chessBoard[c][d] == 'Q') ) {
					count++;
				}else  {

				}

			}//closing nested for loop

		}//closing nested for loop


		//Create an if statement in order to to give the final answer if there are more them one Queen
		if (count > 0) {
			return false;
		}else {
			return true;
		}//closing if statement

	}//closing diagonalTest

	/** Created a print method in order to print the board */
	public static void printBoard(char [][] chessBoard) {


		//print the visual space
		System.out.print("\n\n\t");
		//created a main for loop in order to print each ball
		for(int a = 0; a < chessBoard.length; a++) {
			//print the visual space
			System.out.print("\n\t|");
			//created a nested for loop in order to print every slot of each ball 
			for(int b = 0; b < chessBoard.length; b++) {
				System.out.print(chessBoard[a][b] + "|" );
			}//closing nested for loop
		}//closing main for loop 
	}

}//closing the class_7_22
