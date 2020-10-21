package chapter_12;
import java.util.Scanner;

public class Extra_Hacker_Rank_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.print(S.substring(start, end));
        
	}

}
