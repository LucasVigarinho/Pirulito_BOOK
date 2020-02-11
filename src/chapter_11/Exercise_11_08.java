package chapter_11;

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


/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_08 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
	}//closing the mains method

	
}//closing class exercise_11_01
