package chapter_3;

import java.util.Scanner;


/** 
 * 
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * 
 * 
 *    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 *    
 * 
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 * 
 * 					Enter the first 9 digits of an ISBN as integer: 013601267
 * 					The ISBN-10 number is 0136012671
 * 
 * 					Enter the first 9 digits of an ISBN as integer: 013031997
 * 					The ISBN-10 number is 013031997X
 * 
 * */
public class Exercise_3_9{

	/** Constructor not utilized */
	public Exercise_3_9() {

	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n\tEnter the first 9 digits of an ISBN as integer:");
		int nineDigits = input.nextInt();
		
		int d1 = nineDigits / 100000000;
		int rest = nineDigits % 100000000;
		
		int d2 = rest / 10000000;
		  rest = nineDigits % 10000000;
		
		int d3 = rest / 1000000;
		  rest = nineDigits % 1000000;
		
		int d4 = rest / 100000;
		  rest = nineDigits % 100000;
		
		int d5 = rest / 10000;
		  rest = nineDigits % 10000;
		
		int d6 = rest / 1000;
		  rest = nineDigits % 1000;
		
		int d7 = rest / 100;
		  rest = nineDigits % 100;
		
		int d8 = rest / 10;
		  rest = nineDigits % 10;
		
		int d9 = rest;
		 
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10==10){
			System.out.print(d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print("X");
		}else {
			System.out.print(d1);
			System.out.print(d2);
			System.out.print(d3);
			System.out.print(d4);
			System.out.print(d5);
			System.out.print(d6);
			System.out.print(d7);
			System.out.print(d8);
			System.out.print(d9);
			System.out.print(d10);
		}
		
		


		input.close();



}//close main method

}//close class Exercise_3_9
