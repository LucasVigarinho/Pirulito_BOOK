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


/** Creating the class named Exercise_10_28 */
public class Exercise_10_28{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Testing all the methods */
		/** 	public MyStringBuilder2(); */
		MyStringBuilder2 test = new MyStringBuilder2();
		
		/** 	public MyStringBuilder2(char[] chars); */
		MyStringBuilder2 test1 = new MyStringBuilder2(new char[] {'l','u','c','a','s'});
		System.out.println("\n"+ test1.toString());
		
		/** 	public MyStringBuilder2(String s); */
		MyStringBuilder2 test2 = new MyStringBuilder2("Lucas");
		System.out.println("\n"+ test2.toString());
		
		/** 	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s); */
		
		System.out.println("\n"+ test1.insert(2, test2));
		
		/** 	public MyStringBuilder2 reverse(); */
		System.out.println("\n"+ test2.reverse());
		
		/** 	public MyStringBuilder2 substring(int begin); */
		System.out.println("\n"+ test1.substring(2));
		
		/** 	public MyStringBuilder2 toUpperCase(); */
		System.out.println("\n"+ test2.toUpperCase());

	}//closing the main method

	

}//closing the Exercise_10_28 method (used as driver method)


/** (Implement the StringBuilder2 class) ...	(name the new class MyStringBuilder2): */
class MyStringBuilder2{
	
	private char[] chars;
	
	 /** 	public MyStringBuilder2();*/
	public MyStringBuilder2() {
		this.chars =  new char[16];
	}
	 /** 	public MyStringBuilder2(char[] chars); */
	public MyStringBuilder2(char[] chars) {
		this.chars = chars;
	}
	
	/** 	public MyStringBuilder2(String s);*/
	public MyStringBuilder2(String s) {
		this.chars = s.toCharArray();
	}
	/** 	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);*/
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String newStr = "";
		int i;
		for (i = 0; i < offset; i++) {
			if (i < offset)
				newStr += this.chars[i] + "";
		}
		newStr += s;
		return new MyStringBuilder2(newStr + substring(offset));
	}
	/** 	public MyStringBuilder2 reverse();*/
	public MyStringBuilder2 reverse() {
		String newStr = "";
		for (int i = chars.length - 1; i >= 0; i--) {
			newStr += chars[i] + "";
		}
		return new MyStringBuilder2(newStr);
	}
	/** 	public MyStringBuilder2 substring(int begin);*/
	public MyStringBuilder2 substring(int begin) {
		String newStr = "";
		for (int i = begin; i < chars.length; i++) {
			newStr += chars[i] + "";
		}
		return new MyStringBuilder2(newStr);
	}
	
	 /** 	public MyStringBuilder2 toUpperCase();*/
	public MyStringBuilder2 toUpperCase() {
		String newStr = "";
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z')
				newStr += (char)(chars[i] - 32) + "";
			else
				newStr += chars[i] + "";
		}
		return new MyStringBuilder2(newStr);
		
	}
	@Override
/** public String toString(); */
	 public String toString() {
		String ans = new String (this.chars);
		 return ans;
	 }
}//closed MyStringBuilder2 class
