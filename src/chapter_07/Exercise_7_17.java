package chapter_07;
/** 
 * 
 * 
 * 			(Sort students) Write a program that prompts the user to enter the number of students,
 * 			the students’ names, and their scores, and prints student names in decreasing
 * 			order of their scores.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_17 */
public class Exercise_7_17{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input	  = new Scanner(System.in);
		Scanner inputName = new Scanner(System.in);

		/** Print out the message to be the user guide */
		System.out.print("\n\n\tInsert the number of students -> ");
		
		/** Created the variable to absorb the number of students and the varibale array of the students names and scores */
		int 		studentsNumber 	= input.nextInt();
		String 	[]  studentsNames 	= new String[studentsNumber];
		double 	[] 	studentScore 	= new double[studentsNames.length];
		
		int i = 0;
		
		while(i < studentsNumber ) {
			System.out.print("\n\tInsert student name number " + (i+1) + " -> " );
			studentsNames [i] = inputName.nextLine();
			System.out.print("\n\tInsert student score " + (i+1) + " -> " );
			studentScore [i] = input.nextDouble();
			i++;
		}
		
		sortArrays(studentsNames, studentScore);
		
		for(int t = studentsNames.length-1; t >= 0 ; t--) {
			System.out.print("\n\tStudent " + studentsNames[t] + " score -> " + studentScore[t]);
		}
		
	}//closing the main method

	/** Created the method in order to organize the arrays */
	public static void sortArrays(String [] names, double [] myArray) {
		

		//Creating a variable b, array, to receive myArray.
		double [] scores = myArray;
		String [] name = names;
		
		//Create the algorithm 
		for (int j = 0; j <= scores.length-2; j++) {
			
			for (int i = 0; i <= scores.length-j-2; i++) {
				
				if(scores[i] > scores[i+1]) {
					double tempScore = scores[i];
					String tempNames = name[i];
					
					scores[i] = scores[i+1];
					name[i] = names[i+1];
							
					scores[i+1] = tempScore;
					name[i+1] = tempNames;
				}//close if
				
			}//close for 
			
		}//close for
		
		myArray = scores;
		names = name;
		
	}

}//closing the class_7_17
