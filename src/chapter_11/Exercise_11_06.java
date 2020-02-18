package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
 * 		object, a Date object, a string, and a Circle object to the list, and use a loop
 * 		to display all the elements in the list by invoking the object’s toString()
 * 		method.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES  */
import java.util.ArrayList;
import java.util.Date;


/**
|-------------------------------------|
|                Loan                 |
|-------------------------------------|
| - annualInterestRate: double        |
| - numberOfYears: int                |
| - loanAmount: double                |
| - loanDate: java.util.Date          |
|-------------------------------------|
| + Loan()                            |
| + Loan(annualInterestRate: double,  |
|   numberOfYears: int,loanAmount:    |
|   double)                           |
| + getAnnualInterestRate(): double   |
| + getNumberOfYears(): int           |
| + getLoanAmount(): double           |
| + getLoanDate(): java.util.Date     |
| + setAnnualInterestRate(            |
|   annualInterestRate: double): void |
| + setNumberOfYears(                 |
|   numberOfYears: int): void         |
| + setLoanAmount(                    |
|   loanAmount: double): void         |
| + getMonthlyPayment(): double       |
| + getTotalPayment(): double         |
| + toString (): String		          |
|_____________________________________|

*/
/** Created the main class, using the name of the package (11) and the exercise (01) in a compose name */
public class Exercise_11_06 {
	
	
	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {
		
		/** Testing all the methods created */
		ArrayList<Object> testing = new ArrayList<Object>();
		
		/** a Loan object, a Date object, a string, and a Circle object to the list,  */
		
		testing.add(new Loan());
		testing.add(new Date());
		testing.add(new String("Lucas"));
		testing.add(new Circle());
		
		
		/** and use a loop to display all the elements in the list by invoking the object’s toString() method.*/
		for(int a = 0 ; a < testing.size(); a++) {
			System.out.println("\n\t\t" + testing.get(a).toString());
		}
		
		
	}//closing the mains method

	
}//closing class exercise_11_01


class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Construct a loan with specified annual interest rate, 
	    number of years, and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set an new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}


	/** Created the to String method */
	@Override
	public String toString() {
		return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount="
				+ loanAmount + ", loanDate=" + loanDate + "]";
	}
	
}

class Circle {
	/** The radius of the circle */
	private double radius = 1;

	/** The number of objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	public Circle() {
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}


	/** Created toString override method */
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}