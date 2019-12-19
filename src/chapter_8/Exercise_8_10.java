package chapter_8;
/** 
 * 			
 * 		(Largest row and column) Write a program that randomly fills in 0s and 1s into
 * 		a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 * 		most 1s. Here is a sample run of the program:
 * 
 * 		0011
 * 		0011
 * 		1101
 * 		1010
 * 		The largest row index: 2
 * 		The largest column index: 2
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_8_01 */
public class Exercise_8_10{

	/** Creating the main method */
	public static void main(String[] arg) {

		//created the necessary variable array 4-by-4
		int [][] matrix = new int [4][4];
		int countRow = 0, countColumn = 0, lastCountRow = 0, lastCountColumn  = 0, row = 0, column = 0;

		

		//created a for loop in order to fill the array created
		for(int a = 0; a < matrix.length; a++) {
			//created a nested for loop in order to fill all the positions of the matrix and count the numbers of 1's
			for(int b = 0; b < matrix[a].length; b++) {
				matrix[a][b] = (int) (Math.random()*2);
			}//closing nested for loop
		}//closing main for loop

		printArray(matrix);

		//created a for loop in order to fill the array created
		for(int c = 0; c < matrix.length; c++) {
			//created a nested for loop in order to fill all the positions of the matrix and count the numbers of 1's
			for(int d = 0; d < matrix[c].length; d++) {

				//created an if statement to count numbers of one in the row
				if(matrix[c][d] == 1) {
					countRow++;
				}//closing if statement

				//created an if statement to count numbers of one in the row
				if(matrix[d][c] == 1) {
					countColumn++;
				}//closing if statement

			}//closing nested loop

			//created an if statement in order to check the sum of row
			if(countRow > lastCountRow) {
				lastCountRow = countRow;
				countRow = 0;
				row = c;
			}else {
				countRow = 0;
			}//closing if for the row

			//created an if statement in order to check the sum of columns
			if(countColumn > lastCountColumn) {
				lastCountColumn = countColumn;
				countColumn = 0;
				column = c;
			}else {
				countColumn = 0;
			}//closing if for the columns

		}//closing main for loop

		System.out.print("\n\n\tThe largest row index: " + row);
		System.out.print("\n\n\tThe largest column index: " + column);
	}//closing the main method


	public static void printArray(int matrix[][]) {
		System.out.print("\n\t");
		//created a for loop in order to fill the array created
		for(int a = 0; a < matrix.length; a++) {
			//created a nested for loop in order to fill all the positions of the matrix and count the numbers of 1's
			for(int b = 0; b < matrix[a].length; b++) {
				System.out.print(matrix[a][b] + " ");
			}//closing nested for loop
			System.out.print("\n\t");

		}//closing main for loop


	}

}//closing the class_8_10

