package chapter_5;


/**    ************* Description of the Exercise_5_21 *************
 * 
 * 		(Financial application: compare loans with various interest rates) Write a program
 * 		that lets the user enter the loan amount and loan period in number of years
 * 		and displays the monthly and total payments for each interest rate starting from
 * 		5% to 8%, with an increment of 1/8. Here is a sample run:
 * 
 * 
 * 		Loan Amount: 10000
 * 		Number of Years: 5
 * 		Interest Rate 	Monthly Payment 		Total Payment
 * 		5.000% 			188.71 					11322.74
 * 		5.125% 			189.29 					11357.13
 * 		5.250% 			189.86 					11391.59
 * 		...
 * 		7.875% 			202.17 					12129.97
 * 		8.000% 			202.76 					12165.84
 * 
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_21 */
public class Exercise_5_21 {

	//create the main method
	public static void main(String[] args) {

		//create a variable to be utilized for Scanner Method
		Scanner input = new Scanner(System.in);
		//create the format model for digits after coma
		DecimalFormat threeDigits = new DecimalFormat("##.000");
		DecimalFormat twoDigits = new DecimalFormat("##.00");

		//Open the possibility to the user input the Amount
		System.out.print("\n\tThe Total Amount?  -> ");
		double loanAmount = input.nextDouble();//create a variable who is going to receive the inputed number

		//Open the possibility to the user input the number of years			
		System.out.print("\n\tNumber of Years?  ->");
		double numberOfYear = input.nextDouble();//create a variable who is going to receive the inputed number

		//Print out the Header of the information
		System.out.println("\n\n\t\tInterest Rate " + "\t" + "\t" + "\t" + "Monthly payment " + "\t" + "\t" + "\t" + "Total payment ");


		int months = 12;

		// Create a for loop to print out From 5% to 8%...
		for (double interestRate = 5.0; interestRate <= 8.0; interestRate = interestRate + 0.125) {

			// Obtain the monthly interest rate
			double monthlyInterestRate = interestRate / (months*100);

			//create the variable to apply the equation to subtract the monthly payment
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYear * months));

			//create the variable total payment
			double totalPayment = monthlyPayment * numberOfYear * months;



			//print the results inside the for loop
			System.out.print("\n\t\t" + threeDigits.format(interestRate)+ "%" + "\t" + "\t" + "\t"  + "\t"  );
			System.out.print(twoDigits.format(monthlyPayment)  + "\t" + "\t" + "\t"+ "\t" + "\t");
			System.out.print( twoDigits.format(totalPayment));
		}
		//printing a space for better visualization
		System.out.println(" ");

		//close the input used for Scanner method
		input.close();

	}//closing main method


}//closing the class_5_21
