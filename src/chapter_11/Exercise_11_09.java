package chapter_11;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * 		into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * 		most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * 		the most 1s.) Here is a sample run of the program:
 * 
 * 		Enter the array size n: 4
 * 		The random array is
 * 		0011
 * 		0011
 * 		1101
 * 		1010
 * 		The largest row index: 2
 * 		The largest column index: 2, 3
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */


/** Created the main class, using the name of the package (11) and the exercise (09) in a compose name */
public class Exercise_11_09 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		RandomMatrix test = new RandomMatrix(4);
		
		
		System.out.println(Arrays.toString( test.analyseMatrix()));
		
		int [][] matrix = {{0, 0, 1, 1},
				 		   {0, 0, 1, 1},
				 		   {1, 1, 0, 1},
				 		   {1, 0, 1, 0} };
		
		RandomMatrix test2 = new RandomMatrix(matrix);
		
		System.out.println(Arrays.toString( test2.analyseMatrix()));

	}//closing the mains method

	
}//closing class exercise_11_09		

/** (Largest rows and columns) Write a program that randomly fills in 0s and 1s
 * 		into an n-by-n matrix, prints the matrix, and finds the rows and columns with the
 * 		most 1s. (Hint: Use two ArrayLists to store the row and column indices with
 * 		the most 1s.) Here is a sample run of the program: */

class RandomMatrix{
	
	private int [][] matrix;
	
	RandomMatrix(int [][] matrix){
		this.matrix = matrix;
	}
	
	RandomMatrix(int size){
		matrix = new int [4][4];
		for(int row = 0; row < matrix.length; row++) {
			for(int column = 0; column < matrix[row].length; column++  ) {
				matrix[row][column] = (int) (Math.random()* 2);
			}//closing nested for loop (column)
		}//closing main for loop (row)
	}//closing constructor
	

	
	public int [] analyseMatrix (){
		
		int [] answer = new int [2];
		int lastCountRow = 0;
		int lastCountColumn = 0;
		
		for(int row = 0, column2 = 0;  row < matrix.length; column2++, row++) {
			int tempCountRow = 0;
			int tempCountColumn = 0;
			for(int column = 0, row2 = 0; column < matrix[row].length; row2++, column++  ) {
				tempCountRow += matrix[row][column];
				if(lastCountRow < tempCountRow) {
					lastCountRow = tempCountRow;
					answer [0] = row;
				}			
				tempCountColumn += matrix[column2][row2];
				if(lastCountColumn < tempCountColumn) {
					lastCountColumn = tempCountColumn;
					answer [1] = column;
				}
			}//closing nested for loop (column)	
		}//closing main for loop (row)	
		return answer;
	}//closing analyseMatrix method
	
}













