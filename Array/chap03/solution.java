package code.Array.chap03;

public class solution {
	boolean duplicate(int num[],int length,int []duplicate){
		for(int i=0;i<num.length;i++){
			if(num[i]!=i){
				if(num[i]!=num[num[i]]){
					int b = num[num[i]];
					num[num[i]] = num[i];
					num[i] = b;
				}
				else{
					duplicate[0] = num[num[i]];
					return true;
				}
			}
		}
		return false;
	}
	
	
}
