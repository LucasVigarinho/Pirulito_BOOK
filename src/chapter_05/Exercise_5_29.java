package chapter_05;

import java.util.Scanner;

/**    ************* Description of the Exercise_5_29 *************
 * 
 * 		(Display calendars) Write a program that prompts the user to enter the year and
 * 		first day of the year and displays the calendar table for the year on the console. For
 * 		example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * 		your program should display the calendar for each month in the year, as follows:
 * 
 * 					January 2013
 * 		Sun Mon Tue Wed Thu Fri Sat
 * 		        1 	2 	3 	4 	5
 * 		6 	7 	8 	9 	10 	11 	12
 * 		13 	14 	15 	16 	17 	18 	19
 * 		20 	21 	22 	23 	24 	25 	26
 * 		27 	28 	29 	30 	31
 * 
 * 					December 2013
 * 		Sun Mon Tue Wed Thu Fri Sat
 * 		1 	2 	3 	4	5 	6 	7
 * 		8 	9 	10 	11 	12 	13 	14
 * 		15 	16 	17 	18 	19 	20 	21
 * 		22 	23 	24 	25 	26 	27 	28
 * 		29 	30 	31
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_29 */
public class Exercise_5_29 {

	/** Creating the main method */
	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);

		//create the necessary variables
		System.out.print("\n\n\tEnter the year: ");
		int year = input.nextInt();
		System.out.print("\n\t Enter the first day of the year, week day -> 0(sunday) to 6(saturday) ");
		int weekDay = input.nextInt();

		printMonth(year, weekDay);



		input.close();

	}//closing the main method

	//open the method to print out the necessary information
	public static void printMonth(int year, int weekDay) {
		int daysMonth = 0;
		int weekDay1 = weekDay;

		for(int i = 1; i <= 12; i++) {
			switch (i) {
			case(1):
				daysMonth = 31;
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "January \t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    January " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth); //method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 = (daysMonth % 7)+weekDay;
			break;

			case(2):
				//in case of leap year
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					daysMonth = 29;
				}else{
					daysMonth = 28;
				}//closing if statement
			 
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "February \t" + year + " day 1st on \t" + weekDay(weekDay1));
		
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    February " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(3):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "March \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    March " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(4):
				daysMonth = 30;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "April \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    April " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(5):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "May \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    May " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(6):
				daysMonth = 30;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "June \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    June " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			
			break;

			case(7):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "July \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    July " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			
			break;

			case(8):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "August \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
		
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    August " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(9):
				daysMonth = 30;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "September \t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    September " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");

			printCalendar(weekDay1, daysMonth);
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(10):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "October \t" + year + " day 1st on \t" + weekDay(weekDay1));

			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    October " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(11):
				daysMonth = 30;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "November \t" + year + " day 1st on \t" + weekDay(weekDay1));
			
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    November " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			//preparing the weekDay for the next month, according with the last day of this month
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;

			case(12):
				daysMonth = 31;
			
			//printing out the message communicating in which week day is the day first of this month
			System.out.print("\n\t" + "December \t" + year + " day 1st on \t" + weekDay(weekDay1));
		
			//printing the month according with the week day of the day first, numbers of days of the month and the last day of the last month
			System.out.print("\n\n\t                    December " + year);
			System.out.print("\n\t---------------------------------------------------");
			System.out.print("\n\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
			printCalendar(weekDay1, daysMonth);//method created to print the month
			
			break;

			default:
				System.err.print("\n\tERRO");
			}//close switch
		}//close for loop


	}//closing the method printMonth

	//create method to give the answer of the weekDay
	public static String weekDay(int weekDay) {

		String weekDayString = "";

		switch (weekDay) {
		case 0: 
			weekDayString = "Sunday"; 
			break;
		case 1: 
			weekDayString = "Monday"; 
			break;
		case 2: 
			weekDayString = "Tuesday"; 
			break;
		case 3: 
			weekDayString = "Wednesday"; 
			break;
		case 4: 
			weekDayString = "Thursday"; 
			break;
		case 5: 
			weekDayString = "Friday"; 
			break;
		case 6: 
			weekDayString = "Saturday"; 
			break;
		}
		return weekDayString;
	}
	/** Create method to print the calendar */
	public static void printCalendar(int weekDay1, int daysMonth) {

		//creating variable to count days of each month
		int day = 0;
		
		//print the firt space an the line jump to initiate the number printing o the month
		System.out.print("\n\t");
		
		//create a first for loop to print all the possibles lines or weeks of the month calendar according to the first day 
		for (int i = 0; i <= 5; i++) {
			
			//Create the nested for loop to print the days among the seven days of the week
			for (int j = 0; j <= 6; j++) {
				
				//first fi statement in order to define where the first day is going to be printed, using the variable day internal to the method
				//and the weekDay variable to define for how long the space is going to be printed.
				if(day == 0 && j < weekDay1) {
					System.out.print(" " + " " + "\t");
					
				}else {
					
					//nested if statement, for print the days after the internal variable day started counting, initiating the month
					if(day > daysMonth - 1 ) {

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


}//closing the class_5_29
