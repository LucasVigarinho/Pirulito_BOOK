package chapter_4;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Geometry: great circle distance) The great circle distance is the distance between
 * two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 * latitude and longitude of two points. The great circle distance between the two
 * points can be computed using the following formula:
 * 
 * 
 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * 
 * Write a program that prompts the user to enter the latitude and longitude of two
 * points on the earth in degrees and displays its great circle distance. The average
 * earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
 * using the Math.toRadians method since the Java trigonometric methods use
 * radians. The latitude and longitude degrees in the formula are for north and west.
 * Use negative to indicate south and east degrees. 
 * 
 * Here is a sample run:
 * 
 * 
 * Enter point 1 (latitude and longitude) in degrees: 39.55 -116.25
 * Enter point 2 (latitude and longitude) in degrees: 41.5 87.37
 * The distance between the two points is 10691.79183231593 km
 * 
 *  
 */

//necessary imports
import java.util.Scanner;
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_2 {

	//Creating a constructor of the public class described above
	public Exercise_4_2() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		//creating the object to absorb the user iformation
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.0000000000000");

		//print out the message to absorb the user insert
		System.out.print("\n\n\tEnter point 1 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("\n\n\tEnter point 2 (latitude and longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		//calculation
		double averageEarthRadius = 6371.01;

		 double d = averageEarthRadius * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(y1))) + 
				    					(Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(y1)) * Math.cos(Math.toRadians(y2) - Math.toRadians(x2))));
		//print out the answer
		System.out.print("\n\n\tThe distance between the two points is  " + df.format(d) + " km");

		//closing object
		input.close();

	}//closing the main method


}//closing the public class Exercise_4_2
