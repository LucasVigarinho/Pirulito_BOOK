package chapter_10;

/** 
 * 			
 * 	(Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 * 			■ Three points named p1, p2, and p3 of the type MyPoint with getter and
 * 			  setter methods. MyPoint is defined in Programming Exercise 10.4.
 * 			■ A no-arg constructor that creates a default triangle with the points (0, 0), (1,
 * 			  1), and (2, 5).
 * 			■ A constructor that creates a triangle with the specified points.
 * 			■ A method getArea() that returns the area of the triangle.
 * 			■ A method getPerimeter() that returns the perimeter of the triangle.
 * 			■ A method contains(MyPoint p) that returns true if the specified point
 * 			  p is inside this triangle (see Figure 10.22a).
 * 		
 * 			■ A method contains(Triangle2D t) that returns true if the specified
 * 			  triangle is inside this triangle (see Figure 10.22b).
 * 			■ A method overlaps(Triangle2D t) that returns true if the specified
 * 			  triangle overlaps with this triangle (see Figure 10.22c).
 * 
 * 	
 * 	FIGURE 10.22 (a) A point is inside the triangle. (b) A triangle is inside another triangle.
 * 	(c) A triangle overlaps another triangle.
 * 
 * 	Draw the UML diagram for the class and then implement the class. 
 * 
 * 	Write a test program that 
 * 		creates a Triangle2D objects t1 using the constructor new Triangle2D(new MyPoint(2.5, 2), 
 * 															  new MyPoint(4.2, 3),
 * 															  new MyPoint(5, 3.5)), 
 * 		displays its area and 
 * 					 perimeter, and 
 * 					 displays the result of t1.contains(3, 3), 
 * 										 	r1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and 
 * 											t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,-3), MyPoint(2, 6.5))).
 * 	
 * 	(Hint: 	For the formula to compute the area of a triangle, see Programming Exercise 2.19. 
 * 			To detect whether a point is inside a triangle, draw three dashed lines, as shown in Figure 10.23. 
 * 			If the point is inside a triangle, each dashed line should intersect a side only once. 
 * 			If a dashed line intersects a side twice, then the point must be outside the triangle. 
 * 			For the algorithm of finding the intersecting point of two lines, see Programming Exercise 3.25.)
 * 
 * 	FIGURE 10.23 (a) A point is inside the triangle. (b) A point is outside the triangle.
 * 
 * 
 * @author lucasmaximo
 *
 */

/** 
 * 
 * *  	Draw the UML diagram for the class and then implement the class. 
 * 			|                       Exercise_10_12													|
 * 			|---------------------------------------------------------------------------------------|
 * 			|						   Triangle2D     												|
 * 			|---------------------------------------------------------------------------------------|	
 * 			| - p1: MyPoint																			|
 * 			| - p2: MyPoint																			|
 * 			| - p3: MyPoint																			|
 * 			|---------------------------------------------------------------------------------------|
 * 			| + Triangle2D ()	             						    							|
 * 			| + Triangle2D (x1: double, y1: double, x2: double, y2: double, x3: double, y3: double)	|
 * 			| + getP1(): double										  								|
 * 			| + getP2(): double										  								|
 * 			| + getP3(): double										  								|
 * 			| + getArea(): double							       									|
 * 			| + contains (p: MyPoint): boolean		  			 									|
 * 			| + contains (t: Triangle2D): boolean		     										|
 * 			| + overlaps (t: Triangle2D): boolean			       									|
 * 			|_______________________________________________________________________________________| 	 
 * 			
 * */

/** Necessary imports */
import java.text.DecimalFormat;
import chapter_10.Exercise_10_04;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_12{

	/** Creating the main method */
	public static void main(String[] arg) {
		
		/** created an object of format numbers of the answers/results */
		DecimalFormat df = new DecimalFormat("####.00");
		/** Write a test program that 
		 *	creates a Triangle2D objects t1 using the constructor new Triangle2D(new MyPoint(2.5, 2), 
		 *															  new MyPoint(4.2, 3),
		 * 															  new MyPoint(5, 3.5)), 
		 * 	displays its area and 
		 * 				 perimeter, and 
		 * 				 displays the result of t1.contains(3, 3), 
		 * 									 	t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and 
		 * 										t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,-3), MyPoint(2, 6.5))).
		 */

		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));

		System.out.print("\n\n\tThe area is \t\t-> " + df.format(t1.getArea()));
		System.out.print("\n\tThe perimenter is \t-> " + df.format(t1.getPerimeter()));
		System.out.print("\n\n\t" + (((t1.contains(new MyPoint(3, 3))))?"The point is inside of the TRIANGLE":"The point is NOT inside of the TRIANGLE"));
		System.out.print("\n\n\t" + (((t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))))?"The Triangle is inside of the TRIANGLE":"The Triangle is NOT inside of the TRIANGLE")));
		System.out.print("\n\n\t" + (((t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4,-3), new MyPoint(2, 6.5)))?"The Triangle is overlaping the TRIANGLE":"The Triangle is NOT ovelarping the TRIANGLE"))));



	}//closing the main method



}//closing the Exercise_10_01 method (used as driver method)

