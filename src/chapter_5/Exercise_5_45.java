package chapter_5;



/**    ************* Description of the Exercise_5_45 *************
 * 
 * 
 * 		(Statistics: compute mean and standard deviation) In business applications, you
 * 		are often asked to compute the mean and standard deviation of data. The mean is
 * 		simply the average of the numbers. The standard deviation is a statistic that tells
 * 		you how tightly all the various data are clustered around the mean in a set of data.
 * 		For example, what is the average age of the students in a class? How close are the
 * 		ages? If all the students are the same age, the deviation is 0.
 * 		Write a program that prompts the user to enter ten numbers, and displays the
 * 		mean and standard deviations of these numbers using the following formula:
 * 
 * 
 * 		Here is a sample run:
 * 
 * 		Enter ten numbers: 1 2 3 4.5 5.6 6 7 8 9 10
 * 		The mean is 5.61
 * 		The standard deviation is 2.99794
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;


/** Creating the class named Exercise_5_45 */
public class Exercise_5_45 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);
		DecimalFormat df2 = new DecimalFormat("####.00");
		DecimalFormat df5 = new DecimalFormat("####.00000");

		//creating the necessary variables
		double [] numbers = new double [10];
		double summ = 0;
		int quantNumb = 0;
		double average = 0, deviation =0;

		
		//print out the interaction with the user, in order to absorb the numbers
		System.out.print("\n\n\tEnter ten numbers: ");
		
		//creating an while loop in order to populate the array 
		while(quantNumb < 10) {
			numbers[quantNumb] = input.nextDouble();
			summ += numbers[quantNumb];
			quantNumb +=1;
			average = summ/quantNumb;
		}//closing the while loop
		

		System.out.print("\n\n\tThe mean is " + df2.format(average));
		
		//create the for loop for the second question
		for (int i = 9; i >= 0; i--) {
			deviation += Math.pow((numbers[i]-average),2);
		}//closing for loop
		
		System.out.print("\n\tThe standard deviation is " + df5.format(Math.sqrt(deviation/quantNumb)));

		input.close();
	}//closing the main method


}//closing the class_5_45
