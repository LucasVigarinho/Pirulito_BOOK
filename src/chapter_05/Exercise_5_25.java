package chapter_05;


/**    ************* Description of the Exercise_5_25 *************
 * 
 * 		(Compute p) You can approximate p by using the following series:
 * 
 * 		PI = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ((-1)^(i+1))/2i-1)
 * 
 * 		Write a program that displays the p value for i = 10000, 20000, …, and
 * 		100000.
 * 
 *  @author lucasmaximo
 *  
 * */

/** Necessary imports */


/** Creating the class named Exercise_5_25 */
public class Exercise_5_25 {

	/** Creating the main method */
	public static void main(String[] arg) {



		//create the necessary variables
		double extra = 0;
		int l = 0;
		//create the for loop for the description
		for(int i = 10000; i <=100000 ; i +=10000) {
			for(int j = 3; j <= i -8; j +=8) {
					extra -= (1.0/j+ 1.0/(j+2.0) - (1.0/j+2+2.0) + (1.0/(j+2+2+2.0)));
			}//closing for loop
			double pi = ((4 * ((1 - extra + (Math.pow(-1, (i+1))/ ((2 * i) -1))))));
			System.out.print("\n\tPi with i being " + (l+=1) + "0000" + " is  -> " + pi );
		}
//		double pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ((-1)^(i+1))/2i-1)

	}//closing the main method


}//closing the class_5_25
