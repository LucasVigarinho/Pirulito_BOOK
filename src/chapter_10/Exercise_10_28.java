package chapter_10;

/** 
 * 			
 * 	(Implement the StringBuilder class) The StringBuilder class is provided
 * 	in the Java library. Provide your own implementation for the following methods
 * 	(name the new class MyStringBuilder2):
 * 	public MyStringBuilder2();
 * 	public MyStringBuilder2(char[] chars);
 * 	public MyStringBuilder2(String s);
 * 	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
 * 	public MyStringBuilder2 reverse();
 * 	public MyStringBuilder2 substring(int begin);
 * 	public MyStringBuilder2 toUpperCase();
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_28{
 int a = 10;
 
	/** Creating the main method */
	public static void main(String[] arg) {

		new Exercise_10_28().print();
		String s = "Java";
		s += (" SE 6");
		s.replace('6', '7');	
		System.out.print(s);
	}//closing the main method

	
	public void print() {
		int a = 8;
		System.out.print(a + " ");
	}

}//closing the Exercise_10_01 method (used as driver method)



