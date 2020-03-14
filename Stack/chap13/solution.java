package code.Stack.chap13;

public class solution {
	public int movingCount(int threshold,int rows,int cols) throws Exception{
		if(threshold<0||rows<=0||cols<=0){
			throw new Exception("行、列或者阈值小于等于0");
		}
		//标志集合，判断是否访问，全部遍历一遍，均未访问
		boolean visited[] = new boolean[rows * cols];
		for(int i=0;i<rows*cols;i++){
			visited[i] = false;
		}
		int count = movingCountCore(threshold,rows,cols,0,0,visited);
		
		return count;
		
	}

	private int movingCountCore(int threshold, int rows, int cols, int row, int col, 
			boolean[] visited) {
		int count = 0;
		//如果可以访问，标志位为true，计数从（0,0）位开始，1+（只要可以移动就加）
		if(check(threshold,rows,cols,row,col,visited)){
			visited[row * cols + col] = true;
			count = 1 + movingCountCore(threshold, rows, cols, row-1, col, visited)
					+ movingCountCore(threshold, rows, cols, row+1, col, visited)
					+ movingCountCore(threshold, rows, cols, row, col-1, visited)
					+ movingCountCore(threshold, rows, cols, row, col+1, visited);
		}
		return count;
	}

	//当所有条件满足时表示可以访问
	private boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		if(row>=0&&row<rows&&col>=0&&col<cols&&getDigitSum(row)+getDigitSum(col)<=threshold
				&&!visited[row*cols+col]){
			return true;
		}
		return false;
	}
	
	//将行列值转化为个位数
	private int getDigitSum(int num) {
		int sum = 0;
		while(num>0){
			sum += num %10;//取模，获取个位数
			num /=10;		//取商，获取十位数
		}
		return sum;
	}
}
