package code.Array.chap11;

public class solution {
	public int minElement(int []number) throws Exception{
		if(number==null||number.length<=0){
			throw new Exception("Invaild parameters"); 
		}
		int left = 0;
		int right = number.length - 1;
		int mid = left;
		while(number[left]>=number[right]){
			if(right-left==1){
				mid = right;
				break;
			}
			mid = (left + right)/2;
			if(number[left]==number[mid]&&number[mid]==number[right]){
				return minFromSort(number);
			}
			if(number[mid]>=number[left]){
				left = mid;
			}
			else if(number[mid]<=number[right]){
				right = mid;
			}
		}
		
		return number[mid];
		
	}

	public int minFromSort(int[] number) {
		int result = number[0];
		for(int i=1;i<=number.length-1;i++){
			if(result > number[i]){
				result = number[i];
			}
		}
		return result;
	}
}