/** (Geometry: the Triangle2D class) Define the Triangle2D class that contains: */
class Triangle2D{

	/** ■ Three points named p1, p2, and p3 of the type MyPoint with getter and
	 * setter methods. MyPoint is defined in Programming Exercise 10.4. */
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	/** ■ A no-arg constructor that creates a default triangle with the points (0, 0),
	 * (1, 1), and (2, 5). */
	public Triangle2D() {
		p1 = new MyPoint (0,0);
		p2 = new MyPoint (1,1);
		p3 = new MyPoint (2,5);
	}

	/** ■ A constructor that creates a triangle with the specified points. */
	public Triangle2D(MyPoint p1,MyPoint p2, MyPoint p3) {
		this.p1 = (p1);
		this.p2 = (p2);
		this.p3 = (p3);
	}

	public MyPoint getP1() {return p1;}
	public MyPoint getP2() {return p2;}
	public MyPoint getP3() {return p3;}

	/** ■ A method getArea() that returns the area of the triangle. */
	public double getArea() {
		double s1 = this.p1.distance(p2);
		double s2 = this.p2.distance(p3);
		double s3 = this.p3.distance(p1);
		double s = (s1 + s2 + s3) / 2.0;
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

	}
	/**	■ A method getPerimeter() that returns the perimeter of the triangle. */
	public double getPerimeter() {
		double s1 = this.p1.distance(p2);
		double s2 = this.p2.distance(p3);
		double s3 = this.p3.distance(p1);
		return s1 + s2 + s3;
	}
	/** ■ A method contains(MyPoint p) that returns true if the specified point
	 * p is inside this triangle (see Figure 10.22a).*/
	public boolean contains(MyPoint p) {
		boolean b1 = insideIn(p, p1, p2) < 0;
		boolean b2 = insideIn(p, p2, p3) < 0;
		boolean b3 = insideIn(p, p3, p1) < 0;
		boolean answer =  ((b1 == b2) && (b2 == b3));
		return answer;
	}
	/** ■ A method contains(Triangle2D t) that returns true if the specified
	 * triangle is inside this triangle (see Figure 10.22b). */
	public boolean contains(Triangle2D t) {
		return contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3());
	}
	/** ■ A method overlaps(Triangle2D t) that returns true if the specified
	 * triangle overlaps with this triangle (see Figure 10.22c).*/
	public boolean overlaps(Triangle2D t) {
		if (contains(t)) { 
			return true; 
		}

		MyPoint[] a = { p1, p2, p3 };
		MyPoint[] b = { t.getP1(), t.getP2(), t.getP3() };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int k = i + 1;
				int m = j + 1;
				if (i == a.length - 1) { k = 0; }
				if (j == b.length - 1) { m = 0; }
				if (intersect(a[i], a[k], b[j], b[m])) { return true; }
			}
		}
		return false;
	}



	/** // convenience methods - created by Max Althoff */
	private static double insideIn(MyPoint p1, MyPoint p2, MyPoint p3) {
		double x1 = p1.getX();
		double y1 = p1.getY();
		double x2 = p2.getX();
		double y2 = p2.getY();
		double x3 = p3.getX();
		double y3 = p3.getY();
		return (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);
	}
	public static boolean intersect(MyPoint p1, MyPoint q1, MyPoint p2,
			MyPoint q2) {
		int o1 = orientation(p1, q1, p2);
		int o2 = orientation(p1, q1, q2);
		int o3 = orientation(p2, q2, p1);
		int o4 = orientation(p2, q2, q1);

		if (o1 != o2 && o3 != o4)
			return true;

		return false;
	}
	public static int orientation(MyPoint p, MyPoint q, MyPoint r) {
		double val = (q.getY() - p.getY()) * (r.getX() - q.getX())
				- (q.getX() - p.getX()) * (r.getY() - q.getY());

		if (val == 0.0)
			return 0; // colinear
		return (val > 0) ? 1 : 2; // clock or counterclock wise
	}
}//closing Triangle 2D



