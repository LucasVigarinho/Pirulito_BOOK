package chapter_10;

/** 
 * 		
 * 		(The MyDate class) Design a class named MyDate. The class contains:
 * 
 * 		■ The data fields year, month, and day that represent a date. month is
 * 		0-based, i.e., 0 is for January.
 * 		■ A no-arg constructor that creates a MyDate object for the current date.
 * 		■ A constructor that constructs a MyDate object with a specified elapsed time
 * 		since midnight, January 1, 1970, in milliseconds.
 * 		■ A constructor that constructs a MyDate object with the specified year,
 * 		month, and day.
 * 		■ Three getter methods for the data fields year, month, and day, respectively.
 * 		■ A method named setDate(long elapsedTime) that sets a new date for
 * 		the object using the elapsed time.
 * 
 * 		Draw the UML diagram for the class and then implement the class. Write a
 * 		test program that creates two MyDate objects (using new MyDate() and new
 * 		MyDate(34355555133101L)) and displays their year, month, and day.
 * 		(Hint: The first two constructors will extract the year, month, and day from
 * 		the elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
 * 		the year is 1987, the month is 9, and the day is 18. You may use the
 * 		GregorianCalendar class discussed in Programming Exercise 9.5 to simplify
 * 		coding.)
 * 
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class. */

/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_14{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write a	test program that creates two MyDate objects (using new MyDate() and new
		 * 	MyDate(34355555133101L)) and displays their year, month, and day.
		 * 	
		 *  (Hint: The first two constructors will extract the year, month, and day from
		 * 	the elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
		 * 	the year is 1987, the month is 9, and the day is 18. You may use the
		 * 	GregorianCalendar class discussed in Programming Exercise 9.5 to simplify
		 * 	coding.)*/
		

	}//closing the main method

	

}//closing the Exercise_10_01 method (used as driver method)

/** 
 * 
 * 			|                      			Exercise_10_14								|
 * 			|---------------------------------------------------------------------------|
 * 			|									MyDate		  							|
 * 			|---------------------------------------------------------------------------|	
 * 			| - day: int				  												|	
 * 			| - month: int				  												|
 * 			| - year: int				  												|
 * 			|---------------------------------------------------------------------------|
 * 			| + MyDate ()														        |
 * 			| + MyDate (day: long)												        |
 * 			| + MyDate (day: int, month: int, year: int)						        |
 * 			| + getDay (): int										  					|
 * 			| + getMonth (): int									  					|
 * 			| + getYear (): int										  					|
 * 			| + setDate(elapsedTime: long)							 					|
 * 			|___________________________________________________________________________|  
 * 
 * 
 */


/**  Design a class named MyDate */

/** 	
 * 		
 * 		

 * 		
*/

/** ■ The data fields year, month, and day that represent a date. month is
 * 	0-based, i.e., 0 is for January. */

/** ■ A no-arg constructor that creates a MyDate object for the current date. */

/** ■ A constructor that constructs a MyDate object with a specified elapsed time
 *	since midnight, January 1, 1970, in milliseconds. */

/**	■ A constructor that constructs a MyDate object with the specified year,
 * 	month, and day.*/

/** ■ Three getter methods for the data fields year, month, and day, respectively. */

/** ■ A method named setDate(long elapsedTime) that sets a new date for
 * 		the object using the elapsed time. */

/** */