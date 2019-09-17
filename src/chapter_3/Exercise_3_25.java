package chapter_3;

/**
 * 
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following
 * linear equation:
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise
 * 3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * 
 * Write a program that prompts the user to enter four points and displays the intersecting
 * point. Here are sample runs:
 * 
 * 			   (x2,y2)		
 * 			     /		  (x2,y2)				(x2,y2)		(x3,y3)
 *  (x3,y3)     /            /                     /		   /
 * 		\      /            /\                    /			  /	
 * 		 \    /            /  \                  /			 /
 * 		  \  /            /    \(x3,y3)         /			/
 *         \/            /      \              /		   /
 *         /\           /        \            /			  /
 *        /  \         /          \			 /			 /
 *       /    \		(x1,y1)	    (x4,y4)		/			/
 *      /    (x4,y4)					(x1,y1)		(x4,y4)
 *   (x1,y1)
 * 
 * Two lines intersect in (a and b) and two lines are parallel in (c).
 * 
*/

/** Defining the main class*/
public class Exercise_3_25 {

	/** Defining the constructor of the class */
	public Exercise_3_25() {

	}//closing constructor

	/** creating the main method */
	public static void main(String[] args) {
		
	}//closing the main method
	
}//closing class exercise_3_25
