package chapter_11;



/**			EXERCISE DESCRIPTION 
 * 
 * 		(The Person, Student, Employee, Faculty, and Staff classes) Design a
 * 		class named Person and its two subclasses named Student and Employee.
 * 
 * 		Make Faculty and Staff subclasses of Employee. A person has a name,
 * 		address, phone number, and email address. A student has a class status (freshman,
 * 		sophomore, junior, or senior). Define the status as a constant. An employee has
 * 		an office, salary, and date hired. Use the MyDate class defined in Programming
 * 		Exercise 10.14 to create an object for date hired. A faculty member has office
 * 		hours and a rank. A staff member has a title. Override the toString method in
 * 		each class to display the class name and the person’s name.
 * 		
 * 		Draw the UML diagram for the classes and implement them. Write a test program
 * 		that creates a Person, Student, Employee, Faculty, and Staff, and
 * 		invokes their toString() methods.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.GregorianCalendar;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_02 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/**Creating a test for each class and its methods */
		Person person1 = new Person();
		System.out.print("\n\n\tPrinting the person1 - only a default person" + person1.toString());
		
		Person person2 = new Student("Lucas", "Ireland", "083xxxxxx", "lucas.maximo....", "Fresnman"  );
		System.out.print("\n\n\tPrinting the person2 - only a student " + person2.toString());

		Person person3 = new Employee("José", "Glasgow", "089xxxxx", "jose@gmail.com", 5, 30000);
		System.out.print("\n\n\tPrinting the person3 - only a Employee " + person3.toString());

		Person person4 = new Staff("Jorge", "India", "035xxxxx", "indian@gmail.com", 3, 40000, "CTO");
		System.out.print("\n\n\tPrinting the person4 - only a Staff " + person4.toString());
		
		Person person5 = new Faculty("Juliao", "Brazil", "027xxxx09854", "juliaocrazy@gmail.com", 2, 100000, 2 , "Founder");
		System.out.print("\n\n\tPrinting the person5 - only a Faculty " + person5.toString());

	}//closing the mains method

	
}//closing class exercise_11_01


/** 
 * 		1 - Design a class named Person and its two subclasses named Student and Employee.
 * 		2 - Make Faculty and Staff subclasses of Employee.
 * 
 * 		1	- Person,(CLASS)
 * 		1		- Student,  (SUB-CLASS)
 * 		1 2		- Employee, (SUB-CLASS) - (CLASS)
 *    	  2			- Faculty, (SUB-CLASS)
 *    	  2			- Staff (SUB-CLASS)
 *    	
 **/

/** 
 *   
 *   Override the toString method in each class to display the class name and the person’s name.*/

/**	IMPORTED NECESSARY LIBRARIES 				|			     Person	  		   	|
*												|-----------------------------------|
*											   /| - name: String					|\					
* 	|			  Student	  	   		|	  /	| - address: String					| \	    |			  Employee	  	   		|   
* 	|-----------------------------------|	 /  | - phone: String					|  \	|-----------------------------------|
*	| - status: String		 			|	/   | - email: String					|   \   | - office: int			 			|                        
*	|-----------------------------------|  /    |-----------------------------------|	 \	| - salary: double 					|
*	| + Student(name: String, address:  |_/	    | + Person()						|	  \_| - dateHired: MyDate (10.14)  		|  
*	|   String, phoneNumber: String, 	|       | + Person(name: String, address:	|		|-----------------------------------|
*	| 	email: String), status: String)	|       |   String, phone: String,      	| 	   /| + Employee(name: String, address: |
*	| + getStatus (): String			|		| 	email: String)					|	  /	| 	String, phoneNumber: String, 	|
* 	| + setStatus (status: String)		|    	| + getters and setters off all		|	 /	| 	email: String, office: int, 	|
* 	| + toString(): String				|    	| + toString(): String				|	|	| 	salary: double, dateHired:  	|
* 	|___________________________________|    	|___________________________________|	|	| 	MyDate)							|
* 										    											|	| + getOffice(): int				|
* 										    											|	| + setOffice(office: int)			|
* 																						|	| + getSalary(): double				|
* 										    											|	| + setSalray(salary: double)		|
* 											   											|	| + getDateHired(): MyDate 			|
* 																						|	| + setDateHired(dateHirde: MyDate)	|
*												|			     Faculty  		   	|	|	| + toString(): String				|
*												|-----------------------------------|	|	|___________________________________|
*											    | - officeHour: int					|  / \				
* 	|			  MyDate	  	   		|	   	| - rank: String					|_/   \_|			    Staff	  	   		|   
* 	|-----------------------------------|	    |-----------------------------------|     	|-----------------------------------|
*	| - day: int			 			|	    | + Faculty(name: String, address: 	|       | - title: String		 			|                        
*	| - month: int	 					|       |   String, phoneNumber: String, 	|	 	|-----------------------------------|
*	| - year: int				  		|	    | 	email: String, office: int, 	|	  	| + Faculty(name: String, address: 	| 
*	|-----------------------------------|       |   salary: double, dateHired: 		|		|   String, phoneNumber: String, 	|
*	| + MyDate ()			 			|       |   MyDate, officeHour: int, rank:	| 		| 	email: String, office: int, 	|
*	| + MyDate(day: long)				|		|	String)							|		|   salary: double, dateHired: 		|
* 	| + MyDate(day: int, month: int, 	|    	| + getOfficeHours(): int			|	    |   MyDate, officeHour: int, rank:	| 
* 	|   year: int)			 			|    	| + setOfficeHours(officeHours: int)|		|	String)							|
* 	| + getDay (): int		 			|    	| + getRank(): String  				|		| +	getTitle(): String				|
* 	| + getMonth (): int	 			|    	| + setRank(rank: String)			|		| + setTilte(title: String)			|
* 	| + getYear (): int		 			|    	| + toString(): String     			|		| + toString(title: String)			|
* 	| + setDate (elapsedTime: long)		|    	|___________________________________|		|___________________________________|
* 	| 									|    												
* 	|___________________________________|    												
*/			


