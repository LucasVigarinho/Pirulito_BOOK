package chapter_03;


/** 
 * 
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month name January, February, …, December for
 * the number 1, 2, …, 12, accordingly.
 * 				
 * 
 * 
 * */
public class Exercise_3_04{

	/** Constructor not utilized */
	public Exercise_3_04() {
		
	}//close constructor

	/** Automatic generated main method */
	public static void main(String[] args) {

	
		int random = (int) (Math.random()*12) + 1;
		
		//Creating the necessary variables 
		System.out.println("\n\n\tThe random number is --> " + random);
		
		
		switch (random) {
			
		case 1:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("JANUARY");
			break;
		case 2:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("FEBRUARY");
			break;
		case 3:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("MARCH");
			break;
		case 4:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("APRIL");
			break;
		case 5:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("MAY");
			break;
		case 6:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("JUNE");
			break;
		case 7:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("JULY");
			break;
		case 8:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("AUGUST");
			break;
		case 9:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("SEPTEMBER");
			break;
		case 10:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("OCTOBER");
			break;
		case 11:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("NOVEMBER");
			break;
		case 12:
			System.out.print("\n\n\tThe correspondent month is --> ");
			System.out.println("DECEMBER");
			break;
			default:
				System.out.println("WRONG NUMBER!!!");
		}
		
		

	}//close main method

}//close class Exercise_3_4
