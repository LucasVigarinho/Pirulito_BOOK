package chapter_8;
/** 
 * 			
 * 
 * 		(Sum elements column by column) Write a method that returns the sum of all the
 * 		elements in a specified column in a matrix using the following header:
 * 
 * 		public static double sumColumn(double[][] m, int columnIndex)
 * 		
 * 		Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * 		column. Here is a sample run:
 * 
 * 		Enter a 3-by-4 matrix row by row:
 * 		1.5 2 3 4
 * 		5.5 6 7 8
 * 		9.5 1 3 1
 * 		Sum of the elements at column 0 is 16.5
 * 		Sum of the elements at column 1 is 9.0
 * 		Sum of the elements at column 2 is 13.0
 * 		Sum of the elements at column 3 is 13.0
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);



		System.out.print(solution("apple", "aear"));
		input.close();
	}//closing the main method


	



	public static int solution(String A, String B) {
		char cA = A.charAt(0);
		char cB = B.charAt(0);
		int count = 0;
		char [] repet = new char [A.length() + B.length()];

		for(int a = 0; a < A.length(); a++){

			for(int b = 0; b < B.length();b++) {

				if(A.charAt(a) == B.charAt(b)){
					count++;
				}else{

				}
			}
			if(count == 0) {
				repet[a] = A.charAt(a);
			}else if (count > 1) {
				repet[a] = A.charAt(a);
			}
			count = 0;
		}
		
		for (int c = 0; c < repet.length; c++) {
			if(repet[c] > 0) {
				count++;
			}
		}
		return count;
	}


}//closing the class_8_01

