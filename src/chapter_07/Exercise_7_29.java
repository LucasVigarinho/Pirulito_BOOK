package chapter_07;

/** 
 * 
 * 		(Game: pick four cards) Write a program that picks four cards from a deck of 52
 * 		cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
 * 		12, and 11, respectively. Your program should display the number of picks that
 * 		yields the sum of 24.
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_7_29 */
public class Exercise_7_29{

	/** Creating the main method */
	public static void main(String[] arg) {

		//Created an array with 52 positions
		String [] deckOfCards = new String [52];
		
		//filled the array using the method fillDeck
		deckOfCards = fillDeck(deckOfCards);
		
		//created a variable to sum the cards and total of cards to be picked
		int sum = 0;
		int count = 4;
		
		/** Print a better visualization of the game */
		System.out.print("\n\n\t********** GAME - PICK FOUR CARDS ********** \n\n");
		System.out.print("\n\tSUMMARIZED\tVALUE\t- CARD PICKED");
		System.out.print("\n\t----------\t-----\t- -----------");
		//Create an while loop in order to sum all the cards picked, until a limit sum of 24.
		while(count > 0) {
			
			//verify the rank using the substring method from the java library, because the suit does not matter
			String picked = (String) pickCard(deckOfCards);
			//summarize the value of the card
			sum += Integer.parseInt(picked.substring(1));
			
			//print out the summarization of the cards picked 
			System.out.print("\n\t     " + sum);
			//print out the value of the card picked
			System.out.print("\t\t  " + picked.substring(1) + "\t- ");
			//print out the card piqued
			printPick(picked);
			
			count--;
			
		}//closing the while loop
		
	
	}//closing the main method

	/** Created a method in order to fill the Deck of Cards - Array */
	public static String [] fillDeck(String deckOfCards []) {
		int index = 0;
		/** Created a main for loop in order to run all the suits */
		for(int a = 1; a <= 4; a++) {

			/** Created a nested for loop in order to run all the ranks */
			for(int b = 1; b <= 13; b++) {

				String number = String.valueOf(a) + String.valueOf(b);
				deckOfCards[index] = number;
				index++;
			}//closing nested for loop (RANKS)
		}//closing main for loop (SUITS)
		
		return deckOfCards;
	}//closing fillDeck of cards
	
	/** Created a method to pick one card from the deckOrCards */
	public static String pickCard(String deckOfCards []) {


		/** Created the necessary variable to generate randomly the position that will be picked the card  */
		int randPos = (int) (Math.random() * deckOfCards.length);
		
		/** Created a while loop in order to make impossible take the same card took before */
		while(deckOfCards[randPos] == "Null") {
			randPos = (int) (Math.random() * deckOfCards.length);
		}//closing the while loop
		
		///** Created the variable to send the value of the card */
		String result = deckOfCards[randPos];
		
		//the card picked is out form the deckOfCards
		deckOfCards[randPos] = "Null";
		
		return result;
	}//closing method pickCard

	
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
		case ("1"):
			cardSuit = "Spades";
		break;
		case ("2"):
			cardSuit = "Hearts";
		break;
		case ("3"):
			cardSuit = "Diamonds";
		break;
		case ("4"):
			cardSuit = "Clubs";
		break;
		default:
			System.out.print("error SUIT");
		}

		/** Created an switch statement in order to print the correct suit and rank */
		switch (rank){
		case ("1"):
			cardRank = "Ace";
		break;
		case ("2"):
			cardRank = "2";
		break;
		case ("3"):
			cardRank = "3";
		break;
		case ("4"):
			cardRank = "4";
		break;
		case ("5"):
			cardRank = "5";
		break;
		case ("6"):
			cardRank = "6";
		break;
		case ("7"):
			cardRank = "7";
		break;
		case ("8"):
			cardRank = "8";
		break;
		case ("9"):
			cardRank = "9";
		break;
		case ("10"):
			cardRank = "10";
		break;
		case ("11"):
			cardRank = "Jack";
		break;
		case ("12"):
			cardRank = "Queen";
		break;
		case ("13"):
			cardRank = "King";
		break;
		default:
			System.out.print("error RANK");
		}

		System.out.print( cardRank + " of " + cardSuit);
	}//closing print result 

}//closing the class_7_29
