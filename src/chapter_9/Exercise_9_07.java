package chapter_9;

/** 
 * 			
 * 
 * 		(The Account class) Design a class named Account that contains:
 * 		■ A private int data field named id for the account (default 0).
 * 		■ A private double data field named balance for the account (default 0).
 * 		■ A private double data field named annualInterestRate that stores the current
 * 		interest rate (default 0). Assume all accounts have the same interest rate.
 * 		■ A private Date data field named dateCreated that stores the date when the
 * 		account was created.
 * 		■ A no-arg constructor that creates a default account.
 * 		■ A constructor that creates an account with the specified id and initial balance.
 * 		■ The accessor and mutator methods for id, balance, and annualInterestRate.
 * 		■ The accessor method for dateCreated.
 * 		■ A method named getMonthlyInterestRate() that returns the monthly
 * 		interest rate.
 * 		■ A method named getMonthlyInterest() that returns the monthly interest.
 * 		■ A method named withdraw that withdraws a specified amount from the
 * 		account.
 * 		■ A method named deposit that deposits a specified amount to the account.
 * 		
 * 		Draw the UML diagram for the class and then implement the class. (Hint: The
 * 		method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * 		Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * 		is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * 		e.g., like 4.5%. You need to divide it by 100.)
 * 
 * 		Write a test program that creates an Account object with an account ID of 1122,
 * 		a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * 		method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * 		the balance, the monthly interest, and the date when this account was created.
 * 
 * 
 * 		 @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Date;

/** 
 * 		Draw the UML diagram for the class and then implement the class. (Hint: The
 * 		method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * 		Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * 		is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * 		e.g., like 4.5%. You need to divide it by 100.)
 * 
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
 * */

/** Creating the class named Exercise_9_07 */
public class Exercise_9_07{

	/** Creating the main method, 
	 * Write a test program that creates an Account object with an account ID of 1122,
	 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
	 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
	 * the balance, the monthly interest, and the date when this account was created. */
	public static void main(String[] arg) {

		//create the necessary variable
		Account Account1 = new Account(1122, 20000);
		Account1.setAnnualInterestRate(4.5);
		Account1.withdraw(2500);
		Account1.deposit(3000);
		printBalance(Account1);


	}//closing the main method

	public static void printBalance(Account name) {

		System.out.print("\n\n\tBank Account " + name.getId() + " created in \t-> " + name.getDateCreated());
		System.out.print("\n\n\tBalance of " + name.getId() + " is \t\t-> " + name.getBalance());
		System.out.print("\n\n\tMonthly inerest of " + name.getId() + " is \t-> " + name.getMonthlyInterest());
	}
}//closing the class_9_07


/** 
 * 
 * 		(The Account class) Design a class named Account that contains:
 * 		■ A private int data field named id for the account (default 0).
 * 		■ A private double data field named balance for the account (default 0).
 * 		■ A private double data field named annualInterestRate that stores the current
 * 		interest rate (default 0). Assume all accounts have the same interest rate.
 * 		■ A private Date data field named dateCreated that stores the date when the
 * 		account was created.
 * 		■ A no-arg constructor that creates a default account.
 * 		■ A constructor that creates an account with the specified id and initial balance.
 * 		■ The accessor and mutator methods for id, balance, and annualInterestRate.
 * 		■ The accessor method for dateCreated.
 * 		■ A method named getMonthlyInterestRate() that returns the monthly
 * 		interest rate.
 * 		■ A method named getMonthlyInterest() that returns the monthly interest.
 * 		■ A method named withdraw that withdraws a specified amount from the
 * 		account.
 * 		■ A method named deposit that deposits a specified amount to the account.
 * */
class Account {


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
