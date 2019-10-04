package chapter_4;

/**    ************* Description of the Exercise_4_17 *************
 * 
 * 		(Days of a month) Write a program that prompts the user to enter a year and the
 * 		first three letters of a month name (with the first letter in uppercase) and displays
 * 		the number of days in the month. Here is a sample run:
 * 
 * 		Enter a year: 2001
 * 		Enter a month: Jan
 * 		Jan 2001 has 31 days
 * 		
 * 		Enter a year: 2016
 * 		Enter a month: Feb
 * 		Jan 2016 has 29 days
 * 
 * 		@author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_4_17 */
public class Exercise_4_17 {

	/** Creating the main method */
	public static void main (String[] args){
		
		//creating object to absorb the user answer 
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter a year: ");
		int year = input.nextInt();
		System.out.print("\n\n\tEnter a month: ");
		String month = input2.nextLine();
		
		if((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (month.equals("Feb"))) {
			System.out.print("\n\n\t" + month + " " + year + " has " + 29 + " days");
		}else {
			printOut(month, year);
		}//closing if statement
		
	}//closing main method
	
	/** creating a support method to make the code clean */
	public static void printOut(String month, int year ) {
		
		//creating swithc statement in order to give the right answer, printing out
		switch(month) {
		
		case("Jan"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Mar"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Apr"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 30 + " days");
			break;
		case("May"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Jun"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 30 + " days");
			break;
		case("Jul"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Aug"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Sep"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 30 + " days");
			break;
		case("Oct"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
		case("Nov"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 30 + " days");
			break;
		case("Dec"):
			System.out.print("\n\n\t" + month + " " + year + " has " + 31 + " days");
			break;
			default:
				System.out.print("\n\n\tYou should had inserted the year XXXX or month three letters using the first capital letter, like Jan or Mar ");
		}//closing switch statement
	}//closing the support method printOut
	
}//closing the class_4_17
