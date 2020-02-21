package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented
 * 		using composition. Define a new stack class that extends ArrayList.
 * 		
 * 		Draw the UML diagram for the classes and then implement MyStack. Write
 * 		a test program that prompts the user to enter five strings and displays them in
 * 		reverse order.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;
import java.util.Arrays;

/** Created the main class, using the name of the package (11) and the exercise (10) in a compose name */
public class Exercise_11_10 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		MyStack number = new MyStack();
		String objectT = new String("Lucas");
		number.push(objectT);
		number.push("Jonas");
		number.push("Jorge");
		number.push("Raimundo");
		
		System.out.print("\n\t\t" + number.toString());
		
		number.pop();
		number.pop();
		
		System.out.print("\n\t\t" + number.toString());

		System.out.print("\n\t\t" + number.peek());
		
		number.push("Victor");
		
		System.out.print("\n\t\t" + number.toString());

		
		
	}//closing the mains method

	
}//closing class exercise_11_10
/** CREATED THE UML DIAGRAM */
/**
|----------------------------|
|           MyStack          |
|----------------------------|
| - list: ArrayList<Object>  |
|----------------------------|
| + MyStack()                |
| + peek(): Object           |
| + pop(): Object            |
| + push(o: Object): void    |
|----------------------------|
*/
/** Created the MyStack class  */
class MyStack{
	
	private ArrayList<Object> list;
	
	MyStack(){
		list = new ArrayList<Object>();
	}
	
	public Object peek() {
		return list.get(0);
	}
	
	public Object pop() {
		Object x = list.get(0);
		list.remove(x);
		return x;
	}
	
	public void push(Object o) {
		list.add(0, o);
	}
	
	@Override
	public String toString() {
		
		return "stack" + Arrays.deepToString(list.toArray()); 
	}
}