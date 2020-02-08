package chapter_10;

/** 
 * 			
 * 	(Implement the StringBuilder class) The StringBuilder class is provided
 * 	in the Java library. Provide your own implementation for the following methods
 * 	(name the new class MyStringBuilder1):
 * 	public MyStringBuilder1(String s);
 * 	public MyStringBuilder1 append(MyStringBuilder1 s);
 * 	public MyStringBuilder1 append(int i);
 * 	public int length();
 * 	public char charAt(int index);
 * 	public MyStringBuilder1 toLowerCase();
 * 	public MyStringBuilder1 substring(int begin, int end);
 * 	public String toString();
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */

/** Creating the class named Exercise_10_27 */
public class Exercise_10_27{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Testing all the methods */
		/** public MyStringBuilder1(String s); */
		MyStringBuilder1 test = new MyStringBuilder1("Lucas");
		System.out.println(test.toString());
//		/** public MyStringBuilder1 append(MyStringBuilder1 s);*/
		test.append(new MyStringBuilder1 (" Maximo"));
		System.out.println(test.toString());

//		/**	public MyStringBuilder1 append(int i);*/
		test.append(16);
		System.out.println(test.toString());

//		/**	public int length();*/
		System.out.println(test.length());
		
//		/**	public char charAt(int index);*/
		System.out.println(test.charAt(01));

//		/**	public MyStringBuilder1 toLowerCase();*/
		System.out.println(test.toLowerCase().toString());
	
//		/**	public MyStringBuilder1 substring(int begin, int end);*/
		System.out.println((test.substring(1, 5).toString()));
//		
//		/**	public String toString();*/
//		System.out.print(test);

	}//closing the main method

	

}//closing the Exercise_10_27 method (used as driver method)


/** (Implement the StringBuilder class) ...	(name the new class MyStringBuilder1): */
class MyStringBuilder1{

	//created the initial necessary variable
	private String  chars;
	
/**	public MyStringBuilder1(String s); */
	public MyStringBuilder1(String s) {
		chars = s;
	}
	
/** public MyStringBuilder1 append(MyStringBuilder1 s); */
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(chars += s);
	}
	
/** public MyStringBuilder1 append(int i); */
	public MyStringBuilder1 append(int i) {
		return append(new MyStringBuilder1(Character.toString( Character.valueOf((char)i))));
	}
/** public int length(); */
	public int length() {
		return chars.length();
	}
	
/** public char charAt(int index); */
	public char charAt(int index) {
		
		return chars.toCharArray()[index];
	}

/** public MyStringBuilder1 toLowerCase(); */
	public MyStringBuilder1 toLowerCase() {
		char [] lower = chars.toCharArray();
		
		for(int i = 0; i < lower.length; i++) {
			if(lower[i] >= 'A' && lower[i] <='Z'){
				lower[i] = (char) ((char) lower[i] + 32);
			}
		}
		String ans = new String(lower);
		return new MyStringBuilder1(ans);
	}

/** public MyStringBuilder1 substring(int begin, int end); */
	public MyStringBuilder1 substring(int begin, int end) {
		char[] subChar = new char [(end - begin)+1];
//		char[] temp = chars.toCharArray();
		for(int i = begin; i < end; i++ ) {
			subChar[i] = chars.charAt(i);
		}
		String ans = new String(subChar);


		return new MyStringBuilder1(ans);
	}
	@Override
/** public String toString(); */
	 public String toString() {
		 return this.chars;
	 }

}//closed MyStringBuilder1 class
