package chapter_08;
/** 
 * 		
 * 		(Central city) Given a set of cities, the central city is the city that has the shortest
 * 		total distance to all other cities. Write a program that prompts the user to enter
 * 		the number of the cities and the locations of the cities (coordinates), and finds
 * 		the central city and its total distance to all other cities.
 * 		
 * 		Enter the number of cities: 5
 * 		Enter the coordinates of the cities:
 * 		2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
 * 		The central city is at (2.5, 5.0)
 * 		The total distance to all other cities is 60.81
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_8_01 */
public class Exercise_8_21{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the necessary objects
		Scanner input = new Scanner(System.in);
		//print out the message to be the guide during the user interaction
		System.out.print("\n\tEnter the number of cities: ");
		//created the array multidimensional using the user input as quantity of rows.cities
		double[][] cities = new double[input.nextInt()][2];
		//print out the message in order to give the user an opportunity to input the positions
		System.out.print("\n\tEnter the coordinates of the cities: ");

		//created a for loop in order to absorb all the necessary inputs by the user
		for (int i = 0; i < cities.length; i++) {
			cities[i][0] = input.nextDouble();
			cities[i][1] = input.nextDouble();
		}//closing for loop 

		/** Created a variable city to absorb when the calculation show the shortest distance*/
		int city = -1;
		//created the shortestTotalDistance with the max value of a double, in order to verify only short values
		double shortestTotalDistance = Double.MAX_VALUE;
		double totalDistance = 0.0;

		//created a for loop in order to verify all row/cities
		for (int row = 0; row < cities.length; row++) {
			//initiated totalDistance with 0 in every loop, in order to renew the distance in all main loop
			totalDistance = 0.0;
			/** Created a nested loop in order to verify all two values of a city position and sum all cities 
			 * in relation of the city of every loop of the main for loop */
			for (int j = 0; j < cities.length; j++) {
				totalDistance += distance(cities[row][0], cities[row][1], cities[j][0],cities[j][1]);
			}//closing a nested loop

			//created a if statement in order to verify the shortest total distance from the nested loop, before verify the sum of the next city in relation to the rest
			if (totalDistance < shortestTotalDistance) {
				shortestTotalDistance = totalDistance;
				city = row;
			}//closing if statement
		}//closing the main for loop

		//printing out the results
		System.out.print("\n\tThe central city is at (" );
		//created a for loop in order to print both values of the city position
		for(int a = 0; a < cities[city].length; a++) {
			System.out.print(" " + cities[city][a]); 
		}//closing the for loop 
		System.out.println(" )" );
		System.out.println("\n\tThe total distance to all other cities is " + shortestTotalDistance);
		input.close();
	}//closing the main method

	/** Created a method in order to calculate the distance between a specific city and another */
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}






}//closing the class_8_21

