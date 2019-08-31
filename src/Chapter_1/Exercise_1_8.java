package Chapter_1;


/** 
 * 
 *  (Area and perimeter of a circle) Write a program that displays the area and perimeter
 *  of a circle that has a radius of 5.5 using the following formula:
 *  
 *  		perimeter = 2 * radius * π
 *  		area = radius * radius * π
 * 							
 * */
public class Exercise_1_8{

	/** Constructor not utilized */
	public Exercise_1_8() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		//Creating the necessary variables 
		double radius = 5.5;
		double perimeter = 2 * radius * Math.PI;
		double area = radius * radius * Math.PI;
		
		
		//printing the results out
		System.out.println("\n\n\tThe result of perimeter \t= " + perimeter);
		System.out.println("\tThe result of area \t\t= " + area);

		

	}//close main method

}//close class Exercise_1_8
