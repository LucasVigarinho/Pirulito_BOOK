package chapter_9;

/** 
 * 				
 * 		(The Stock class) Following the example of the Circle class in Section 9.2,
 * 		design a class named Stock that contains:
 * 		■ A string data field named symbol for the stock’s symbol.
 * 		■ A string data field named name for the stock’s name.
 * 		■ A double data field named previousClosingPrice that stores the stock
 * 		price for the previous day.
 * 		■ A double data field named currentPrice that stores the stock price for the
 * 		current time.
 * 		■ A constructor that creates a stock with the specified symbol and name.
 * 		■ A method named getChangePercent() that returns the percentage changed
 * 		from previousClosingPrice to currentPrice.
 * 		Draw the UML diagram for the class and then implement the class. Write a test
 * 		program that creates a Stock object with the stock symbol ORCL, the name
 * 		Oracle Corporation, and the previous closing price of 34.5. Set a new current
 * 		price to 34.35 and display the price-change percentage.
 * 
 * 		
 * @author lucasmaximo
 *
 */

/** Draw the UML diagram for the class and then implement the class.  
 * 
 * 			|--------------|
 * 			|Exercise_9_02 |
 * 			|--------------|	
 * 			
 * 
 * */
/**import the necessary libraries */
import java.text.DecimalFormat;

/** Creating the class named Exercise_9_02 */
public class Exercise_9_02{

	/** Creating the main method */
	public static void main(String[] arg) {

		/** Write a test program that creates a Stock object with the stock symbol ORCL, the name
		 * 		Oracle Corporation, and the previous closing price of 34.5. Set a new current
		 * 		price to 34.35 and display the price-change percentage. */
		
		//create the necessary objects in order to test
		DecimalFormat df = new DecimalFormat("###0.00");
		Stock product1 = new Stock ("ORCL","Oracle Corporation" );
		product1.setCurrentPrice(34.5);
		product1.setCurrentPrice(34.35);
		
		System.out.print("\n\n\tPrice-change percentage" + product1.getSymbol() + "  " + product1.getStockName() + " is -> " + df.format(product1.getChangePercent()) + "%");
		System.out.print("\n\n\tCurrent price " + product1.getSymbol() + "  " + product1.getStockName() + " is -> " + product1.getCurrentPrice());
		System.out.print("\n\n\tPrevious price " + product1.getSymbol() + "  " + product1.getStockName() + " is -> " + product1.getPreviousClosingPrice());

		
	}//closing the main method

	
}//closing the class_9_02

/** Created the class named Stock following the initial instructions 

		■ A string data field named symbol for the stock’s symbol.
* 		■ A string data field named name for the stock’s name.
* 		■ A double data field named previousClosingPrice that stores the stock
* 		price for the previous day.
* 		■ A double data field named currentPrice that stores the stock price for the
* 		current time.
* 		■ A constructor that creates a stock with the specified symbol and name.
* 		■ A method named getChangePercent() that returns the percentage changed
* 		from previousClosingPrice to currentPrice. */
class Stock{
	
	String symbol;
	String stockName;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String simbol, String stockName){
		
		this.symbol = simbol;
		this.stockName = stockName;
	}
	/** Created the method following the initial instructions to inform the percentage*/
	public double getChangePercent() {
		double percentage =  ( ( currentPrice/ previousClosingPrice )) * 100;
		
		return percentage;	
	}
	/** Created a method getSimbol, in order to be able to inform the symbol of each stock product */
	public String getSymbol() {
		return symbol;
	}
	/** Created a method setSimbol, in order to be able to change the symbol of each product */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/** Created a method get Stock Name, in order to be able to get the stock name from each product in stock created*/
	public String getStockName() {
		return stockName;
	}
	/** Created a method set stock name in order to be able to change the name of each product from stock */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	/** Created a method get previous closing price in order to get the price from the day before settled by the set previous closing price method */
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	/** Created a method to get the current price  */
	public double getCurrentPrice() {
		return currentPrice;
	}
	/** Setting the current price and also the previou closing price */
	public void setCurrentPrice(double currentPrice) {
		this.previousClosingPrice = this.currentPrice;
		this.currentPrice = currentPrice;
	}
	
	
	
	
	 
}
