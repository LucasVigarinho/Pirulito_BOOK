package chapter_10;

/** 
 * 			
 * 	(The MyPoint class) Design a class named MyPoint to represent a point with
 * 	x- and y-coordinates. The class contains:
 * 
 * 	■ The data fields x and y that represent the coordinates with getter
 * 	methods.
 * 	■ A no-arg constructor that creates a point (0, 0).
 * 	■ A constructor that constructs a point with specified coordinates.
 * 	■ A method named distance that returns the distance from this point to a
 * 	specified point of the MyPoint type.
 * 	■ A method named distance that returns the distance from this point to
 * 	another point with specified x- and y-coordinates.
 * 
 * 	Draw the UML diagram for the class and then implement the class. Write a
 * 	test program that creates the two points (0, 0) and (10, 30.5) and displays the
 * 	distance between them.
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|							MyPoint  						|
 * 			|-----------------------------------------------------------|	
 * 			| - x: double   				  							|
 * 			| - y: double   				  							|
 * 			|-----------------------------------------------------------|
 * 			| + MyPoint ()												|
 * 			| + MyPoint (x: double, y: double)							|
 * 			| + distance (MyPoint point) : double						|
 * 			| + distance (x: double, y: double)							|
 * 			|___________________________________________________________| 
 * */
/** import necessary libraries */
import java.text.DecimalFormat;


/** Creating the class named Exercise_10_01 */
public class Exercise_10_04{

	/** Creating the main method */
	public static void main(String[] arg) {

		/**  Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the
		 * 	distance between them. */
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		DecimalFormat df = new DecimalFormat("###0.00");
		
		System.out.print("\n\n\tThe distance between point two points (0, 0) and (10, 30.5) -> " + df.format(point1.distance(point2)) );
		System.out.print("\n\n\tThe distance between point two points (0, 0) and (10, 30.5) -> " + df.format(point1.distance(10, 30.5)) );



	}//closing the main method



}//closing the Exercise_10_01 method (used as driver method)


/** 	(The MyPoint class) Design a class named MyPoint to represent a point with
 * 	x- and y-coordinates. */
class MyPoint{
	/**
	 * 	■ The data fields x and y that represent the coordinates with getter
	 * 	methods.*/
	private double x;
	private double y;
	
	/** ■ A no-arg constructor that creates a point (0, 0).*/
	MyPoint(){
		x = 0;
		y = 0;
	}
	/**	■ A constructor that constructs a point with specified coordinates.*/
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**	■ A method named distance that returns the distance from this point to a
	 * 	specified point of the MyPoint type. */
	public double distance(MyPoint point) {
		
		return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
	}
	
	/**	■ A method named distance that returns the distance from this point to
	 * 	another point with specified x- and y-coordinates. */
	public double distance(double x, double y) {
		
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
}//closing MyPoint class