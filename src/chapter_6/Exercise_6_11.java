package chapter_6;



/** 
 * 
 * 		(Financial application: compute commissions) Write a method that computes the
 * 		commission, using the scheme in Programming Exercise 5.39. The header of the
 * 		method is as follows:
 * 
 * 		public static double computeCommission(double salesAmount)
 * 
 * 		Write a test program that displays the following table:
 * 		
 * 		Sales Amount  	Commission
 * 		10000 		 	900.0
 * 		15000 			1500.0
 * 		...
 * 		95000 			11100.0
 * 		100000 			11700.0
 * 		
 * @author lucasmaximo
 *
 */
/** Importing libraries*/
import java.text.DecimalFormat;

/** Creating the main class as a public class */
public class Exercise_6_11 {

	/** Creating the method following the instructions*/
	public static double computeCommission(double salesAmount) {

		//create the necessary variables
		double sales = 0;
		double comission = 0;
		double salesXcomission = 0;

		//calculation

		//always generates a new value of salesXcomission to descont the actual value of the sales
		salesXcomission = comission = 0;

		//calculation
		//Open a do while loop in order to calculate the ranges
		do {
			//always generates a new value of salesXcomission to descont the actual value of the sales
			salesXcomission = comission = 0;
			sales += 0.01;

			// If sales amount is $10.000.01 and above commission rate is 12%
			if (sales >= 10000.01) {
				comission += (salesXcomission = salesAmount - 10000) * 0.12;
			}
			// If sales amount is $5,000.01 to $10,000 commissin rate is 10%
			if (sales >= 5000.01) {
				comission += (salesXcomission -= salesXcomission - 5000) * 0.10;
			}
			// If sales amount is $0.01 to $5,000.01 commissin rate is 8%
			if (sales >= 0.01) {
					comission += salesXcomission * 0.08;
			}
		}while(sales <= salesAmount);//closing for loop

		return comission;
	}//closing computeCommission method

	public static void main(String[] args) {

		DecimalFormat df0 = new DecimalFormat("######");
		DecimalFormat df1 = new DecimalFormat("######.0");


		System.out.print("\n\n\tSales Amount/tCommission");
		for (int i = 10000; i <= 100000; i+=5000) {
			System.out.print("\n\t"+ df0.format(i) + " Total Comission " + df1.format(computeCommission(i)));
		}


	}
}
