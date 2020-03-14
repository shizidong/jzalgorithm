package code.Stack.chap12;

	/**
	 *1、根据给定数组，初始化一个标志位数组，初始化为false，表示未走过，true表示已经走过，不能走第二次
	 * 2、根据行数和列数，遍历数组，先找到一个与str字符串的第一个元素相匹配的矩阵元素，进入递归hasPath
	 * 3、根据i和j先确定一维数组的位置，因为给定的matrix是一个一维数组
	 * 4、确定递归终止条件：越界，当前找到的矩阵值不等于数组对应位置的值，已经走过的，这三类情况，都直接false，说明这条路不通
	 * 5、若k，就是待判定的字符串str的索引已经判断到了最后一位，此时说明是匹配成功的
	 * 6、下面就是本题的精髓，递归不断地寻找周围四个格子是否符合条件，只要有一个格子符合条件，就继续再找这个符合条件的格子的四周是否存在符合条件的格子，直到k到达末尾或者不满足递归条件就停止。
	 * 7、走到这一步，说明本次是不成功的，我们要还原一下标志位数组index处的标志位，进入下一轮的判断。
	 */

public class solution {
	public boolean hasPath(char []matrix,int rows,int cols,char []str){
		if(matrix==null||matrix.length==0||str==null||str.length==0||matrix.length!=rows*cols
				||rows<=0||cols<=0||rows*cols<str.length){
			return false;
		}
		// 标志位，初始化为false
		boolean []isVisited = new boolean[matrix.length];
		for(int row=0;row<rows;row++){
			// 循环遍历二维数组，找到起点等于str第一个元素的值，再递归判断四周是否有符合条件的----回溯法
			for(int col=0;col<cols;col++){
				if(hasPathCore(matrix,rows,cols,row,col,str,isVisited,0))
					{
						return true;
					}
			}
		}
		return false;
		
	}
	// judge(初始矩阵，索引行坐标i，索引纵坐标j，矩阵行数，矩阵列数，待判断的字符串，字符串索引初始为0即先判断字符串的第一位)
	private boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str,
			boolean[] flag,int k) {
		// 先根据i和j计算匹配的第一个元素转为一维数组的位置
		int index = row * cols + col;
		// 递归终止条件
		if(row<0||col<0||row>=rows||col>=cols||matrix[index]!=str[k]||flag[index]==true){
			return false;
		}
		// 若k已经到达str末尾了，说明之前的都已经匹配成功了，直接返回true即可
		if(k==str.length-1){
			return true;
		}
		// 要走的第一个位置置为true，表示已经走过了
		flag[index] = true;
		// 回溯，递归寻找，每次找到了就给k加一，找不到，还原
		if(hasPathCore(matrix, rows, cols, row+1, col, str, flag, k+1)||
				hasPathCore(matrix, rows, cols, row-1, col, str, flag, k+1)||
				hasPathCore(matrix, rows, cols, row, col+1, str, flag, k+1)||
				hasPathCore(matrix, rows, cols, row, col-1, str, flag, k+1)){
			return true;
		}
		// 走到这，说明这一条路不通，还原，再试其他的路径
		flag[index] = false;
		return false;
	}

}	