package chapter_10;

/** 
 * 			
 * 	(New string split method) The split method in the String class returns an
 * 	array of strings consisting of the substrings split by the delimiters. However, the
 * 	delimiters are not returned. Implement the following new method that returns
 * 	an array of strings consisting of the substrings split by the matching delimiters,
 * 	including the matching delimiters.
 * 	
 * 	public static String[] split(String s, String regex)
 * 
 * 	For example, 
 * 				split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String, and 
 * 				split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf, #, and e in an array of String.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_25{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Testing the method created */
		String test1 = new String("ab#12#453");
		String test2 = new String("a?b?gf#e");

		String[] test1_01 = split(test1, "#");
		for(int a = 0; a < test1_01.length ; a++) {
			System.out.println(test1_01[a]);
		}
		
		
		
		String[] test2_01 = test2.split( "[?#]");
		for(int a = 0; a < test2_01.length ; a++) {
			System.out.println(test2_01[a]);
		}

		

	}//closing the main method

	public static String[] split(String s, String regex) {

		String [] initial = new String [s.length()];
		int count = 0;

		for(int a = 0; a < s.length(); a++) {

			if(a == 0 || initial[count] == null) {
				if(s.charAt(a) == regex.charAt(0)){
					count++;
				}else {
					initial[count] = Character.toString(s.charAt(a));
				}
			}else {
				if(s.charAt(a) == regex.charAt(0)){
					count++;
				}else {
					initial[count] += Character.toString(s.charAt(a));
				}
			}

		}
		
		String [] result = new String [count+1];
		
		for(int b = 0; b < result.length ; b++) {
			result[b] = initial[b];
		}
		return result;
	}

}//closing the Exercise_10_01 method (used as driver method)




