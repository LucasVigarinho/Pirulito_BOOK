package chapter_03;

import java.util.Scanner;

/** 
 * 
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week. 
 * 
 * 			Here is a sample run:
 * 				
 * 			Enter today's day: 1
 * 			Enter the number of days elapsed since today: 3
 * 			Today is Monday and the future day is Thursday
 * 
 * 
 * 			Enter today's day: 0
 * 			Enter the number of days elapsed since today: 31
 * 			Today is Sunday and the future day is Wednesday
 * */
public class Exercise_3_05{

	/** Constructor not utilized */
	public Exercise_3_05() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//Creating the necessary variables 
		System.out.print("\n\n\tEnter today's day: ");
		int today = input.nextInt();
		System.out.print("\n\n\tEnter the number of days elapsed since today: ");
		int nextDay = input.nextInt();
		
		String weekDay1 = null;
		String weekDay2 = null;
		
		switch (today) {
		case 0:
			weekDay1 = "Sunday";
			break;
		case 1:
			weekDay1 = "Monday";
			break;
		case 2:
			weekDay1 = "Tuesday";
			break;
		case 3:
			weekDay1 = "Wednesday";
			break;
		case 4:
			weekDay1 = "Thursday";
			break;
		case 5:
			weekDay1 = "Friday";
			break;
		case 6:
			weekDay1 = "Saturday";
			break;
			default:
				weekDay1 = "WRONG!!";
			
		}
		
		int nextDayC = (today + nextDay) % 7;
		
		switch (nextDayC) {
		case 0:
			weekDay2 = "Sunday";
			break;
		case 1:
			weekDay2 = "Monday";
			break;
		case 2:
			weekDay2 = "Tuesday";
			break;
		case 3:
			weekDay2 = "Wednesday";
			break;
		case 4:
			weekDay2 = "Thursday";
			break;
		case 5:
			weekDay2 = "Friday";
			break;
		case 6:
			weekDay2 = "Saturday";
			break;
			default:
				weekDay2 = "WRONG!!";
			
		}
		
		
		
		System.out.println("\n\n\tToday is " + weekDay1 + " and the future day is " +  weekDay2);
		
		
		

		input.close();

	}//close main method

}//close class Exercise_3_5
