package chapter_03;

/**
 * 
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * Here is a sample run of the program:
 * 
 * The card you picked is Jack of Hearts
 * 
 */

/** Defining the main class*/
public class Exercise_3_24 {

	/** Defining the constructor of the class */
	public Exercise_3_24() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {

		int rankN = (int) (Math.random() * 13) +1;
		int suitN = (int) (Math.random() * 4) +1;

		String rank = " ";
		String suit = " ";

		switch (rankN) {

		case 1:
			rank = "Ace";
			break;
		case 2:
			rank = "2";
			break;
		case 3:
			rank = "3";
			break;
		case 4:
			rank = "4";
			break;
		case 5:
			rank = "5";
			break;
		case 6:
			rank = "6";
			break;
		case 7:
			rank = "7";
			break;
		case 8:
			rank = "8";
			break;
		case 9:
			rank = "9";
			break;
		case 10:
			rank = "10";
			break;
		case 11:
			rank = "Jack";
			break;
		case 12:
			rank = "Queen";
			break;
		case 13:
			rank = "King";
			break;
		default:
			rank = "N/A";
		}

		switch (suitN) {

		case 1:
			suit = "Clubs";
			break;
		case 2:
			suit = "Diamonds";
			break;
		case 3:
			suit = "Hearts";
			break;
		case 4:
			suit = "Spades";
			break;
		default:
			suit = "N/A";

		}


		//Print out the answer
		System.out.print("\n\n\tThe card you picked is " + rank + " of " + suit);

	}//closing the main method

}//closing class exercise_3_24
