package chapter_12;
import java.util.Scanner;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(NumberFormatException) Listing 6.8 implements the hex2Dec(String
 * 		hexString) method, which converts a hex string into a decimal number.
 * 		Implement the hex2Dec method to throw a NumberFormatException if the
 * 		string is not a hex string.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (06) in a compose name */
public class Exercise_12_06 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** testing all the classes and methods */
		//Creating a Scanner
		Scanner input = new Scanner (System.in);
		
		//Giving to the user the opportunity to interact
		System.out.println("\n\t" + "Enter a hex number: ");
		String hex = input.nextLine();
		
		//creating a catch in order to handle the NumberFormatException
		try {
			System.out.println("The decimal value for hex number " +
						hex + " is " + hexToDecimal(hex.toUpperCase());
			
		}catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}//closing try catch
		//Closing the input Scanner variable
		input.close();
	}//closing the mains method

	/** Creating the class to be used as a method hexToDecimal */
	public static int hexToDecimal (String hex) throws NumberFormatException{
		
		//create a variable in order to start the initial Decimal Value
		int decimalValue = 0;
		
		//create a for loop in order to verify character by character of the user input
		for (int i =0; i < hex.length(); i++) {
			if ( !(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') ||
					!(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) {
				
						throw new  NumberFormatException ("String is not a hex String");
			}
			
			//create a char variable to absorb the hex decimal number that passed through the if test above
			char hexChar = hex.charAt(i);
			
			//using the int value created in order to compose the final hexdecimalvalue
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			
		}//closing main loop
		
		return decimalValue;
		
	}//closing hexToDecimal class
	
	
	//create a public class in order to transform the hex value to an int
	public static int hexCharToDecimal(char ch) {
		
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		}else {
			return ch - '0';
		}
	}//closing 
	
}//closing class exercise_12_06
