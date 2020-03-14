package code.String.chap17;

public class solution {
	public void printToMax(int n) throws Exception{
		if(n<=0) {
			throw new Exception("输入错误");
		}
		char []number = new char[n];
		//将数组中的值都置为0
		for(int i=0;i<number.length;i++){
			number[i] = '0';
		}
		//全排列，将每个位置上的数从0-9打印一遍
		for(int j=0;j<10;++j){
			number[0] =(char) (j + '0');
			printDigits(number,n,0);
		}
	}

	private void printDigits(char[] number, int n, int index) {
		//当所有位置上的数都全排列一遍则跳出循环，索引指数组中的位置
		if(index==n-1){
			printNumber(number);
			return;
		}
		for(int i=0;i<10;++i){
			number[index+1] = (char) (i+'0');
			printDigits(number, n, index+1);
		}
		
	}

	private void printNumber(char[] number) {
		//初始所有位置均为0，为true
		boolean isBegin0 = true;
		int nLength = number.length;
		for(int i=0;i<nLength;++i){
			//如果不为零，则标志位置为false
			if(isBegin0&&number[i]!=0){
				isBegin0 = false;
			}
			//标志位不为零，打印输出
			if(!isBegin0){
				System.out.print(number[i]);
			}
		}
		System.out.println();
	}
}
