package chapter_9;

/** 
 * 			
 * 		(The Fan class) Design a class named Fan to represent a fan. The class contains:
 * 		■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * 		denote the fan speed.
 * 		■ A private int data field named speed that specifies the speed of the fan (the
 * 		default is SLOW).
 * 		■ A private boolean data field named on that specifies whether the fan is on (the
 * 		default is false).
 * 		■ A private double data field named radius that specifies the radius of the fan
 * 		(the default is 5).
 * 		■ A string data field named color that specifies the color of the fan (the default
 * 		is blue).
 * 		■ The accessor and mutator methods for all four data fields.
 * 		■ A no-arg constructor that creates a default fan.
 * 		■ A method named toString() that returns a string description for the fan. If
 * 		the fan is on, the method returns the fan speed, color, and radius in one combined
 * 		string. If the fan is not on, the method returns the fan color and radius
 * 		along with the string “fan is off” in one combined string.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that creates two Fan objects. Assign maximum speed, radius 10, color
 * 		yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * 		blue, and turn it off to the second object. Display the objects by invoking their
 * 		toString method.
 * 		
 * @author lucasmaximo
 *
 */

/** Draw the UML diagram for the class and then implement the class.
 * 
 * 			|							  Fan     						|
 * 			|-----------------------------------------------------------|	
 * 			| - SLOW: INT - 1				  							|
 * 			| - MEDIUM: INT - 2        									|
 * 			| - FAST: INT - 3											|
 * 			| - speed: int (default: SLOW) 								|
 * 			| - on: boolean (default: false)							|
 * 			| - radius: double (default: 5) 							|
 * 			| - color: String (default: blue)							|
 * 			|-----------------------------------------------------------|
 * 			| + Fan ()             									    |
 * 			| + getSpeed (): int										|
 * 			| + setSpeed (speed: int ): void							|
 * 			| + getOn () : boolean										|
 * 			| + setOn (on: boolean) : void								|
 * 			| + getRadius (): int										|
 * 			| + setRadius (radius: int): void							|
 * 			| + getColor (): String										|
 * 			| + setColor(color: String): void 							|
 * 			| + toString(): String - on(sp, col, rad) - off(col, rad).	|
 * 			|___________________________________________________________| 
 * */
/** Necessary imports */


/** Creating the class named Exercise_9_08 */

/**		Write a test
 * 		program that creates two Fan objects. Assign maximum speed, radius 10, color
 * 		yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * 		blue, and turn it off to the second object. Display the objects by invoking their
 * 		toString method. */
public class Exercise_9_08{

	/** Creating the main method */
	public static void main(String[] arg) {

		//create the first fan object
		Fan fan1 = new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		//create the second fan object
		Fan fan2 = new Fan();
		fan2.setSpeed(2);

		System.out.print("\n\t"+ fan1.toString());
		System.out.print("\n\t"+ fan2.toString());
	}//closing the main method


}//closing the class_9_08

/** 
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * 		■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * 		denote the fan speed.
 * 		■ A private int data field named speed that specifies the speed of the fan (the
 * 		default is SLOW).
 * 		■ A private boolean data field named on that specifies whether the fan is on (the
 * 		default is false).
 * 		■ A private double data field named radius that specifies the radius of the fan
 * 		(the default is 5).
 * 		■ A string data field named color that specifies the color of the fan (the default
 * 		is blue).
 * 		■ The accessor and mutator methods for all four data fields.
 * 		■ A no-arg constructor that creates a default fan.
 * 		■ A method named toString() that returns a string description for the fan. If
 * 		the fan is on, the method returns the fan speed, color, and radius in one combined
 * 		string. If the fan is not on, the method returns the fan color and radius
 * 		along with the string “fan is off” in one combined string.		
 * */
class Fan{
	/** ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed. */
	private int SLOW = 1, MEDIUM = 2, FAST = 3;
	/** ■ A private int data field named speed that specifies the speed of the fan (the default is SLOW). */
	private int speed;
	/** ■ A private boolean data field named on that specifies whether the fan is on (the default is false). */
	private boolean on;
	/** ■ A private double data field named radius that specifies the radius of the fan (the default is 5). */
	private double radius;
	/** ■ A string data field named color that specifies the color of the fan (the default is blue). */
	private String color;

	/** Creating a constructor */
	Fan(){

		speed = SLOW; //speed of the fan (the default is SLOW).
		on = false; //on that specifies whether the fan is on (the default is false). 
		radius = 5; //radius that specifies the radius of the fan (the default is 5). 
		color = "blue"; // color of the fan (the default is blue). 

	}//closing constructor with defaults values

	/** ■ The accessor and mutator methods for all four data fields. */

	/** Created the accessor of speed */
	public int getSpeed() {
		return speed;
	}
	/** Created the mutator of speed */	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/** Created the accessor of on */
	public boolean getOn() {
		return on;
	}
	/** Created the mutator of on */
	public void setOn(boolean on) {
		this.on = on;
	}
	/** Created the accessor of radius */
	public double getRadius() {
		return radius;
	}
	/** Created the mutator of radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	/** Created the accessor of color */
	public String getColor() {
		return color;
	}
	/** Created the mutator of color */
	public void setColor(String color) {
		this.color = color;
	}

	/** ■ A method named toString() that returns a string description for the fan. If
	 *	the fan is on, the method returns the fan speed, color, and radius in one combined
	 *	string. If the fan is not on, the method returns the fan color and radius
	 *	along with the string “fan is off” in one combined string.		*/
	@Override
	public String toString() {
		/** Created an if statement in order to return the right situation, according to the instructions */
		if(getOn() ==  true) {
			return "Fun [speed = " + speed + ", radius = " + radius + ", color = " + color + "]";
		}else {
			return "Fun [radius = " + radius + ", color = " + color + "]"; 
		}//closing if statement 

	}//closing to string

}//closing fun class 