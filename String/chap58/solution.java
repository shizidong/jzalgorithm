package code.String.chap58;

//反转字符串
//思路：第一步反转句子中的所有字符；第二步反转每个单词中的字符

public class solution {
	public String reserveSentence(String str){
		if(str==null||str.length()==0){
			return null;
		}
		//字符串转为数组
		char []chars = str.toCharArray();
		rolateWord(chars);
		//char类型的数组返回的类型包含String类型的特点
		return String.valueOf(chars);
		
	}

	//对句子进行判断，对单词的分割
	private void rolateWord(char[] chars) {
		if(chars==null||chars.length==0){
			return ;
		}
		reserve(chars,0,chars.length-1);
		int start = 0;
		int end = 0;
		int i = 0;
		while(i<chars.length){
			//当前值为空格，则是新的一个单词
			while(i<chars.length&&chars[i]==' '){
				i++;
				start = i;
			}
			//当前值不为空格，继续找单词的结尾
			while(i<chars.length&&chars[i]!=' '){
				i++;
				end = i;
			}
			reserve(chars, start, end-1);
		}
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
}
