package code.Array.chap53.question02;

//判断0~n-1中缺失的数字，数组中只缺少一个数字，根据数组的递增特性，缺少数字的后一个是第一个值和下标不符的数

public class solution {
	public int getMissingNumber(int []data,int length){
		if(data==null|length==0){
			return -1;
		}
		int start = 0;
		int end = length-1;
		while(start<=end){
			int middle = (start+end)/2;
			if(middle != data[middle]){
				if(middle==0||data[middle-1]==middle-1){
					return middle;
				}
				end = middle - 1;
			}else{
				start = middle + 1;
			}
		}
		if(start==length){
			return length;
		}
		return -1;
		
	}
}
