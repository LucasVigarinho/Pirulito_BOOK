package chapter_8;
/** 
 * 
 * 		
 * 		(Financial tsunami) Banks lend money to each other. In tough economic times,
 * 		if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s
 * 		total assets are its current balance plus its loans to other banks. The diagram in
 * 		Figure 8.8 shows five banks. The banks’ current balances are 25, 125, 175, 75,
 * 		and 181 million dollars, respectively. The directed edge from node 1 to node 2
 * 		indicates that bank 1 lends 40 million dollars to bank 2.
 * 		
 * 
 * 		If a bank’s total assets are under a certain limit, the bank is unsafe. The money it
 * 		borrowed cannot be returned to the lender, and the lender cannot count the loan in
 * 		its total assets. Consequently, the lender may also be unsafe, if its total assets are
 * 		under the limit. Write a program to find all the unsafe banks. Your program reads
 * 		the input as follows. It first reads two integers n and limit, where n indicates the
 * 		number of banks and limit is the minimum total assets for keeping a bank safe. It
 * 		then reads n lines that describe the information for n banks with IDs from 0 to n-1.
 * 
 * 		The first number in the line is the bank’s balance, the second number indicates
 * 		the number of banks that borrowed money from the bank, and the rest are pairs
 * 		of two numbers. Each pair describes a borrower. The first number in the pair
 * 		is the borrower’s ID and the second is the amount borrowed. For example, the
 * 		input for the five banks in Figure 8.8 is as follows (note that the limit is 201):
 * 
 * 		nBanks = 5 assetLimit = 201
 * 		bank0 -> balance = 25 	banksLoaned = 2 bankId = 1 amount = 100.5 	bankId = 4 	amount = 320.5
 * 		bank1 -> balance = 125 	banksLoaned = 2 bankId = 2 amount = 40 		bankId = 3 	amount = 85
 * 		bank2 -> balance = 175 	banksLoaned = 2 bankId = 0 amount = 125 	banlId = 3 	amount = 75
 * 		bank3 -> balance = 75 	banksLoaned = 1 bankId = 0 amount = 125
 * 		bank4 -> balance = 181 	banksLoaned = 1 bankId = 2 amount = 125
 * 
 *  
 * 		The total assets of bank 3 are (75 + 125), which is under 201, so bank 3 is
 * 		unsafe. After bank 3 becomes unsafe, the total assets of bank 1 fall below
 * 		(125 + 40). Thus, bank 1 is also unsafe. The output of the program should be
 * 
 * 		Unsafe banks are 3 1
 * 
 * 		(Hint: Use a two-dimensional array borrowers to represent loans.
 * 		borrowers[i][j] indicates the loan that bank i loans to bank j. Once bank j
 * 		becomes unsafe, borrowers[i][j] should be set to 0.)
 * 
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_17{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner (System.in);

		input.close();
	}//closing the main method

	


}//closing the class_8_17

