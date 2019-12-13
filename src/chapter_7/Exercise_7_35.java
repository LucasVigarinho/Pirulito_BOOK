package chapter_7;
/** 
 * 
 * 		(Game: hangman) Write a hangman game that randomly generates a word and
 * 		prompts the user to guess one letter at a time, as shown in the sample run. Each
 * 		letter in the word is displayed as an asterisk. When the user makes a correct
 * 		guess, the actual letter is then displayed. When the user finishes a word, display
 * 		
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;
import java.util.Random;
/** Creating the class named Exercise_7_35 */
public class Exercise_7_35{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		startHangMan();
		//create a for loop in order to test all the letters
		//close for loop
		//print out the messages 


	}//closing the main method

	/** Created a method to display the menu */
	public static void startHangMan() {

		/** Created the necessary objects */
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		/** Created the necessary variables */
		int option = 0;
		int category = 0;

		//printing out the first line of the game
		System.out.print("\n\n\t**************** HANG MAN - GAME ****************");

		/** Created a do loop in order to display the menu, while the game did not finished */
		do {

			/** Print out the menu Game */
			System.out.print("\n\t*************************************************");
			System.out.print("\n\t* Option 1 - Start New Game (Random category)\t*");
			System.out.print("\n\t* Option 2 - Choose a category\t\t\t*");
			System.out.print("\n\t* Option 3 - Exit Game\t\t\t\t*");
			System.out.print("\n\t*************************************************");
			System.out.print("\n\tType here your option -> ");
			option = input.nextInt(); //using the variable option to absorb the user input during UI (User Interaction).

			/** Created the switch statement in order to make the menu of the game interact with the user options */
			switch(option) {
			/** OPTION 1 */
			/** In the option 1 the new game is going to be started using one random category */
			case(1):
				/** calling new game with the randomly number choice */
				category = r.nextInt(5);
			System.out.print("\n\n\t************** STARTING A NEW GAME **************");
			newGame(category);

			break;
			case(2):
				break;
			case(3):
				System.err.print("\n\n\t\t\tTHE END");
			break;
			default:
				System.out.print("wrong choice");

			}//closing the switch statement  


		}while(option != 3);
		input.close();

	}//closing start Hang Man method

	/** Created a method to start a new game following the category chosen */
	public static void newGame(int category ) {

		/** Create the necessary object */
		Scanner input = new Scanner (System.in);

		/** Created the necessary variable array word to absorb the answer of the method categoryGame */
		String [] wordCategory = categoryGame(category);
		String word = wordCategory[((int) (Math.random()*5+1))];
		char [] wordArray = word.toCharArray();
		String letter = "";
		boolean isNotFull = true;
		char [] newWord = new char[wordArray.length];
		int bodyPart = 0;

		/** Printing out the message to the user understand which category and how many characters has this word */
		System.out.print("\n\n\tThe category is -> " + wordCategory[0]);

		System.out.print("\n\tThe word has -> " + word.length() + " characteres\n\t\t\t\t\t");

		/** Created a for loop to show to the user how many characters has the word */
		for(int a = 0; a < word.length(); a++) {
			if(word.charAt(a) == 32) {
				System.out.print("   " + " ");
			}else {
				System.out.print("___" + " ");
			}
		}//closing the word for loop


		hangTheMan(bodyPart);

		do {
			//printed a space for a visual motives 
			System.out.print("\n\n\tPlease, choose one letter -> ");

			//absorb the user message
			letter = input.nextLine();
			int position = isInTheWord(letter, word);

			/** Created an if statement in order to change the letter inside of the string by an space or print the incorrect mode */
			if( position >= 0 ) {

				newWord[position] = letter.charAt(0);

				System.out.print("\n\n\t\t\t\t\t");

				/** Created a for loop to show to the user how many characters has the word */
				for(int a = 0; a < word.length(); a++) {
					if(wordArray[a] == 32) {
						System.out.print("   " + " ");
					}else if(wordArray[a] == newWord[a]){
						System.out.print(" "+ newWord[a] + " " + " ");
					}else {
						System.out.print("___" + " ");
					}
				}//closing the word for loop

				hangTheMan(bodyPart);

			}else{
				bodyPart++;
				hangTheMan(bodyPart);

			}//closing the if statement 

			if(bodyPart == 6) {
			
				isNotFull = false;
			}else if(isFull(newWord, wordArray)) {
			
				isNotFull = false;
			}
			
		}while(isNotFull);

		if(bodyPart == 6) {
			System.err.print("\n\n\t\t\t\t\tYOU LOOSE");
			
		}else if(isFull(newWord, wordArray)) {
			System.err.print("\n\n\t\t\t\t\tYOU WON");
			
		}
		//Creates an array in order to absorb errors letters and compare with the right word
		//creates an array for the right letter created 
		//creates a method in order to test the word in all loop
		//creates a do loop in order to give to the user an opportunity to try letters
		//creates a visual print of error and visual print for right, using the method created for be tested if

	}//closing the new Game method

	/** Created a method which give the answer of the isNotFull back */
	public static boolean isFull(char[] newWord, char [] wordArray) {
		
		for(int j = 0; j < newWord.length; j++  ) {
			if(newWord[j] != wordArray[j]) {
				return false;
			}
		}
		return true;
	}//closing isFull method
	
	/** Created a boolean method in order to verify if the letter is part of the word */
	public static int isInTheWord(String letter, String word) {

		int position = 0;

		char l = letter.charAt(0);
		/** Created a for loop to verify if the letter is in the word */
		for(int f = 0; f < word.length(); f++) {
			if(l == word.charAt(f)) {
				return f;
			}else {

			}
		}
		return -1;

	}//closing method which verifies if the letter is in the word

	/** Created a method category game in order to absorb from a external txt file, the possible categories and words to play */
	public static String [] categoryGame(int category) {

		/** Created the necessary variable in order to absorb all the external txt file document information and generates a multidimensional array */
		String [][] categories = new String [5][10];
		String [] myArray = new String [10];

		//FIRST category description
		categories[0][0] = "Importat thing for a car";
		categories[0][1] = "wheels";//word 1
		categories[0][2] = "tyres";//word 2
		categories[0][3] = "petrol";//word 3
		categories[0][4] = "seat";//word 4
		categories[0][5] = "car Key";//word 5
		categories[0][6] = "oil";//word 6
		categories[0][7] = "seat Belt";//word 7
		categories[0][8] = "alarm";//word 8
		categories[0][9] = "radio";//word 9

		//SECOND category description
		categories[1][0] = "Important thing for a house";
		categories[1][1] = "house Key";//word 1
		categories[1][2] = "eletricity";//word 2
		categories[1][3] = "wather";//word 3
		categories[1][4] = "oven";//word 4
		categories[1][5] = "microwave";//word 5
		categories[1][6] = "toilet";//word 6
		categories[1][7] = "internet";//word 7
		categories[1][8] = "television";//word 8
		categories[1][9] = "windows";//word 9

		//THIRD category description
		categories[2][0] = "Name of a clothes";
		categories[2][1] = "jumper";//word 1
		categories[2][2] = "moleton";//word 2
		categories[2][3] = "suit";//word 3
		categories[2][4] = "jacket";//word 4
		categories[2][5] = "trausers";//word 5
		categories[2][6] = "shorts";//word 6
		categories[2][7] = "shirt";//word 7
		categories[2][8] = "shoes";//word 8
		categories[2][9] = "underwear";//word 9

		//FORTH category description
		categories[3][0] = "Name of a furniture";
		categories[3][1] = "sofa";//word 1
		categories[3][2] = "chair";//word 2
		categories[3][3] = "table";//word 3
		categories[3][4] = "desk";//word 4
		categories[3][5] = "dinner table";//word 5
		categories[3][6] = "matriz";//word 6
		categories[3][7] = "bed";//word 7
		categories[3][8] = "wardraw";//word 8
		categories[3][9] = "drawer";//word 9

		//FIFTH category description
		categories[4][0] = "Name of an acomputer app";
		categories[4][1] = "docker";//word 1
		categories[4][2] = "workbench";//word 2
		categories[4][3] = "whatsapp";//word 3
		categories[4][4] = "eclipse";//word 4
		categories[4][5] = "ratonal";//word 5
		categories[4][6] = "photoshop";//word 6
		categories[4][7] = "ilustrator";//word 7
		categories[4][8] = "corel draw";//word 8
		categories[4][9] = "postman";//word 9

		//created a for loop in order to populate an array with the category chosen
		for(int b = 0; b < 10; b++) {

			myArray [b] = categories[category][b];
		}//closing for loop

		return myArray;
	}//closing category Game method

	/** Created a method to hang the man until the actual situation */
	public static void hangTheMan(int bodyPart) {
		int special = 92;



		switch(bodyPart) {
		case(0):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
		break;
		case (1):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\n\n");
		break;
		case (2):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\t\t   |");
			System.out.print("\n\t\t   | " );
			System.out.print("\n\n");
		break;
		case (3):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\t\t  /|"  );
			System.out.print("\n\t\t / | " );
			System.out.print("\n\n");
		break;
		case (4):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\t\t  /|"  + String.valueOf( (char) special) );
			System.out.print("\n\t\t / | " + String.valueOf( (char) special));
		break;
		case (5):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\t\t  /|"  + String.valueOf( (char) special) );
			System.out.print("\n\t\t / | " + String.valueOf( (char) special));
			System.out.print("\n\t\t  / ");
			System.out.print("\n\t\t /   " );

		break;
		case (6):
			System.out.print("\n\n\t ||_________");
			System.out.print("\n\t |---------|");
			System.out.print("\n\t\t   O");
			System.out.print("\n\t\t  /|"  + String.valueOf( (char) special) );
			System.out.print("\n\t\t / | " + String.valueOf( (char) special));
			System.out.print("\n\t\t  / " + String.valueOf( (char) special) );
			System.out.print("\n\t\t /   " + String.valueOf( (char) special) );

		break;
		default:
			System.err.print("\n\n\tPÉÉÉÉÉÉ WRONG!!!");
		}




	}//closing hang the man

}//closing the class_7_35