/** Creating Person Class ( A person has a name, address, phone number, and email address. ) */
class Person{

	/** Created the necessary variable */
	private String name;
	private String address;
	private String phone;
	private String email;

	/** Created a constructor with no args */
	Person (){
		name = "Default_Name";
		address = "Default_address";
		phone = "Default_phone";
		email = "Default_email";
	}

	/** Created a constructor with args */
	Person (String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}


	/** Created getter(assessors) and setters(modifiers) */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	/** Created to String */
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}

}//closed the Person class 

/** Created the class student 
 * (A student has a class status (freshman,sophomore, junior, or senior). Define the status as a constant. )*/
class Student extends Person{

	/** Created the status variable */
	private String status;
	public static final int FRESHMAN = 1;
	public static final int SOPHMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;


	/** Created the constructor with no args */
	Student(String name, String address, String phone, String email, String status){
		super(name, address, phone, email);
		this.status = status;
	}

	/** Created getter(assessors) and setters(modifiers) */
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	/** Created to String */
	@Override
	public String toString() {
		return super.toString() + "\nStudent --- Status: " + getStatus();
	}
}//closed the Student class

/** Created the Employee class - 
 * (An employee has an office, salary, and date hired. Use the MyDate class defined in Programming
 * 	 Exercise 10.14 to create an object for date hired. )*/
class Employee extends Person {

	/** Created the necessary variables */
	private int office;
	private double salary;
	private MyDate dateHired;

	/** Created the necessary constructor with args and inheritance from super class */
	Employee(String name, String address, String phone, String email, 
			int office, double salary){
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}

	/** Created  the getters (assessors) and setters (modifiers) */

	public int getOffice() {
		return office;
	}
	public void setOffice(int office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployee [office=" + office + ", salary=" + salary + 
			", dateHired=" + dateHired.getDay() + " / " + dateHired.getMonth() + " / " + dateHired.getYear() + "]";
	}


	/** Overriding to String method inheriting the super */


}

/**  Design a class named MyDate */
class MyDate{

	/** ■ The data fields year, month, and day that represent a date. month is
	 * 	0-based, i.e., 0 is for January. */
	private int day;
	private int month;
	private int year;

	/** ■ A no-arg constructor that creates a MyDate object for the current date. */
	MyDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		month = calendar.get(GregorianCalendar.MONTH);
		year = calendar.get(GregorianCalendar.YEAR);
	}
	/** ■ A constructor that constructs a MyDate object with a specified elapsed time
	 *	since midnight, January 1, 1970, in milliseconds. */
	MyDate(long elapsedTime){
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	/**	■ A constructor that constructs a MyDate object with the specified year,
	 * 	month, and day.*/
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	/** ■ Three getter methods for the data fields year, month, and day, respectively. */
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}

	/** ■ A method named setDate(long elapsedTime) that sets a new date for
	 * 		the object using the elapsed time. */

	public void setDate(long elapsedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		month = calendar.get(GregorianCalendar.MONTH);
		year = calendar.get(GregorianCalendar.YEAR);

	}
}
/** Created the Faculty class -  A faculty member has office hours and a rank. */
class Faculty extends Employee {

	/** Created the necessary variables */
	private int officeHours;
	private String rank;

	/** Created the necessary constructor with args and inheritance from super class */
	Faculty(String name, String address, String phone, String email, 
			int office, double salary, int officeHours, String rank){
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** Created  the getters (assessors) and setters (modifiers) */
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	/** Overriding to String method inheriting the super */
	@Override
	public String toString() {
		return super.toString() + "\nFaculty [officeHours=" + officeHours + ", rank=" + rank + "]";
	}

}

/** Created the Staff class -    A staff member has a title.  */
class Staff extends Employee {

	/** Created the necessary variables */
	private String title;

	/** Created the necessary constructor with args and inheritance from super class */
	Staff(String name, String address, String phone, String email, 
			int office, double salary, String title){
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	/** Created  the getters (assessors) and setters (modifiers) */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	/** Overriding to String method inheriting the super */
	@Override
	public String toString() {
		return super.toString() + "\nStaff [title=" + title + "]";
	}

}

