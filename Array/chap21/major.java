package code.Array.chap21;

public class major {

	public static void main(String[] args) {
		solution s = new solution();
		int []str = {1,2,3,4,5};
		s.recordOddEvent(str);
		printArray(str);

	}

	private static void printArray(int[] str) {
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]+"");
		}
		
	}

}
