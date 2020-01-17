package chapter_10;

/** 
 * 		(The Queue class) Section 10.6 gives a class for Stack. Design a class named
 * 		Queue for storing integers. Like a stack, a queue holds elements. In a stack, the
 * 		elements are retrieved in a last-in first-out fashion. In a queue, the elements are
 * 		retrieved in a first-in first-out fashion. The class contains:
 * 		■ An int[] data field named elements that stores the int values in the
 * 		queue.
 * 		■ A data field named size that stores the number of elements in the queue.
 * 		■ A constructor that creates a Queue object with default capacity 8.
 * 		■ The method enqueue(int v) that adds v into the queue.
 * 		■ The method dequeue() that removes and returns the element from the
 * 		queue.
 * 		■ The method empty() that returns true if the queue is empty.
 * 		■ The method getSize() that returns the size of the queue.
 * 		Draw an UML diagram for the class. Implement the class with the initial array
 * 		size set to 8. The array size will be doubled once the number of the elements
 * 		exceeds the size. After an element is removed from the beginning of the array,
 * 		you need to shift all elements in the array one position the left. Write a test
 * 		program that adds 20 numbers from 1 to 20 into the queue and removes these
 * 		numbers and displays them.
 * 		
 * 		
 * @author lucasmaximo
 *
 */
/** 
 * 
 * 			|                       Exercise_10_10						|
 * 			|-----------------------------------------------------------|
 * 			|							Queue	     					|
 * 			|-----------------------------------------------------------|	
 * 			| - size: int				  								|
 * 			| - elements: int[]	        								|
 * 			|-----------------------------------------------------------|
 * 			| + Queue ()             								    |
 * 			| + enqueue (v: int)									  	|
 * 			| + dequeue(): int  							       		|
 * 			| + empty(): boolean										|
 * 			| + getSize():int											|
 * 			|___________________________________________________________|  
 * 
 * 
 */

/** Necessary imports */


/** Creating the class named Exercise_10_10 */
public class Exercise_10_10{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Implement the class with the initial array
		 * 		size set to 8. The array size will be doubled once the number of the elements
		 * 		exceeds the size. After an element is removed from the beginning of the array,
		 * 		you need to shift all elements in the array one position the left. Write a test
		 * 		program that adds 20 numbers from 1 to 20 into the queue and removes these
		 * 		numbers and displays them.*/

		Queue myArray = new Queue();
		

		for(int b = 0; b < 20; b++ ) {
			myArray.enqueue(b+1);
		}
		/** Display the students in the course */
		for(int c = 0; c < myArray.elements.length; c++) {
			System.out.print("\n\t Student " + (c+1) + " \t-> " + myArray.elements[c]);
		}
		
		for(int b = 0; b < 20; b++ ) {
			myArray.dequeue();
		}
		
		/** Display the students in the course */
		for(int c = 0; c < myArray.elements.length; c++) {
			System.out.print("\n\t Student " + (c+1) + " \t-> " + myArray.elements[c]);
		}
	}//closing the main method



}//closing the Exercise_10_10 method (used as driver method)

/** (The Queue class) Section 10.6 gives a class for Stack. Design a class named
 * 		Queue for storing integers. 
 * 		In a stack, the elements are retrieved in a last-in first-out fashion. 
 * 		In a queue, the elements are retrieved in a first-in first-out fashion. The class contains:	
 */
class Queue{

	/** ■ An int[] data field named elements that stores the int values in the queue.*/
	int[] elements;

	/** ■ A data field named size that stores the number of elements in the queue. */
	int size = 0;

	/** ■ A constructor that creates a Queue object with default capacity 8. */
	Queue(){
		elements = new int [8];
	}

	/** ■ The method enqueue(int v) that adds v into the queue.
	 * 	The array size will be doubled once the number of the elements exceeds the size. */
	public void enqueue(int v) {
		if(size == elements.length-1) {
			int [] temp = new int [(elements.length - 3) * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
			elements[size++] = v;
		}else {
			elements[size++] = v;
		}
	}
	/** ■ The method dequeue() that removes and returns the element from the queue.*/
	public void dequeue() {
		if(!empty()) {
			for(int a = 0; a < elements.length-1;a++) {
				elements[a] = elements[a+1];
			}
			elements[elements.length-1] = 0;
			size--;
		}

	}
	/** ■ The method empty() that returns true if the queue is empty. */
	public boolean empty() {
		if(size < 0) {
			return true;
		}else {
			return false;
		}
	}

	/** ■ The method getSize() that returns the size of the queue. */
	public int getSize() {
		return size;
	}


}