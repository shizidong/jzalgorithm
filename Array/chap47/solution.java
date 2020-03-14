package code.Array.chap47;

public class solution {
	public int getMaxValus(int []arr[]){
		if(arr.length==0||arr==null){
			return -1;
		}
		int rows = arr.length;
		int cols = arr[0].length;
		//用来存储走过路径的最大价值
		int [][]maxValue = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				int left = 0;
				int up = 0;
				if(i>0){
					//到达当前格子的上一格为i-1
					up = maxValue[i-1][j];
				}
				if(j>0){
					//到达当前格子的上一格为j-1
					left = maxValue[i][j-1];
				}
				//最大礼物的价值是之前礼物价值的和加当前礼物的价值
				maxValue[i][j] = Math.max(up, left) + arr[i][j]; 
			}
		}
		return maxValue[rows-1][cols-1];
		
	}
}
