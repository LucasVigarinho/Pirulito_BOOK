package chapter_8;
/** 
 * 
 * 		
 * 			(Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
 * 			students in increasing order of the number of correct answers.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_8_03 */
public class Exercise_8_03{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Students' answers to the questions
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		// Key to the questions
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int [][] studentGrades = new int [2][8];
		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			studentGrades[0][i] = i+1;
			studentGrades[1][i] = correctCount;
		}
		//printed description of the printed values
		System.out.println("\n\n\tPrinting before organized \n");
		
		//calling method in order to print before organization
		printMultArray(studentGrades);
		
		//printed description of the printed values
		System.out.println("\n\n\tPrinting after organized (increasing)\n");
		
		//calling method in order to print after organization
		printMultArray(organizeArray(studentGrades));
	
		
	}//closing the main method

	/** Created a method to organize the array numbers - bubble sort and create new array with the right size */
	public static int [][] organizeArray(int[][] myArray) {

		int [][] a = myArray;


		//Create the algorithm 
		for (int j = 0; j < a.length; j++) {

			for (int i = 0; i <= 8-j-2; i++) {
	
				if(a[1][i] > a[1][i+1]) {
					int temp1 = a[1][i];
					a[1][i] = a[1][i+1];
					a[1][i+1] = temp1;
					int temp0 = a[0][i];
					a[0][i] = a[0][i+1];
					a[0][i+1] = temp0;

				}//close if

			}//close for 

		}//close for

		return a ;
	}//closing organize array Method


	/** Created a method in order to print a multidimensional array */
	public static void printMultArray(int [][] myArray) {
		for(int a = 0; a < 8; a++) {
			System.out.println("Student " + myArray[0][a] + "'s correct count is " +
					myArray[1][a]);
		}
		
	}//closing multidimensional array print method
	

}//closing the class_8_03

