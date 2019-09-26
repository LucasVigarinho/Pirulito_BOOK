package chapter_4;


/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.
 *                            ____________
 *                           /            \                                        
 *	                        /              \                                            
 *                         /                \                                        
 *                        /                  \                                             
 *                       /          r_________\                                          
 *                       \                    /                                                         
 *                        \                  /                                                    
 *                         \                /                                                    
 *                          \              /                                             
 *							 \____________/					         2
 *															    5 * S
 * The formula for computing the area of a pentagon is Area = ------------ , where
 *															 4 * tan(PI/5)
 *
 * S is the length of a side. The side can be computed using the formula s = 2r sin Pi/5,
 * where r is the length from the center of a pentagon to a vertex. Round up two digits
 * after the decimal point. Here is a sample run:
 *
 * Enter the length from the center to a vertex: 5.5
 * The area of the pentagon is 71.92
 */

//necessary imports
import java.util.Scanner;
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_1 {

	//Creating a constructor of the public class described above
	public Exercise_4_1() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {
		//creating the object to absorb the user iformation
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		
		//print out the message to absorb the user insert
		System.out.print("\n\n\tEnter the length from the center to a vertex: ");
		double r = input.nextDouble();
		
		//calculation
		double s = (2 * r * Math.sin(Math.PI/5));
		double area = ((5 * Math.pow(s, 2)) / (4 *( Math.tan((Math.PI/5)))));
		
		//print out the answer
		System.out.print("\n\n\tThe area of the pentagon is " + df.format(area));
		
		//closing object
		input.close();
		
	}//closing the main method
	
	
}//closing the public class Exercise_4_1
