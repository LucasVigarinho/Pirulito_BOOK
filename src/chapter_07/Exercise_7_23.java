package chapter_07;
/** 
 * 
 * 		(Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 * 		closed on the first day of school. As the students enter, the first student, denoted
 * 		S1, opens every locker. Then the second student, S2, begins with the second
 * 		locker, denoted L2, and closes every other locker. Student S3 begins with the
 * 		third locker and changes every third locker (closes it if it was open, and opens it if
 * 		it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 * 		Student S5 starts with L5 and changes every fifth locker, and so on, until student
 * 		S100 changes L100.
 * 
 * 		After all the students have passed through the building and changed the lockers,
 * 		which lockers are open? Write a program to find your answer and display all
 * 		open locker numbers separated by exactly one space.
 * 
 * 		(Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 * 		locker is open (true) or closed (false). Initially, all lockers are closed.)
 * 		
 * 		     100 lockers and 100 students 
//
//     FIRST  STEP -      ALL LOCKERS ARE CLOSED 		  	-   on the first day of school. 
//	   SECOND STEP -      S1, OPEN EVERY LOCKER.            -   Student 1, open every locker
//     THIRD  STEP -      S2, BEGINS WITH THE LOCKER 2		-   Student 2, closes every other locker.
//	   FOURTH STEP -      S3, BEGINS WITH THE LOCKER 3		-   Student 3, changes every third locker (closes it if it was open, and opens it if it was closed).
//	   FIFTH  STEP -      S4, BEGINS WITH THE LOCKER 4		-   Student 4, changes every fourth locker.
//	   SIXTH  STEP -      S5, BEGINS WITH THE LOCKER 5		-   Student 5, changes every fifth locker.
//					 so on, until student S100 changes L100.        

//                           _____________________
//                          |1 2 3 4 5 6 7 8 9 10| 
//     FIRST  STEP ---------|c c c c c c c c c c |
//     SECOND STEP -   S1 --|o o o o o o o o o o | 
//     THIRD  STEP -   S2 --|-|c| |c| |c| |c| |c |
//     FOURTH STEP -   S3 --|-|-|c| | |o| | |c|  |
//     FIFTH  STEP -   S4 --|-|-|-|o| | | |o| |  |
//     SIXTH  STEP -   S5 --|-|-|-|-|c| | | | |o |                   
//                 -   S6 --|-|-|-|-|-|c| | | |  |
//                 -   S7 --|-|-|-|-|-|-|c| | |  |
//                 -   S8 --|-|-|-|-|-|-|-|c| |  | 
//                 -   S9 --|-|-|-|-|-|-|-|-|o|  |                 
//                 -   S10--|-|-|-|-|-|-|-|-|-|c |
//                          |_|_|_|_|_|_|_|_|_|__|
//                          |1 2 3|4 5 6 7 8|9 10
// Which lockers are open?  |o    |o        |o
//   First ten elements    
//                                                       
//   The program should display the answer like this        
//
//                           Locker x is open 
//                           Locker y is open
//                           … 
//                           Locker z is open      
 * FINAL RESULT -> locker 1 is open.
 *                 locker 4 is open.
 *                 locker 9 is open.
 *                 locker 16 is open.
 *                 locker 25 is open.
 *                 locker 36 is open.
 *                 locker 49 is open.
 *                 locker 64 is open.
 *                 locker 81 is open.
 *                 locker 100 is open.         
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_7_23 */
public class Exercise_7_23{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects

		/** Created necessary variables in order to manipulate */
		boolean [] lockers = new boolean [101];

		printArrayStep(lockers, 0); //FIRST STEP - STEP1
		printArrayStep(lockers);	//PRINTING OUT STEP 1

		/** Created a main for loop in order to change all the boolean results of the lockers jumping according to the main number of jump */
		for(int a = 1; a <= 100; a++) {
			/** Created the nested for loop in order to run all the positions, jumping according to the number in a jump variable */
			for(int b = 1 ; b * a <= 100; b++) {
				//calling method in order to change the boolean value of the position, number multiples.
				changeArray(lockers, (b*a), a);
			}//closing nested for loop
			printArrayStep(lockers);
		}//closing the main for loop

		printResult(lockers);
	}//closing the main method

	/** Created a method to print the result of the array step */
	public static void printArrayStep(boolean lockers[]) {
		System.out.print("\n");
		//created a for loop in order to print all the positions, giving O for true and C for false
		for(int i = 1; i < lockers.length; i++) {
			System.out.print("\t|\t" + ((lockers[i])==true?"O":"C") + "");	
		}//closing for loop

	}//closing printArrayStep method

	/** Created a method to print the result of the array step by step */
	public static void printArrayStep(boolean lockers[], int a) {
		System.out.print("\n\t");
		//created a for loop in order to print position by position
		for(int i = -1; i < lockers.length-1; i++) {

			System.out.print("|\t" + (i+2) + "\t");	
		}//closing for loop
	}//closing printArrayStep method

	/** Created a method to print the FINAL RESULT step */
	public static void printResult(boolean lockers[]) {
		//print out msg of locker 01 open
		System.out.println("locker " + 1 + " is open.");

		// Create a for loop to analyze every array 
		for (int n = 0; n < lockers.length; n++) {

			// Create an if statement to locate only the arrays with the boolean value true
			if (lockers[n] == true)

				// Print out the arrays located by the if statement, personalized according instructions
				System.out.println("\tlocker " + n + " is open.");
		}//closing if statement

	}//closing printArrayStep method

	/** Created a method to change the boolean result for a specific positions in the array */
	public static void changeArray(boolean lockers[], int a, int b) {

		//created a if statement in order to change the inside result of the position
		if(b == 0) {

		}else {
			if(lockers[a] == true) {
				lockers[a] = false;
			}else {
				lockers[a] = true;
			}//closing nested if statement 
		}//closing if statement 
	}//closing method changeArray

}//closing the class_7_23
