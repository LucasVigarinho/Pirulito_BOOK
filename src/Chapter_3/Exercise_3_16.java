package Chapter_3;


import java.util.concurrent.ThreadLocalRandom;

/** 
 * 
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 * 
 * */

public class Exercise_3_16{

	/** Constructor not utilized */
	public Exercise_3_16() {

	}//close constructor

	
	/** Automatic generated main method */
	public static void main(String[] args) {
		

		System.out.print("\n\n\tDisplays a random coordinate in a rectangle.");
		
		double x = ThreadLocalRandom.current().nextDouble(-50.0, 50);
		double y = ThreadLocalRandom.current().nextDouble(-100.0, 100.0);
		
		System.out.print("\n\n\t X -> " + x);
		
		System.out.print("\n\n\t Y -> " + y);
		

	}//close main method

}//close class Exercise_3_16
