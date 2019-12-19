package chapter_8;
/** 
 * 
 * 		(Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking
 * 		whether every number is valid in the board. Rewrite the program by checking
 * 		whether every row, every column, and every small box has the numbers 1 to 9.
 * 		
 * 		tested valid solution: 	5 3 4 6 7 8 9 1 2 6 7 2 1 9 5 3 4 8 1 9 8 3 4 2 5 6 7 
 * 								8 5 9 7 6 1 4 2 3 4 2 6 8 5 3 7 9 1 7 1 3 9 2 4 8 5 6 
 * 								9 6 1 5 3 7 2 8 4 2 8 7 4 1 9 6 3 5 3 4 5 2 8 6 1 7 9
 *   
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_24 */
public class Exercise_8_24{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Read a Sudoku solution
		int[][] grid = readASolution();
		printSudoku(grid);
		System.out.println(isValid(grid) ? "\n\n\tValid solution" : "\n\n\tInvalid solution");
	}

	/** Read a Sudoku solution from the console */
	public static int[][] readASolution() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		//printing out the first line of the game
		System.out.print("\n\n\t**************** SUDOKU- GAME ****************");

		System.out.println("\n\n\tEnter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				grid[i][j] = input.nextInt();
		input.close();
		return grid;
	}

	/** Check whether a solution is valid */
	public static boolean isValid(int[][] grid) {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (grid[i][j] < 1 || grid[i][j] > 9  || !isValid(i, j, grid))
					return false;
		return true; // The solution is valid
	}

	/** Check whether grid[i][j] is valid in the grid */
	public static boolean isValid(int i, int j, int[][] grid) {
		// Check whether grid[i][j] is unique in i's row
		for (int column = 0; column < 9; column++)
			if (column != j && grid[i][column] == grid[i][j])
				return false;
		// Check whether grid[i][j] is unique in j's column
		for (int row = 0; row < 9; row++)
			if (row != i && grid[row][j] == grid[i][j])
				return false;

		// Check whether grid[i][j] is unique in the 3-by-3 box
		for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
			for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
				if (row != i && col != j && grid[row][col] == grid[i][j])
					return false;

		return true; // The current value at grid[i][j] is valid
	}

	/** Created a method to print the values positions of the Matrix array*/
	public static void printSudoku(int [][] matrix) {
		int countRow = 1;
		int countColumn = 1;
		//printing the first part of the matrix
		System.out.print("\n\n\t");
		for(int t = 0; t < matrix.length ; t++) {
			System.out.print("   " + (t+1));
		}
		System.out.print("\n\t  ");
		for(int x = 0; x < matrix.length ; x++) {
			System.out.print("————");
		}

		//created a main for loop in order to print the rows of the matrix
		for(int a = 0; a < matrix.length; a++) {

			System.out.print("\n\t" + a +" | ");
			//created a nested for loop in order to print the columns of the matrix
			for(int b = 0; b < matrix[a].length; b++) {
				if(countColumn % 3 == 0 && b != 0) {
					System.out.print(matrix[a][b] + " | ");
				}else {
					System.out.print(matrix[a][b] + "   ");
				}
				countColumn++;
			}//closing the nested for loop 

			//printing the first part of the matrix array
			System.out.print("\n\t  ");
			if(countRow % 3 == 0 && a != 0) {
				for(int q = 0; q < matrix.length ; q++) {
					System.out.print("————");
				}
			}
			countRow++;
			countColumn = 1;
		}//closing the main for loop 
		System.out.println("");
	}//closing method print matrix

}