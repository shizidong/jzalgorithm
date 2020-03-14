package code.Stack.chap14;

public class solution {
	public int maxProduct(int length){
		if(length < 2) return 0;
		if(length == 2) return 1;
		if(length == 3) return 2;
		int timeOf3 = length / 3;
		if(length - timeOf3 * 3 == 1){
			timeOf3 -= 1;
		}
		int timeOf2 = (length-timeOf3 * 3)/2;
		//math中pow方法为a的几次方
		return (int) ((Math.pow(3, timeOf3))*(Math.pow(2, timeOf2)));
	}
}
