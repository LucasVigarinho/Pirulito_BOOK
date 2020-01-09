package chapter_07;


/** 
 * 		
 * 		(Game: bean machine) The bean machine, also known as a quincunx or the Galton
 * 		box, is a device for statistics experiments named after English scientist Sir
 * 		Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 * 		in a triangular form, as shown in Figure 7.13.
 * 		
 * 		
 * 		Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 * 		has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 * 		in the slots at the bottom of the board.
 * 		Write a program that simulates the bean machine. Your program should prompt
 * 		the user to enter the number of the balls and the number of the slots in the machine.
 * 		Simulate the falling of each ball by printing its path. For example, the path for
 * 		the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 * 		RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
 * 		is a sample run of the program:
 * 		
 * 		
 * 		Enter the number of balls to drop: 5
 * 		Enter the number of slots in the bean machine: 8
 * 		LRLRLRR
 * 		RRLLLRR
 * 		LLRLLRR
 * 		RRLLLLL
 * 		LRLRRLR
 * 			O
 * 			O
 * 		  OOO
 * 
 * 		(Hint: Create an array named slots. Each element in slots stores the number
 * 		of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
 * 		a path is the position of the slot where the ball falls. For example, for the path
 * 		LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball
 * 		falls into slots[2].)
 * 
 *       
 * 
 * 		The idea  -> 8 slots & 8 balls
 * 		------------------------------
 * 
 * 				             |o|         
 *                          / ^o\        1  
 *   					   / ^ ^o\       2  
 * 						  /	^ ^o^ \      3  
 * 						 / ^ ^ ^o^ \     4   
 * 				        / ^ ^ ^o^ ^ \    5     
 *          		   / ^ ^ ^ ^o^ ^ \   6
 *          		  / ^ ^ ^ ^ ^ ^ ^ \	 7
 *                   / ^ ^ ^ ^ ^ ^ ^ ^ \ 8     
 *                   | | | | |o| | | | |      
 *                   | | | | |o| | | | |          				
 *                   | | | |o|o|o| | | |      
 *                   | | | |o|o|o| | | |                   
 *                    1 2 3 4 5 6 7 8 9	    
 *                    
 * 		The idea  -> 6 slots & 8 balls
 * 		------------------------------
 * 
 * 				             |o|         
 *                          / ^o\        1  
 *   					   / ^ ^o\       2  
 * 						  /	^ ^o^ \      3  
 * 						 / ^ ^ ^o^ \     4   
 * 				        / ^ ^ ^o^ ^ \    5     
 *          		   / ^ ^ ^ ^o^ ^ \   6    
 *                     | | | | |o| | |       
 *                     | | | | |o| | |            				
 *                     | | | |o|o|o| |        
 *                     | | | |o|o|o| |                    
 *                      1 2 3 4 5 6 7 	   
 *                           
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Random;
import java.util.Scanner;


/** Creating the class named Exercise_7_21 */
public class Exercise_7_21{

	/** Creating the main method */
	public static void main(String[] arg) {


		//create the object Scanner
		Scanner input = new Scanner(System.in);
		//print out the message to let the user know the necessary interaction
		System.out.print("\n\n\tEnter the number of balls to drop: ");
		//create the necessary variables to absorb the number of balls will be tested 
		int balls = input.nextInt();
		/** Print out the message to let the user know the necessary interaction, in this case
		 * how many slots or 50% chances to the ball goes to L or R ... or levels, because 
		 * in each level the ball pass for one interaction */
		System.out.print("\n\n\tEnter the number of slots in the bean machine: ");
		//create the necessary variables to absorb number of tests to get in the final result
		int slots = input.nextInt();

		/** Created the necessary varibales - the array for machine and result */
		char [][] machine = new char [balls][slots];
		int [] result = new int [slots];
		/** Drop all the ball through the machine */
		machineProcess(machine);
		
		/** Calculate the results */
		result = calculateResult(machine, result);
		
		/** Calling the method to print the results of the balls drooped */
		printBeanMachine(machine, result);
		

		input.close();
	}//closing the main method


