package chapter_10;

/** 
 * 			
 * 	(Square numbers) Find the first ten square numbers that are greater than
 * 	Long.MAX_VALUE. A square number is a number in the form of n2. For example,
 * 	4, 9, and 16 are square numbers. Find an efficient approach to run your
 * 	program fast.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.math.BigDecimal;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_17{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Created the data type BigDecimal longMaxValue to compare the results */
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        long start = (long) Math.sqrt(Long.MAX_VALUE); //created a start data variable in order to multiply this number every loop
        BigDecimal n = new BigDecimal(start);//created the BigDecimal variable in order to be the number to be calculated
        int count = 0;

        //created a while for loop with max of ten loops
        while (count < 10) {

        	//created a squared number, which means the first start long number multiply by each self every loop
            BigDecimal squared = n.multiply(n);
            if (squared.compareTo(longMaxValue) > 0) {
                count++;//max of loops every one loop
                System.out.println(count +": " + n + " squared = " + squared);//printed the result
            }
            n = n.add(BigDecimal.ONE); //increase one BigDecimal number up to the last number calculated
        }//closing the while loop
    
		

	}//closing the main method

	

}//closing the Exercise_10_01 method (used as driver method)



