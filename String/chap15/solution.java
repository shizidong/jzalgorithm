package code.String.chap15;

public class solution {
	public int numOf(int n){
		int count = 0;
		while(n!=0){
			count++;
			n = (n-1)&n;
		}
		return count;
	}
}
