package chapter_01;


/** 
 * 
 * (Print a table) Write a program that displays the following table:
 * 
 * 					a 	a^2  	a^3
 * 					1 	1 		1
 * 					2 	4 		8
 * 					3	9 		27
 * 					4 	16 		64
 *
 * 
 * */
public class Exercise_1_04{

	/** Constructor not utilized */
	public Exercise_1_04() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {
		
		
		System.out.println("\n\n");
		System.out.println("\t\ta\taˆ2\taˆ3");
		
		//open for loop to produce the perfect result till 4
		for (int i = 1; i < 5; i++) {
			
			System.out.println("\t\t" + i + "\t"+ (int)Math.pow(i, 2) + "\t" + (int)Math.pow(i, 3));
			
		}//close for loop
		

	}//close main method

}//close class Exercise_1_4
