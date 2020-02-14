package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
 * 		to replace an array to store students. Draw the new UML diagram for the class.
 * 
 * 		You should not change the original contract of the Course class (i.e., the definition
 * 		of the constructors and methods should not be changed, but the private
 * 		members may be changed.)
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.ArrayList;

/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_05 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Testing all variables and methods */
		Course dataAnalytics = new Course("Data Analystics");
		
		/** Print out the name of the course */
		System.out.print("\n\n\tCourse Name - " + dataAnalytics.getCourseName() );

		/** Include dataAnalystics student */
		dataAnalytics.addStudent("Lucas Maximo");
		dataAnalytics.addStudent("Vanessa Maximo");
		dataAnalytics.addStudent("Jorge Maximo");
		dataAnalytics.addStudent("Pricila Maximo");
		
		dataAnalytics.dropStudent("Jorge Maximo");
		/** Print out dataAnalystics student */
		String [] studentArray = dataAnalytics.getStudents();
		
		System.out.print("\n\n\tThe student list of the course " + dataAnalytics.getCourseName() + " is ");
		/** Print out students from the course created */
		for(int c = 0; c < dataAnalytics.getNumberOfStudents() ; c++) {
			System.out.print("\n\t\t\t\t\t\t\t - " + studentArray[c]);
		}
		
		
		
		
	}//closing the mains method

	
}//closing class exercise_11_01

class Course{

	private String courseName;
	private ArrayList<String> student;

	Course(String courseName) {
		this.courseName = courseName;
		this.student = new ArrayList<String>();
	}

	public void addStudent(String student) {
		this.student.add(student);
	}

	public String [] getStudents() {
		
		String [] studentArray = new String [this.student.size()];
		return this.student.toArray(studentArray);
	}

	public int getNumberOfStudents() {
		return student.size();
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
		this.student.remove(student);
	}

}