package chapter_04;



/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computing the area
 * of a regular polygon is
 *  
 *  	         						  2
 *						 		     n * S
 * 							Area = ------------ 
 *								  4 * tan(PI/n)
 *
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here is
 * a sample run:
 * 
 *  Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. Here is
 * a sample run:
 * 
 * Enter the number of sides: 5
 * Enter the side: 6.5
 * The area of the polygon is 74.69017017488385
 *  
 */

//necessary imports
import java.util.Scanner;
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_05 {

	//Creating a constructor of the public class described above
	public Exercise_4_05() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		//Creating the necessary objects to absorb the user information and to format the print out 
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		
		//print out one message to give the user chance to insert information
		System.out.print("\n\n\tEnter the number of sides: ");
		double n = input.nextDouble();
		System.out.print("\n\n\tEnter the side: ");
		double side = input.nextDouble();
		
		//calculate the area of the hexagon utilizing the formula
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n)); 
		
		//printing out the answer 
		System.out.print("\n\n\tThe area of the polygon is  " + df.format(area));
		
		//closing the object
		input.close();
	}//closing the main method
	
	
}//closing the public class Exercise_4_5
