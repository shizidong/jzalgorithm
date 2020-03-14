package code.Array.chap04;

public class solution {
	public boolean find(int arr[][],int key){
		int row = 0;
		int col = arr[0].length-1;
		while(row<arr.length&&col>=0){
			if(arr[row][col]==key){
				return true;
			}else if(arr[row][col]>key){
				col--;
			}else if(arr[row][col]<key){
				row++;
			}
		}
		return false;
	}
}
