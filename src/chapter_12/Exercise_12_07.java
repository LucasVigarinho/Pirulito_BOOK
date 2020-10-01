package chapter_12;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(NumberFormatException) Write the bin2Dec(String binaryString)
 * 		method to convert a binary string into a decimal number. Implement the
 * 		bin2Dec method to throw a NumberFormatException if the string is not a
 * 		binary string.
 * 
 * 		Based on https://github.com/LuizGsa21/intro-to-java-10th-edition/blob/master/src/Chapter_12/Exercise_07.java
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (07) in a compose name */
public class Exercise_12_07 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/** */
		/** Testing the methods with a Binary Number  and with non Binary Number*/
		/** First giving to the user a possibility to interact */
		System.out.print("\n\tHi THere! Please, type the binary number ->> ");
		String binary1 = input.nextLine();

		/** Print out the message calling the method */
		System.out.println(bin2Dec(binary1));
		input.close();
	}//closing the mains method


	/** Create the bin2Xec method throwing a exception handler 'NumberFormatException'*/
	public static int bin2Dec(String binaryString) throws NumberFormatException {

		/** Create an if statement in order to check if the receiving String is a binary number or not */
		if (!isBinary(binaryString)) {

			/** Throwing the message for the exception */
			throw new NumberFormatException(binaryString + "   \n\n\t\tis not a binary number.\n\n");
		}

		int power = 0;
		int decimal = 0;
		/** Create the necessary variable in order to calculate the decimal number 
		 * 
		 *    binary number: 1 1 0 1 1 0 0 1      
		 *                   | | | | | | | |_1 x 2 power 0 = 1 x 1 = 1  
		 *                   | | | | | | |___0 x 2 power 1 = 0 x 2 = 0             
		 *                   | | | | | |_____0 x 2 power 2 = 0 x 4 = 0
		 *                   | | | | |_______1 x 2 power 3 = 1 x 8 = 8
		 *                   | | | |_________1 x 2 power 4 = 1 x 16 = 16
		 *                   | | |___________0 x 2 power 5 = 0 x 32 = 0
		 *                   | |_____________1 x 2 power 6 = 1 x 64 = 64
		 *                   |_______________1 x 2 power 7 = 1 x 129 = 128
		 * */

		for(int i = binaryString.length()-1;i>=0; i--) {

			if (binaryString.charAt(i) == '1') {
				decimal += (Math.pow(2, power));
			}
			power++;
		}


		return decimal;
	}//closing the bin2Dec method


	public static boolean isBinary(String binaryNumber) {

		for (char ch : binaryNumber.toCharArray()) {
			if (ch != '1' && ch != '0') return false;		
		}
		return true;
	}


}//closing class exercise_12_07
