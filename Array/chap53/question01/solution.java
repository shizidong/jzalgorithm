package code.Array.chap53.question01;

public class solution {
	public int findNumTime(int []data,int target){
		if(data==null||data.length==0){
			return 0;
		}
		int times = 0;
		for(int i=0;i<data.length;i++){
			if(data[i]==target){
				times++;
			}
		}
		
		return times;
		
	}
}
