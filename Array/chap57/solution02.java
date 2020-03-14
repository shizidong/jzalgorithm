package code.Array.chap57;

import java.util.ArrayList;

//和为s的正数序列（且最少有两个数）
//

public class solution02 {
	public ArrayList<ArrayList<Integer>> fidContinueSequence(int sum){
		if(sum<3){
			//若和小于三，不成立，因为至少两个数字，1+2等于3不小于3
			return null;
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int small = 1;
		int big = 2;
		int curSum = big+small;
		while(small<big&&small<(1+sum)/2){
			//若最小的数等于或大于和的一半，则后面的数不可能成立，因为是递增序列
			if(curSum==sum){
				ArrayList<Integer> list = new ArrayList<Integer>();
				//将序列中的所有数加入到数组中
				for(int i=small;i<=big;i++){
					list.add(i);
				}
				//保存一次结果
				result.add(list);
				//和减去最小数，先后移动，窗口先后移动
				curSum -= small;
				small++;
				big++;
				curSum += big;
			}else if(curSum<sum){
				//再加入新的大数
				big++;
				curSum += big;
			}else{
				//移除小的数
				curSum -= small;
				small++;
			}
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		solution02 s =  new solution02();
		System.out.println(s.fidContinueSequence(9));
	}
}
