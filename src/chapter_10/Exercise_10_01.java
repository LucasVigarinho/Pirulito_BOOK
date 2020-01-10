package chapter_10;

/** 
 * 			
 * 	(The Time class) Design a class named Time. The class contains:
 * 
 * 	■ The data fields hour, minute, and second that represent a time.
 * 	■ A no-arg constructor that creates a Time object for the current time. (The
 * 	values of the data fields will represent the current time.)
 * 	■ A constructor that constructs a Time object with a specified elapsed time
 * 	since midnight, January 1, 1970, in milliseconds. (The values of the data
 * 	fields will represent this time.)
 * 	■ A constructor that constructs a Time object with the specified hour, minute,
 * 	and second.
 * 	■ Three getter methods for the data fields hour, minute, and second,
 * 	respectively.
 * 	■ A method named setTime(long elapseTime) that sets a new time
 * 	for the object using the elapsed time. For example, if the elapsed time is
 * 	555550000 milliseconds, the hour is 10, the minute is 19, and the second is
 * 	10.
 * 
 * 	Draw the UML diagram for the class and then implement the class. Write
 * 	a test program that creates two Time objects (using new Time() and new
 * 	Time(555550000)) and displays their hour, minute, and second in the format
 * 	hour:minute:second.
 * 
 * 	(Hint: The first two constructors will extract the hour, minute, and second
 * 	from the elapsed time. For the no-arg constructor, the current time can be
 * 	obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 * 	ShowCurrentTime.java.)
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|							Time  							|
 * 			|-----------------------------------------------------------|	
 * 			| - hour: int   				  							|
 * 			| - minute: int     	 	    							|
 * 			| - second: int		   										|
 * 			|-----------------------------------------------------------|
 * 			| + Time ()													|
 * 			| + Time(elapseTime: long)									|
 * 			| + Time(hour: int, minute: int, second: int				|
 * 			| + getHour (): int											|
 * 			| + getMinute (): int										|
 * 			| + getSecond (): int										|
 * 			| + setTime (elapseTIme: long) 								|
 * 			|___________________________________________________________| 
 * */

/** Necessary imports */

/** Creating the class named Exercise_10_01 */
public class Exercise_10_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write
		 * 	a test program that creates two Time objects (using new Time() and new
		 * 	Time(555550000)) and displays their hour, minute, and second in the format
		 * 	hour:minute:second.
		 * */

		Time first = new Time();
		Time second = new Time(555550000);

		System.out.println("\n\n\tfisrt: " + first.getHour() + " : " + first.getMinute() + " : "+ first.getSecond());
		System.out.println("\n\tsecond: " + second.getHour() + " : " + second.getMinute() + " : "+ second.getSecond());

	}//closing the main method


}//closing the Exercise_10_01 method (used as driver method)

/** 
 * 	Design a class named Time. 
 * */
class Time{
	/** ■ The data fields hour, minute, and second that represent a time. */
	private int hour;
	private int minute;
	private int second;

	/** ■ A no-arg constructor that creates a Time object for the current time. (The
	 * 	values of the data fields will represent the current time.)*/
	public Time(){
		this(System.currentTimeMillis());
	}

	/** ■ A constructor that constructs a Time object with a specified elapsed time
	 * 	since midnight, January 1, 1970, in milliseconds. (The values of the data
	 * 	fields will represent this time.) */
	public Time(long elapseTIme) {
		this((int)(elapseTIme/3600000)%24, (int)(elapseTIme/60000)%60, (int)(elapseTIme/1000)%60);
	}

	/** ■ A constructor that constructs a Time object with the specified hour, minute,
	 * 	and second.*/
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	/** ■ Three getter methods for the data fields hour, minute, and second,
	 * 	respectively.*/
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	/** 	■ A method named setTime(long elapseTime) that sets a new time
	 * 	for the object using the elapsed time. For example, if the elapsed time is
	 * 	555550000 milliseconds, the hour is 10, the minute is 19, and the second is
	 * 	10.*/
	public void setTime(long elapseTime) {
		this.hour = (int) (elapseTime/3600000)%24;
		this.minute = (int) (elapseTime/60000)%60;
		this.second = (int) (elapseTime/1000)%60;
	}


}//closing the class Time
