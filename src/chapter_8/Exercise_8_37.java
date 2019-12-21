package chapter_8;
/** 
 * 
 * 		(Guess the capitals) Write a program that repeatedly prompts the user to enter
 * 		a capital for a state. Upon receiving the user input, the program reports whether
 * 		the answer is correct. Assume that 50 states and their capitals are stored in a twodimensional
 * 		array, as shown in Figure 8.10. The program prompts the user to
 * 		answer all states’ capitals and displays the total correct count. The user’s answer
 * 		is not case-sensitive.
 * 		
 * 		Alabama			Montgomery
 * 		Alaska			Juneau
 * 		Arizona			Phoenix
 * 		...				...
 * 		...				...
 * 
 * 		A two-dimensional array stores states and their capitals.
 * 
 * 		Here is a sample run:
 * 
 * 		What is the capital of Alabama? Montogomery
 * 		The correct answer should be Montgomery
 * 		What is the capital of Alaska? Juneau
 * 		Your answer is correct
 * 		What is the capital of Arizona? ...
 * 		...
 * 		The correct count is 35
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_37{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);

		// Created the multidimensional array calling the get states and cities method 
		String[][] statesAndCapitals = getStatesAndCities();

		int count = 0;			
		
		//created a for loop in order to questioning all the positions of the array created and count the result of correct answers
		for (int i = 0; i < statesAndCapitals.length; i++) {
			System.out.print("\n\tWhat is the capital of " + statesAndCapitals[i][0] + "? ");
			String capital = input.nextLine();

			//created an if statement in order to compare values of answer and array, using a boolean method
			if (isEqual(statesAndCapitals[i][1], capital)) {
				System.out.print("\n\tYour answer is correct");
				count++;
			}else {
				System.out.print("\n\tThe correct answer should be " + 
					statesAndCapitals[i][1]);
			}//closing if statement
		}//closing a for loop

		// Display the total correct count
		System.out.print("\n\tThe correct count is " + count);
	}//closing a main method

	/**  Created a method in order to verify if the answer of in order*/
	public static boolean isEqual(String c, String a) {
		//created an if statement in order to verify the length and if is not the same size, already return false
		if (c.length() != a.length())
			return false;

		//created a for loop in order to verify if each variable is equal
		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}//closing for loop

		return true;
	}//closing method isEqual

	/** Created a method get states and cities in order to initializes the array with the 50 states and their capitals */
	public static String[][] getStatesAndCities() {
		String[][] d = {
			{	"Alabama"		,	"Montgomery"	}, 
			{	"Alaska"		, 	"Juneau"		}, 
			{	"Arizona"		, 	"Phoenix"		},
			{	"Arkansas"		, 	"Little Rock"	}, 
			{	"California"	, 	"Sacramento"	},
			{	"Colorado"		, 	"Denver"		}, 
			{	"Connecticut"	, 	"Hartford"		}, 
			{	"Delaware"		, 	"Dover"			}, 
			{	"Florida"		, 	"Tallahassee"	}, 
			{	"Georgia"		,	"Atlanta"		},
			{	"Hawaii"		, 	"Honolulu"		}, 
			{	"Idaho"			, 	"Boise"			},
			{	"Illinois"		, 	"Springfield"	}, 
			{	"Indiana"		, 	"Indianapolis"	},
			{	"Iowa Des"		, 	"Moines"		}, 
			{	"Kansas"		, 	"Topeka"		}, 
			{	"Kentucky"		,	"Frankfort"		}, 
			{	"Louisiana"		, 	"Baton Rouge"	}, 
			{	"Maine"			, 	"Augusta"		}, 
			{	"Maryland"		, 	"Annapolis"		}, 
			{	"Massachusetts"	, 	"Boston"		}, 
			{	"Michigan"		, 	"Lansing"		}, 
			{	"Minnesota"		, 	"Saint Paul"	}, 
			{	"Mississippi"	, 	"Jackson"		}, 
			{	"Missouri"		, 	"Jefferson City"}, 
			{	"Montana"		, 	"Helena"		}, 
			{	"Nebraska"		, 	"Lincoln"		}, 
			{	"Nevada"		, 	"Carson City"	}, 
			{	"New Hampshire"	, 	"Concord"		}, 
			{	"New Jersey"	, 	"Trenton"		}, 
			{	"New Mexico"	, 	"Santa Fe"		}, 
			{	"New York"		, 	"Albany"		}, 
			{	"North Carolina",	"Raleigh"		}, 
			{	"North Dakota"	, 	"Bismarck"		},
			{	"Ohio"			, 	"Columbus"		},
			{	"Oklahoma"		, 	"Oklahoma City"	}, 
			{	"Oregon"		, 	"Salem"			}, 
			{	"Pennsylvania"	, 	"Harrisburg"	}, 
			{	"Rhode Island"	, 	"Providence"	}, 
			{	"South Carolina", 	"Columbia"		}, 
			{	"South Dakota"	, 	"Pierre"		}, 
			{	"Tennessee"		, 	"Nashville"		}, 
			{	"Texas"			, 	"Austin"		}, 
			{	"Utah"			, 	"Salt Lake City"}, 
			{	"Vermont"		, 	"Montpelier"	}, 
			{	"Virginia"		, 	"Richmond"		}, 
			{	"Washington"	, 	"Olympia"		}, 
			{	"West Virginia"	, 	"Charleston"	}, 
			{	"Wisconsin"		, 	"Madison"		}, 
			{	"Wyoming"		, 	"Cheyenne"		}};
		return d;
	}//closing the method get states and cities
	


}//closing the class_8_01

