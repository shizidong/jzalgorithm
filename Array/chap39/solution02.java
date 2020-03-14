package code.Array.chap39;

public class solution02 {
	public int moreThanHalfNum(int []array){
		if(array==null||array.length==0){
			return -1;
		}
		//使用哈希表
		int mapArr[] = new int[256];
		
		for(int i=0;i<mapArr.length;i++){
			mapArr[i] = 0;
		}
		//保存当前数放入数组中
		for(int i=0;i<array.length;i++){
			mapArr[array[i]]++;
		}
		//如果数组中的某个数的个数超过总数的一半就返回
		for(int i=0;i<mapArr.length;i++){
			if(mapArr[i]>array.length/2){
				return i;
			}
		}
		return 0;
		
	}
}
