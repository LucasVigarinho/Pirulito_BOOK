package chapter_10;

/** 
 * 			
 * 		(Financial: the Tax class) Programming Exercise 8.12 writes a program for
 * 		computing taxes using arrays. Design a class named Tax to contain the following
 * 		instance data fields:
 * 
 * 		■ int filingStatus:
 * 		 One of the four tax-filing statuses: 	0—single filer, 
 * 												1—married filing jointly or qualifying widow(er), 
 * 												2—married filing separately,
 * 											and 3—head of household. 
 * 
 * 		Use the public static constants 		SINGLE_FILER (0), 
 * 												MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), 
 * 												MARRIED_SEPARATELY (2), 
 * 												HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 * 
 * 		■ int[][] brackets: Stores the tax brackets for each filing status.
 * 		■ double[] rates: Stores the tax rates for each bracket.
 * 		■ double taxableIncome: Stores the taxable income.
 * 	
 * 		Provide the getter and setter methods for each data field and the getTax()
 * 		method that returns the tax. Also provide a no-arg constructor and the constructor
 * 		Tax(filingStatus, brackets, rates, taxableIncome).
 * 
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
 * 		income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
 * 		The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
 * 		are shown in Table 10.1.
 * 		
 * 		
 * 		TABLE 10.1	2001 United States Federal Personal Tax Rates
 * 		--------------------------------------------------------------------------------------------------
 * 										Married filing jointly 		Married filing  
 * 		Tax rate	Single filers		or qualifying widow(er)		separately 			Head of household
 * 		--------------------------------------------------------------------------------------------------
 * 		15% 		Up to $27,050 		Up to $45,200 				Up to $22,600 		Up to $36,250
 * 		27.5% 		$27,051–$65,550 	$45,201–$109,250 			$22,601–$54,625 	$36,251–$93,650
 * 		30.5% 		$65,551–$136,750 	$109,251–$166,500 			$54,626–$83,250 	$93,651–$151,650
 * 		35.5% 		$136,751–$297,350 	$166,501–$297,350 			$83,251–$148,675 	$151,651–$297,350
 * 		39.1% 		$297,351 or more 	$297,351 or more 			$148,676 or more 	$297,351 or more
 * 
 * 		Table 3.2	2009 U.S. Federal Personal Tax Rates
 * 		--------------------------------------------------------------------------------------------------
 * 											Married filing jointly 		Married filing  
 * 		Tax rate	Single filers			or qualifying widow(er)		separately 			Head of household
 * 		--------------------------------------------------------------------------------------------------
 *		10%			$0 – $8,350 			$0 – $16,700 				$0 – $8,350 		$0 – $11,950
 *		15% 		$8,351 – $33,950 		$16,701 – $67,900 			$8,351 – $33,950	$11,951 – $45,500
 *		25% 		$33,951 – $82,250 		$67,901 – $137,050 			$33,951 – $68,525 	$45,501 – $117,450
 *		28% 		$82,251 – $171,550 		$137,051 – $208,850 		$68,526 – $104,425 	$117,451 – $190,200
 *		33% 		$171,551 – $372,950 	$208,851 – $372,950 		$104,426 – $186,475 $190,201 – $372,950
 *		35% 		$372,951+ $372,951+ 	$186,476+ $372,951+
 *
 * @author lucasmaximo
 *
 */
/** 
 * 		Draw the UML diagram for the class and then implement the class.
 * 
 * 
 * 			|                       Exercise_10_08							|
 * 			|---------------------------------------------------------------|
 * 			|							Tax		     						|
 * 			|---------------------------------------------------------------|	
 * 			| + static final int SINGLE_FILER(0)							|
 * 			| + static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1)|
 * 			| + static final int MARRIED_SEPARATELY (2)     				|
 * 			| + static final intHEAD_OF_HOUSEHOLD (3)     					|
 * 			| - filingStatus: int		  									|
 * 			| + brackets: int[][] 											|
 * 			| + rates: double[] 											|
 * 			| + taxableIncome: double 										|
 * 			|---------------------------------------------------------------|
 * 			| + Tax ()	             								    	|
 * 			| + Tax(filingStatus, brackets, rates, taxableIncome)	  		|
 * 			| + getFilingStatus(): int 						       			|
 * 			| + getBrackets(): int [][]						       			|
 * 			| + getRates(): int  							       			|
 * 			| + getTaxableIncome(): double					       			|
 * 			|_______________________________________________________________| 	 
 * 
 */
