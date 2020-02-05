package chapter_10;

/** 
 * 			
 * 	(Implement the String class) The String class is provided in the Java library.
 * 	Provide your own implementation for the following methods (name the new
 * 	class MyString2):
 * 	public MyString2(String s);
 * 	public int compare(String s);
 * 	public MyString2 substring(int begin);
 * 	public MyString2 toUpperCase();
 * 	public char[] toChars();
 * 	public static MyString2 valueOf(boolean b);
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_23 */
public class Exercise_10_23{

	/** Creating the main method */
	public static void main(String[] arg) {

		
		MyString2 test1 = new MyString2("Testing String Test ");
		MyString2 test2 = new MyString2("Testing String Test ");
		MyString2 test3 = new MyString2("Testing String Tested ");

		System.out.print("\n\n\tPrint test1 \t\t\t\t\t-> " + toString(test1));
		System.out.print("\n\tPrint test2 \t\t\t\t\t-> " + toString(test2));
		System.out.print("\n\tPrint test3 \t\t\t\t\t-> "+ toString(test3));
		
		
		System.out.print("\n\n\tpublic int compare(String s); \t\t\t-> " + test1.compare(toString(test2)));
		System.out.print("\n\tpublic int compare(String s); \t\t\t-> " + test1.compare(toString(test3)));


		System.out.print("\n\n\tpublic MyString2 substring(int begin); \t\t-> " + toString(test1.substring(4)));
		System.out.print("\n\tpublic MyString2 substring(int begin); \t\t-> " + toString(test2.substring(4)));
		System.out.print("\n\tpublic MyString2 substring(int begin); \t\t-> " + toString(test3.substring(4)));

		System.out.print("\n\n\tpublic MyString2 toUpperCase(); \t\t-> " + toString(test1.toUpperCase()));
		System.out.print("\n\tpublic MyString2 toUpperCase(); \t\t-> " + toString(test2.toUpperCase()));
		System.out.print("\n\tpublic MyString2 toUpperCase(); \t\t-> " + toString(test3.toUpperCase()));

		System.out.print("\n\n\tpublic char[] toChars(); \t\t\t-> " );
		char[] chars1 = test1.toChars();
		for (char ch: chars1) {
			System.out.print(ch);
		}
		System.out.print("\n\tpublic char[] toChars(); \t\t\t-> " );
		char[] chars2 = test2.toChars();
		for (char ch: chars2) {
			System.out.print(ch);
		}
		System.out.print("\n\tpublic char[] toChars(); \t\t\t-> " );
		char[] chars3 = test3.toChars();
		for (char ch: chars3) {
			System.out.print(ch);
		}
		
		MyString2 testValue1 = MyString2.valueOf(true);
		MyString2 testValue2 = MyString2.valueOf(false);

		System.out.print("\n\n\tpublic static MyString2 valueOf(boolean b); \t-> " + toString(testValue1));
		System.out.print("\n\tpublic static MyString2 valueOf(boolean b); \t-> " +  toString(testValue2));


	}//closing the main method

	public static String toString(MyString2 test) {
		return new String(test.toChars());
	}
	

}//closing the Exercise_10_23 method (used as driver method)




/** (Implement the String class) ... (name the new class MyString2):*/
class MyString2 {
	
	private char[] chars;

	
	/** public MyString2(String s); 				*/
	public MyString2(String s) {
		chars = s.toCharArray();
	}
	
	/** Created the constructor of its class	 	*/
	MyString2(char[] chars){
		this.chars = chars;
	}//closing constructor of the MyString2 new String class
	
	/**	public int compare(String s); 				*/
	public int compare (String s) {
		MyString2 test1; 
	    MyString2 testS; 
	    if (length() <= s.length()) {
	    	test1 = new MyString2(chars);
	    	testS = new MyString2(s);
	    } else {
	    	test1 = new MyString2(s);
	    	testS = new MyString2(chars);
	    }

	   
	    for (int a = 0; a < test1.length(); a++) {
	      if (test1.charAt(a) != testS.charAt(a)) {
	        return (int)(test1.charAt(a) - testS.charAt(a));
	      }
	    }

	    
	    if (length() < s.length() || length() > s.length()) {
	      return length() - s.length();
	    }

	    // otherwise, they must be equal
	    return 0;
	}
	
	/** Created auxiliary length() function */
	public int length() {
		return chars.length;
	}

	public char charAt(int index) {
		if (index < 0 || index > length() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return chars[index];
	}
	
	/**	public MyString2 substring(int begin); 		*/
	public MyString2 substring(int begin) {
		
	    if (begin < 0 || begin > length() - 1) {
	      throw new IndexOutOfBoundsException();
	    }
	    
	    char[] sub = new char[length() - begin];
	    
	    for (int b = 0, c = begin; c < length(); b++, c++) {
	      sub[b] = charAt(c);
	    }
	    return new MyString2(sub);
	  }

	/** public MyString2 toUpperCase(); 			*/
	public MyString2 toUpperCase() {
	    char[] replacement = new char[length()];
	    
	    for (int i = 0; i < length(); i++) {
	      char c = charAt(i);
	      if (c >= 'a' && c <= 'z') {
	        replacement[i] = (char)(c - 32);
	      } else {
	        replacement[i] = c;
	      }
	    }
	    return new MyString2(replacement);
	  }
	
	/** public char[] toChars();					*/
	public char[] toChars() {
		return this.chars;
	}
	/** public static MyString2 valueOf(boolean b);	*/
	public static MyString2 valueOf(boolean b) {
		return new MyString2 (b ? "true":"false");
	}
	
	
}//closing MyString2 new class


