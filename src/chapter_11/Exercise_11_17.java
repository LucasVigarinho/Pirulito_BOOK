package chapter_11;

/**			EXERCISE DESCRIPTION 
 * 
 * 		(Algebra: perfect square) Write a program that prompts the user to enter an integer
 * 		m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * 		Store all smallest factors of m into an array list. n is the product of the factors that
 * 		appear an odd number of times in the array list. For example, consider m = 90,
 * 		store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 * 		in the array list. So, n is 10.) Here are sample runs:
 * 
 * 
 * 		Enter an integer m: 1500
 * 		The smallest number n for m * n to be a perfect square is 15
 * 		m * n is 22500
 * 
 * 
 * 		Enter an integer m: 63
 * 		The smalle
 * 		st number n for m * n to be a perfect square is 7
 * 		m * n is 441
 * 
 * */

/**			IMPORTED NECESSARY LIBRARIES 
 * */
import java.util.Scanner;
import java.util.ArrayList;

/** Created the main class, using the name of the package (11) and the exercise (17) in a compose name */
public class Exercise_11_17 {


	/** Created the main method, in order to test all the methods that eventually has to be created and 
	 * make possible the interaction with the user */
	public static void main(String[] args) {

		System.out.print("Enter an integer m: ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		ArrayList<Integer> factors = new ArrayList<>();

		getFactors(m, factors);

		int smallestSquare = smallestSquare(factors);
		System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
		System.out.println("m * n = " + (m * smallestSquare));

		input.close();
	}//closing the mains method

	private static int smallestSquare(ArrayList<Integer> factors) {

		int[][] occurrences = copy(factors);
		for (int i : factors) {
			search(occurrences, i);
		}

		// remove duplicates and get odd sequence factors
		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);

		// get smallest square by multiplying oddSequenceFactors
		int smallestSquare = 1;
		for (int i : oddSequenceFactors) {
			smallestSquare *= i;
		}
		return smallestSquare;
	}

	private static ArrayList<Integer> removeDuplicates(int[][] m) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < m.length; i++) {
			if (m[i][1] % 2 != 0) {
				temp.add(m[i][0]);
			}
		}

		// removing duplicates
		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {

			if (!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add(temp.get(i));
			}
		}

		return duplicateRemoved;
	}

	private static void search(int[][] m, int number) {
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] == number) {
				m[i][1]++;
			}
		}
	}

	private static int[][] copy(ArrayList<Integer> factors) {

		int[][] temp = new int[factors.size()][2];

		for (int i = 0; i < temp.length; i++) {
			temp[i][0] = factors.get(i);
		}
		return temp;
	}

	private static void getFactors(int m, ArrayList<Integer> factors) {

		int count = 2;
		while (count <= m) {
			if (m % count == 0) {
				factors.add(count);
				m /= count;
			} else {
				count++;
			}
		}
	}


}//closing class exercise_11_17

