package chapter_03;

import java.util.Scanner;

/** 
 * 
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by
 * Christian Zeller to calculate the day of the week. The formula is
 * 
 * 					 26(m + 1)		  k     j
 * 			h = (q + --------- + k + --- + --- + 5j) % 7
 * 						10     		  4		4

 * 	where
 * 		
 * 		■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 * 		Wednesday, 5: Thursday, 6: Friday).
 * 		■ q is the day of the month.
 * 		■ m is the month (3: March, 4: April, …, 12: December). January and February
 * 		are counted as months 13 and 14 of the previous year.
 * 		■ j is the century (i.e., year 100).
 * 		■ k is the year of the century (i.e., year % 100).
 * 
 * 		Note that the division in the formula performs an integer division. Write a program
 * 		that prompts the user to enter a year, month, and day of the month, and
 * 		displays the name of the day of the week. Here are some sample runs:
 * 
 * 
 * 		Enter year: (e.g., 2012): 2015
 * 		Enter month: 1-12: 1
 * 		Enter the day of the month: 1-31: 25
 * 		Day of the week is Sunday
 * 
 * 
 * 		Enter year: (e.g., 2012): 2012
 * 		Enter month: 1-12: 5
 * 		Enter the day of the month: 1-31: 12
 * 		Day of the week is Saturday
 * 
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need
 * to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
 * the previous year.)
 * 
 * 
 * */
public class Exercise_3_21{

	/** Constructor not utilized */
	public Exercise_3_21() {
		
	}//close constructor
 
	/** Automatic generated main method */
	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
				System.out.print("\n\n\tEnter year: (e.g., 2012): ");
				int year = input.nextInt();
				System.out.print("\n\n\tEnter month: 1-12: ");
				int month = input.nextInt();
				System.out.print("\n\n\tEnter the day of the month: 1-31: ");
				int day = input.nextInt();
				
				
				int k = year % 100;
				int j = year / 100;
				int m = 0;
				
				if(month == 1) {
					m = 13;
				}else if (month == 2) {
					m = 14;
				}else {
					m = month;
				}
				int q = day;
				
				int h = (((q + (26 * (m + 1)/10) + k + (k / 4) + (j / 4 ) + (5 * j))) % 7);
				
				String dayW = null;
				
				switch(h) {
				case 0:
					dayW = "Saturday";
					break;
				case 1:
					dayW = "Sunday";
					break;
				case 2:
					dayW = "Monday";
					break;
				case 3:
					dayW = "Tuesday";
					break;
				case 4:
					dayW = "Wednesday";
					break;
				case 5:
					dayW = "Thursday";
					break;
				case 6:
					dayW = "Friday";
					break;
					default:
					
				}
				
				System.out.print("\n\n\tDay of the week is " + dayW);
				

				input.close();
		 
	}//close main method

}//close class Exercise_2_19

