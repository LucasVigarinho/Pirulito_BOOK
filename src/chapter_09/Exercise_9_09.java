package chapter_09;

/** 
 * 			
 * 
 * 			(Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides
 * 		have the same length and all angles have the same degree (i.e., the polygon is
 * 		both equilateral and equiangular). Design a class named RegularPolygon that
 * 		contains:
 * 		■ A private int data field named n that defines the number of sides in the polygon
 * 		with default value 3.
 * 		■ A private double data field named side that stores the length of the side with
 * 		default value 1.
 * 		■ A private double data field named x that defines the x-coordinate of the polygon’s
 * 		center with default value 0.
 * 		■ A private double data field named y that defines the y-coordinate of the polygon’s
 * 		center with default value 0.
 * 		■ A no-arg constructor that creates a regular polygon with default values.
 * 		■ A constructor that creates a regular polygon with the specified number of sides
 * 		and length of side, centered at (0, 0).
 * 		■ A constructor that creates a regular polygon with the specified number of sides,
 * 		length of side, and x- and y-coordinates.
 * 		■ The accessor and mutator methods for all data fields.
 * 		■ The method getPerimeter() that returns the perimeter of the polygon.
 * 		■ The method getArea() that returns the area of the polygon. The formula for
 * 		computing the area of a regular polygon is 
 * 				n * s2
 * 		Area = --------
 * 				4 * tan(PI/n)
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that creates three RegularPolygon objects, created using the no-arg
 * 		constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
 * 		4, 5.6, 7.8). For each object, display its perimeter and area.
 * @author lucasmaximo
 *
 */

/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|							RegularPolygon     						|
 * 			|-------------------------------------------------------------------|		
 * 			| - n: int (default: 3)				  								|
 * 			| - side: double (default: 1) 										|
 * 			| - x: double (default: 0)											|
 * 			| - y: double (default: 0)  										|
 * 			|-------------------------------------------------------------------|
 * 			| + RegularPolygon ()  									    		|
 * 			| + RegularPolygon (n: int, side: double)							|
 * 			| + RegularPolygon (n: int, side: double, x: double, y: double)		|
 * 			| + getN (): int 													|
 * 			| + setN (n: int): void												|
 * 			| + getSide (): double 												|
 * 			| + setSide (side: double) : void									|
 * 			| + getX () : double												|
 * 			| + setX (x: double) : void											|
 * 			| + getY () : double												|
 * 			| + setY (y: double) : void											|
 * 			| + getPerimeter(): double - getSide() * getN()						|
 * 			| + getArea(): double - 											|
 * 			|(getN() * (Math.pow(getS(),2))/(4 * (Math.tan(Math.PI/getN()))))	|
 * 			|___________________________________________________________________|	 
 * */
/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_9_09 */
public class Exercise_9_09{

	/** Creating the main method */
	public static void main(String[] arg) {
		/**
		Write a test
		 * 		program that creates three RegularPolygon objects, created using the no-arg
		 * 		constructor, using RegularPolygon(6, 4), and using RegularPolygon(10,
		 * 		4, 5.6, 7.8). For each object, display its perimeter and area. */
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
		/** created using the no-arg constructor*/
		RegularPolygon polygon1 = new RegularPolygon();
		
		/** using RegularPolygon(6, 4) */
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		
		/** using RegularPolygon(10,4, 5.6, 7.8) */
		RegularPolygon polygon3 = new RegularPolygon(10,4, 5.6, 7.8);
		
		/** For each object, display its perimeter and area. */
		System.out.print("\n\n\t The PERIMETER of a polygon of " + polygon1.getN() + " sides and length " + polygon1.getSide() + " is \t" + polygon1.getPerimeter());
		System.out.print("\n\t The AREA of a polygon of " + polygon1.getN() + " sides and length " + polygon1.getSide() + " is \t\t" + df.format(polygon1.getArea()));
		
		System.out.print("\n\n\t The PERIMETER of a polygon of " + polygon2.getN() + " sides and length " + polygon2.getSide() + " is \t" + polygon2.getPerimeter());
		System.out.print("\n\t The AREA of a polygon of " + polygon2.getN() + " sides and length " + polygon2.getSide() + " is \t\t" + df.format(polygon2.getArea()));
		
		System.out.print("\n\n\t The PERIMETER of a polygon of " + polygon3.getN() + " sides and length " + polygon3.getSide() + " is \t" + polygon3.getPerimeter());
		System.out.print("\n\t The AREA of a polygon of " + polygon3.getN() + " sides and length " + polygon3.getSide() + " is \t\t" + df.format(polygon3.getArea()));
	
	}//closing the main method
}//closing the class_9_09

/** Design a class named RegularPolygon that contains: */
class RegularPolygon{
	/** ■ A private int data field named n that defines the number of sides in the polygon with default value 3. */
	private int n;
	
	/**	■ A private double data field named side that stores the length of the side with default value 1.*/
	private double side;
	
	/** ■ A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.*/
	private double x;
	
	/**	■ A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0. */
	private double y;
	
	/** ■ A no-arg constructor that creates a regular polygon with default values. */		
	RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	
	}//closing the no-arg constructor
	
	/** ■ A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).*/
	RegularPolygon (int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
		
	}//closing the constructor of sides and length defined, but default as 0 the position
	
	/**	■ A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates. */
	RegularPolygon (int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
		
	}//closing the constructor of sides and length defined and position coordinates

	/**	■ The assessor and mutator methods for all data fields. */
	/** Created an assessor for N */
	public int getN() {
		return n;
	}
	/** Created an mutator for N */
	public void setN(int n) {
		this.n = n;
	}
	/** Created an assessor for Side */
	public double getSide() {
		return side;
	}
	/** Created an mutator for side */
	public void setSide(double side) {
		this.side = side;
	}
	/** Created an assessor for X */
	public double getX() {
		return x;
	}
	/** Created an mutator for X */
	public void setX(double x) {
		this.x = x;
	}
	/** Created an assessor for Y */
	public double getY() {
		return y;
	}
	/** Created an mutator for Y */
	public void setY(double y) {
		this.y = y;
	}
	
	/**	■ The method getPerimeter() that returns the perimeter of the polygon. */
	public double getPerimeter() {
		return getSide() * getN();
	}//closing getPerimeter assessor method
	 
	/** ■ The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is 
	 * 				n * s2
	 * 		Area = --------
	 * 				4 * tan(PI/n) 
	 * 											(getN() * (Math.pow(getS(),2)))/(4 * (Math.tan(Math.PI/getN()))))
	 *  * */ 
	public double getArea() {
		return (getN() * (Math.pow(getSide(),2)))/(4 * (Math.tan(Math.PI/getN())));
	}//closing getArea assessor method
	
	
}//closing the RegularPolygon class