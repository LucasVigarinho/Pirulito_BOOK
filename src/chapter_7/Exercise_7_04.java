package chapter_7;
/** 
 * 		(Analyze scores) Write a program that reads an unspecified number of scores and
 * 		determines how many scores are above or equal to the average and how many
 * 		scores are below the average. Enter a negative number to signify the end of the
 * 		input. Assume that the maximum number of scores is 100.	
 * 			
 * @author lucasmaximo
 *
 */



/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_7_04 */
public class Exercise_7_04{

	/** Creating the main method */
	public static void main(String[] arg) {
		//create the necessary objects
		Scanner input = new Scanner (System.in);


		/** Print out the message to be a guide of the user interaction */
		System.out.print("\n\n\tEnter the integers limited by 100 inputs or a negative number: ");
		/** Created the necessary variables */
		int studentsN = 100;
		int [] students = new int [studentsN];
		int number = 0, l = 0;
		int below = 0, above = 0, same = 0;

		//create a do loop in order to absorb all the students scores xcept the negative numbers
		do {
			/** absorb the user intertion */
			number = input.nextInt();

			//create the if statement to avoid the negative number into the array
			if(number<0) {

			}else {
				students[l] = number;
				l += 1;
			}

		}while(number >= 0);//closing while loop stopping when the user inserted the negative number

		//created the new array utilizing the bubble sort method icluding the creation of a new array resied
		int [] myArray = organizeArray(students);

		/** Finding out the medium number of the array through a method */
		int number1 = myArray[medium(myArray)];

		/** Print the students scores */
		for(int j = 0; j < myArray.length ; j++) {
			//creating a if statement in order to test and calculate the number above, below and same
			if(myArray[j] < number1) {
				below += 1;
			}else if (myArray[j] == number1) {
				same += 1;
			}else  {
				above += 1;
			}

		}//close for loop

		/** Printing out the rsults */
		System.out.print("\n\n\tMy Array numbers -> " );
		for(int m = 0; m < myArray.length; m++) {
			System.out.print(" " + myArray[m]);
		}
		System.out.print("\n\n\tMedium number \t-> " + number1);
		System.out.print("\n\n\tNumbers Above \t-> " + above);
		System.out.print("\n\n\tNumbers Below \t-> " + below);
		System.out.print("\n\n\tNumbers SAME \t-> " + same );

		input.close();
	}//closing the main method

	/** Created a medium methdo to find out the medium number */
	public static int medium(int [] myArray) {

		int medium = 0;

		/** Created a if statement in order to calculate the medium position number */
		if (myArray.length % 2 == 0) {
			medium = (myArray.length)/2 + 1;

		}else {
			medium = (int) (myArray.length)/2;
		}//closing if statement 

		return medium;
	}//closing medium method

	/** Created a method to organize the array numbers - bubble sort and create new array with the right size */
	public static int [] organizeArray(int[] myArray) {

		int [] a = newArray(myArray);


		//Create the algorithm 
		for (int j = 0; j <= a.length-2; j++) {

			for (int i = 0; i <= a.length-j-2; i++) {

				if(a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

				}//close if

			}//close for 

		}//close for

		return a ;
	}//closing organize array Method

	/** Created a method in order to create a new array resized */
	public static int [] newArray (int [] myArray) {

		/** Creating the countable variable */
		int count = 1;

		//Created a for loop in order to count the real array size
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] != 0) {
				count += 1;
			}
		}//closing for loop

		int [] a = new int [count];
		count = 0;

		/** create a for loop in order to fill the array */
		for (int j = 0; j < myArray.length; j++) {
			if(myArray[j] != 0) {
				a[count] = myArray[j];
				count+=1;
			}
		}
		return a;

	}//closing new Array method

}//closing the class_7_04
