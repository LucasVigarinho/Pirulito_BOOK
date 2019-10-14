package chapter_5;


/**    ************* Description of the Exercise_5_22 *************
 * 
 * 
 * 		For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java.
 * 		(Financial application: loan amortization schedule) The monthly payment for a
 * 		given loan pays the principal and the interest. The monthly interest is computed
 * 		by multiplying the monthly interest rate and the balance (the remaining principal).
 * 		The principal paid for the month is therefore the monthly payment minus
 * 		the monthly interest. Write a program that lets the user enter the loan amount,
 * 		number of years, and interest rate and displays the amortization schedule for the
 * 		loan. Here is a sample run:
 * 
 * 
 * 		Loan Amount: 10000
 * 		Number of Years: 1
 * 		Annual Interest Rate: 7
 * 
 * 		Monthly Payment: 865.26
 * 		Total Payment: 10383.21
 * 
 * 		Payment# 	Interest 	Principal 	Balance
 * 		1 			58.33 		806.93 		9193.07
 * 		2 			53.62 		811.64 		8381.43
 * 		...
 * 		11 			10.0 		855.26 		860.27
 * 		12 			5.01 		860.25 		0.01
 * 
 * 		Note
 * 		The balance after the last payment may not be zero. If so, the last payment should be
 * 		the normal monthly payment plus the final balance.
 * 
 * 		Hint: Write a loop to display the table. Since the monthly payment is the
 * 		same for each month, it should be computed before the loop. The balance
 * 		is initially the loan amount. For each iteration in the loop, compute the
 * 		interest and principal, and update the balance. The loop may look like this:
 * 
 * 		for (i = 1; i <= numberOfYears * 12; i++) {
 * 		interest = monthlyInterestRate * balance;
 * 		principal = monthlyPayment - interest;
 * 		balance = balance - principal;
 * 		System.out.println(i + "\t\t" + interest
 * 		+ "\t\t" + principal + "\t\t" + balance);
 * 		}
 * 		
 * 		@author lucasmaximo
 *  
 * */


/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_22 */
public class Exercise_5_22 {

	//create the main method
	public static void main(String[] args) {

		//create a variable to be utilized for Scanner Method
		Scanner input = new Scanner(System.in);
		//create the format model for digits after coma

		DecimalFormat twoDigits = new DecimalFormat("##.00");

		//Open the possibility to the user input the Amount
		System.out.print("\n\tThe Total Amount?  -> ");
		double loanAmount = input.nextDouble();//create a variable who is going to receive the inputed number

		//Open the possibility to the user input the number of years			
		System.out.print("\n\tNumber of Years?  ->");
		double numberOfYear = input.nextDouble();//create a variable who is going to receive the inputed number

		System.out.print("\n\tAnnual Interest Rate:  ->");
		double annualInterestRate = input.nextDouble();//create a variable who is going to receive the inputed number
		
		//Print out the Header of the information
		System.out.println("\n\n\t\tPayment " + "\t" + "\t" + "\t" + "Interest " + "\t" + "\t" + "\t" + "Principal " + "\t\tBalance");


		int months = 12;
		double balance = loanAmount, principal, interest;
		
		// Create a for loop to print out From 5% to 8%...
		for (int i = 1; i <= numberOfYear*12 ; i++) {

			
			// Obtain the monthly interest rate
			double monthlyInterestRate = annualInterestRate / (months*100);

			//create the variable to apply the equation to subtract the monthly payment
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYear * months));
			
			//create the variable total payment
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			

			//print the results inside the for loop
			System.out.print("\n\t\t" + i + "\t" + "\t" + "\t"  + "\t"  );
			System.out.print(twoDigits.format(interest)  + "\t" + "\t" + "\t"+ "\t" );
			System.out.print( twoDigits.format(principal)+ "\t" + "\t" + "\t");
			System.out.print( twoDigits.format(balance));
		}
		//printing a space for better visualization
		System.out.println(" ");

		//close the input used for Scanner method
		input.close();

	}//closing main method


}//closing the class_5_22

