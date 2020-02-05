package chapter_10;

/** 
 * 			
 * 	(Implement the String class) The String class is provided in the Java library.
 * 	Provide your own implementation for the following methods (name the new
 * 	class MyString1):
 * 	public MyString1(char[] chars);
 * 	public char charAt(int index);
 * 	public int length();
 * 	public MyString1 substring(int begin, int end);
 * 	public MyString1 toLowerCase();
 * 	public boolean equals(MyString1 s);
 * 	public static MyString1 valueOf(int i);
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_22 */
public class Exercise_10_22{

	/** Creating the main method */
	public static void main(String[] arg) {
		/** public MyString1(char[] chars); */
		MyString1 test1 = new MyString1(new char [] {'T', 'e', 's', 't', 'i', 'n', 'g'});
		MyString1 test2 = new MyString1(new char [] {'T', 'e', 's', 't', 'i', 'n', 'g'});
		MyString1 test3 = new MyString1(new char [] {'T', 'e', 's', 't', 'e', 'd'});

		System.out.print("\n\n\tPrint test1 \t\t\t\t\t-> " + toString(test1));
		System.out.print("\n\tPrint test2 \t\t\t\t\t-> " + toString(test2));
		System.out.print("\n\tPrint test3 \t\t\t\t\t-> "+ toString(test3));




		System.out.print("\n\n\tpublic int length(); \t\t\t-> " + test1.length());
		System.out.print("\n\tpublic int length(); \t\t\t-> " + test2.length());
		System.out.print("\n\tpublic int length(); \t\t\t-> "+ test3.length());

		/** 	public char charAt(int index); */
		System.out.print("\n\n\tpublic boolean equals(MyString1 s); \t\t\t-> " + test1.equals((test2)));
		System.out.print("\n\tpublic boolean equals(MyString1 s); \t\t\t-> " + test1.equals((test3)));


		System.out.print("\n\n\tpublic char charAt(int index); \t\t-> " + test1.charAt(4));
		System.out.print("\n\tpublic char charAt(int index); \t\t-> " + test2.charAt(4));
		System.out.print("\n\tpublic char charAt(int index);\t\t-> " + test3.charAt(5));

		System.out.print("\n\n\tpublic MyString1 substring(int begin, int end); \t\t-> " + toString(test1.substring(2, 4)));
		System.out.print("\n\tpublic MyString1 substring(int begin, int end); \t\t-> "  + toString(test2.substring(2, 4)));
		System.out.print("\n\tpublic MyString1 substring(int begin, int end); \t\t-> "  + toString(test3.substring(2, 6)));

		System.out.print("\n\n\tpublic int length(); \t\t\t-> " + test1.length());
		System.out.print("\n\tpublic int length(); \t\t\t-> " + test2.length());
		System.out.print("\n\tpublic int length(); \t\t\t-> "+ test3.length());

		System.out.print("\n\n\tpublic MyString1 toLowerCase(); \t\t\t-> " + toString(test1.toLowerCase()));
		System.out.print("\n\tpublic MyString1 toLowerCase(); \t\t\t-> " + toString(test2.toLowerCase()));
		System.out.print("\n\tpublic MyString1 toLowerCase(); \t\t\t-> "+ toString(test3.toLowerCase()));
		

		MyString1 testValue1 = MyString1.valueOf(test1.charAt(4));
		MyString1 testValue2 = MyString1.valueOf(test1.charAt(5));

		System.out.print("\n\n\tpublic static MyString1 valueOf(int i); \t-> " + toString(testValue1));
		System.out.print("\n\tpublic static MyString1 valueOf(int i); \t-> " +  toString(testValue2));



	}//closing the main method

	public static String toString(MyString1 test) {
		return new String(test.toChars());
	}

}//closing the Exercise_10_22 method (used as driver method)

/** (Implement the String class) ... (name the new class MyString1):*/
class MyString1 {

	private char [] chars;

	/** 	public MyString1(char[] chars); */
	MyString1(char[] chars){
		this.chars = chars;
	}

	/** 	public char charAt(int index); */
	public char charAt(int index) {
		if (index < 0 || index > length() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return chars[index];
	}

	/** 	public int length();*/
	public int length() {
		return chars.length;
	}

	/** 	public MyString1 substring(int begin, int end); */
	public MyString1 substring(int begin, int end) {
		if (begin < 0 || end > length() || begin > end) {
			throw new IndexOutOfBoundsException();
		}
		char[] sub = new char[end - begin];
		for (int i = 0, j = begin; j < end; i++, j++) {
			sub[i] = chars[j];
		}
		return new MyString1(sub);

	}

	/** 	public MyString1 toLowerCase(); */
	public MyString1 toLowerCase() {
		char[] replacement = new char[length()];
		for (int i = 0; i < length(); i++) {
			char c = charAt(i);
			if (c >= 'A' && c <= 'Z') {
				replacement[i] = (char)(c + 32);
			} else {
				replacement[i] = c;
			}
		}
		return new MyString1(replacement);
	}

	/** 	public boolean equals(MyString1 s); */
	public boolean equals(MyString1 s) {
		if (s.length() != length()) { return false; }
		for (int i = 0; i < length(); i++) {
			if (charAt(i) != s.charAt(i)) { return false; }
		}
		return true;
	}
	/** 	public static MyString1 valueOf(int i); */
	public static MyString1 valueOf(int i) {

		int count = 0;
		int n = i;
		while (n != 0) {
			n /= 10;
			count++;
		}

		char[] num = new char[count];
		for (int idx = num.length - 1; idx >= 0; idx--) {
			num[idx] = (char)((i % 10) + 48);
			i /= 10;
		}

		return new MyString1(num);
	}

	/** public char[] toChars();					*/
	public char[] toChars() {
		return this.chars;
	}

}//closing MyString2 new class


