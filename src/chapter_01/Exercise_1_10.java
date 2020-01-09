package chapter_01;


/** 
 * 
 *  (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 *  seconds. Write a program that displays the average speed in miles per hour. (Note
 *  that 1 mile is 1.6 kilometers.)
 * 							
 * */
public class Exercise_1_10{

	/** Constructor not utilized */
	public Exercise_1_10() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		double kilometer = 14;
		double miles = kilometer / 1.6;
		double second = 1;
		double minute = 60 * second;
		double hour = 60 * minute;

		
        double rate = (45.5 * minute + 30.0) / (hour);
        double speedMiles = miles / rate;
		
		//printing the results out
		System.out.println("\n\n\tThe runner was running in " + speedMiles + " miles per hour \t= " );


		

	}//close main method

}//close class Exercise_1_10
