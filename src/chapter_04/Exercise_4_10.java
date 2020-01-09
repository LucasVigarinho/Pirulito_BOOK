package chapter_04;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
 * enter the character Y for Yes and N for No rather than entering 1 for Yes and 0
 * for No.
 * 
 * 
 */

//necessary imports
import java.util.Scanner;

//creating a public class
public class Exercise_4_10 {

	//Creating a constructor of the public class described above
	public Exercise_4_10() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {

		String set1 =
				"\t 1 3 5 7\n" +
				"\t 9 11 13 15\n" +
				"\t17 19 21 23\n" +
				"\t25 27 29 31";

		String set2 =
				"\t 2 3 6 7\n" +
				"\t10 11 14 15\n" +
				"\t18 19 22 23\n" +
				"\t26 27 30 31";

		String set3 =
				"\t 4 5 6 7\n" +
				"\t12 13 14 15\n" +
				"\t20 21 22 23\n" +
				"\t28 29 30 31";

		String set4 =
				"\t 8 9 10 11\n" +
				"\t12 13 14 15\n" +
				"\t24 25 26 27\n" +
				"\t28 29 30 31";

		String set5 =
				"\t16 17 18 19\n" +
				"\t20 21 22 23\n" +
				"\t24 25 26 27\n" +
				"\t28 29 30 31";

		int day = 0;

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to answer questions
		System.out.print("\n\tIs your birthday in Set1?\n");
		System.out.print("\n "+ set1 + "\n");
		System.out.print("\n\tEnter N for No and Y for Yes: ");
		String answer = input.nextLine();

		if (answer.equals("Y"))
			day += 1;

		// Prompt the user to answer questions
		System.out.print("\n\tIs your birthday in Set2?\n");
		System.out.print("\n "+ set2 + "\n");
		System.out.print("\n\tEnter N for No and Y for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 2;

		// Prompt the user to answer questions
		System.out.print("\n\tIs your birthday in Set3?\n");
		System.out.print("\n "+ set3 + "\n");
		System.out.print("\n\tEnter N for No and Y for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 4;

		// Prompt the user to answer questions
		System.out.print("\n\tIs your birthday in Set4?\n");
		System.out.print("\n "+ set4 + "\n");
		System.out.print("\n\tEnter N for No and Y for Yes: ");
		answer = input.nextLine();


		if (answer.equals("Y"))
			day += 8;

		// Prompt the user to answer questions
		System.out.print("\n\tIs your birthday in Set5?\n");
		System.out.print("\n "+ set5 + "\n");
		System.out.print("\n\tEnter N for No and Y for Yes: ");
		answer = input.nextLine();

		if (answer.equals("Y"))
			day += 16;

		System.out.println("\n\n\tYour birthday is " + day + "!");

		input.close();
	}//closing the main method


}//closing the public class Exercise_4_10
