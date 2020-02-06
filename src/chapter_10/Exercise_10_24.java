package chapter_10;

/** 
 * 			
 * 	(Implement the Character class) The Character class is provided in the Java
 * 	library. Provide your own implementation for this class. Name the new class
 * 	MyCharacter.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_24{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Creating a test for all the methods created */
		/** Created a constructor test */
		MyCharacter test1 = new MyCharacter('a');
		MyCharacter test2 = new MyCharacter('b');
		MyCharacter test3 = new MyCharacter('a');

		
		/** Created charValue test */
		System.out.print("\n\tTesting charValue method test1 (variable) \t-> " + test1.charValue());
		System.out.print("\n\tTesting charValue method test2 (variable)\t-> " + test2.charValue());
		System.out.print("\n\tTesting charValue method test3 (variable)\t-> " + test3.charValue());
		System.out.println();

		/** Created valueOf method */
		System.out.print("\n\tTesting valueOf method test1 (variable) \t-> " + Character.toString(test1.charValue()));
		System.out.print("\n\tTesting valueOf method test2 (variable) \t-> " + Character.toString(test1.charValue()));
		System.out.print("\n\tTesting valueOf method test3 (variable) \t-> " + Character.toString(test1.charValue()));
		System.out.println();

		/** Created compareTo method */
		System.out.print("\n\tTesting compareTo method test1 (variable) \t-> " + test1.compareTo(test2));
		System.out.print("\n\tTesting compareTo method test2 (variable) \t-> " + test2.compareTo(test3));
		System.out.print("\n\tTesting compareTo method test3 (variable) \t-> " + test3.compareTo(test1));
		System.out.println();

		/** Created compare method */
		System.out.print("\n\tTesting compare method test1 (variable) \t-> " + test1.compare(test1.charValue(), test2.charValue()));
		System.out.print("\n\tTesting compare method test2 (variable) \t-> "  + test1.compare(test2.charValue(), test3.charValue()));
		System.out.print("\n\tTesting compare method test3 (variable) \t-> "  + test1.compare(test1.charValue(), test3.charValue()));
		System.out.println();

		/** Created equals method */
		System.out.print("\n\tTesting equals method test1 (variable) \t\t-> " + test1.equals(test2));
		System.out.print("\n\tTesting equals method test2 (variable) \t\t-> " + test2.equals(test3));
		System.out.print("\n\tTesting equals method test3 (variable) \t\t-> " + test3.equals(test1));
		System.out.println();

		/** Created toLowerCase method */
		System.out.print("\n\tTesting toLowerCase method test1 (variable) \t-> " + test1.toLowerCase(test2.charValue()));
		System.out.print("\n\tTesting toLowerCase method test2 (variable) \t-> " + test2.toLowerCase(test3.charValue()));
		System.out.print("\n\tTesting toLowerCase method test3 (variable) \t-> " + test3.toLowerCase(test1.charValue()));
		System.out.println();

		/** Created toUpperCase method */
		System.out.print("\n\tTesting toUpperCase method test1 (variable) \t-> " + test1.toUpperCase(test2.charValue()));
		System.out.print("\n\tTesting toUpperCase method test2 (variable) \t-> " + test2.toUpperCase(test3.charValue()));
		System.out.print("\n\tTesting toUpperCase method test3 (variable) \t-> " + test3.toUpperCase(test1.charValue()));
		System.out.println();

		/** Created isDigit method */
		System.out.print("\n\tTesting isDigit method test1 (variable) \t-> " + test1.isDigit(test2.charValue()));
		System.out.print("\n\tTesting isDigit method test2 (variable) \t-> "  + test2.isDigit(test3.charValue()));
		System.out.print("\n\tTesting isDigit method test3 (variable) \t-> " + test3.isDigit(test1.charValue()));
		System.out.println();

		/** Created isLetter method */
		System.out.print("\n\tTesting isLetter method test1 (variable) \t-> " + Character.isLetter(test1.charValue()));
		System.out.print("\n\tTesting isLetter method test2 (variable) \t-> "  + Character.isLetter(test2.charValue()));
		System.out.print("\n\tTesting isLetter method test3 (variable) \t-> "  + Character.isLetter(test3.charValue()));


		/** Created isLetterOrDigit method */
		System.out.print("\n\tTesting isLetterOrDigit method test1 (variable) -> " + Character.isLetterOrDigit(test1.charValue()));
		System.out.print("\n\tTesting isLetterOrDigit method test2 (variable) -> " + Character.isLetterOrDigit(test2.charValue()));
		System.out.print("\n\tTesting isLetterOrDigit method test3 (variable) -> " + Character.isLetterOrDigit(test3.charValue()));

	}


}//closing the Exercise_10_01 method (used as driver method)


/** (Implement the Character class) 
 * 	Name the new class MyCharacter.*/
class MyCharacter{

	/** Created a variable */
	private char chare;

	/** Created a constructor */
	public MyCharacter(char chare) {
		this.chare = chare;
	}//closed MyCharacter Constructor

	/** Created charValue method */
	public char charValue() {
		return chare;
	}//closed charValue method


	/** Created valueOf method */
	public MyCharacter valueOf(char c) {
		return new MyCharacter(c);
	}//closed valueOf method

	/** Created compareTo method */
	public int compareTo(MyCharacter c) {
		return charValue() - c.charValue();
	}//closed compareTo method

	/** Created compare method */
	public int compare(char x, char y) {
		return Character.valueOf(x).compareTo(Character.valueOf(y));
	}//closed compare method

	/** Created equals method */
	public boolean equals(MyCharacter c) {
		if (compareTo(c) == 0) { 
			return true; 
		}else {
			return false;
		}
	}//closed equals method

	/** Created toLowerCase method */
	public char toLowerCase(char ch) {
		if (ch >= 'A' && ch <= 'Z') { 
			return (char)(ch + 32); 
		}else {
			return ch;
		}
	}//closed toLowerCase method

	/** Created toUpperCase method */
	public char toUpperCase(char ch) {
		if (ch >= 'a' && ch <= 'z') { 
			return (char)(ch - 32); 
		}else {
			return ch;
		}
	}//closed toUpperCase method

	/** Created isDigit method */
	public boolean isDigit(char c) {
		if (c >= '0' && c <= '9') { 
			return true; 
		}else {
			return false;
		}
	}//closed isDigit method

	/** Created isLetter method */
	public boolean isLetter(char c) {
		if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) { 
			return true; 
		}else{
			return false;
		}
	}//closed the isLetter method

	/** Created isLetterOrDigit method */
	public boolean isLetterOrDigit(char c) {
		return (isDigit(c) || isLetter(c))?true:false;
	}//closed the isLetterOrDigit method


}//closed the MyCharacter class
