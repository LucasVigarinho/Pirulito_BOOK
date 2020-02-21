package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Area of a convex polygon) A polygon is convex if it contains any line segments
 * 		that connects two points of the polygon. Write a program that prompts the user to
 * 		enter the number of points in a convex polygon, then enter the points clockwise,
 * 		and display the area of the polygon. Here is a sample run of the program:
 * 
 * 		Enter the number of the points: 7
 * 		Enter the coordinates of the points:
 * 		-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -3.5
 * 		The total area is 250.075
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */

import java.util.Scanner;
import java.util.ArrayList;


/** Created the main class, using the name of the package (11) and the exercise (15) in a compose name */
public class Exercise_11_15 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		/** Created the Scanner object */
		Scanner input = new Scanner(System.in);
		/** Created the variable, to absorb the are of Polygon */
		double area = getAreaOfConvexPolygon(input);

		/** Print out the final answer */
		System.out.println("The total area is " + area);

	}//closing the mains method
	
	/** Created the getAreaOfConvexPolygon method, receiving the user input */
	public static double getAreaOfConvexPolygon(Scanner input) {
		/** Created the ArrayList of ArrayList double */
		ArrayList<ArrayList<Double>> points = getPoints(input);

		double sumOfProducts = 0.0;
		
		for (int i = 0; i < points.size() - 1; i++) {
			double x1 = points.get(i).get(0);
			double y1 = points.get(i).get(1);
			double x2 = points.get(i + 1).get(0);
			double y2 = points.get(i + 1).get(1);
			sumOfProducts += ((x1 * y2) - (y1 * x2));
		}

		return Math.abs(sumOfProducts / 2);
	}

	/** Created the getPoints method, return an ArrayList of ArrayList of Double */
	public static ArrayList<ArrayList<Double>> getPoints(Scanner input) {
		System.out.print("Enter the number of the points: ");
		int size = input.nextInt();
		System.out.print("Enter the coordinates of the points: ");
		ArrayList<ArrayList<Double>> points = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			ArrayList<Double> point = new ArrayList<>();
			point.add(input.nextDouble());
			point.add(input.nextDouble());
			points.add(point);
		}
		return points;
	}



}//closing class exercise_11_15
