package chapter_12;


/**			EXERCISE DESCRIPTION 
 * 
 * 		(ArrayIndexOutOfBoundsException) Write a program that meets the following
 * 		requirements:
 * 		■ Creates an array with 100 randomly chosen integers.
 * 		■ Prompts the user to enter the index of the array, then displays the corresponding
 * 		element value. If the specified index is out of bounds, display the
 * 		message Out of Bounds.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */
import java.util.Scanner;

/** Created the main class, using the name of the package (12) and the exercise (03) in a compose name */
public class Exercise_12_03 {

	private int [] randomNumber;
	private int index;

	Exercise_12_03(int index){

		randomNumber = new int [100];
		for(int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = (int) (Math.random()*100) + 1;
		}

		this.index = index;
	}

	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		/** 	■ Creates an array with 100 randomly chosen integers.
		 * 		■ Prompts the user to enter the index of the array, then displays the corresponding
		 * 		element value. If the specified index is out of bounds, display the
		 * 		message Out of Bounds.
		 * */

		while(true) {
			System.out.print("\n\tPlease, input the index to be found from the array -> ");

			Exercise_12_03 test = new Exercise_12_03(input.nextInt());

			try {
				System.out.print("\n\tThe position " + test.getIndex() + " has a number " + test.indexFounder());
				break;
			}catch (ArrayIndexOutOfBoundsException e){
				System.out.print("\n\tOut of Bounds. Please, try again");
				input.nextLine();
			}
		}
		
	}//closing the mains method

	public int indexFounder() {
		return randomNumber[index];
	}
	
	public int  getIndex() {
		return index;
	}
}//closing class exercise_12_03
