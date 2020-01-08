package chapter_1;


/** 
 * 
 (Approximate) pi can be computed using the following formula:
 * 
 * p = 4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11...)
 *  
 * Write a program that displays the result of 
 * 
 * 		4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11...)
 * 
 * and  
 * 
 * 		4 * (1 - 1/3+1/5 - 1/7+1/9 - 1/11 + 1/13...)
 * 
 *  	Use 1.0 instead of 1 in yourprogram.
 * 							
 * */
public class Exercise_1_07{

	/** Constructor not utilized */
	public Exercise_1_07() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables for the first range of denominators
		int count1 = 12;
		double pi1 = 0;
		double den1 = 1;
		
		//Creating the for loop to define the limite of the denominator and the odd numbers
		for (int x = 0; x < count1; x++) {

			//if statement to the even part
			if (x % 2 == 0) {
				pi1 = pi1 + (1 / den1);
			}//close if
			//else statement to the odd part
			else {
				pi1 = pi1 - (1 / den1);
			}//close else
			//increasing the denominator
			den1 = den1 + 2;
		}//close first for
		
		//Multiplying for four
		pi1 = pi1 * 4;
		
		//Creating the necessary variables for the second range of denominators
		int count2 = 14;
		double pi2 = 0;
		double den2= 1;
		
		//Creating the for loop to define the limite of the denominator and the odd numbers
		for (int x = 0; x < count2; x++) {
			//if statement to the even part
			if (x % 2 == 0) {
				pi2 = pi2 + (1 / den2);
			}//closing if  
			//else statement to the odd part
			else {
				pi2 = pi2 - (1 / den2);
			}//closing else
			
			//increasing the denominator
			den2 = den2 + 2;
		}//closing second for
		
		//Multiplying for four
		pi2 = pi2 * 4;
		
		//printing the results out
		System.out.println("The result of π till denominator 11 is = " + pi1);
		System.out.println("The result of π till denominator 13 is = " + pi2);
		System.out.println("The resulto of π from java libray is   = " + Math.PI);
		

	}//close main method

}//close class Exercise_1_7