/** Necessary imports */


/** Creating the class named Exercise_10_01 */
public class Exercise_10_08{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write a test program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
		 * 	income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
		 * 	The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
		 * 	are shown in Table 10.1.*/
		 int[][] tax2009 = {{8350 , 33950, 82250 , 171550, 372950},
				 			{16700, 67900, 137050, 208850, 372950},
				 			{8350 , 33950, 68525 , 104425, 186475},
				 			{11950, 45500, 117450, 190200, 372950}};

		 int[][] tax2001 = {{27050, 65550 , 136750, 297350},
				 			{45200, 109250, 166500, 297350},
				 			{22600, 54625 , 83250 , 148675},
				 			{36250, 93650 , 151650, 297350}};

		 double[] rate2009 = {0.10, 0.15 , 0.25 , 0.28 , 0.33 , 0.35};
		 double[] rate2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
		
		 Tax test1 = new Tax(0, tax2009, rate2009, 5000);
		 Tax test2 = new Tax(0, tax2001, rate2001, 5000);
		 
		/** print the 2001 and 2009 tax tables */
		printTable(test1, 2009);
		printTable(test2, 2001);

}//closing the main method

	public static void printTable(Tax data, int year) {
		
		System.out.print(
			"\n\n\tTABLE "+ year + " -  United States Federal Personal Tax Rates														\n" +
			 "\t----------------------------------------------------------------------------------------------------------------\n" +
			 "\t					Married filing jointly 		Married filing     												\n" +
			 "\n\tIncome		Single filers		or qualifying widow(er)		separately 		Head of household					\n" +
			 "\t----------------------------------------------------------------------------------------------------------------\n" 
//			 "\n\t15%\t\tUp to $27,050\t\tUp to $45,200\t\t\tUp to $22,600\t\tUp to $36,250       				\n" +
//			 "\n\t27.5% 		$27,051–$65,550 	$45,201–$109,250 		$22,601–$54,625 	$36,251–$93,650 				\n" +
//			 "\n\t30.5% 		$65,551–$136,750 	$109,251–$166,500 		$54,626–$83,250 	$93,651–$151,650				\n" +
//			 "\n\t35.5% 		$136,751–$297,350 	$166,501–$297,350 		$83,251–$148,675 	$151,651–$297,350				\n" +
//			 "\n\t39.1% 		$297,351 or more 	$297,351 or more 		$148,676 or more 	$297,351 or more				\n" 
				);
		System.out.printf("\n");
		for (int i = 50000; i <= 60000; i += 1000) {
			System.out.printf("\t"+ "%-10d\t", i);
			for (int j = 0; j <= 3; j++) {
				data.setFilingStatus(j);
				data.setTaxableIncome(i);
				if(j == 1) {
				System.out.printf("%-8.2f\t\t\t", data.getTax());
				}else {
					System.out.printf("%-8.2f\t\t", data.getTax());
				}
			}
			System.out.println();
		}
	}
	
}//closing the Exercise_10_01 method (used as driver method)

/** 	
 * 		 One of the four tax-filing statuses: 	0—single filer, 
 * 												1—married filing jointly or qualifying widow(er), 
 * 												2—married filing separately,
 * 											and 3—head of household. 
 * 
 * 		Use the public static constants 		SINGLE_FILER (0), 
 * 												MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), 
 * 												MARRIED_SEPARATELY (2), 
 * 												HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 * 
 * 		■ int[][] brackets: Stores the tax brackets for each filing status.
 * 		■ double[] rates: Stores the tax rates for each bracket.
 * 		■ double taxableIncome: Stores the taxable income.
 * 	
 * 		Provide the getter and setter methods for each data field and the getTax()
 * 		method that returns the tax. Also provide a no-arg constructor and the constructor
 * 		Tax(filingStatus, brackets, rates, taxableIncome).
 * 
 * */
