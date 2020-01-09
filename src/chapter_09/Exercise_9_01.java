package chapter_09;

/** 
 * 			
 * 
 * 		(The Rectangle class) Following the example of the Circle class in Section 9.2,
 * 		design a class named Rectangle to represent a rectangle. The class contains:
 * 		■ Two double data fields named width and height that specify the width and
 * 		height of the rectangle. The default values are 1 for both width and height.
 * 		■ A no-arg constructor that creates a default rectangle.
 * 		■ A constructor that creates a rectangle with the specified width and height.
 * 		■ A method named getArea() that returns the area of this rectangle.
 * 		■ A method named getPerimeter() that returns the perimeter.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that creates two Rectangle objects—one with width 4 and height 40
 * 		and the other with width 3.5 and height 35.9. Display the width, height, area,
 * 		and perimeter of each rectangle in this order.
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */


/** Creating the class named Exercise_9_01 */
public class Exercise_9_01{

	/** Creating the main method */
	public static void main(String[] arg) {

		// Create a rectangle with a default rectangle.
		Rectangle rectangle1 = new Rectangle();
		System.out.println("\n\n\tThe area of the rectangle of width " + rectangle1.getWidth() + " and height  " + rectangle1.getHeight() + " is -> " + rectangle1.getArea());
		System.out.println("\n\n\tThe perimenter of the rectangle of width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " is -> " + rectangle1.getPerimeter());
		//printing out the shape of the rectangle with 4 x 4
		printRectangle(rectangle1.getWidth(), rectangle1.getHeight());

		//Created an objects—one with width 4 and height 40
		Rectangle rectangle2 = new Rectangle(3.5, 40);
		System.out.println("\n\n\tThe area of the rectangle of width " + rectangle2.getWidth() + " and height  " + rectangle2.getHeight() + " is -> " + rectangle2.getArea());
		System.out.println("\n\n\tThe perimenter of the rectangle of width " + rectangle2.getWidth() + " and height " + rectangle2.getHeight() + " is -> " + rectangle2.getPerimeter());
		//printing out the shape of the rectangle2 3.5 x 40
		printRectangle(rectangle2.getWidth(), rectangle2.getHeight());
		
		

	}//closing the main method

	/** Created a method in order to print out the rectangle created */
	public static void printRectangle(double width, double height) {

		//Visual motives code, giving space 
		System.out.print("\n\n\t ");

		//created a for loop in order to print the first part of the rectangle
		for(int a = 0; a < width; a++) {
			//printing out the first part of the rectangle, the ceiling
			System.out.print("___");
		}
		System.out.print("\n\t");
		//created the second for loop in order to print the two laterals of the rectangle
		for(int b = 0; b < height; b++) {
			System.out.print("|");
			//created a nested for loop in order to print the internal space of the rectangle
			for(int c = 0; c < width; c++) {
				System.out.print("   ");
			}
			System.out.print("|\n\t");
		}
		//Visual motives code, giving space 
		System.out.print(" ");
		//created a for loop in order to print the last part of the rectangle, the floor
		for(int a = 0; a < width; a++) {
			//printing out the first part of the rectangle, the the floor
			System.out.print("---");
		}

	}//closing the print rectangle method

}//closing the Exercise_9_01 method (used as driver method)

// Define the rectangle class with two constructors (default and personalized)
class Rectangle {
	double width;
	double height;

	/** Construct a rectangle with width and height 4 */
	Rectangle() {
		width = 4;
		height = 4;
	}

	/** Construct a rectangle with a specified height and width */
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	/** Return the area of this circle */
	double getArea() {
		return width * height;
	}

	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + height);
	}
	/** Return the width value */
	public double getWidth() {
		return width;
	}
	/** Set the new value of the width */
	public void setWidth(double width) {
		this.width = width;
	}
	/** return the height value */
	public double getHeight() {
		return height;
	}
	/** set the new value of height */
	public void setHeight(double height) {
		this.height = height;
	}




}//closing the class_9_01

