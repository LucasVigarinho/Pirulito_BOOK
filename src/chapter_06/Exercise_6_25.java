package chapter_06;

/**
 * 
 * 		(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
 * 		milliseconds to hours, minutes, and seconds using the following header:
 * 
 * 		public static String convertMillis(long millis)
 * 
 * 		The method returns a string as hours:minutes:seconds. For example,
 * 		convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 * 		a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 * @author lucasmaximo
 *
 */
public class Exercise_6_25 {


	//create the main method
	public static void main(String[] args) {


		long millis = System.currentTimeMillis();  

		System.out.println("\n\n\t"+ convertMillis(millis));


	}//closing main method

	/** Created converMillis method in order to return the current time */
	public static String convertMillis(long millis) {

		java.util.Date date2 = new java.util.Date(millis);  
		String str = String.valueOf(date2);
		return str;
	}//closing the convertMillis method

}//closing exercise 6 25 class
