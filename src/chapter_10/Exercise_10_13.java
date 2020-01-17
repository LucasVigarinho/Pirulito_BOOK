package chapter_10;

/** 
 * 			
 * 		(Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
 * 		contains:
 * 		■ Two double data fields named x and y that specify the center of the rectangle
 * 		with getter and setter methods. (Assume that the rectangle sides are
 * 		parallel to x- or y- axes.)
 * 		■ The data fields width and height with getter and setter methods.
 * 		■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
 * 		1 for both width and height.
 * 		■ A constructor that creates a rectangle with the specified x, y, width, and
 * 		height.
 * 		
 * 		■ A method getArea() that returns the area of the rectangle.
 * 		■ A method getPerimeter() that returns the perimeter of the rectangle.
 * 		■ A method contains(double x, double y) that returns true if the
 * 		specified point (x, y) is inside this rectangle (see Figure 10.24a).
 * 		■ A method contains(MyRectangle2D r) that returns true if the specified
 * 		rectangle is inside this rectangle (see Figure 10.24b).
 * 		■ A method overlaps(MyRectangle2D r) that returns true if the specified
 * 		rectangle overlaps with this rectangle (see Figure 10.24c).
 * 		
 * 		FIGURE 10.24 A point is inside the rectangle. (b) A rectangle is inside another rectangle.
 * 		(c) A rectangle overlaps another rectangle. (d) Points are enclosed inside a rectangle.
 * 		
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
 * 		2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
 * 		r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5,
 * 		3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class. */
/** 
 * 
 * 			|                      			Exercise_10_13								|
 * 			|---------------------------------------------------------------------------|
 * 			|								MyRectangle2D	  							|
 * 			|---------------------------------------------------------------------------|	
 * 			| - x: double				  												|	
 * 			| - y: double				  												|
 * 			| - width: double			  												|
 * 			| - height: double			  												|
 * 			|---------------------------------------------------------------------------|
 * 			| + MyRectangle2D ()												        |
 * 			| + MyRectangle2D (x: double, y: double, width: double, height: double)     |
 * 			| + getX (): double										  					|
 * 			| + getY (): double										  					|
 * 			| + getWidth (): double									  					|
 * 			| + getHeight (): double								  					|
 * 			| + getArea (): double									  					|
 * 			| + getPerimeter(): double						       						|
 * 			| + contains(x: double, y: double): boolean									|
 * 			| + contains(r: MyRectangle2D): boolean										|
 * 			| + overlaps(r: MyRectangle2D): boolean 									|
 * 			|___________________________________________________________________________|  
 * 
 * 
 */
/** Necessary imports */
import java.text.DecimalFormat;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_13{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write a test program that creates a 
		 * 	MyRectangle2D object r1 (new MyRectangle2D(2,2, 5.5, 4.9)),
		 *  											displays its area and perimeter, and 
		 *  											displays the result of r1.contains(3, 3), 
		 *  											r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)), and 
		 *  											r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
		 *  */
		DecimalFormat df = new DecimalFormat("####.00");
		
		MyRectangle2D r1 = new MyRectangle2D(2,	2, 5.5, 4.9);
		
		System.out.print("\n\n\tThe area of the Rectangle is \t\t-> " + df.format(r1.getArea()));
		System.out.print("\n\tThe area of the Perimeter is \t\t-> " + df.format(r1.getPerimeter()));
		System.out.print("\n\n\t" + ((r1.contains(3, 3))?"The POINT is inside of the Rectangle":"The POINT is NOT inside of the Rectangle"));
		System.out.print("\n\t" + ((r1.contains(new MyRectangle2D(4, 5, 10.5,3.2)))?"The rectangle is inside of the Rectangle":"The rectangle is NOT inside of the Rectangle"));
		System.out.print("\n\t" + ((r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)))?"The rectangle is OVERLAPING  the Rectangle":"The rectangle is NOT OVERLAPING the Rectangle"));



	}//closing the main method



}//closing the Exercise_10_01 method (used as driver method)


/** (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that contains: */
class MyRectangle2D{

	/** ■ Two double data fields named x and y that specify the center of the rectangle
	 *	with getter and setter methods. (Assume that the rectangle sides are parallel to x- or y- axes.) */
	private double x;
	private double y;

	/** ■ The data fields width and height with getter and setter methods. */
	private double width;
	private double height;

	/** ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
	 * 	1 for both width and height.*/
	MyRectangle2D(){
		x = 0;
		y = 0;
		width = 1;
		height =1;
	}
	/**	■ A constructor that creates a rectangle with the specified x, y, width, and
	 * 	height. */
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public double 	getX		() 				{return x;}
	public void 	setX		(double x)		{this.x = x;}
	public double 	getY		() 				{return y;}
	public void 	setY		(double y) 		{this.y = y;}
	public double 	getWidth	() 				{return width;}
	public void 	setWidth	(double width) 	{this.width = width;}
	public double 	getHeight	() 				{return height;}
	public void 	setHeight	(double height) {this.height = height;}
	
	/** ■ A method getArea() that returns the area of the rectangle. */
	public double getArea() {
		return width * height;
	}

	/** ■ A method getPerimeter() that returns the perimeter of the rectangle. */
	public double getPerimeter() {
		return 2 * (width + height);
	}
	/** ■ A method contains(double x, double y) that returns true if the
	 * 	specified point (x, y) is inside this rectangle (see Figure 10.24a).*/
	public boolean contains(double x, double y) {
		return ((x > this.x && y > this.y) && (x < (this.x+ width) && y < (this.y + height)));
		
	}
	/** ■ A method contains(MyRectangle2D r) that returns true if the specified
	 * 	rectangle is inside this rectangle (see Figure 10.24b). */
	public boolean contains(MyRectangle2D r) {
		return ((r.getX() > this.x && r.getY() > this.y) && (r.getX() < (this.x + this.width) && r.getY() < (this.y + this.height)) && (r.getArea() < getArea()));
	}
	/** ■ A method overlaps(MyRectangle2D r) that returns true if the specified
	 * 	rectangle overlaps with this rectangle (see Figure 10.24c). */
	public boolean overlaps(MyRectangle2D r) {
		
		 if(contains(r)) {
			 return false;
		 }else if (((this.x + width / 2) > (r.getX() - r.getWidth())) 						|| 
				  ((this.y + height / 2) > (r.getY() - r.getHeight()))						&&
		  		  (getDistance(this.y, r.getY()) < (this.height / 2 + r.getHeight() / 2)) 	&& 
		  		  (getDistance(this.x, r.getX()) < (this.width / 2 + r.getWidth() / 2)))	{
			 return true;
		 }else {
			 return false;
		 }
	}
	/** Return distance */
	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
}


