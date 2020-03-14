package code.Array.chap21;

public class solution {
	public void recordOddEvent(int[] str){
		if(str==null||str.length==0){
			return;
		}
		int pBeginIndex = 0;
		int pEndIndex = str.length-1;
		while(pBeginIndex<pEndIndex){
			//向后移动起始指针，直到指向偶数
			while(pBeginIndex<pEndIndex&&(pBeginIndex&0X1)!=0){
				pBeginIndex++;
			}
			while(pBeginIndex<pEndIndex&&(pEndIndex&0X1)==0){
				pEndIndex--;
			}
			if(pBeginIndex<pEndIndex){
				int temp = str[pBeginIndex];
				str[pBeginIndex] = str[pEndIndex];
				str[pEndIndex] = temp;
			}
		}
		
	}
	public void printArray(int []str){
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]+"");
		}
	}
}
