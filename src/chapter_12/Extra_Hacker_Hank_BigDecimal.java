package chapter_12;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Extra_Hacker_Hank_BigDecimal {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
//		int n = input.nextInt();
		
		String [] myArray = {"9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
		
//		String [] myArray = new String [n];
		
//		for(int i = 0; i < myArray.length; i++) {
//			myArray [i] = input.next();
//		}
		
//		System.out.print(myArray.toString());

		Arrays.sort(myArray, new Comparator<Object>(){
		public int compare(Object a1, Object a2) {
			if (a1 == null || a2 == null) {
			    return 0;
			}

			BigDecimal bigA = new BigDecimal((String)a1);
			BigDecimal bigB = new BigDecimal((String)a2);
			return bigB.compareTo(bigA);
		}
			
		});
		
//		System.out.print(myArray.toString());

		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		
		input.close();
	}
	
}