	/** Created a method to randomnly suggest the results of the slots */
	public static char randomResult() {

		//Created the object to generates the random guess
		Random r = new Random();
		//created the variable to absobr the result randonmloy
		int guess = r.nextInt(2) +1;
		
		//created an if statement in order to guive back the result with the right or left
		if(guess == 1) {
			return 'R';
		}else {
			return 'L';
		}//closing if statement
		
	}//closing the method

	/** Created a method to fill the guesses for each ball, randomly */
	public static void machineProcess(char [][] machine) {
		
		/** created a for loop in order to fill all the positions of the array  */
		for(int a = 0; a < machine.length; a++) {
			/** Created a nested for loop in order to fill all positions*/
			for(int b = 0; b < machine.length; b++) {
				machine[a][b] = randomResult();
			}//closing for loop 
		}//closing the main for loop 

	}//closing the method machine process 
	
	/** Created a method in order to calculate the results */
	public static int [] calculateResult(char [][] machine, int [] results) {
		/** created variables necessary to manipulated the positions and quantity in each */
		int count = 0;
		int position = 0;
		int [] result = new int [results.length];
		
		/** Created a main for loop in order to check all the positions */
		for(int a = 0; a < machine.length; a++) {
			
			/** Created a nested for loop in order to verify all positions of the array */
			for(int b = 0; b < machine.length; b++) {
				
				//created an if statement in order to verify all the positions and the quantify the positions 
				if(machine[a][b] == 'R') {
					count++;
				}//closing the if statement
			}//closing the nested for loop 
			//inserting in which position each ball felt into
			results[a] = count;
			count = 0;
		}//closing the main for loop 
		
		//created a second main for loop in order to verify all the positions for the second array, the result array
		for(int a = 0; a < result.length; a++) {
			/** Created a nested for loop in order to verify all positions of the array result */
			for(int b = 0; b < result.length; b++) {
				
				//absorb the position of this ball felt
				position = results[a];
				
				//if the position is the same, quantify how many balls felt in this position
				if(results[b] == position ) {
					count++;
				}//closing if statement
			}//closing nested for loop
			
			//in the new array, quantify how many ball in each position
			result[position] = count;
			count = 0;
		}//closing main for loop
		return result;
	}
	/** Created a method in order to print the funnily/pyramid in order 
	 * to check results and create an interaction to show off skills */
	public static void printBeanMachine(char [][] machine, int [] result) {

		//created the necessary variables in order to print all the balls path and results
		int count = 0;
		int [] results = result;
		int moreTimes = 0; //created in order to verify from where start to print in order 
						   //to have all the balls settled on the bottom
		
		//print the visual space
		System.out.print("\n\n\t");
		//created a main for loop in order to print each ball
		for(int a = 0; a < machine.length; a++) {
			//print the visual space
			System.out.print("\n\t");
			//created a nested for loop in order to print every slot of each ball 
			for(int b = 0; b < machine.length; b++) {
				System.out.print(machine[a][b]);
			}//closing nested for loop
		}//closing main for loop 

		/** Created a for loop in order to verify each position has more balls*/
		for(int d = 0; d < result.length; d++) {
			if (moreTimes < result[d]) {
				moreTimes = result[d];
			}
		}//closing for loop 
		
		//created a main for loop in order to print each ball position
		for(int a = 0; a < result.length; a++) {
			//print the visual space
			System.out.print("\n\t");
			//created a nested for loop in order to print each ball position
			for(int b = 0; b < result.length; b++) {
				/** Absorbing the value of the results, stipulating the position to be printed*/
				count = results[b];
				
				//created an if statement in order to print the ball in the positions
				if(count > 0 && count >= moreTimes) {
					System.out.print("o");
					count--;
					results[b] = count;
				}else {
					System.out.print(" ");
				}//closing if statement
				
			}//closing nested for loop
			moreTimes--;//subtracting the numbers of balls minus one, in order to put all balls settled on the bottom
			count = 0;//restarting the count variable
			
		}//closing the main for loop

	}//closing print bean machine
	
	

}//closing the class_7_21
