package chapter_11;

import java.util.Date;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Subclasses of Account) In Programming Exercise 9.7, the Account class was
 * 		defined to model a bank account. An account has the properties account number,
 * 		balance, annual interest rate, and date created, and methods to deposit and withdraw
 * 		funds. Create two subclasses for checking and saving accounts. A checking
 * 		account has an overdraft limit, but a savings account cannot be overdrawn.
 * 		
 * 		Draw the UML diagram for the classes and then implement them. Write
 * 		a test program that creates objects of Account, SavingsAccount, and
 * 		CheckingAccount and invokes their toString() methods.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
/** 
 *  * 
 * 			|                       Exercise_9_07						|    
 * 			|-----------------------------------------------------------|                   
 * 			|							Account     					|\
 * 			|-----------------------------------------------------------| \	
 * 			| - id: int					  								|  \
 * 			| - balance: double           								|   \
 * 			| - annualInterestRate: double								|    \
 * 			| - dateCreated: Date         								|\	  \		|			   Checking  		   	|
 * 			|-----------------------------------------------------------| \	   \	|-----------------------------------|
 * 			| + Account ()             								    |  \ 	\___| - overdraft: double				|
 * 			| + Account (id: int, balance: double)					  	|	\	 	|-----------------------------------|
 * 			| + getId(): int  								       		|	 \	  	| + Checking()						|
 * 			| + setId(id: int): void									|	  \		| + Checking(id: int, balance: 		|
 * 			| + getBalance():double										|	   \	| 	double, overdraft: double)		|
 * 			| + setBalance(balance: double): void						|		\	| + getOverdraft(): double			|
 * 			| + getAnnualInterestRate(): double							|		|	| + setOverdraft(limit: double)		|	
 * 			| + setAnnualInterestRate(annualInterestRate: double): void |		|	| + withdraw(amount: double): void  |
 * 			| + getDateCreated(): Date									|		|	| + toString(): String			    |
 * 			| + getMonthlyInterestRate(): double						|		|	|___________________________________|
 * 			| + withdraw(amount: double): void							|       |
 * 			| + deposit(amount: double): void							|		|___|			   Saving   		   	|
 * 			|___________________________________________________________|  			|-----------------------------------|
 * 																					| + Saving()						|
 * 																					| + Saving(id: int, balance: 		|						|
 *																					| 	double, overdraft: double)		|
 *																					| + withdraw(amount: double): void  |
 *																					| + toString(): String			    |
 *																					|___________________________________|
 * */																				


/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_03 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		/** Testing the methods */
		// Create Account, SavingsAccount and Checking Account objects
		Account account = new Account(1122, 20000);
		Account savings = new Saving(1001, 20000);
		Account checking = new Checking(1004, 20000, -20);
		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		// Invoke toString methods
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());

		System.out.println("\n");
		savings.withdraw(200);
		savings.withdraw(50000);
		System.out.println("\n");
		checking.withdraw(200);
		checking.withdraw(200000);

	}//closing the mains method


}//closing class exercise_11_03


/** 	 Create two subclasses for checking and saving accounts. */

/** A checking account has an overdraft limit, but a savings account cannot be overdrawn. */
class Checking extends Account{
	
	/** Created the necessary variable - overdraft: double*/
	private double overdraft;
	
	/** Created the default Checking account using a constructor with no args */
	Checking(){
		super();
		overdraft = -20.0;
	}
	/** Created the Checking account using a constructor with args */
	Checking(int id, double balance, double overdraft){
		super(id, balance);
		this.overdraft = overdraft;
	}

	/** Created getters (assessors) and setter (modifiers) methods */
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
	/** Created the Override withdraw method method in order to withdraw money respecting the overdraft limit */
	public void withdraw(double amount) {
		if(getBalance() - amount > overdraft) {
			setBalance(getBalance() - amount);
			System.out.println("Your balance has being withdraw");
		}else {
			System.out.println("This amount exceed your limit of Overdraft - you have now -> " + String.format("%.2f", getBalance() + overdraft));
		}
	}//closing withdraw method
	
	/** Created the Override toString method in order to print the necessary information when asked */
	@Override
	public String toString() {
		return super.toString() +
				"Checking [overdraft= $" + String.format("%.2f", overdraft) + "]";
	}
	
}//closing Checking Account

/** A saving account has an overdraft limit, but a savings account cannot be overdrawn. */
class Saving extends Account{
	
	/** No necessary created variables */
	
	/** Created the default Saving account using a constructor with no args */
	Saving(){
		super();
	}
	/** Created the Saving account using a constructor with args */
	Saving(int id, double balance){
		super(id, balance);
	}
	
//	/** Created getters (assessors) and setter (modifiers) methods   */
	
	/** Created the Override withdraw method method in order to withdraw money respecting the limit of account*/
	public void withdraw(double amount) {
		if(amount < getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Your balance has being withdraw");
		}else {
			System.out.println("This amount exceed your limit of Overdraft - you have now -> " + String.format("%.2f", getBalance()));
		}
	}//closing withdraw method
//	/** Created the Override toString method in order to print the necessary information when asked */
	
}//closing Checking Account



/** 
 * 			(Subclasses of Account) In Programming Exercise 9.7, the Account class was
 * 		defined to model a bank account. An account has the properties account number,
 * 		balance, annual interest rate, and date created, and methods to deposit and withdraw
 * 		funds.
 * 			(The Account class) Design a class named Account that contains:
 * */
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

	/** Return a String description of Account class */
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}//closing class Account 

