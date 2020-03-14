package code.Array.chap47;

public class major {

	public static void main(String[] args) {
		int[][] arr = { { 1, 10, 3, 8 }, 
		        	 	{ 12, 2, 9, 6 },
		        	 	{ 5, 7, 4, 11 },
		        	 	{ 3, 7, 16, 5 } };
		solution s = new solution();
		System.out.println(s.getMaxValus(arr));

	}

}
