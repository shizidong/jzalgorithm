package code.String.chap58.question02;

//坐旋转字符串，将字符串中的前若干字符移到后面
//思路：将字符串分为两部分，先反转第一部分，再反转第二部分，然后再将整体反转

public class solution {
	public String leftRotateString(String str,int n){
		if(str==null||str.length()==0){
			return null;
		}
		//字符串转为数组
		char []chars = str.toCharArray();
		if(str!=null){
			//将待反转的字符串分为两部分
			int firstStart = 0;
			int firstEnd = n-1;
			int secondStart = n;
			int secondEnd = chars.length-1;
			//反转前一部分
			reserve(chars,firstStart,firstEnd);
			//反转后一部分
			reserve(chars, secondStart, secondEnd);
			//全部反转一次
			reserve(chars, firstStart, secondEnd);
		}
		//char数组以String字符串的形式返回
		return String.valueOf(chars);	
	}
	private void reserve(char[] chars, int left, int right) {
		while(left<right){
			char tmp = chars[left];
			chars[left] = chars[right];
			chars[right] = tmp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		solution s = new solution();
		String str = "abcdefg";
		System.out.println(s.leftRotateString(str, 2));
	}
}