/** Design a class named Tax to contain the following instance data fields:*/
class Tax{
	/** ■ int filingStatus: */
	private int filingStatus;
	/** One of the four tax-filing statuses: 	
	 * 										0—single filer, 
	 *										1—married filing jointly or qualifying widow(er), 
	 * 										2—married filing separately,
	 * 									and 3—head of household. 
	 */
	public static final int SINGLE_FILER 						= 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY					= 2;
	public static final int HEAD_OF_HOUSEHOLD 					= 3;

	/** ■ int[][] brackets: Stores the tax brackets for each filing status. */
	private int [][] brackets;

	/** ■ double[] rates: Stores the tax rates for each bracket. */
	private double [] rates;

	/** ■ double taxableIncome: Stores the taxable income. */
	private double taxableIncome;

	/** method that returns the tax. Also provide a no-arg constructor and the constructor */
	Tax(){
		filingStatus = SINGLE_FILER;

		int [][] lastMaxLimits = {{27050, 65550 , 136750, 297350},  // Single filer
								  {45200, 109250, 166500, 297350},	// Married jointly
								  {22600, 54625 , 83250 , 148675},  // Married separately
								  {36250, 93650 , 151650, 297350}};	// Head of household
		this.brackets = lastMaxLimits;

		double [] lastTaxRates = {15, 27.5, 30.5, 35.5, 39.1};		
		this.rates = lastTaxRates;
		
		taxableIncome = 0;
	}

	/** Tax(filingStatus, brackets, rates, taxableIncome). */
	Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;		
	}

	/** Provide the getter and setter methods for each data field and the getTax() */
	public int getFilingStatus() {return filingStatus;}
	public void setFilingStatus(int filingStatus) {this.filingStatus = filingStatus;}
	public int[][] getBrackets() {return brackets;}
	public void setBrackets(int[][] brackets) {
		this.brackets = new int [brackets.length][brackets[0].length];
		for (int a = 0; a < brackets.length; a++) {
			for (int b = 0; b < brackets[0].length; b++) {
				this.brackets[a][b] = brackets[a][b];
			}
		}
	}
	public double[] getRates() {return rates;}
	public void setRates(double[] rates) {
		this.rates = new double [rates.length];

		for(int c = 0; c < rates.length; c++) {
			this.rates[c] = rates[c];
		}
	}
	public double getTaxableIncome() {
		/** Define the way to calculate tax*/	
		return taxableIncome;
	}
	public void setTaxableIncome(double taxableIncome) {this.taxableIncome = taxableIncome;}

	/** by: https://github.com/maxalthoff */
	public double getTax() {
		double tax = 0.0;
		int lastIndex = -1;

		// There are three basic parts to the tax calculation process.
		// 1. The first bracket.
		if (getTaxableIncome() <= getBrackets()[getFilingStatus()][0]) {
			return getTaxableIncome() * getRates()[0];
		} else {
			tax += getBrackets()[getFilingStatus()][0] * getRates()[0];
			// 2. Middle brackets. Iterate through the brackets, calculating tax
			//    until taxable incomes does not exceed the current bracket.
			for (int i = 1; i < getBrackets()[getFilingStatus()].length; i++) {
				if (getTaxableIncome() > getBrackets()[getFilingStatus()][i]) {
					tax += (getBrackets()[getFilingStatus()][i] - getBrackets()[getFilingStatus()][i - 1]) *
							getRates()[i];
				} else {
					// Set the last index to the previous bracket and break from the loop.
					lastIndex = i;
					break;
				}
			}
		}
		// 3. The last bracket
		// This handles the case of a taxable income that exceeds the low bound
		// of the last tax bracket. We use the last tax bracket and the last rate
		// to calculate the final portion of taxes.
		int lastBracket = getBrackets()[getFilingStatus()].length - 1;
		int lastRate = getRates().length - 1;
		if (getTaxableIncome() > getBrackets()[getFilingStatus()][lastBracket]) {
			tax += (getTaxableIncome() - getBrackets()[getFilingStatus()][lastBracket]) *
					getRates()[lastRate];
		} else {
			// And this handles all other cases. We use the last index of the loop
			// (minus 1, to get the bracket before that) along with the last index
			// of the rates (since we're calculating tax from the part that flows
			// into the next bracket) to calculate the final portion of taxes.
			tax += (getTaxableIncome() - getBrackets()[getFilingStatus()][lastIndex - 1]) *
					getRates()[lastIndex];
		}

		return tax;
	}

}
