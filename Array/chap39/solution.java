package code.Array.chap39;

public class solution {
	boolean isInvalid = false;
	public int moreThanHalfNum (int []array){
		if(array==null||array.length==0){
			return -1;
		}
		//遍历到的当前数
		int result = array[0];
		//这个数出现的次数
		int count = 1;
		//遍历整个数组
		for(int i=1;i<array.length;i++){
			//如果次数减为0，则将下一个数保存到当前结果中
			if(count==0){
				result = array[i];
				count = 1;
				//下一个数等于结果中的数+1，不等则—1
			}else if(array[i]==result){
				count++;
			}else{
				count--;
			}
		}
		if(!checkMoreThanHalf(array,array.length,result)){
			result = 0;
		}
		return result;
		
	}
	//判断输入的数组中是否有超过一半的数
	private boolean checkMoreThanHalf(int[] array, int length, int result) {
		int count = 0;
		for(int i=0;i<length;i++){
			if(array[i]==result){
				count++;
			}
		}
		boolean isMoreThanHalf = true;
		if(count*2<=length){
			isInvalid = true;
			isMoreThanHalf = false;
		}
		return isMoreThanHalf;
	}
}
