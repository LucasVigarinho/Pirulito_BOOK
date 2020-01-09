package codility;

public class Codility5 {
	public static void main(String[] args){
		System.out.println(solution(268));
		System.out.println(solution(670));
		System.out.println(solution(0));
		System.out.println(solution(-999));

	}

	public static int solution(int N){
		
		boolean isNegative = false;

		if (N < 0){
			
			isNegative = true;
			
			N = N * (-1);
		}

		String transform = String.valueOf(N);
	
		int[]intTab = new int[transform.length()];
		
		for (int i = 0; i < intTab.length; i++){
			String temp1 = Character.toString(transform.charAt(i));
			int temp2 = Integer.parseInt(temp1);
			intTab[i] = temp2;
		}
		
		int[] newNumber = new int[intTab.length + 1];

		if (isNegative){
			newNumber[0] = 5;
			for (int i = 0; i < intTab.length; i++){
				newNumber[i + 1] = intTab[i];
			}
		}else{
			for (int i = 0; i < intTab.length; i++){
				if (5 > intTab[i]){
					newNumber[i] = 5;
					for (int j = i; j < intTab.length; j++){
						newNumber[j + 1] = intTab[j];
					}
					break;
				}
				else{
					newNumber[i] = intTab[i];
				}
			}
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < newNumber.length; i++){
			sb.append(newNumber[i]);
		}

		int retorno = Integer.parseInt(sb.toString());
		return isNegative ? (retorno * (-1)) : retorno;
	}

}
