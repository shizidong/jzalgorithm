package code.Array.chap29;

public class solution {
	public void printClock(int num[][],int cols,int rows){
		if(num==null||cols<=0||rows<=0){
			return;
		}
		int start = 0;
		while(cols>start*2&&rows>start*2){
			printCricle(num,cols,rows,start);
			start++;
		}
	}
	
	private void printCricle(int[][] num, int cols, int rows, int start) {
		int endX = cols - 1 - start;
		int endY = rows - 1 - start;
		//从左到右打印一行
		for(int i=start;i<=endX;i++){
			int number = num[start][i];
			System.out.println(number);
		}
		//从上到下打印一列
		if(start<endY){
			for(int i=start+1;i<=endY;i++){
				int number = num[i][endX];
				System.out.println(number);
			}
		}
		//从右到左打印一行
		if(start<endX&&start<endY){
			for(int i=endX-1;i>=start;i--){
				int number = num[endY][i];
				System.out.println(number);
			}
		}
		//从下到上打印一列
		if(start<endX&&start<endY-1){
			for(int i=endY-1;i>=start+1;i--){
				int number = num[i][start];
				System.out.println(number);
			}
		}
		
	}
}
