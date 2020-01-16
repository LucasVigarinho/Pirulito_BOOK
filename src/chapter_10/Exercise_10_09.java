package chapter_10;



/** 
 * 			
 * 		(The Course class) Revise the Course class as follows:
 * 		■ The array size is fixed in Listing 10.6. Improve it to automatically increase
 * 		the array size by creating a new larger array and copying the contents of the
 * 		current array to it.
 * 		■ Implement the dropStudent method.
 * 		■ Add a new method named clear() that removes all students from the
 * 		course.
 * 		Write a test program that creates a course, adds three students, removes one,
 * 		and displays the students in the course.
 * 		
 * 		
 * @author lucasmaximo
 *
 */

/** Necessary imports */
import java.util.Arrays;
import java.util.Scanner;

/** Creating the class named Exercise_10_09 */
public class Exercise_10_09{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** 
		 *	Write a test program that creates a course, adds three students, removes one,
		 *	and displays the students in the course.
		 * */
		Scanner input = new Scanner (System.in);
		
		/** Create a course */
		Course computing = new Course ("Computing Science");
		
		/** Add three students */
		computing.addStudent("Lucas Maximo");
		computing.addStudent("Jonas Maximo");
		computing.addStudent("Joana Maximo");

		/** Remove on student */
		computing.dropStudent("Jonas Maximo");

		
		/** Display the students in the course */
		for(int c = 0; c < computing.getStudents().length; c++) {
			System.out.print("\n\t Student " + (c+1) + " -> " + computing.getStudents()[c]);
		}
		/** The last test */
//		computing.clear();
		
		input.close();
	}//closing the main method



}//closing the Exercise_10_09 method (used as driver method)

/** 
 * 		■ The array size is fixed in Listing 10.6. Improve it to automatically increase
 * 		the array size by creating a new larger array and copying the contents of the
 * 		current array to it.
 * 		■ Implement the dropStudent method.
 * 		■ Add a new method named clear() that removes all students from the
 * 		course.
 * */
class Course {

	private String courseName;
	private String[] students;
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
		this.numberOfStudents = 0;
		this.students = new String [0];
	}

	public void addStudent(String student) {
		
			String[] temp = new String[students.length + 1];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
			students[numberOfStudents++] = student;
			
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents+1;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9

		int index = search(this.students, student);
		students[index] = "";

		for(int b = index; b < students.length-1; b++ ) {
			
			students[b] = students[b+1];
		
		}
		students[students.length-1] = "";
	

	}
	public void clear() {
		Arrays.fill(this.students, null);
	}
	public int search(String [] students, String student) {
		for(int a = 0; a < students.length; a++) {
			if((students[a]).equals(student)) {
				return a;
			}
		}
		return 0;
	}
	
}


