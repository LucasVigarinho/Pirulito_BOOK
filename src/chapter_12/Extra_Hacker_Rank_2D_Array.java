package chapter_12;
import java.util.Scanner;

public class Extra_Hacker_Rank_2D_Array {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr =  {{1, 1, 1, 0, 0, 0},
                 	    {0, 1, 0, 0, 0, 0},
                     	{1, 1, 1, 0, 0, 0},
        		        {0, 0, 2, 4, 4, 0},
        		        {0, 0, 0, 2, 0, 0},
        		        {0, 0, 1, 2, 4, 0}};
        int largestSum = 0;
        
        for (int i = 0; i <= 3; i++) {
//            String[] arrRowItems = {};
//            		scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j <= 3; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
                int sum = (arr[i][j])+(arr[i][j+1])+(arr[i][j+2])+(arr[i+1][j+1])+(arr[i+2][j])+(arr[i+2][j+1])+(arr[i+2][j+2]);
//                arr[i][j] = arrItem;
                if(i==0 && j==0){
                    largestSum=sum;
                }else{
                    if(sum>largestSum){
                        largestSum=sum;
                    }
                }
            }   

        }
        System.out.print(largestSum);
     scanner.close();
    }

}
