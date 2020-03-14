package code.String.chap38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class solution {
	public ArrayList<String> permutation(String str){
		ArrayList<String> re = new ArrayList<String>();
		if(str==null||str.length()==0){
			return re;
		}
		//如果有重复元素，将相同的排列去重
		HashSet<String> set = new HashSet<String>();
		fun(set,str.toCharArray(),0);
		re.addAll(set);
		//collections只允许操作集合中的静态方法，sort对集合中的元素排序，默认为升序。
		Collections.sort(re);
		return re;
		
	}

	private void fun(HashSet<String> re, char[] str, int beginIndex) {
		//只有一个元素
		if(beginIndex==str.length){
			re.add(new String(str));
			return;
		}
		for(int i=beginIndex;i<str.length;i++){
			//第一步交换所有可能出现在第一个位置的字符
			swap(str,i,beginIndex);
				fun(re,str,beginIndex+1);
					//第二步，在固定第一个字符的情况下，交换后面所有字符
					swap(str,i,beginIndex);
		}
		
	}

	private void swap(char[] str, int i, int beginIndex) {
		if(i!=beginIndex){
			char t = str[i];
			str[i] = str[beginIndex];
			str[beginIndex] = t;
		}
		
	}
}
