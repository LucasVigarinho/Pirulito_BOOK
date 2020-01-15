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


/** Creating the class named Exercise_10_09 */
public class Exercise_10_09{

	/** Creating the main method */
	public static void main(String[] arg) {




	}//closing the main method



}//closing the Exercise_10_09 method (used as driver method)

class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
		for(int a = 0; a < getStudents().length; a++) {
			if(getStudents().[a] == )
		}

	}
	public void clear() {

	}
}


