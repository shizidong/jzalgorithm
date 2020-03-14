package code.Array.chap53.question01;

//思路：递归二分法查找，获取第一次k的位置和最后一次k出现的位置，然后相减获得k出现的次数

public class solution01 {
	public int getNumK(int data[],int k){
		if(data==null||data.length==0){
			return 0;
		}
		int number = 0;
		if(data!=null&&data.length>0){
			int first = getFirst(data,k,0,data.length-1);
			int last = getLast(data,k,0,data.length-1);
			if(first>-1&&last>-1){
				number = last - first + 1;
			}
		}
		return number;
		
	}

	private int getLast(int[] data, int k, int start, int end) {
		if(start>end) return -1;
		int middleIndex = (start+end)/2;
		int middleData = data[middleIndex];
		if(middleData==k){
			//如果中间的值刚好为k，有两种情况，一种是中间值是k出现最后一次的位置，第二种是中间值后面还有k出现。
			if((middleIndex<data.length-1&&data[middleIndex+1]!=k)||middleIndex==data.length-1){
				return middleIndex;
				//中间值的后一个也为k，则start移动到中间索引的后一位，在后半段找最后一个出现的k位置
			}else{
				start = middleIndex+1;
			}	
		}else if(middleData>k){
			end = middleIndex-1;
		}else{
			start = middleIndex+1;
		}
		//递归二分法查找
		return getLast(data, k, start, end);
	}

	private int getFirst(int[] data, int k, int start, int end) {
		if(start>end) return -1;
		int midleIndex = (start+end)/2;
		int midleData = data[midleIndex];
		if(midleData==k){
			if((midleIndex>0&&data[midleIndex-1]!=k)||midleIndex==0){
				return midleIndex;
			}else{
				end = midleIndex-1;
			}
		}else if(data[midleIndex]>k){
			end = midleIndex-1;
		}else{
			start = midleIndex+1;
		}
		return getFirst(data, k, start, end);
	}
}
