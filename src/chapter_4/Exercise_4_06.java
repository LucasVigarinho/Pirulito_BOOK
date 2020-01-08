package chapter_4;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
 * formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
 * angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point determined
 * by this angle is (r*cos(a), r*sin(a)).)
 * 
 *     x = r × cos(α) and y = r ×sin(α)                  0 o’clock position
 * 
 * 			**** figure page 152 ****
 * 
 * 
 * (a) A triangle is formed from three random points on the circle. (b) A random
 * point on the circle can be generated using a random angle a. (c) A pentagon is centered at
 * (0, 0) with one point at the 0 o’clock position.
 * 
 * 
 */

//necessary imports
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_06 {

	//Creating a constructor of the public class described above
	public Exercise_4_06() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		
		DecimalFormat df = new DecimalFormat("####,00");
		
		double r = 40;
		
		// Creating random angles in radians between 0 and 2PI
		double a1 = ( Math.random () * ( Math.PI * 2 ));
		double a2 = ( Math.random () * ( Math.PI * 2 ));
		double a3 = ( Math.random () * ( Math.PI * 2 ));

		// Defining x and y form the angles above
		double x1 = r * Math.cos ( a1 );
		double y1 = r * Math.sin ( a1 );
		double x2 = r * Math.cos ( a2 );
		double y2 = r * Math.sin ( a2 );
		double x3 = r * Math.cos ( a3 );
		double y3 = r * Math.sin ( a3 );

		// Compute the three sides
		double a = Math.pow (( Math.pow(( x2 - x3 ), 2 ) + Math.pow(( y2 - y3 ), 2 )), 0.5 );
		double b = Math.pow (( Math.pow(( x1 - x3 ), 2 ) + Math.pow(( y1 - y3 ), 2 )), 0.5 );
		double c = Math.pow (( Math.pow(( x1 - x2 ), 2 ) + Math.pow(( y1 - y2 ), 2 )), 0.5 );

		// Compute three angles following the formula
		double aA = Math.toDegrees (Math.acos((( a * a ) - ( b * b ) - ( c * c )) / ( -2 * b * c )));
		double aB = Math.toDegrees (Math.acos((( b * b ) - ( a * a ) - ( c * c )) / ( -2 * a * c )));
		double aC = Math.toDegrees (Math.acos((( c * c ) - ( b * b ) - ( a * a )) / ( -2 * a * b )));

		// Display results
		System.out.println("\n\n\tThe three angles are " + df.format(aA) + " " + df.format(aB)+ " " + df.format(aC) );	

	
	}//closing the main method
	
	
}//closing the public class Exercise_4_6
