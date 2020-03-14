package code.Array.chap51;

//使用归并排序计算个数

public class solution02 {
	public int inverseParis(int []data){
		if(data==null||data.length==0){
			return 0;
		}
		//辅助数组
		int tmp[] = new int[data.length];
		//将值全复制到辅助数组中
		for(int i=0;i<data.length;i++){
			tmp[i] = data[i];
		}
		//计算逆序对的个数
		int count = inverseCore(data,tmp,0,data.length-1);
		return count;
		
	}

	private int inverseCore(int[] data, int[] tmp, int start, int end) {
		if(start==end){
			tmp[start] = data[start];
			return 0;
		}
		//数组中中间的值
		int mid = (end+start)/2;
		//递归对左半部分进行归并
		int left = inverseCore(tmp,data,start,mid);
		//递归对右半部分进行归并
		int right = inverseCore(tmp, data, mid+1, end);
		//原数组左半部分末尾的索引
		int i = mid;
		//右半部分末尾的索引
		int j = end;
		//辅助数组末尾的索引（从小到大排序）
		int indexCopy = end;
		int count = 0;
		//两个指针不越界的循环条件
		while(i>=start&&j>=mid+1){
			if(data[i]>data[j]){
				tmp[indexCopy--] = data[i--];
				count += j-mid;
			}else{
				tmp[indexCopy--] = data[j--];
			}
		}
		//将剩余的复制进来
		for(;i>=start;i--){
			tmp[indexCopy--] = data[i];
		}
		for(;j>=mid+1;j--){
			tmp[indexCopy--] = data[j];
		}
		
		return left+right+count;
		
	}
	
	public static void main(String[] args) {
		solution02 s = new solution02();
		int []data = {7,5,6,4};
		System.out.println(s.inverseParis(data));
	}
}
