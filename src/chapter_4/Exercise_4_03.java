package chapter_4;


/**
 * 
 * @author lucasmaximo
 *
 */

/**
 * 
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 * four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 * distance between two cities. Divide the polygon into two triangles and use the
 * formula in Programming Exercise 2.19 to compute the area of a triangle.)
 * 
 * 
 * 		 GPS locations for Atlanta	, Georgia		; 51.5138505182,	-0.15690922737098845
 * 		 GPS locations for Orlando	, Florida		; 28.5383355,		-81.37923649999999
 * 		 GPS locations for Savannah	, Georgia		; 32.0835407,		-81.09983419999998
 * 		 GPS locations for Charlotte	, North Carolina; 35.2270869,		-80.84312669999997
 *  
 */

//necessary imports
import java.util.Scanner;
import java.text.DecimalFormat;

//creating a public class
public class Exercise_4_03 {

	//Creating a constructor of the public class described above
	public Exercise_4_03() {

	}//closing the constructor

	//Creating the main method
	public static void main (String[] args) {

		//creating the necessary objects to format and absorb the user information
		DecimalFormat df = new DecimalFormat("##.#############");
		DecimalFormat df1 = new DecimalFormat("##.##");
		Scanner input = new Scanner(System.in);

		//Defining the latitude and longitude of Atlanta, Georgia
		double x1 = 51.5138505182;
		double y1 = -0.15690922737098845;

		//Defining the latitude and longitude of Orlando, Florida
		double x2 = 28.5383355;
		double y2 = -81.37923649999999;

		//Defining the latitude and longitude of Savannah, Georgia
		double x3 = 32.0835407;
		double y3 = -81.09983419999998;

		//Defining the latitude and longitude of Charlote, North Carolina
		double x4 = 35.2270869;
		double y4 = -80.84312669999997;
		
		//printing out the informations of each city - latitude and longitude
		System.out.print("\n\n\tGPS locations for Atlanta, Georgia; \t\t" 	+ df.format(x1) + ", \t" + df.format(y1) );
		System.out.print("\n\n\tGPS locations for Orlando, Florida; \t\t" 	+ df.format(x2) + ", \t" + df.format(y2) );
		System.out.print("\n\n\tGPS locations for Savannah, Georgia;\t\t" 	+ df.format(x3) + ", \t" + df.format(y3) );
		System.out.print("\n\n\tGPS locations for Charlotte, North Carolina; \t"+ df.format(x4) + ", \t" + df.format(y4) );

		//calculating first triangle utilizing the exercise 2.19 formula done
		double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double s = (s1 + s2 + s3) / 2;
		double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

		//calculating the second triangle including the new point represented by Charlote, North Carolina - x4
		s1 = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)), 0.5);
		s2 = Math.pow((Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)), 0.5);
		s3 = Math.pow((Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2)), 0.5);
		s = (s1 + s2 + s3) / 2;
		area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)) + area;

		//print out the answer found
		System.out.print("\n\n\n\n\tTHE AREA ENCLOSED BY 4 CITIES IS --> " + df1.format(area) + " km^2");

		//closing the object scanner
		input.close();

	}//closing the main method


}//closing the public class Exercise_4_3

