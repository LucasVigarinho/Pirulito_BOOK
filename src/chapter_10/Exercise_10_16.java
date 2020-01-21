package chapter_10;

import java.math.BigDecimal;
import java.math.BigInteger;

/** 
 * 			
 * 	(Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that are
 * 	divisible by 2 or 3.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_16{

	/** Creating the main method */
	public static void main(String[] arg) {

		BigInteger bigNumber = new BigInteger("100000000000000000000000000000000000000000000000000");

		int count = 0;

		do {
			boolean temp2 = bigNumber.remainder(new BigInteger("2")).equals(BigInteger.ZERO);
			boolean temp3 = bigNumber.remainder(new BigInteger("3")).equals(BigInteger.ZERO);
			if(temp2 || temp3) {

				count++;
				System.out.print("\nNumber\t" + (count) + "\t->" + bigNumber);
			}
			bigNumber = bigNumber.add(BigInteger.ONE);

		}while(count < 10);

		String a = "a";
		System.out.print(a);
		
		a = "João";
		
		System.out.print(a);
	}//closing the main method



}//closing the Exercise_10_01 method (used as driver method)



