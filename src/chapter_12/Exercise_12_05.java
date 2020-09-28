package chapter_12;
import java.util.Scanner;

import chapter_11.Exercise_11_01;
import chapter_12.Triangle.IllegalTriangleException;


/**			EXERCISE DESCRIPTION 
 * 
 * 		(IllegalTriangleException) Programming Exercise 11.1 defined the
 * 		Triangle class with three sides. In a triangle, the sum of any two sides is
 * 		greater than the other side. The Triangle class must adhere to this rule.
 * 		Create the IllegalTriangleException class, and modify the constructor
 * 		of the Triangle class to throw an IllegalTriangleException object if a
 * 		triangle is created with sides that violate the rule, as follows:
 * 
 * 		// Construct a triangle with the specified sides 
 * 		public Triangle(double side1, double side2, double side3)
 * 		throws IllegalTriangleException {
 * 		// Implement it
 * 		}
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (05) in a compose name */
public class Exercise_12_05   {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		// Create a Scanner object
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a color
				System.out.print("Enter a color: ");
				String color = input.next();

				// Prompt the user to enter whether the triangle is filled
				System.out.print("Is the triangle filled (true / false)? ");
				boolean filled = input.nextBoolean();

				boolean repeatSidesInput = true;
				do {
					// Prompt the user to enter three sides of the triangle
					System.out.print("Enter three side of the triangle: ");
					double side1 = input.nextDouble();		
					double side2 = input.nextDouble();		
					double side3 = input.nextDouble();
			
					try {
						// Create triangle object with user input
						Triangle triangle = new Triangle(side1, side2, side3);
						repeatSidesInput = false;	
						
						
						System.out.println(triangle.toString());
						System.out.println("Area: " + triangle.getArea());
						System.out.println("Perimeter: " + triangle.getPerimeter());
						System.out.println("Triangle is" + (Triangle.isTriangle (side1, side2, side3) ? "" : " not "));
					}
					catch (IllegalTriangleException ex) {
						System.out.println(ex.getMessage());
					}

				} while (repeatSidesInput);
		
	}//closing the mains method


}//closing class exercise_12_05

class Triangle  {

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        isValidTriangle();
    }

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double getArea() {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static boolean isTriangle(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTriangleException {
        this.side1 = side1;
        isValidTriangle();
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTriangleException{
        this.side2 = side2;
        isValidTriangle();
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTriangleException {
        this.side3 = side3;
        isValidTriangle();
    }

    private void isValidTriangle() throws IllegalTriangleException{
        if (!isTriangle(side1, side2, side3)) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }

    @SuppressWarnings("serial")
	public class IllegalTriangleException extends IllegalArgumentException {

        private double s1;
        private double s2;
        private double s3;

         public IllegalTriangleException(double s1, double s2, double s3) {
            super("Not a real triangle:" + " side1 = " + s1 + " side2 = " + s2 + " side3 = " + s3);
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        public double getS1() {
            return s1;
        }

        public double getS2() {
            return s2;
        }

        public double getS3() {
            return s3;
        }

    }
}