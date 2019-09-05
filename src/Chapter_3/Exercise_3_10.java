package Chapter_3;

import java.text.DecimalFormat;
import java.util.Scanner;


/** 
 * 
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 * 
 * */
public class Exercise_3_10{

	/** Constructor not utilized */
	public Exercise_3_10() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {


		
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random()* 900 + 101);
		int number2 = (int) (Math.random()* 900 + 101);
		
		System.out.print("\n\n\tSubtract two integers numbers");
		System.out.print("\n\n\t");
		System.out.print("\n\n\tFirst number is  --> " + number1);
		System.out.print("\n\n\tFirst number is  --> " + number2);
		System.out.print("\n\n\t");
		System.out.print("\n\n\tWhat is your answer ?  --> ");
		int answer1 = input.nextInt();
	
		
		if(answer1 == (number1 - number2)) {
			int number3 = (int) (Math.random()* 900 + 101);
			int number4 = (int) (Math.random()* 900 + 101);
			int number5 = (int) (Math.random()* 900 + 101);
			
			
			System.out.print("\n\n\tSubtract trhee integers numbers");
			System.out.print("\n\n\t");
			System.out.print("\n\n\tFirst number is  --> " + number3);
			System.out.print("\n\n\tSecond number is  --> " + number4);
			System.out.print("\n\n\tThird number is  --> " + number5);
			System.out.print("\n\n\t");
			System.out.print("\n\n\tWhat is your answer ?  --> ");
			int answer2 = input.nextInt();
			if(answer2 == (number3 - number4 - number5)) {
				System.out.print("\n\n\tCongratulations! You won!!!");
			}else {
				System.out.print("\n\n\tSORRY. Start the game again. YOU LOOSE!");
			}
			
		}else {
			System.out.print("\n\n\tSORRY. Start the game again. YOU LOOSE!");
		}
		


		input.close();



}//close main method

}//close class Exercise_3_10
