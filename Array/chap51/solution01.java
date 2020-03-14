package code.Array.chap51;

/**
 *归并排序
 */
public class solution01 {
	public void mergeSort(int []num,int start,int end){
		if(start<end){
			int mid = (start+end)/2;
			mergeSort(num,start,mid);
			mergeSort(num,mid+1,end);
			merge(num,start,mid,end);
		}
	}

	public void merge(int[] num, int left, int mid, int right) {
		int []tmp = new int[num.length];
		int p1=left,p2=mid+1,k=left;
		while(p1<mid&&p2<right){
			if(num[p1]<=num[p2]){
				tmp[k++] = num[p1++];
			}else{
				tmp[k++] = num[p2++];
			}
		}
		while(p1<=mid){
			tmp[k++] = num[p1++];
		}
		while(p2<=right){
			tmp[k++] = num[p2++];
		}
		for(int i=left;i<right;i++){
			num[i] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		solution01 s = new solution01();
		int []num = {7,5,6,4};
		s.mergeSort(num, 0, num.length-1);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
