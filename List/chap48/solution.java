package code.List.chap48;

public class solution {
	public int longSubString(String str){
		if(str==null||str.length()==0){
			return -1;
		}
		int maxLength = 0;
		int curLength = 0;
		int []position = new int[26];
		//初始化为-1，负数表示没出现过
		for(int i=0;i<26;i++){
			position[i] = -1;
		}
		for(int i=0;i<str.length();i++){
			//第一次出现的位置
			int preIndex = position[str.charAt(i)-'a'];
			//重复字符之间的距离
			int distance = i - preIndex;
			//如果当前字符没有出现过，或者出现后的d大于当前最长字串长度
			if(preIndex<0||distance>curLength){
				curLength++;
			}else{
				if(curLength>maxLength){
					maxLength = curLength;
				}
				curLength = distance;
			}
			position[str.charAt(i)-'a'] = i;
		}
		if(curLength>maxLength){
			maxLength = curLength;
		}
		
		return maxLength;
		
	}
}
