package chapter_4;



/**    ************* Description of the Exercise_4_23 *************
 * 
 * 		(Financial application: payroll) Write a program that reads the following information
 * 		and prints a payroll statement:
 * 		Employee’s name (e.g., Smith)
 * 		Number of hours worked in a week (e.g., 10)
 * 		Hourly pay rate (e.g., 9.75)
 * 		Federal tax withholding rate (e.g., 20%)
 * 		State tax withholding rate (e.g., 9%)
 * 		A sample run is shown below:
 * 
 * 
 * 
 * 		Enter employee's name: Smith
 * 		Enter number of hours worked in a week: 10
 * 		Enter hourly pay rate: 9.75
 * 		Enter federal tax withholding rate: 0.20
 * 		Enter state tax withholding rate: 0.09
 * 		Employee Name: Smith
 * 		Hours Worked: 10.0
 * 		Pay Rate: $9.75
 * 		Gross Pay: $97.5
 * 		Deductions:
 * 		Federal Withholding (20.0%): $19.5
 * 		State Withholding (9.0%): $8.77
 * 		Total Deduction: $28.27
 * 		Net Pay: $69.22
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.util.Scanner;
import java.text.DecimalFormat;

/** Creating the class named Exercise_4_23 */
public class Exercise_4_23 {

	/** Creating the main method */
	public static void main(String[] arg) {

		//Create the object to make possible absorb the user inserction
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####,00");


		//print out the question to be answered by the user
		System.out.print("\n\n\tEnter employee's name: ");
		String name = input1.nextLine();
		System.out.println();
		//print out the question to be answered by the user
		System.out.print("\tEnter number of hours worked in a week: ");
		double weekHour = input1.nextDouble();
		System.out.println();
		System.out.print("\tEnter hourly pay rate: ");
		double payRate = input2.nextDouble();
		System.out.println();
		System.out.print("\tEnter federal tax withholding rate: ");
		double taxFederal = input2.nextDouble();
		System.out.println();
		System.out.print("\tEnter state tax withholding rate: ");
		double taxWith = input2.nextDouble();
		

		//		 * 		Employee Name: Smith
		System.out.println("\n\tEmployee Name: " + name);
		//		 * 		Hours Worked: 10.0
		System.out.println("\tHours Worked: " + df.format(weekHour));
		//		 * 		Pay Rate: $9.75
		System.out.println("\tPay Rate:  " + payRate);
		//		 * 		Gross Pay: $97.5
		System.out.println("\tGross Pay: " + df.format(weekHour*payRate));
//		Deductions:
		System.out.println("\tDeductions: ");
//			 * 		Federal Withholding (20.0%): $19.5
		System.out.println("\tFederal Withholding (" + taxFederal*100 +"%):" + df.format((weekHour*payRate)*taxFederal));
//			 * 		State Withholding (9.0%): $8.77
		System.out.println("\tState Withholding (" + taxWith*100 +"%):" + df.format(((weekHour*payRate)*taxWith)));
//			 * 		Total Deduction: $28.27
		System.out.println("\tTotal Deduction: $" + df.format(((weekHour*payRate)*taxFederal) + ((weekHour*payRate)*taxWith)));
//			 * 		Net Pay: $69.22
		System.out.println("\tNet Pay: $" + df.format((weekHour*payRate)-(((weekHour*payRate)*taxFederal) + ((weekHour*payRate)*taxWith))));

		input1.close();
		input2.close();


	}//closing the main method


}//closing the class_4_23
