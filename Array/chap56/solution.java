package code.Array.chap56;

import java.util.ArrayList;

public class solution {
	public ArrayList<Integer> findNumApperanceOnce(int []data){
		if(data==null||data.length==0){
			return null;
		}
		ArrayList<Integer> array = new ArrayList<Integer>();
		int []tmp = new int[data.length];
		for(int i=0;i<data.length;i++){
			tmp[data[i]]++;
		}
		for(int i=0;i<data.length;i++){
			if(tmp[i]==1){
				array.add(i);
			}
		}
		return array;
		
	}
}
