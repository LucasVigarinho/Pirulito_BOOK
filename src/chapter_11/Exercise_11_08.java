package chapter_11;

import java.util.Date;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(New Account class) An Account class was specified in Programming
 * 		Exercise 9.7. Design a new Account class as follows:
 * 
 * 		■ Add a new data field name of the String type to store the name of the
 * 		customer.
 * 		■ Add a new constructor that constructs an account with the specified name, id,
 * 		and balance.
 * 		■ Add a new data field named transactions whose type is ArrayList
 * 		that stores the transaction for the accounts. Each transaction is an instance
 * 		of the Transaction class. The Transaction class is defined as shown in
 * 		Figure 11.6.
 * 														 |The getter and setter methods for these data
 * 														/|fields are provided in the class, but omitted in the UML
 * 													   / |diagram for brevity.														
 * 			|				MyInteger  	   		|	  /	 |____________________________________________________________
 * 			|-----------------------------------|	 /
 * 			| - date: java.util.Date   			|	/ |	The date of this transaction.
 * 			| - type: char  					|  /  |	The type of the transaction, such as 'W' for withdrawal, 'D'
 * 			| 				 			  <_____|_/	  |	for deposit.
 * 			| - amount: double  				|	  |	The amount of the transaction.
 * 			| - balance: double   				|	  |	The new balance after this transaction.
 * 			| - description: String   			|	  |	The description of this transaction.
 * 			|-----------------------------------|     |
 * 			| + Transaction(type: char,			|	  |	Construct a Transaction with the specified date, type,
 * 			|	amount: double, balance:		|	  |	balance, and description.
 * 			|	double, description: String)	|     |
 * 			|___________________________________|     |________________________________________________________________	
 * 
 * 
 * 		■ Modify the withdraw and deposit methods to add a transaction to the
 * 		transactions array list.
 * 		■ All other properties and methods are the same as in Programming Exercise 9.7.
 * 
 * 		Write a test program that creates an Account with annual interest rate 1.5%,
 * 		balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
 * 		account and withdraw $5, $4, and $2 from the account. Print an account summary
 * 		that shows account holder name, interest rate, balance, and all transactions.
 * */


/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;

/** UML FROM EXERCISE 9.7 
 * 
 * 		■ Add a new data field name of the String type to store the name of the
 * 		customer.
 * 		■ Add a new constructor that constructs an account with the specified name, id,
 * 		and balance.
 * 		■ Add a new data field named transactions whose type is ArrayList
 * 		that stores the transaction for the accounts. Each transaction is an instance
 * 		of the Transaction class. The Transaction class is defined as shown in
 * 		Figure 11.6.
 * * 
 * 			|                       Exercise_9_07						|
 * 			|-----------------------------------------------------------|
 * 			|							Accounte     					|
 * 			|-----------------------------------------------------------|	
 * 			| - name: String			  								|
 * 			| - id: int					  								|
 * 			| - balance: double           								|
 * 			| - annualInterestRate: double								|
 * 			| - dateCreated: Date         								|
 * 			| - transactions: ArrayList <Transaction>					|
 * 			|-----------------------------------------------------------|
 * 			| + Account ()             								    |
 * 			| + Account (id: int, balance: double)	  					|
 * 			| + Account (name: String, id: int, balance: double)	  	|
 * 			| + getName(): String							       		|
 * 			| + setName(name: String): void								|
 * 			| + getId(): int  								       		|
 * 			| + setId(id: int): void									|
 * 			| + getBalance():double										|
 * 			| + setBalance(balance: double): void						|
 * 			| + getAnnualInterestRate(): double							|
 * 			| + setAnnualInterestRate(annualInterestRate: double): void |
 * 			| + getDateCreated(): Date									|
 * 			| + getMonthlyInterestRate(): double						|
 * 			| + getTransactions(): ArrayList <Transaction>				|
 * 			| + setTransactions(type: char, amount: double, balance:	|
 * 			|   double, description: String): void						|
 * 			| + withdraw(amount: double): void							|
 * 			| + deposit(amount: double): void							|
 * 			| + toString(): String										|
 * 			|___________________________________________________________|  
 * 
 * 
 *  * 														 |The getter and setter methods for these data
 * 														/|fields are provided in the class, but omitted in the UML
 * 													   / |diagram for brevity.														
 * 			|				MyInteger  	   		|	  /	 |____________________________________________________________
 * 			|-----------------------------------|	 /
 * 			| - date: java.util.Date   			|	/ |	The date of this transaction.
 * 			| - type: char  					|  /  |	The type of the transaction, such as 'W' for withdrawal, 'D'
 * 			| 				 			  <_____|_/	  |	for deposit.
 * 			| - amount: double  				|	  |	The amount of the transaction.
 * 			| - balance: double   				|	  |	The new balance after this transaction.
 * 			| - description: String   			|	  |	The description of this transaction.
 * 			|-----------------------------------|     |
 * 			| + Transaction(type: char,			|	  |	Construct a Transaction with the specified date, type,
 * 			|	amount: double, balance:		|	  |	balance, and description.
 * 			|	double, description: String)	|     |
 * 			|___________________________________|     |________________________________________________________________	
 * 
 * 
 * */

