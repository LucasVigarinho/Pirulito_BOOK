package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(The Triangle class) Design a class named Triangle that extends
 * 		GeometricObject. The class contains:
 * 
 * 		■ Three double data fields named side1, side2, and side3 with default
 * 		values 1.0 to denote three sides of the triangle.
 * 		■ A no-arg constructor that creates a default triangle.
 * 		■ A constructor that creates a triangle with the specified side1, side2, and
 * 		side3.
 * 		■ The accessor methods for all three data fields.
 * 		■ A method named getArea() that returns the area of this triangle.
 * 		■ A method named getPerimeter() that returns the perimeter of this triangle.
 * 		■ A method named toString() that returns a string description for the triangle.
 * 
 * 		For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 * 		The toString() method is implemented as follows:
 * 
 * 		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 * 
 * 		Draw the UML diagrams for the classes Triangle and GeometricObject and
 * 		implement the classes. Write a test program that prompts the user to enter three
 * 		sides of the triangle, a color, and a Boolean value to indicate whether the triangle
 * 		is filled. The program should create a Triangle object with these sides and set
 * 		the color and filled properties using the input. The program should display
 * 		the area, perimeter, color, and true or false to indicate whether it is filled or not.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 				|			GeometricObject			|
  														|-----------------------------------|
* 													   /| - color: String					|					
* 			|			  Triangle  	   		|	  /	| - filled: boolean					|
* 			|-----------------------------------|	 /  |-----------------------------------|
* 			| - side1: double		 			|	/   | + GeometricObject ()				|
* 			| - side2: double 					|  /    | + GeometricObject (color: String,	|
* 			| - side3: double			  		|_/	    | 	filled: boolean)				|		  
* 			|-----------------------------------|       | + getColor (): String				|
* 			| + Triangle (): default 1 			|       | + setColor (color: String)		| 
* 			| + Triangle (side1: double,		|		| + isFilled (): boolean			|
* 			|	side2: double, side3: double)	|    	| + setFilled (filled: boolean)		|
* 			| + getSide1(): double	 			|    	| + toString (): String				|
* 			| + getSide2(): double	 			|    	|									|
* 			| + getSide3(): double	 			|    	|___________________________________|
* 			| + getArea(): double	 			|    
* 			| + getPerimeter(): double 			|    
* 			| + toString (): String 			|    
* 			|___________________________________|    

 																										*/
/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_01 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** testing all the classes and methods */
		GeometricObject test1 = new GeometricObject ();
		System.out.println("\n" + test1);
	
		GeometricObject test2 = new Triangle();
		System.out.println("\n" + test2);
		
		Triangle test3 = new Triangle("Blue", false, 3.0, 5.0, 2.5);
		System.out.println("\n" + test3);
		
		test1.setColor("Red");
		System.out.println("\n" + test1);
		
		test2.setColor("Purple");
		test2.setFilled(false);
		System.out.println("\n" + test2);


		System.out.println("\n" + test1.getColor());
		System.out.println("\n" + test2.getClass());
		System.out.println("\n" + test3.getFilled());



		
	}//closing the mains method

	
}//closing class exercise_11_01

/** Created the GeometricObject class */
class GeometricObject{
	
	/** Created the initial variables, according to description 
	 * 	The program should create a Triangle object with these sides and set
	 * 	the color and filled properties using the input. The program should display
	 * 	the area, perimeter, color, and true or false to indicate whether it is filled or not.*/
	 private String color;
	 private boolean filled;
	 
	/** Created the constructor having no-args */
	GeometricObject(){
		this.color = "white";
		this.filled = true;
	}
	 
	/** Created the constructor receiving from the user the args */
	GeometricObject(String color, boolean filled){
		this.color = "white";
		this.filled = true;
	}
	/** Created assessors methods */
	public String getColor() {
		return this.color;
	}
	public boolean getFilled() {
		return this.filled;
	}
	/** Created the setFilled change variable data */
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled =  filled;
	}
	
	/** Created to String method in order to make possible the information be printed */
	@Override
	public String toString() {
		return "created new Object " +  "\ncolor: " + color + 
				" and filled: " + filled;
	}
}

/**  (The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains: */
class Triangle extends GeometricObject {
	
	/** ■ Three double data fields named side1, side2, and side3 with default
	 * values 1.0 to denote three sides of the triangle. 		*/
	private double side1;
	private double side2;
	private double side3;
	
	/** ■ A no-arg constructor that creates a default triangle.			*/
	public Triangle(){
		super();
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}//closing triangle default constructor
	
	///** ■ A constructor that creates a triangle with the specified side1, side2, and side3.	*/																		*/
	public Triangle (String color, boolean filled, double side1, double side2, double side3){
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/**	■ The accessor methods for all three data fields.									*/
	public double getSide1() {
		return this.side1;
	}
	public double getSide2() {
		return this.side2;
	}
	public double getSide3() {
		return this.side3;
	}
	
	/** ■ A method named getArea() that returns the area of this triangle.					*/
	public double getArea() {
		double sides = (side1 + side2 + side3) / 2;
		return Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
	}
	/** ■ A method named getPerimeter() that returns the parameter of this triangle. 		*/
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	/** ■ A method named toString() that returns a string description for the triangle.		*/
	public String toString() {
		return "Created a Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + 
				"\ncolor: " + getColor() + " and filled: " + getFilled();
	}
	
}//closing Triangle class