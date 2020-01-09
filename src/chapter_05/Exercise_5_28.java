package chapter_05;


/**    ************* Description of the Exercise_5_28 *************
 * 
 *		(Display the first days of each month) Write a program that prompts the user to
 *		enter the year and first day of the year, and displays the first day of each month
 *		in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 *		January 1, 2013, your program should display the following output:
 *
 *		January 1, 2013 is Tuesday
 *		...
 *		December 1, 2013 is Sunday
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_5_28 */
public class Exercise_5_28 {

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
				System.out.print("\n\t" + "January \t" + year + " day 1st on \t" + weekDay(weekDay1));
				weekDay1 = (daysMonth % 7)+weekDay;
			break;
			
			case(2):
				//in case of leap year
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					daysMonth = 29;
				}else{
				daysMonth = 28;
				}//closing if statement
			System.out.print("\n\t" + "February \t" + year + " day 1st on \t" + weekDay(weekDay1));
				weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(3):
				daysMonth = 31;
			System.out.print("\n\t" + "March \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(4):
				daysMonth = 30;
			System.out.print("\n\t" + "April \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(5):
				daysMonth = 31;
			System.out.print("\n\t" + "May \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(6):
				daysMonth = 30;
			System.out.print("\n\t" + "June \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(7):
				daysMonth = 31;
			System.out.print("\n\t" + "July \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(8):
				daysMonth = 31;
			System.out.print("\n\t" + "August \t\t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(9):
				daysMonth = 30;
			System.out.print("\n\t" + "September \t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
				break;
			
			case(10):
				daysMonth = 31;
			System.out.print("\n\t" + "October \t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(11):
				daysMonth = 30;
			System.out.print("\n\t" + "November \t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
			break;
			
			case(12):
				daysMonth = 31;
			System.out.print("\n\t" + "December \t" + year + " day 1st on \t" + weekDay(weekDay1));
			weekDay1 =(( weekDay1 +daysMonth) % 7);
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

}//closing the class_5_28