/** Created the main class, using the name of the package (11) and the exercise (08) in a compose name */
public class Exercise_11_08 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** TESTING ALL THE NEW METHODS CREATED AND PRINT THE INFORMATIONS TO PROFF */
		/* Creating an account **/
		Accounte lucas = new Accounte("Lucas", 01, 200000);
		/* Creating an transaction in the account created **/
		lucas.deposit(100000);
		/* Creating an transaction in the account created **/
		lucas.withdraw(20000);
		/* print the account information **/
		System.out.print("\n\t\t"+ lucas.getTransaction().get(0).toString());
		
		/* print the transaction information **/
		System.out.print("\n\t\t"+lucas.getTransaction().get(1).toString());

		
	}//closing the mains method

	
}//closing class exercise_11_08


/** 
 * 
 * 		(The Account class) Design a class named Account that contains:
 * */
class Accounte {

	/** ■ Add a new data field name of the String type to store the name of the	customer.*/
	private String name;
	
	 
	
	/** ■ A private int data field named id for the account (default 0). */
	private int id;


	/** ■ A private double data field named balance for the account (default 0). */
	private double balance;


	/** ■ A private double data field named annualInterestRate that stores the current
	 * interest rate (default 0). Assume all accounts have the same interest rate. */
	private double annualInterestRate;


	/**  * 		■ Add a new data field named transactions whose type is ArrayList
	 * 		that stores the transaction for the accounts. Each transaction is an instance
	 * 		of the Transaction class. The Transaction class is defined as shown in
	 * 		Figure 11.6. */
	private ArrayList<Transaction> transaction;
	
	/** ■ A private Date data field named dateCreated that stores the date when the
	 * account was created.*/
	private Date dateCreated;


	/** ■ A no-arg constructor that creates a default account. */
	Accounte (){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();

	}//closing constructor

	/** ■ A constructor that creates an account with the specified id and initial balance. */
	Accounte (int id, double balance){
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();

	}//closing constructor
	
	/** ■ Add a new constructor that constructs an account with the specified name, id, and balance.*/
	Accounte (String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
		transaction = new ArrayList<Transaction>(); 

	}//closing constructor

	/**  ■ The accessor and mutator methods for id, balance, and annualInterestRate. */	
	// Created the accessor method for id 
	public String getName() {
		return name;
	}//closing getName method
	//  Created the mutator method for id 
	public void setName(String name) {
		this.name = name;
	}//closing setName method
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

	/** GETTER AND SETTER FOR TRANSACTIONS */
	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transaction = transaction;
	}

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
		transaction.add(new Transaction('W', amount, balance, "Withdraw from account balance"));
	}//closing withdraw method


	/** ■ A method named deposit that deposits a specified amount to the account. */
	public void deposit(double amount) {
		this.balance += amount;
		transaction.add(new Transaction('D', amount, balance, "Deposito to account balance"));
	}//closing deposit method


}//closing class Account 


/** * 													 |The getter and setter methods for these data
 * 														/|fields are provided in the class, but omitted in the UML
 * 													   / |diagram for brevity.														
 * 			|				MyInteger  	   		|	  /	 |____________________________________________________________
 * 			|-----------------------------------|	 /
 * 			| - date: java.util.Date   			|	/ |	The date of this transaction.
 * 			| - type: char  					|  /  |	The type of the transaction, such as 'W' for withdrawal, 'D'
 * 			| 				 			  <_____|_/	  |	for deposit.
 * 			| - amount: double  				|	  |	The amount of the transaction.
 * 			| - balance: double   				|	  |	The new balance after this transaction.
 * 			| - description: String   			|	  |	The description of this transaction.
 * 			|-----------------------------------|     |
 * 			| + Transaction(type: char,			|	  |	Construct a Transaction with the specified date, type,
 * 			|	amount: double, balance:		|	  |	balance, and description.
 * 			|	double, description: String)	|     |
 * 			|___________________________________|     |________________________________________________________________	
 * 
 *  */

class Transaction{
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	/** CREATED THE CONSTRUCTOR FOR EACH TRANSACTION */
	Transaction(char type, double amount, double balance, String description){
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	/** CREATED GETTERS AND SETTER - ONLY NOT SET DATE BECAUSE THE DATE IS ONLY CREATED ON THE CONSTRUCTOR */
	public java.util.Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", type=" + type + ", amount=" + amount + ", balance=" + balance
				+ ", description=" + description + "]";
	}
	
	
	
}