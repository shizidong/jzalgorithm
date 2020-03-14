package code.String.chap19;

public class solution {
	public boolean match(char []str,char []pattern){
		if(str==null||pattern==null){
			return false;
		}
		return mathCore(str,0,pattern,0);
		
	}

	private boolean mathCore(char[] str, int sIndex, char[] pattern, int pIndex) {
		//str和pattern同时到达尾部，完成匹配，返回true
		if(str.length==sIndex&&pattern.length==pIndex){
			return true;
		}
		//str不到尾，pattern到尾部，返回false
		if(sIndex!=str.length&&pIndex==pattern.length){
			return false;
		}
		//模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
		if(pIndex+1<pattern.length&&pattern[pIndex+1]=='*'){
			//1.模式串后后移两位，相当于第一个匹配的字符被忽略掉，从字符串的下一个字符继续开始匹配
			//2.字符串后移一位，模式串后移两位，相当于模式匹配一个字符
			//3.字符串后移一位，模式串不动，因为模式串的第二个字符'*‘，可以匹配前面出现的多个字符
			if(sIndex!=str.length&&str[sIndex]==pattern[pIndex]||sIndex!=str.length&&pattern[pIndex]=='.'){
				return mathCore(str, sIndex, pattern, pIndex+2)||mathCore(str, sIndex+1, pattern, pIndex+2)
						||mathCore(str, sIndex+1, pattern, pIndex);
			}else{
				return mathCore(str, sIndex, pattern, pIndex+2);
			}
		}
		 //模式串第二个字符不是'*',并且两个串的第一个字符是匹配的
		if(sIndex!=str.length&&str[sIndex]==pattern[pIndex]||sIndex!=str.length&&pattern[pIndex]=='.'){
			return mathCore(str, sIndex+1, pattern, pIndex+1);
		}
		//否则，直接返回false
		else{
			return false;
		}
		
	}
}
