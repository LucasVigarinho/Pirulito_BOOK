package Chapter_2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** 
 * 
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer. Here is a sample run of the program:
 * 
 * 						Here is a sample run:
 * 				
 * 						Enter the number of years: 5
 * 						The population in 5 years is 325932970
 * 
 * 
 * */
public class Exercise_2_11{

	/** Constructor not utilized */
	public Exercise_2_11() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		DecimalFormat df = new DecimalFormat("000,000,000");
		int years = 5;
		int population = 312032486; 
		int oneYear = 365;
		int secondsPerYear = (int) 60*60*24*oneYear;
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

}//close class Exercise_2_11
