package chapter_12;




/**			EXERCISE DESCRIPTION 
 * 
 * 		(IllegalArgumentException) Modify the Loan class in Listing 10.2 to
 * 		throw IllegalArgumentException if the loan amount, interest rate, or
 * 		number of years is less than or equal to zero.
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES */


/** Created the main class, using the name of the package (12) and the exercise (04) in a compose name */
public class Exercise_12_04 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		/** Testing all the methods created */
		/** If the loan amount, interest rate, or 
		 * number of years is less than or equal to zero.*/
		try {
            Loan testNewLoan = new Loan(2.0, 0, -10);
        } catch (IllegalArgumentException excep) {
            System.out.println("IllegalArgumentException: " + excep.getMessage());
        }
		
	}//closing the mains method


}//closing class exercise_12_04

/** testing all the classes and methods */
class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Construct a
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if(annualInterestRate <= 0) {
			 throw new IllegalArgumentException("Annual Interest Rate must be greater than 0");
		}else {
			this.annualInterestRate = annualInterestRate;
		}
		if(numberOfYears <= 0) {
			 throw new IllegalArgumentException("Number of the years must be greater than 0");
		}else {
		this.numberOfYears = numberOfYears;
		}
		if(loanAmount <= 0) {
			 throw new IllegalArgumentException("Loan Amount must be greater than 0");
		}else {
		this.loanAmount = loanAmount;
		}
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate <= 0) {
			 throw new IllegalArgumentException("Annual Interest Rate must be greater than 0");
		}
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		if(numberOfYears <= 0) {
			 throw new IllegalArgumentException("Number of the years must be greater than 0");
		}
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		if(loanAmount <= 0) {
			 throw new IllegalArgumentException("Loan Amount must be greater than 0");
		}
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
}