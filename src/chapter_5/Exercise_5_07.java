package chapter_5;


/**    ************* Description of the Exercise_5_7 *************
 * 
 * 		(Financial application: compute future tuition) Suppose that the tuition for a university
 * 		is $10,000 this year and increases 5% every year. In one year, the tuition
 * 		will be $10,500. Write a program that computes the tuition in ten years and the
 * 		total cost of four years’ worth of tuition after the tenth year.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_5_7 */
public class Exercise_5_07 {

	/** Creating the main method */
	public static void main(String[] arg) {
		
		DecimalFormat df = new DecimalFormat("####.00");
		
		double universityYear = 0;
		double universityFee = 10000;
		double taxYear = (5.0 / 100);
		
		for (int i = 1; i <= 10 ; i++) {
			if(i <= 4) {
			universityYear += (universityYear * taxYear) + universityFee;

			}else {
				universityYear += (universityYear * taxYear);
			}
			System.out.print("\n\n\tUniversity year " + i + " \t " + df.format(universityYear ));
		}
		System.out.print("\n\n\tUniversity TOTAL ->\t " + df.format((universityYear)));
		
	}//closing the main method


}//closing the class_5_7
