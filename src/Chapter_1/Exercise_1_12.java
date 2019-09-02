package Chapter_1;

import java.text.DecimalFormat;

/** 
 * 
 *  (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 *  and 35 seconds. Write a program that displays the average speed in kilometers per
 *  hour. (Note that 1 mile is 1.6 kilometers.)
 * 							
 * */
public class Exercise_1_12{

	/** Constructor not utilized */
	public Exercise_1_12() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###.##");
		
		//Creating the necessary variables 
		double runnerTotalTime = (1.0 + (40.0 / 60.0) + (35.0 / (60.0 * 60.0) ) );
		double runnerTimeMiles = 24 / runnerTotalTime;
		double runnerTimeKilometers = 1.6 * runnerTimeMiles;
		
		System.out.println("\n" + "\t\t Average runner speed was " + df.format(runnerTimeKilometers) + " Km/hour");

	}//close main method

}//close class Exercise_1_12
