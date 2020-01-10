package chapter_10;

/** 
 * 			
 * 	(The MyInteger class) Design a class named MyInteger. The class contains:
 * 
 * 	■ An int data field named value that stores the int value represented by this
 * 	object.
 * 	■ A constructor that creates a MyInteger object for the specified int value.
 * 	■ A getter method that returns the int value.
 * 	■ The methods isEven(), isOdd(), and isPrime() that return true if the
 * 	value in this object is even, odd, or prime, respectively.
 * 	■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 * 	return true if the specified value is even, odd, or prime, respectively.
 * 	■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 * 	isPrime(MyInteger) that return true if the specified value is even, odd,
 * 	or prime, respectively.
 * 	■ The methods equals(int) and equals(MyInteger) that return true if
 * 	the value in this object is equal to the specified value.
 * 	■ A static method parseInt(char[]) that converts an array of numeric
 * 	characters to an int value.
 * 	■ A static method parseInt(String) that converts a string into an int
 * 	value.
 * 
 * 	Draw the UML diagram for the class and then implement the class. Write a client
 * 	program that tests all methods in the class.
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|							MyInteger  						|
 * 			|-----------------------------------------------------------|	
 * 			| - value: int   				  							|
 * 			|-----------------------------------------------------------|
 * 			| + MyInteger (value: int)									|
 * 			| + getValue(): int											|
 * 			| + isEven(): boolean										|
 * 			| + isOdd(): boolean										|
 * 			| + isPrime(): boolean										|
 * 			| + isEven(int value): boolean								|
 * 			| + isOdd(int value): boolean								|
 * 			| + isPrime(int value): boolean								|
 * 			| + isEven(MyInteger value): boolean						|
 * 			| + isOdd(MyInteger value): boolean							|
 * 			| + isPrime(MyInteger value): boolean						|
 * 			| + equals(int value): boolean								|
 * 			| + equals(MyInteger value): boolean						|
 * 			| + parseInt(char[] value): int								|
 * 			| + parseInt(String value): int								|
 * 			|___________________________________________________________| 
 * */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_03{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write a client program that tests all methods in the class. */		


	}//closing the main method



}//closing the Exercise_10_01 method (used as driver method)


/**  Design a class named MyInteger.  */
class MyInteger{

	/** ■ An int data field named value that stores the int value represented by this object. */
	private int value;

	/** ■ A constructor that creates a MyInteger object for the specified int value. */
	MyInteger(int value){
		this.value = value;
	}
	/** ■ A getter method that returns the int value. */
	public int getValue() {
		return value;
	}
	/** ■ The methods isEven(), isOdd(), and isPrime() that return true if the
	 * value in this object is even, odd, or prime, respectively. */
	public boolean isEven() {
		if(getValue() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

	
	public boolean isOdd() {
		return (isEven())?false:true;
	}

	public boolean isPrime() {
		//check if n is a multiple of 2
		if (getValue()%2==0 || getValue() == 1 || getValue() == 0) {
			return false;
		}
		
		if(getValue() == 2) { return true; }
		
		//if not, then just check the odds
		for(int i=3;i*i<=value;i+=2) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	/** ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
	 * return true if the specified value is even, odd, or prime, respectively. */
	public boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean isOdd(int value) {
		if(value % 2 == 0) {
			return false;
		}else {
			return true;
		}
	}

	public boolean isPrime(int value) {
		//check if n is a multiple of 2
		if (value%2==0) {
			return false;
		}

		//if not, then just check the odds
		for(int i=3;i*i<=value;i+=2) {
			if(value%i==0) {
				return false;
			}
		}
		return true;
	}
	/** ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
	 * isPrime(MyInteger) that return true if the specified value is even, odd,
	 * or prime, respectively. */
	public boolean isEven(MyInteger value) {
		if(value.isEven()) {
			return true;
		}else {
			return false;
		}
	}

	
	public boolean isOdd(MyInteger value) {
		if(value.isOdd()) {
			return false;
		}else {
			return true;
		}
	}

	public boolean isPrime(MyInteger value) {
		//check if n is a multiple of 2
		if(value.isEven()) {
			return true;
		}else {
			return false;
		}
	}

	/** ■ The methods equals(int) and equals(MyInteger) that return true if
	 * the value in this object is equal to the specified value. */
	public boolean equals(int value) {
		if(getValue() == value) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(MyInteger value) {
		if(getValue() == value.getValue() ) {
			return true;
		}else {
			return false;
		}
	}
	/** ■ A static method parseInt(char[]) that converts an array of numeric
	 * characters to an int value. */
	public int parseInt(char[] value) {
		String temp = "";
		for(int a = 0; a < value.length; a++) {
			temp += value[a];
		}
		
		return Integer.parseInt(temp);
	}
	
	/** ■ A static method parseInt(String) that converts a string into an int
	 * value. */
	public int parseInt(String value) {
		return Integer.parseInt(value);
	}
	
}

