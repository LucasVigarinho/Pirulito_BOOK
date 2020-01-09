package chapter_04;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * 
 *  	         						  2
 *						 		     6 * S
 * 							Area = ------------ 
 *								  4 * tan(PI/6)
 *  
 *  
 *  Write a program that prompts the user to enter the side of a hexagon and displays
 *  its area. Here is a sample run:
 *  
 *  
 *  Enter the side: 5.5
 *  The area of the hexagon is 78.59
 */

//necessary imports
import java.util.Scanner;
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_04 {

	//Creating a constructor of the public class described above
	public Exercise_4_04() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		
		//Creating the necessary objects to absorb the user information and to format the print out 
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		
		//print out one message to give the user chance to insert information
		System.out.print("\n\n\tEnter the side: ");
		double side = input.nextDouble();
		
		//calculate the area of the hexagon utilizing the formula
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/6)); 
		
		//printing out the answer 
		System.out.print("\n\n\tThe area of the hexagon is " + df.format(area));
		
		//closing the object
		input.close();
		
	}//closing the main method
	
	
}//closing the public class Exercise_4_4
