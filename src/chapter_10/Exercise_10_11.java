package chapter_10;

/** 
 * 		
 * 		(Geometry: the Circle2D class) Define the Circle2D class that contains:
 * 		■ Two double data fields named x and y that specify the center of the circle
 * 		with getter methods.
 * 		■ A data field radius with a getter method.
 * 		■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
 * 		for radius.
 * 		■ A constructor that creates a circle with the specified x, y, and radius.
 * 		■ A method getArea() that returns the area of the circle.
 * 		■ A method getPerimeter() that returns the perimeter of the circle.
 * 		■ A method contains(double x, double y) that returns true if the
 * 		specified point (x, y) is inside this circle (see Figure 10.21a).
 * 		■ A method contains(Circle2D circle) that returns true if the specified
 * 		circle is inside this circle (see Figure 10.21b).
 * 		■ A method overlaps(Circle2D circle) that returns true if the specified
 * 		circle overlaps with this circle (see Figure 10.21c).
 * 		
 * 		
 *			 (a) (b) (c)
 * 
 * 		FIGURE 10.21 (a) A point is inside the circle. 
 * 					 (b) A circle is inside another circle. 
 *                   (c) A circle overlaps another circle.
 * 		
 * 		
 * 		Draw the UML diagram for the class and then implement the class. 
 * 		
 * 		Write a test program that 
 * 						creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
 * 						displays its area and perimeter, and 
 * 						displays the result of c1.contains(3, 3), 
 * 											   c1.contains(new Circle2D(4, 5, 10.5)), and 
 * 											   c1.overlaps(new Circle2D(3, 5, 2.3)).
 * 
 * @author lucasmaximo
 *
 */
/** 	Draw the UML diagram for the class and then implement the class. 
 * 
 * 			|                       Exercise_10_11							|
 * 			|---------------------------------------------------------------|
 * 			|						   Circle2D     						|
 * 			|---------------------------------------------------------------|	
 * 			| - x: double													|
 * 			| - y: double													|
 * 			| - radius: double												|
 * 			|---------------------------------------------------------------|
 * 			| + Circle2D ()	             							    	|
 * 			| + Circle2D (x: double, y: double)								|
 * 			| + getX(): double										  		|
 * 			| + getY(): double										  		|
 * 			| + getArea(): double									  		|
 * 			| + getPerimeter(): double						       			|
 * 			| + contains (x: double, y: double): boolean		   			|
 * 			| + contains (circle: Circle2D): boolean		     			|
 * 			| + overlaps (Circle2D circle)					       			|
 * 			|_______________________________________________________________| 	 
 * */

/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_10_11 */
public class Exercise_10_11{

	/** Creating the main method */
	public static void main(String[] arg) {

		
		/** Create the object to format the answer */
		DecimalFormat df = new DecimalFormat("###0.00");
		/** Write a test program that 
		 * 						creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
		 * 						displays its area and perimeter, and 
		 * 						displays the result of c1.contains(3, 3), 
		 * 											   c1.contains(new Circle2D(4, 5, 10.5)), and 
		 * 											   c1.overlaps(new Circle2D(3, 5, 2.3)). */
		
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.print("\n\n\tAre of the circle is \t\t\t->  " + df.format(c1.getArea()));
		System.out.print("\n\tPerimeter of the circle is \t\t->  " + df.format(c1.getPerimeter()));
		System.out.print("\n\tContains test - point (3, 3) \t\t-> " + ((c1.contains(3,3))?" THE POINT IS IN":"THE POINT IS NOT IN"));
		System.out.print("\n\tContains test - Circle2D (4, 5, 10.5) \t-> " + ((c1.contains(new Circle2D(4, 5, 10.5)))?" THE CIRCLE IS IN":"THE CIRCLE IS NOT IN"));
		System.out.print("\n\tOverlap test - Circle2D (3, 5, 2.3) \t-> " + ((c1.overlaps(new Circle2D(3, 5, 2.3)))?" THE CIRCLE IS OVERLAPING":"THE CIRCLE IS NOT OVERLAP"));

	}//closing the main method



}//closing the Exercise_10_11 method (used as driver method)

/** (Geometry: the Circle2D class) Define the Circle2D class that contains: */
class Circle2D{
	/** ■ Two double data fields named x and y that specify the center of the circle
	 * 		with getter methods. */
	private double x;
	private double y;

	/** ■ A data field radius with a getter method. */
	private double radius;

	public double getX() {return x;}
	public double getY() {return y;}
	public double getRadius() {return radius;}

	/**	■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius. */
	Circle2D(){
		x = 0;
		y = 0;
		radius = 1;
	}

	/**	■ A constructor that creates a circle with the specified x, y, and radius. */
	Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/** ■ A method getArea() that returns the area of the circle. */
	public double getArea() {
		return Math.pow(getRadius(), 2) * Math.PI;
	}
	/** ■ A method getPerimeter() that returns the perimeter of the circle. */
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	/** ■ A method contains(double x, double y) that returns true if the
 	  specified point (x, y) is inside this circle (see Figure 10.21a). */
	public boolean contains(double x, double y) {
		return Math.sqrt( Math.pow( x - this.x, 2 ) + Math.pow( y - this.y, 2 ) )  < radius;
	}
	/** ■ A method contains(Circle2D circle) that returns true if the specified
	  circle is inside this circle (see Figure 10.21b).*/
	public boolean contains(Circle2D circle) {
		return Math.sqrt( Math.pow( circle.getX() - x, 2 ) + Math.pow( circle.getY() - y, 2 ) ) <= Math.abs( radius - circle.getRadius() );
	}
	/** ■ A method overlaps(Circle2D circle) that returns true if the specified
      circle overlaps with this circle (see Figure 10.21c). */
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt( Math.pow( circle.getX() - x, 2 ) + Math.pow( circle.getY() - y, 2 ) ) <= radius + circle.getRadius();
	}
}
