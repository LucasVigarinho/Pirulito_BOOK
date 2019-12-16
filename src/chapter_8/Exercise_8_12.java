package chapter_8;
/** 
 * 
 * 		(Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
 * 		using arrays. For each filing status, there are six tax rates. Each rate is applied
 * 		to a certain amount of taxable income. For example, from the taxable income of
 * 		$400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%,
 * 		(82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
 * 		33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
 * 		statuses, which can be represented in the following array:
 * 
 * 		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 * 
 * 		The brackets for each rate for all the filing statuses can be represented in a twodimensional
 * 		array as follows:
 * 		
 * 
 * 		int[][] brackets = {
 * 		{8350, 33950, 82250, 171550, 372950}, // Single filer
 * 		{16700, 67900, 137050, 20885, 372950}, // Married jointly
 * 		// -or qualifying widow(er)
 * 		{8350, 33950, 68525, 104425, 186475}, // Married separately
 * 		{11950, 45500, 117450, 190200, 372950} // Head of household
 * 		};
 * 		Suppose the taxable income is $400,000 for single filers. The tax can be computed
 * 		as follows:
 * 		tax = brackets[0][0] * rates[0] +
 * 		(brackets[0][1] – brackets[0][0]) * rates[1] +
 * 		(brackets[0][2] – brackets[0][1]) * rates[2] +
 * 		(brackets[0][3] – brackets[0][2]) * rates[3] +
 * 		(brackets[0][4] – brackets[0][3]) * rates[4] +
 * 		(400000 – brackets[0][4]) * rates[5]
 * 
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_12{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Created an object necessary in order to let the user insert informations
		Scanner input = new Scanner(System.in);

		// Created the necessary array following the initial instructions
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

		// Created the multidimensional array following the initial instructions - brackets
		int[][] brackets = {
				{8350, 33950, 82250, 171550, 372950},  // Single filer
				{16700, 67900, 137050, 20885, 372950}, // Married jointly
				// -or qualifying widow(er)
				{8350, 33950, 68525, 104425, 186475},  // Married separately
				{11950, 45500, 117450, 190200, 372950}}; // Head of household
		

		// Printing out the guide for helping the user as a guide
		System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " +
																								"household) Enter the filing status: ");
		int status = getStatus();

		// Printing out the guide to the user interacts inputing the income to be taxable
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();


		// Display the final results
		System.out.printf("Tax is $%6.2f\n", computeTax(brackets, rates, status, income)); 
	}//closing the main method

	/** Created a method in order to receive the e matrix, the right rates based on the status, the properly status and the income */
	public static double computeTax(int[][] brackets, double[] rates, int status, double income) {
		//created the necessary variable in order to computed the values of tax and income 
		double tax = 0, incomeTaxed = 0;
		//created a for loop in order to run the brackets values based on the status and level in the multidimensional array
		for (int i = 4; i >= 0; i--) {
			//created an if statement in order to verify if the income is higher them the value of the brackets position in order to calculate
			if (income > brackets[status][i]) {
				tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
			}
			income -= incomeTaxed;
		} 
		return tax += brackets[status][0] * rates[0];
	}

	/** Created a get Status method in order to get the rigth status for each moment in the calculation */
	public static int getStatus(){
		//created the necessary object in order to to give the user opportunity to insert information
		Scanner input = new Scanner(System.in);
		int status;
		
		//created a do loop while status is not in the range of calculation
		do {
			status = input.nextInt();
			if (status < 0 || status > 3)
				System.out.println("Error: invalid status");
		} while (status < 0 || status > 3);
		
		input.close();
		return status;
	}



}//closing the class_8_01

