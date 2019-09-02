package Chapter_1;

import java.text.DecimalFormat;

/** 
 * 
 *  (Population projection) The U.S. Census Bureau projects population based on the
 *  following assumptions:
 *  
 *  		■ One birth every 7 seconds
 *  		■ One death every 13 seconds
 *  		■ One new immigrant every 45 seconds
 *  
 *  Write a program to display the population for each of the next five years. Assume the
 *  current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 *  integers perform division, the result is an integer. The fractional part is truncated. For
 *  example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 *  the fractional part, one of the values involved in the division must be a number with a
 *  decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * 							
 * */
public class Exercise_1_11{

	/** Constructor not utilized */
	public Exercise_1_11() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		DecimalFormat df = new DecimalFormat("000,000,000");
		int years = 5;
		int population = 312032486; 
		int oneYear = 365;
		double secondsPerYear = 60*60*24*oneYear;
		int birthSeconds = (int) (secondsPerYear/7);
		int deathSeconds = (int) (secondsPerYear/13);
		int newImmigrant = (int) (secondsPerYear/45);
		int finalResult = (population + (((birthSeconds) + (newImmigrant))*years))- (deathSeconds)*years;
		
		
		System.out.println("\n");
		System.out.println("\tThe result of births in five year \t=" + " " + (df.format((birthSeconds)*years)));
		System.out.println("\tThe result of deaths in five year \t=" + " " + df.format((deathSeconds)*years));		
		System.out.println("\tThe result of newImigrants in five year =" + " " + df.format((newImmigrant)*years));
		System.out.println("\tPopulation before 5 year \t\t=" + " " + df.format(population));
		System.out.println("\tTHE NEW POPULATION IN FIVE YEARS TIME\t=" + " " + df.format(finalResult));
		

	}//close main method

}//close class Exercise_1_11
