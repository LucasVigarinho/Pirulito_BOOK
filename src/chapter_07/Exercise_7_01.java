package chapter_07;
/** 
 * 
 * 		(Assign grades) Write a program that reads student scores, gets the best score,
 * 		and then assigns grades based on the following scheme:
 * 
 * 		Grade is A if score is >= best - 10
 * 
 * 		Grade is B if score is Ú best - 20;
 * 
 * 		Grade is C if score is Ú best - 30;
 * 
 * 		Grade is D if score is Ú best - 40;
 * 
 * 		Grade is F otherwise.
 * 
 * 		The program prompts the user to enter the total number of students, then prompts
 * 		the user to enter all of the scores, and concludes by displaying the grades. Here
 * 		is a sample run:
 * 		
 * 		Enter the number of students: 4
 * 		Enter 4 scores: 40 55 70 58
 * 		Student 0 score is 40 and grade is C
 * 		Student 1 score is 55 and grade is B
 * 		Student 2 score is 70 and grade is A
 * 		Student 3 score is 58 and grade is B
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_01 */
public class Exercise_7_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		/** Print out the message to be a guide of the user interaction */
		System.out.print("\n\n\tEnter the number of students: ");
		/** Created the necessary variables */

		double best = 0;
		int studentsN = input.nextInt();
		double [] students = new double [studentsN];

		/** Print out the message to be a guide of the user interaction */
		System.out.print("\n\n\tEnter " + studentsN + " scores: ");
		//create a while loop in order to absorb all the students scores
		for(int l = 0; l < studentsN; l++) {
			students[l] = input.nextDouble();

			if(best < students[l]){
				best = students[l];

			}else {

			}

		}//closing while loop

		/** Print the students scores */
		for(int j = 0; j < studentsN; j++) {

			//print out the messages 
			System.out.print("\n\n\tStudent " + j + " score is " + students[j] + " and grade is " + grade(students[j], best));
		}//close for loop

		input.close();
	}//closing the main method

	/** Created the method in order to classificate the mark */
	public static char grade(double grade, double best) {

		char result = 'A';
		if(grade >= best - 10) {
			result = 'A';
		} else if (grade >= best - 20) {
			result = 'B';
		} else if (grade >= best - 30) {
			result = 'C';
		} else if (grade >= best - 40) {
			result = 'D';
		}else {
			result = 'F';
		}

		return result;
	}//clsoing the method


}//closing the class_7_01

