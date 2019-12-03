package chapter_7;
/** 
 * 		(Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 * 		problem with many practical applications. The problem is to pick objects from
 * 		a set of objects repeatedly and find out how many picks are needed for all the
 * 		objects to be picked at least once. A variation of the problem is to pick cards from
 * 		a shuffled deck of 52 cards repeatedly and find out how many picks are needed
 * 		before you see one of each suit. Assume a picked card is placed back in the deck
 * 		before picking another. Write a program to simulate the number of picks needed
 * 		to get four cards from each suit and display the four cards picked (it is possible a
 * 		card may be picked twice). Here is a sample run of the program:
 * 
 * 		Queen of Spades
 * 		5 of Clubs
 * 		Queen of Hearts
 * 		4 of Diamonds
 * 		Number of picks: 12
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_7_24 */
public class Exercise_7_24{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** create the necessary variables */
		String [] deckOfCards = new String [52];
		String [] pickSuit = {"Null", "Null", "Null", "Null"};
		int count = 0;

		//Fill with the Strings simulates cards
		fillDeck(deckOfCards);

		//		method utilized to test and verify the results inside of every position
		//		printAll(deckOfCards);

		//shuffle the deck of cards 
		shuffleDeck(deckOfCards);

		/** created a while loop with the intention of pick how many cards 
		 * necessary until picked at least once all suits */
		while(testPick(pickSuit)) {
			count++;
			pickCard(deckOfCards, pickSuit);

		}//closing while loop
		
		//print all the cards picked for the first time of the suit
		printPickArray(pickSuit);
		//print the final result of cards picked before all the suits were picked
		System.out.print("\n\n\tNumber of picks " + count);
	}//closing the main method

	/** Created a method in order to test if the pick card array is full or not */
	public static boolean testPick(String pickSuit []) {

		//create the necessary variable to verify and test
		String test = "Null";
		/** if in any position of the pickSuit array has the String "Null" 
		 * which means is missing to pick one of the suits, return true */
		for(String e : pickSuit) {
			if (e == test)
				return true;
		}//closing for loop

		//return false in case of the for each loop did not find any empty space	
		return false;

	}//closing testPick method

	/** Created a method to pick one card from the deckOrCards */
	public static void pickCard(String deckOfCards [], String pickSuit []) {

		/** Created the necessary variable to generate randomly the position that will be picked the card  */
		int randPos = (int) (Math.random() * deckOfCards.length);
		//Created the String only to identify the suit
		String cardSuit = (String) deckOfCards[randPos].subSequence(0, 1);
		//Transform the string to integer to verify if the position is occupied or not
		int position = Integer.parseInt(cardSuit);

		//created an if statement in order to test and verify if the position has or not a positive result
		if(pickSuit[position] == "Null") {
			pickSuit[position] = deckOfCards[randPos];
		}else {

		}//closing if statement


	}//closing method pickCard
	/** Created a method to shuffle the Deck of cards */
	public static void shuffleDeck(String deckOfCards []) {


		/** Created a temporary variable to absorb the card that is going to be shuffled */
		String [] shufflingDeck = deckOfCards;
		String temp = "";
		int index = 0;

		/** Created a main for loop in order to run all the suits */
		for(int c = 0; c < 4; c++) {
			/** Created a nested for loop in order to run all the ranks */
			for(int d = 0; d < 13; d++) {
				//generates randomly the position to be shuffled 
				int randPos = (int) (Math.random() * deckOfCards.length);

				//change the cards of the randomly position generated with the actual position from the for loop
				temp = shufflingDeck[index];
				shufflingDeck[index] = shufflingDeck[randPos];
				shufflingDeck[randPos] = shufflingDeck[index];
				index++;
			}//closing nested for loop (RANKS)
		}//closing main for loop (SUITS)

		//change the array decOfCards 
		deckOfCards = shufflingDeck;
	}//closing shuffleDeck

	/** Created a method in order to print the result of the card picked */
	public static void printPick(String card) {

		/** Create the variable to absorb the card and manipulate this */
		String cardPicked = card;

		//verify the suit and rank using the substring method from the java library
		String suit = (String) cardPicked.subSequence(0, 1);
		String rank = (String) cardPicked.substring(1);
		String cardRank = "";
		String cardSuit = "";


		/** Created an switch statement in order to print the correct suit and rank */
		switch (suit){
		case ("0"):
			cardSuit = "Spades";
		break;
		case ("1"):
			cardSuit = "Hearts";
		break;
		case ("2"):
			cardSuit = "Diamonds";
		break;
		case ("3"):
			cardSuit = "Clubs";
		break;
		default:
			System.out.print("error SUIT");
		}

		/** Created an switch statement in order to print the correct suit and rank */
		switch (rank){
		case ("0"):
			cardRank = "Ace";
		break;
		case ("1"):
			cardRank = "2";
		break;
		case ("2"):
			cardRank = "3";
		break;
		case ("3"):
			cardRank = "4";
		break;
		case ("4"):
			cardRank = "5";
		break;
		case ("5"):
			cardRank = "6";
		break;
		case ("6"):
			cardRank = "7";
		break;
		case ("7"):
			cardRank = "8";
		break;
		case ("8"):
			cardRank = "9";
		break;
		case ("9"):
			cardRank = "10";
		break;
		case ("10"):
			cardRank = "Jack";
		break;
		case ("11"):
			cardRank = "Queen";
		break;
		case ("12"):
			cardRank = "King";
		break;
		default:
			System.out.print("error RANK");
		}

		System.out.print("\n\t" + cardRank + " of " + cardSuit);
	}//closing print result 

	/** Created a method in order to fill the Deck of Cards - Array */
	public static void fillDeck(String deckOfCards []) {
		int index = 0;
		/** Created a main for loop in order to run all the suits */
		for(int a = 0; a < 4; a++) {

			/** Created a nested for loop in order to run all the ranks */
			for(int b = 0; b < 13; b++) {

				String number = String.valueOf(a) + String.valueOf(b);
				deckOfCards[index] = number;
				index++;
			}//closing nested for loop (RANKS)
		}//closing main for loop (SUITS)

	}//closing fillDeck of cards

	/** Created with test objective, print all the positions of the array */
	public static void printAll(String deckOfCards []) {

		for(int e = 0; e < deckOfCards.length; e++) {
			System.out.println(deckOfCards[e]);
			printPick(deckOfCards[e]);
		}
	}

	/** Created with test objective, print all the positions of the array picks */
	public static void printPickArray(String pickSuit []) {

		System.out.println("\n\n\tFINAL RESULT");

		for(int f = 0; f < pickSuit.length; f++) {

			printPick(pickSuit[f]);
		}
	}//closing method print Picks
}//closing the class_7_24
