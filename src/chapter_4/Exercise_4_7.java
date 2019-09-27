package chapter_4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * 
 * 
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon. Here is a sample run:
 * 
 * 
 * Enter the radius of the bounding circle: 100
 * The coordinates of five points on the pentagon are
 * (95.1057, 30.9017)
 * (0.000132679, 100)
 * (-95.1056, 30.9019)
 * (-58.7788, -80.9015)
 * (58.7782, -80.902)
 * 
 * 
 */

//necessary imports

//creating a public class
public class Exercise_4_7 {

	//Creating a constructor of the public class described above
	public Exercise_4_7() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {

		//Creating the necessary objects to absorb the user information and to format the print out 
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.0000");

		//print out one message to give the user chance to insert information
		System.out.print("\n\n\tEnter the radius of the bounding circle: ");
		double r = input.nextDouble();

		// Creating random angles in radians between 0 and 2PI
		double a1 = ( Math.random () * ( Math.PI * 2 ));
		double a2 = ( Math.random () * ( Math.PI * 2 ));
		double a3 = ( Math.random () * ( Math.PI * 2 ));
		double a4 = ( Math.random () * ( Math.PI * 2 ));
		double a5 = ( Math.random () * ( Math.PI * 2 ));

		// Defining x and y form the angles above
		double x1 = r * Math.cos ( a1 );
		double y1 = r * Math.sin ( a1 );
		double x2 = r * Math.cos ( a2 );
		double y2 = r * Math.sin ( a2 );
		double x3 = r * Math.cos ( a3 );
		double y3 = r * Math.sin ( a3 );
		double x4 = r * Math.cos ( a4 );
		double y4 = r * Math.sin ( a4 );
		double x5 = r * Math.cos ( a5 );
		double y5 = r * Math.sin ( a5 );

		//print out the five si
		System.out.println("\n\n\tThe coordinates of five points on the pentagon are \n\n" );	
		System.out.println("\t (\t" + df.format(x1) + "\t\t, \t" + df.format(y1) + "\t )" );	
		System.out.println("\t (\t" + df.format(x2) + "\t\t, \t" + df.format(y2) + "\t )" );	
		System.out.println("\t (\t" + df.format(x3) + "\t\t, \t" + df.format(y3) + "\t )" );	
		System.out.println("\t (\t" + df.format(x4) + "\t\t, \t" + df.format(y4) + "\t )" );	
		System.out.println("\t (\t" + df.format(x5) + "\t\t, \t" + df.format(y5) + "\t )" );	

		//closing the object scanner used to absorbs the user input
		input.close();
		
	}//closing the main method


}//closing the public class Exercise_4_7

