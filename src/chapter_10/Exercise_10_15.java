package chapter_10;
import java.util.Scanner;
/** 
 * 			
 * 	(Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle
 * 	that encloses a set of points in a two-dimensional plane, as shown in
 * 	Figure 10.24d. 
 * 		
 * 	Write a method that returns a bounding rectangle for a set of
 * 	points in a two-dimensional plane, as follows:
 * 	
 * 	public static MyRectangle2D getRectangle(double[][] points)
 * 		
 * 	The Rectangle2D class is defined in Programming Exercise 10.13. Write a
 * 	test program that prompts the user to enter five points and displays the bounding
 * 	rectangle’s center, width, and height. Here is a sample run:
 * 	
 * 	
 * 	Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
 * 	The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import chapter_10.Exercise_10_13;

/** Creating the class named Exercise_10_01 */
public class Exercise_10_15{

	/** Creating the main method */
	public static void main(String[] arg) {

		
		/** Write a method that returns a bounding rectangle for a set of
		 * 	points in a two-dimensional plane, as follows:
		 * 	
		 * 	public static MyRectangle2D getRectangle(double[][] points)
		 * 		
		 * 	The Rectangle2D class is defined in Programming Exercise 10.13. 
		 * 
		 * 	Write a test program that prompts the user to enter five points and displays the bounding
		 * 	rectangle’s center, width, and height. Here is a sample run:*/	
		
		double [][] rectangle = new double [][] {	{1.0, 2.5	},
													{3	, 4		},
													{5	, 6		},
													{7	, 8		},
													{9	, 10	}};
		getRectangle(rectangle);

	}//closing the main method

	public static MyRectangle2D getRectangle(double[][] points) {
		double width;
		double height;
		
		 // 1.0 2.5 3 4 5 6 7 8 9 10
        System.out.print("Enter 5 given points: ");
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D r1 = MyRectangle2D.getRectangle(points);
        System.out.println("Center point: " + r1.getCenterP().toString());
        System.out.println("width = " + r1.getWidth());
        System.out.println("height = " + r1.getHeight());
    
	}
	
	
	/** Verify this link -> https://github.com/LuizGsa21/intro-to-java-10th-edition/blob/master/src/Chapter_10/Exercise_15.java */
	

}//closing the Exercise_10_01 method (used as driver method)



