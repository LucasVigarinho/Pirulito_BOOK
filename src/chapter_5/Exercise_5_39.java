package chapter_5;


/**    ************* Description of the Exercise_5_39 *************
 * 		(Financial application: find the sales amount) You have just started a sales job
 * 		in a department store. Your pay consists of a base salary and a commission. The
 * 		base salary is $5,000. The scheme shown below is used to determine the commission
 * 		rate.
 * 
 * 					Sales Amount 							Commission Rate
 * 					--------------------------------------------------------------
 * 					$0.01–$5,000 									8 percent
 * 					$5,000.01–$10,000 							   10 percent
 * 					$10,000.01 and above                           12 percent
 * 
 * 		Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 * 		$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
 * 		is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * 
 * 		Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 * 		you have to generate in order to make $30,000.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;


/** Creating the class named Exercise_5_39 */
public class Exercise_5_39 {

	/** Creating the main method */
	public static void main(String[] arg) {

		DecimalFormat df0 = new DecimalFormat("###,###.00");
				
		//create the necessary variables
		double sales = 0;
		double comission = 0;
		double salesXcomission = 0;
		
		//calculation
		//Open a do while loop in order to calculate the ranges
		do {
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
			
			
		}while(comission <= 30000);//closing for loop
		
		System.out.print("\n\n\tNecessary sales "+ df0.format( + sales) + " Total Comission " + df0.format(comission));
		
	}//closing the main method


}//closing the class_5_39
