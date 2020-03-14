package code.Array.chap51;

import java.util.ArrayList;

//蛮力法，遍历两边，时间复杂度为O(n^2)

public class solution {
    public ArrayList<ArrayList<Integer>> reversePairs(int []num){
		if(num==null||num.length==0){
			return null;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					result.add(num[i]);
					result.add(num[j]);
					System.out.println(result);
					result.clear();
				}
			}
			
		}
    	return null;
    	
    }
}