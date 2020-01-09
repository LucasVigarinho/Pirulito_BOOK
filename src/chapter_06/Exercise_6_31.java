package chapter_06;

/**
 * 
 * 		(Financial: credit card number validation) Credit card numbers follow certain patterns.
 * 		A credit card number must have between 13 and 16 digits. It must start with:
 * 
 * 		■ 4 for Visa cards
 * 		■ 5 for Master cards
 * 		■ 37 for American Express cards
 * 		■ 6 for Discover cards
 * 
 * 		In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
 * 		numbers. The algorithm is useful to determine whether a card number is entered
 * 		correctly or whether a credit card is scanned correctly by a scanner. Credit card
 * 		numbers are generated following this validity check, commonly known as the
 * 		Luhn check or the Mod 10 check, which can be described as follows (for illustration,
 * 		consider the card number 4388576018402626):
 * 
 * 		1. Double every second digit from right to left. If doubling of a digit results in a
 * 		two-digit number, add up the two digits to get a single-digit number.
 * 
 * 		4388576018402626
 * 		| | | | | | | |
 * 		| | | | | | | |_ 2 * 2 = 4
 * 		| | | | | | |___ 2 * 2 = 4
 * 		| | | | | |_____ 4 * 2 = 8
 * 		| | | | |_______ 1 * 2 = 2	
 * 		| | | |_________ 6 * 2 = 12 (1 + 2 = 3)	
 * 		| | |___________ 5 * 2 = 10 (1 + 0 = 1)
 * 		| |_____________ 8 * 2 = 16 (1 + 6 = 7)
 * 		|_______________ 4 * 2 = 8 
 * 
 * 		2. Now add all single-digit numbers from Step 1.
 * 		4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 		3. Add all digits in the odd places from right to left in the card number.
 * 		6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 		4. Sum the results from Step 2 and Step 3.
 * 		37 + 38 = 75
 * 		5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
 * 		it is invalid. For example, the number 4388576018402626 is invalid, but the
 * 		number 4388576018410707 is valid.
 * 		Write a program that prompts the user to enter a credit card number as a long
 * 		integer. Display whether the number is valid or invalid. Design your program to
 * 		use the following methods:
 * 
 * 		/* Return true if the card number is valid 
 * 		public static boolean isValid(long number)
 * 
 * 		/* Get the result from Step 2 
 * 		public static int sumOfDoubleEvenPlace(long number)
 * 
 * 		/** Return this number if it is a single digit, otherwise,
 * 		* return the sum of the two digits 
 * 		public static int getDigit(int number)
 * 
 * 		/* Return sum of odd-place digits in number 
 * 		public static int sumOfOddPlace(long number)
 * 
 * 		/* Return true if the digit d is a prefix for number 
 * 		public static boolean prefixMatched(long number, int d)
 * 
 * 		/* Return the number of digits in d 
 * 		public static int getSize(long d)
 * 
 * 		/* Return the first k number of digits from number. If the
 * 		* number of digits in number is less than k, return number. 
 * 		public static long getPrefix(long number, int k)
 * 
 * 		Here are sample runs of the program: (You may also implement this program by
 *		reading the input as a string and processing the string to validate the credit card.)
 * 
 *		Enter a credit card number as a long integer:
 *		4388576018410707
 *		4388576018410707 is valid
 *
 *		Enter a credit card number as a long integer:
 *		4388576018402626
 *		4388576018402626 is invalid 
 * 
 * @author lucasmaximo
 *
 */

/** Import the necessary libraries */
import java.util.Scanner;

public class Exercise_6_31 {
	
	/** Created the main method */
	
	public static void main(String[] args) {
	// Initialize the Scanner method creating an new scanner variable called input,
			// to be used to extract the information inserted
			Scanner input = new Scanner(System.in); // Create a Scanner

			// Print out to the user to insert a credit card number
			System.out.print("\n\n\tEnter a credit card number as a long integer: ");

			// Create the variable long called number, to receive the insertion from the
			// user
			long number = input.nextLong();
			System.out.print("\n\t");
			// Print out the answer if is valid or not, calling the public
			System.out.print(number + " is " + (toValid(number) ? "valid" : "invalid"));
			input.close();
		}

		// Create the public class toValid to validate the numbers, following the
		// explained rules on the description
		public static boolean toValid(long number) {
			// Create the boolean variable to validate the number, calling every class in
			// oder to test numbers
			boolean valid = (getSize(number) >= 13 && getSize(number) <= 16)
					&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
							|| prefixMatched(number, 6))
					&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

			return valid;
		}

		// Create the class getSize to return the number of digits in the long integer d
		public static int getSize(long d) {
			String num = d + "";
			return num.length();
		}

		// Create the class prefixMatched to analyze the prefix, calling it of K, in
		// order to check if card is valid
		public static boolean prefixMatched(long number, int d) {
			return getPrefix(number, getSize(d)) == d;
		}

		// Create the class getPrefix to validate the first number of the number
		// inserted by the user
		public static long getPrefix(long number, int k) {
			if (getSize(number) > k) {
				String num = number + "";
				return Long.parseLong(num.substring(0, k));
			}
			return number;
		}

		// Create the class sumOfDoubleEvenPlace in order to make every second number
		// multiplied by two and summarize them
		public static int sumOfDoubleEvenPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 2; i >= 0; i -= 2) {
				sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
			}
			return sum;
		}

		// Create the class getDigit to validate the exceptions of number multiplied by
		// two bigger the 9, summarizing the two digits
		public static int getDigit(int number) {
			if (number < 9)
				return number;
			else
				return number / 10 + number % 10;
		}

		// Create the class sumOfOddPlace in order to summarize every number allocated
		// in an odd position
		public static int sumOfOddPlace(long number) {
			int sum = 0;
			String num = number + "";
			for (int i = getSize(number) - 1; i >= 0; i -= 2) {
				sum += Integer.parseInt(num.charAt(i) + "");
			}
			return sum;
		}

}
