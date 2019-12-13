package chapter_8;
/** 
 * 
 * 		(Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * 		in the major diagonal in an n * n matrix of double values using the following
 * 		header:
 * 
 * 		public static double sumMajorDiagonal(double[][] m)
 * 
 * 		Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 * 		elements on the major diagonal. Here is a sample run:
 * 		
 * 		Enter a 4-by-4 matrix row by row:
 * 		1 2 3 4.0
 * 		5 6.5 7 8
 * 		9 10 11 12
 * 		13 14 15 16
 * 		Sum of the elements in the major diagonal is 34.5
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_02 */
public class Exercise_8_02{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		
		
		System.out.print(solution (268));
		input.close();
	}//closing the main method


	public static int solution(int N){
		boolean isNegative = false;

		if (N < 0){
			isNegative = true;
			N = N * (-1);
		}

		int[] intTab = String.valueOf(N).chars().map(Character::getNumericValue).toArray();
		int[] newNumber = new int[intTab.length + 1];

		if (isNegative){
			newNumber[0] = 5;
			for (int i = 0; i < intTab.length; i++){
				newNumber[i + 1] = intTab[i];
			}
		}else{
			for (int i = 0; i < intTab.length; i++){
				if (5 > intTab[i]){
					newNumber[i] = 5;

					for (int j = i; j < intTab.length; j++){
						newNumber[j + 1] = intTab[j];
					}
					break;
				}else{
					newNumber[i] = intTab[i];
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < newNumber.length; i++){
			sb.append(newNumber[i]);
		}
		
		int retorno = Integer.parseInt(sb.toString());
		return isNegative ? (retorno * (-1)) : retorno;
	}
        

}//closing the class_8_02

