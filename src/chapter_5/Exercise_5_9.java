package chapter_5;


/**    ************* Description of the Exercise_5_9 *************
 * 
 * 		(Find the two highest scores) Write a program that prompts the user to enter the
 * 		number of students and each student’s name and score, and finally displays the
 * 		student with the highest score and the student with the second-highest score.
 * 		
 * 
 * 		@author lucasmaximo
 *  
 * */



/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_9 */
public class Exercise_5_9 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		//create the object Scanner to absorb the user insertion
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		//Print out the message to the user enter the number of students 
		System.out.print("\n\n\tEnter the number of students: ");
		int numberStudents = input.nextInt();
		
		String name = " ";
		String best = " ", secondBest = " ";
		int score = 0;
		int highest = 0, secondHighest = 0;
		
		
		//open for loop to absorb all the informations of the students
		for(int i = 1; i <= numberStudents; i++) {
			System.out.print("\n\tInsert the student Name: ");
			name = input1.nextLine();
			System.out.print("\tInsert " + name + " score's: ");
			score = input.nextInt();
			
			//open if statement in order to test names and choose the best player
			if(score > highest) {
				best = name;
				highest = score;
			}else if (score > secondHighest) {
				secondBest = name;
				secondHighest = score;
			}else{
				
			}//closing if statement
		
			
		}//close for loop
		
		System.out.print("\n\n\tThe student with the highest score was -> " + best + " with " + highest + " points of score ");
		System.out.print("\n\n\tThe student with the highest score was -> " + secondBest+ " with " + secondHighest + " points of score ");
		
		input.close();
		input1.close();

		
	}//closing the main method


}//closing the class_5_9
