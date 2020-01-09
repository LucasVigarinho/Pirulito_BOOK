package chapter_05;



/**    ************* Description of the Exercise_5_42 *************
 * 
 * 
 * 		(Financial application: find the sales amount) Rewrite Programming Exercise
 * 		5.39 as follows:
 * 
 * 		Use a for loop instead of a do-while loop.
 * 		■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 *  * 		
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;
import java.util.Scanner;

/** Creating the class named Exercise_5_42 */
public class Exercise_5_42 {
	
	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df0 = new DecimalFormat("###,###.00");
		Scanner input = new Scanner(System.in);
		//create the necessary variables
		double sales = 0;
		double salesXcomission = 0;
		
		System.out.print("\n\n\tPlease, enter the Commission_Sought -> ");
		double comissionSought = input.nextDouble();
		double comission1 = 0;
		//calculation
		//Open a for loop in order to calculate the ranges
		for(double comission = 0;comission <= comissionSought;) {
			//always generates a new value of salesXcomission to descont the actual value of the sales
			salesXcomission = comission = 0;
			sales += 0.01;
			
			//creating an if statement in order to calculate the ranges
			if (sales <= 5000) {
				comission+=((salesXcomission)*0.08); //Commission is the value of the actual sales times the range, more the last commission
			}else if(sales > 5000 && sales <=10000) {
				comission+=((salesXcomission=sales-5000)*0.10);//Commission is the value of the actual sales times the range, more the last commission
			}else {
				comission+=((salesXcomission=sales-10000)*0.12);//Commission is the value of the actual sales times the range, more the last commission
			}//closing if statement
			
			comission1 = comission;
		}//closing for loop
		
		System.out.print("\n\n\tNecessary sales "+ df0.format( + sales) + " Total Comission " + df0.format(comission1));
	

		input.close();
		
	}//closing the main method


}//closing the class_5_42
