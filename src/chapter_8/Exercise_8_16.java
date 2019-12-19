package chapter_8;
/** 
 * 
 * 		
 * 		(Sort two-dimensional array) Write a method to sort a two-dimensional array
 * 		using the following header:
 * 
 * 		public static void sort(int m[][])
 * 
 * 		The method performs a primary sort on rows and a secondary sort on columns.
 * 		For example, the following array
 * 
 * 		{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * 
 * 		will be sorted to
 * 
 * 		{{1, 1},
 * 		 {1, 2},
 * 		 {1, 7},
 * 		 {4, 1},
 * 		 {4, 2},
 * 		 {4, 5}}.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_8_01 */
public class Exercise_8_16{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Created a multidimensional array using the values tester from the initial instructions
		int[][] matrix = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

		//printing out the matrix before sort it
		print(matrix);
		// call the method in order to sort the multidimensional array
		sort(matrix);
		//printing out the matrix after sort it
		print(matrix);

	}

	// Created a method following the initial introduction sorting the row and the columns  */
	public static void sort(int [][] matrix) {

		//created an array in order to absorb values and check in each loop
		int[] min = new int[2];

		//created a main for loop in order to run each row
		for (int row = 0; row < matrix.length - 1; row++) {
			//absorb the value of the position in the matrix put into the simple array to be tested
			min[0] = matrix[row][0]; 
			min[1] = matrix[row][1]; 
			//created the index row
			int index = row;

			//created the nested for loop in order to check all the columns from each row and test the positions from the simple array created 
			for (int i = row + 1; i < matrix.length; i++) {

				//created an if statement to test the first and the second position in comparison to the columns 0  and the column 1 following the example in the instruction
				if (matrix[i][0] <= min[0] && (matrix[i][0] < min[1] || matrix[i][1] < min[0] || matrix[i][1] < min[1])) { 
					min[0] = matrix[i][0];
					min[1] = matrix[i][1];
					index = i;
				}//closing if statement
			}//closing nested for loop

			//if the index of the row is different them the row it self, change positions values
			if (index != row){
				matrix[index][0] = matrix[row][0];
				matrix[index][1] = matrix[row][1];
				matrix[row][0] = min[0];
				matrix[row][1] = min[1]; 
			}//closing if statement
		}//closing main for loop
	}//closing sort method

	/** Created a method in order to print the matrix multidimensional */
	public static void print(int [][]matrix) {
		System.out.print("\n\n\t");
		// Display sorted array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n\t");
		}
	}

}//closing the class_8_16

