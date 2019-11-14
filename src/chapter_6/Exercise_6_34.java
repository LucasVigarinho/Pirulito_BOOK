package chapter_6;

import java.util.Scanner;

/** 
 * 
 * 		(Print calendar) Programming Exercise 3.21 uses Zeller’s congruence to calculate
 * 		the day of the week. Simplify Listing 6.12, PrintCalendar.java, using Zeller’s
 * 		algorithm to get the start day of the month.
 * 
 * 
 * @author lucasmaximo
 *
 */

public class Exercise_6_34 {

	/** Automatic generated main method */
	public static void main(String[] args) {

		/** Created object necessary to interact with the user */
		Scanner input = new Scanner(System.in);

		/** Print out the message to guide the user interaction */
		System.out.print("\n\n\tEnter year: (e.g., 2012): ");
		int year = input.nextInt();//absorb the user input year
		System.out.print("\n\n\tEnter month: 1-12: ");
		int month = input.nextInt();//absorb the user input month

		/** Call the method to prnt the specific month */
		printMonth(year, month);


	}

	/** Created the method to print the month, according to the others methods 
	 * to calculate start day and days of the month according to each year */
	public static void printMonth(int year, int month) {
		// Print the calendar header
		printMonthHeader(year, month);

		// Print the calendar body
		printMonthBody(year, month);
	}//closing print month method


	/** Created the method to print the header of the month, avoiding recoding */
	public static void printMonthHeader(int year, int month) {
		//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
		System.out.print("\n\n\t                    " + monthName(month) + year);
		System.out.print("\n\t---------------------------------------------------");
		System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat\n");
	}

	/** Created the method to set the right month */
	public static String monthName(int month) {
		String monthName = "";
		/** Created a switch statement which the months possibilities*/
		switch (month) {
		case 1: monthName  = "January"	; break;
		case 2: monthName  = "February"	; break;
		case 3: monthName  = "March"	; break;
		case 4: monthName  = "April"	; break;
		case 5: monthName  = "May"		; break;
		case 6: monthName  = "June"		; break;
		case 7: monthName  = "July"		; break;
		case 8: monthName  = "August"	; break;
		case 9: monthName  = "September"; break;
		case 10: monthName = "October"	; break;
		case 11: monthName = "November"	; break;
		case 12: monthName = "December"	;
		}

		return monthName;
	}
	
	/** Created the printMonthBody method in order to print the number sequence of the month, 
	 * following the start day and number of the day  */
	public static void printMonthBody(int year, int month) {
		// Get start day of the week for the first date in the month
		int startDay = startDay(year, month, 1);

		int day = 0;
		// Get number of days in the month
		int daysOfTheMonth = daysOfTheMonth(year, month);
		//print the firt space an the line jump to initiate the number printing o the month
		System.out.print("\n\t");
		//create a first for loop to print all the possibles lines or weeks of the month calendar according to the first day 
		for (int i = 0; i <= 5; i++) {

			//Create the nested for loop to print the days among the seven days of the week
			for (int j = 0; j <= 6; j++) {

				//first fi statement in order to define where the first day is going to be printed, using the variable day internal to the method
				//and the weekDay variable to define for how long the space is going to be printed.
				if(day == 0 && j < startDay) {
					System.out.print(" " + " " + "\t");

				}else {

					//nested if statement, for print the days after the internal variable day started counting, initiating the month
					if(day > daysOfTheMonth - 1 ) {

					}else {
						System.out.print(" " + (day+1) + "\t");
						day += 1;
					}//closing nested if statement
				}//closing main if statement
			}//closing nested for loop

			//support visual, jumping line and give the first necessary space for initiate every week that is going to be printed
			System.out.print("\n\t");

		}//closing main for loop

	}//closing printCalendar method


	
	/** Created the method to apply the zeller's congruence */
    public static int startDay(int year, int month, int day) {
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = year / 100;
        return ((day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) - 1) % 7;
    } // closing the zeller's method congruence
    
    
    
    /** created a method to identify how many day in the month */
    public static int daysOfTheMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /** Created the leap year method to check if the month is or not leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
	