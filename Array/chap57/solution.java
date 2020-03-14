package code.Array.chap57;

import java.util.ArrayList;

//和为s的两个数字
//思路：定义两个指针，一个从前往后指，一个从后往前指，比较前后两个值的和与目标数的大小，移动指针

public class solution {
	public ArrayList<Integer> findNumberWithSum(int []data,int target){
		if(data==null||data.length==0){
			return null;
		}
		ArrayList<Integer> array = new ArrayList<Integer>();
		int left = 0;
		int right = data.length-1;
		while(left<=right){
			if((data[left]+data[right])==target){
				array.add(data[left]);
				array.add(data[right]);
				break;
			}else if((data[left]+data[right])>target){
				right--;
			}else{
				left++;
			}
		}
		return array;
		
	}
}
