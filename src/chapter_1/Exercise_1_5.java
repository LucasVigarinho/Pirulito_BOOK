package chapter_1;


/** 
 * 
 * (Compute expressions) Write a program that displays the result of
 * 
 * 				9.5 * 4.5 - 2.5 * 3
 * 				------------------- .
 * 					45.5 - 3.5
 * 							
 * 
 * */
public class Exercise_1_5{

	/** Constructor not utilized */
	public Exercise_1_5() {
		// TODO Auto-generated constructor stub
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {
		
		double ans = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
		
		System.out.println(" The result of \t	9.5 * 4.5 - 2.5 * 3\n" + 
				"  			-------------------    =    " + ans + "\n" + 
				"\t\t    	45.5 - 3.5");
		

	}//close main method

}//close class Exercise_1_5
