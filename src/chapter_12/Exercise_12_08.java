package chapter_12;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(HexFormatException) Exercise 12.6 implements the hex2Dec method to
 * 		throw a NumberFormatException if the string is not a hex string. Define
 * 		a custom exception called HexFormatException. Implement the hex2Dec
 * 		method to throw a HexFormatException if the string is not a hex string.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (08) in a compose name */
public class Exercise_12_08 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** testing all the classes and methods */
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a hex number: ");
		
		String hex = input.nextLine();
		
		try {
			System.out.println("The decimal value for hex number" + hex + "is " + hexToDecimal(hex.toUpperCase()));
		}catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
		
	}//closing the mains method

	public static int hexToDecimal(String hex) throws NumberFormatException{
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || 
					(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) throw new NumberFormatException(hex);
					
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal (char ch) {
		if (ch >=  'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
		
	}
	
}//closing class exercise_12_08
