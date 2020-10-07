package chapter_12;

public class Extra_Racker_Hank_Anagram {

	public Extra_Racker_Hank_Anagram() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\t" + isAnagram("anagram", "margana"));
		System.out.println("\n\t" + isAnagram("Hello", "hello"));
		System.out.println("\n\t" + isAnagram("anagramm", "marganaa"));
		System.out.println("\n\t" + isAnagram("abcde", "xyzwf"));
		System.out.println("\n\t" + isAnagram("adxy", "bcgz"));
	}

	static boolean isAnagram(String a, String b) {

		if(a.length() != b.length()) {
			return false;
		}else {
			String aa = a.toUpperCase();
			String bb = b.toUpperCase();
			char [] arrayA = organize(aa);
			char [] arrayB = organize(bb);

			
			int [] numbersA = numbers(arrayA);
			int [] numbersB = numbers(arrayB);

			boolean result = false;

			for(int i = 0; i < numbersA.length; i++) {
				if(numbersA[i] == numbersB[i] && arrayA[i] == arrayB [i]) {
					result = true;
				}else {
					result = false;
					break;
				}
			}
			return result;
		}

	}//close for

	static int [] numbers ( char [] myArray) {

		int [] counting = new int [myArray.length];

		for (int i = 0; i < counting.length; i++) {
			for(int x = 0; x < counting.length; x++) {
				if(x == i) {

				}else {
					if(myArray[i] == myArray[x]){
						counting[i] += 1;
//											myArray[x] = '-';
					}
				}
			}

		}
		printOut(counting);

		return counting;
	}

	static char [] organize (String myArray) {

		char [] arrayX = myArray.toCharArray();

		//Create the algorithm 
		for (int j = 0; j < arrayX.length; j++) {

			for (int i = 0; i <= arrayX.length-j-2; i++) {

				if(arrayX[i] > arrayX[i+1]) {
					char temp = arrayX[i];
					arrayX[i] = arrayX[i+1];
					arrayX[i+1] = temp;
				}//close if
			}//close for 	
		}

		return arrayX;
	}

	static void printOut(int [] arrayChar) {
		for(int i = 0; i < arrayChar.length; i++) {
			System.out.print(arrayChar[i]);
		}
		System.out.print("\n");
	}
}
