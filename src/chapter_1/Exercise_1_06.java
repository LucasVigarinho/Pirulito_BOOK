package chapter_1;


/** 
 * 
 *  (Summation of a series) Write a program that displays the result of
 *  		
 *  			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
 * 							
 * 
 * */
public class Exercise_1_06{

	/** Constructor not utilized */
	public Exercise_1_06() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {
		
		System.out.println(" \t1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 ");
		
		int q = 1;
		
		for (int i = 2; i < 10 ; i++) {
			q+=i;
		}
		System.out.println("\n\tanswer  = " + q );
		

	}//close main method

}//close class Exercise_1_6
