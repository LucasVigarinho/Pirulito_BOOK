package chapter_3;

import java.util.Scanner;


/** 
 * 
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 had 31 days.
 * 
 * */

public class Exercise_3_11{

	/** Constructor not utilized */
	public Exercise_3_11() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {


		//Activate the scanner packet 
		Scanner input = new Scanner (System.in);

		//Give the first moment to the user insert which month indicating by number
		System.out.print("\n\n\tEnter the number which represents the month: ");
		int month = input.nextInt();
		int days = 0;

		//Give the second moment to the user insert which year indicating by number
		System.out.print("\n\n\tEnter the number which represents the year: ");
		int year = input.nextInt();
		
		//create a boolean true or false to help identify the Leap Years	
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		//Start the Switch statement to indicate numbers of the days by month,  the , that depends on the leap years.  
		switch (month) {
		case 1: days = 31; break;
		case 2: if (isLeapYear) days = 29;
		else days = 28; break;
		case 3:days = 31; break;
		case 4: days = 30; break;
		case 5: days = 31; break;
		case 6: days = 30; break;
		case 7: days = 31; break;
		case 8: days = 31; break;
		case 9: days =30; break;
		case 10: days =31; break;
		case 11: days = 30; break;
		case 12: days = 31; break;
		default:
		}
		//Starting the if statement to change the number of the month to the name
		if ((int) month == 1) {
			System.out.println("\n\n\tJanuary" + " " + year + " had " + days + " days");	
		}
		else if ((int) month == 2) {
			System.out.println("\n\n\tFebruary" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 3) {
			System.out.println("\n\n\tMarch" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 4) {
			System.out.println("\n\ntApril" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 5) {
			System.out.println("\n\ntMay" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 6) {
			System.out.println("\n\n\tJune" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 7) {
			System.out.println("\n\n\tJuly" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 8) {
			System.out.println("\n\n\tAugust" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 9) {
			System.out.println("\n\n\tSeptember" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 10) {
			System.out.println("\n\n\tOctober" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 11) {
			System.out.println("\n\n\tNovember" + " " + year + " had " + days + " days");
		}
		else if ((int) month == 12) {
			System.out.println("\n\n\tDecember" + " " + year + " had " + days + " days");
		}

		//close the scanner
		input.close();





	}//close main method

}//close class Exercise_3_11
