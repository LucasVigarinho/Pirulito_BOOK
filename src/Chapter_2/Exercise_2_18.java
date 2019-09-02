package Chapter_2;



/** 
 * 
 * (Print a table) Write a program that displays the following table. Cast floatingpoint
 * numbers into integers.
 * 
 * 
 * 					a 	b	  	pow(a, b)
 * 					1 	2 		1
 * 					2 	3 		8
 * 					3	4 		81
 * 					4 	5 		1024
 * 					5	6		15625
 * 
 * */
public class Exercise_2_18{

	/** Constructor not utilized */
	public Exercise_2_18() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

		
		int a = 1;
		System.out.println("\n\n");
		System.out.println("\t\ta\taˆ2\taˆ3");
		
		//open for loop to produce the perfect result till 4
		for (int i = 1; i < 6; i++) {
			
			System.out.println("\t\t" + i + "\t"+ (int)(i+1) + "\t" + (int)Math.pow(i, (i+1)));
			
		}//close for loop
		

	}//close main method

}//close class Exercise_2_18
