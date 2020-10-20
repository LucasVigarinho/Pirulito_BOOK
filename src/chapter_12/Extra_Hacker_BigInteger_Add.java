package chapter_12;
import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Hacker_BigInteger_Add {
	
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);

    String a = input.nextLine();
    String b = input.nextLine();
    
    BigInteger resultA = new BigInteger(a).add(new BigInteger(b));
    BigInteger resultB = new BigInteger(a).multiply(new BigInteger(b));
    
    System.out.println(resultA);
    System.out.println(resultB);
    
    input.close();

	}
    
}
