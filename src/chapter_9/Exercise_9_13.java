package chapter_9;

/** 
 * 			
 * 		(The Location class) Design a class named Location for locating a maximal
 * 		value and its location in a two-dimensional array. The class contains public data
 * 		fields row, column, and maxValue that store the maximal value and its indices
 * 		in a two-dimensional array with row and column as int types and maxValue as
 * 		a double type.
 * 		Write the following method that returns the location of the largest element in a
 * 		two-dimensional array:
 * 
 * 		public static Location locateLargest(double[][] a)
 * 		
 * 		The return value is an instance of Location. Write a test program that prompts
 * 		the user to enter a two-dimensional array and displays the location of the largest
 * 		element in the array. Here is a sample run:
 * 		
 * 		
 * 		Enter the number of rows and columns in the array: 3 4
 * 		Enter the array:
 * 		23.5 35 2 10
 * 		4.5 3 45 3.5
 * 		35 44 5.5 9.6
 * 		The location of the largest element is 45 at (1, 2)
 * 		
 * @author lucasmaximo
 *
 */
/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|						Location 	 						|
 * 			|-----------------------------------------------------------|	
 * 			| + row: int  				  								|
 * 			| + column: int      	    								|
 * 			| + maxValue: double   										|
 * 			| + Location (array: double[][])							|
 * 			|-----------------------------------------------------------|
 * 			|___________________________________________________________| 
 * */
/** Necessary imports */
import java.util.Scanner;

/** Creating the class named Exercise_9_13 */
public class Exercise_9_13{

	/** Creating the main method */
	public static void main(String[] arg) {

		//created a object Scanner to absorb user interaction
		Scanner input = new Scanner(System.in);
		
		//Print out the user guide message
        System.out.print("\n\n\tPlease, Enter the rows and columns: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];

        //print out the user guide to insert the values 
        System.out.print("\n\tEnter the array: ");
        //created a main for loop in order to run all the rows
        for (int i = 0; i < m.length; i++) {
        	//created a nested for loop to run all the columns
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }//closing nested for loop 
        }//closing main for loop
		
        System.out.print("\n\tThe max value is \t-> " + locateLargest(m).maxValue);
        System.out.print("\n\tThe the row is \t\t-> " + locateLargest(m).row);
        System.out.print("\n\tThe the column is \t-> " + locateLargest(m).column);


	}//closing the main method


	/** 	 * 	Write the following method that returns the location of the largest element in a
	 * 	two-dimensional array:
	 * 
	 * 	public static Location locateLargest(double[][] a)*/
	public static Location locateLargest(double[][] a) {
		
		Location testLocation = new Location(a);

		return testLocation;
	}

}//closing the class_9_13

/**  Design a class named Location for locating a maximal
 * 		value and its location in a two-dimensional array. */
class Location{
	/**
	 *	The class contains public data fields row, column, and 
	 * 	maxValue that store the maximal value and its indices in a two-dimensional array 
	 * 	with row and column as int types and maxValue as a double type.
	 */ 
		
	public int row;
	public int column;
	public double maxValue;

	Location(double [][] maxValue){
		this.maxValue = maxValue[0][0];
		row = 0;
		column = 0;
		for (int i = 0; i < maxValue.length; i++) {
			for (int j = 0; j < maxValue[i].length; j++) {
				if (maxValue[i][j] > this.maxValue) {
					this.maxValue = maxValue[i][j];
					row = i;
					column = j;
				}
			}
		}
	}//closing the constructor

	


}//closing Location class
