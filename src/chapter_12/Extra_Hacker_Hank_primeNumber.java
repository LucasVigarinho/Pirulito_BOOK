package chapter_12;
import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Hacker_Hank_primeNumber {



	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		String n = input.nextLine();
		BigInteger test = new  BigInteger(n);
		
		if(test.isProbablePrime(1)){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}

		input.close();
	}
}
