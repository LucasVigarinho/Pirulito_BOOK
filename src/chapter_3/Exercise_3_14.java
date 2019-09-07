package chapter_3;

import java.util.Scanner;


/** 
 * 
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 * 
 * */

public class Exercise_3_14{

	/** Constructor not utilized */
	public Exercise_3_14() {

	}//close constructor

	
	/** Automatic generated main method */
	public static void main(String[] args) {
		
	Scanner input =  new Scanner(System.in);
	
	int coin = (int) (Math.random() * 2);
	
	
	System.out.print("\n\n\tThe coin is fliped now! ");
	System.out.print("\n\n\tPlease, guess the coin fliped  --> (Head or Tail) ");
	String guess = input.nextLine();
	
	if(coin == 0) {
		if(guess.equals("Head") || guess.equals("head") ) {
			System.out.print("\n\n\tCongratulations the Coin was Head! ");
		}else {
			System.out.print("\n\n\tYou loose! the Coin was Head! ");
		}
	}else {
		if(guess.equals("Tail") || guess.equals("tail") ) {
			System.out.print("\n\n\tCongratulations the Coin was Tail! ");
		}else {
			System.out.print("\n\n\tYou loose! the Coin was Tail!  ");
		}
	}
	System.out.print(coin);
	input.close();

	}//close main method

}//close class Exercise_3_14
