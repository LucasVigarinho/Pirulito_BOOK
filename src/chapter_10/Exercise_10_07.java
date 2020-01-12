package chapter_10;



/** 
 * 			
 * 		(Game: ATM machine) Use the Account class created in Programming Exercise
 * 		9.7 to simulate an ATM machine. Create ten accounts in an array with id
 * 		0, 1, . . . , 9, and initial balance $100. The system prompts the user to enter an
 * 		id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id
 * 		is accepted, the main menu is displayed as shown in the sample run. You can
 * 		enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
 * 		depositing money, and 4 for exiting the main menu. Once you exit, the system
 * 		will prompt for an id again. Thus, once the system starts, it will not stop.
 * 		
 * 		Enter an id: 4
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 1
 * 		The balance is 100.0
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 2
 * 		Enter an amount to withdraw: 3
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 1
 * 		The balance is 97.0
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 3
 * 		Enter an amount to deposit: 10
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 1
 * 		The balance is 107.0
 * 
 * 		Main menu
 * 		1: check balance
 * 		2: withdraw
 * 		3: deposit
 * 		4: exit
 * 		Enter a choice: 4
 * 		Enter an id:
 * 
 * @author lucasmaximo
 *
 */

/** 
 * 
 * 			|                       Exercise_9_07						|
 * 			|-----------------------------------------------------------|
 * 			|							Account     					|
 * 			|-----------------------------------------------------------|	
 * 			| - id: int					  								|
 * 			| - balance: double           								|
 * 			| - annualInterestRate: double								|
 * 			| - dateCreated: Date         								|
 * 			|-----------------------------------------------------------|
 * 			| + Account ()             								    |
 * 			| + Account (id: int, balance: double)					  	|
 * 			| + getId(): int  								       		|
 * 			| + setId(id: int): void									|
 * 			| + getBalance():double										|
 * 			| + setBalance(balance: double): void						|
 * 			| + getAnnualInterestRate(): double							|
 * 			| + setAnnualInterestRate(annualInterestRate: double): void |
 * 			| + getDateCreated(): Date									|
 * 			| + getMonthlyInterestRate(): double						|
 * 			| + withdraw(amount: double): void							|
 * 			| + deposit(amount: double): void							|
 * 			|___________________________________________________________|  
 * 
 * 
 */

/** Necessary imports */
import java.util.Date;
import java.util.Scanner;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_07{

	/** Creating the main method */
	public static void main(String[] arg) {


		Scanner input = new Scanner(System.in);

		/** Create ten accounts in an array with id
		 *	0, 1, . . . , 9, and initial balance $100.  */
		Account[] accounts = new Account[10];	

		for (int a = 0; a < 10; a++) {
			accounts[a] = new Account(a, 100.0);
		}
		/** The system prompts the user to enter an id. */
		int test = -1;
		int position = -1;

		do {
			/** If the id is entered incorrectly, ask the user to enter a correct id. */
			do {
				if(test < 0) {
					System.out.print("\n\n\tPlease, enter an id -> ");
					position = incorretId(input.nextInt(), accounts);
					test++;
				}else {
					System.out.print("\n\n\tPlease, entenr a positive id -> ");
					position = incorretId(input.nextInt(), accounts);
				}
			}while(position < 0);
			test = -1;

			/** Once an id is accepted, the main menu is displayed as shown in the sample run. */

			/** You can enter a choice 	1 for viewing the current balance, 
			 * 							2 for withdrawing money, 
			 * 							3 for depositing money,
			 * 							4 for exiting the main menu.
			 * 							 Once you exit, the system
			 *							will prompt for an id again. Thus, once the system starts, it will not stop. */
			int choice  = 0;
			do {
				System.out.print("\n\n\tMain menu");
				System.out.print("\n\t1: check balance");
				System.out.print("\n\t2: withdraw");
				System.out.print("\n\t3: deposit");
				System.out.print("\n\t4: exit");
				System.out.print("\n\n\tEnter a choice: ");
				choice = input.nextInt();
				switch(choice) {
				case 1:
					System.out.print("\n\tThe balance is " + accounts[position].getBalance());
					break;
				case 2:
					System.out.print("\n\tEnter an amount to withdraw: ");
					double withdraw = input.nextDouble();
					accounts[position].withdraw(withdraw);
					break;
				case 3:
					System.out.print("\n\tEnter an amount to deposite: ");
					double deposite = input.nextDouble();
					accounts[position].deposit(deposite);
					break;
				case 4:

					break;
				default:
					System.out.print("\n\n\tWrong choice. Try again.");

				}

			}while(choice != 4);
			
		}while(position > -2);

		/**  Once you exit, the system */

		input.close();
	}//closing the main method

	/**  If the id is entered incorrectly, ask the user to enter a correct id. */
	public static int incorretId(int id, Account [] accounts) {
		for(int b = 0; b < accounts.length; b++) {
			if(id == accounts[b].getId()) {
				return b;
			}else {

			}
		}
		return -1;
	}


}//closing the Exercise_10_01 method (used as driver method)

class  Account {


	/** ■ A private int data field named id for the account (default 0). */
	private int id;


	/** ■ A private double data field named balance for the account (default 0). */
	private double balance;


	/** ■ A private double data field named annualInterestRate that stores the current
	 * interest rate (default 0). Assume all accounts have the same interest rate. */
	private double annualInterestRate;


	/** ■ A private Date data field named dateCreated that stores the date when the
	 * account was created.*/
	private Date dateCreated;


	/** ■ A no-arg constructor that creates a default account. */
	Account (){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}//closing constructor


	/** ■ A constructor that creates an account with the specified id and initial balance. */
	Account (int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();

	}//closing constructor


	/**  ■ The accessor and mutator methods for id, balance, and annualInterestRate. */	
	// Created the accessor method for id 
	public int getId() {
		return id;
	}//closing getId method
	//  Created the mutator method for id 
	public void setId(int id) {
		this.id = id;
	}//closing setId method
	// Created the accessor method for balance 
	public double getBalance() {
		return balance;
	}//closing getBalance method
	//Created the mutator method for balance 
	public void setBalance(double balance) {
		this.balance = balance;
	}//closing setBalance method
	// Created the accessor method for Annual Interest Rate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}//closing getAnnualInterestRate
	// Created the mutator method for Annual Interest Rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}//closing setAnnualInterestRate


	/** ■ The accessor method for dateCreated. */
	public Date getDateCreated() {
		return dateCreated;
	}//closing getDateCreated method


	/** ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
	 * 	Hint:  The monthlyInterestRate	is annualInterestRate / 12. Note that annualInterestRate is a percentage,
	 * 		e.g., like 4.5%. You need to divide it by 100.) */
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) /100;
	}//closing getMonthlyInterestRate method


	/** ■ A method named getMonthlyInterest() that returns the monthly interest. 
	 * Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate.
	 * 		Monthly interest is balance * monthlyInterestRate.*/
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}//closing getMonthlyInterest method


	/** ■ A method named withdraw that withdraws a specified amount from the
	 * account. */
	public void withdraw(double amount) {
		this.balance -= amount;
	}//closing withdraw method


	/** ■ A method named deposit that deposits a specified amount to the account. */
	public void deposit(double amount) {
		this.balance += amount;
	}//closing deposit method


}//closing class Account 

