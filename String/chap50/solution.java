package code.String.chap50;

/**
 *查找字符串中第一个只出现一次的字符
 *思路：首先可以想到hashtable的原理，设置一个存储字符的数组，将每个字符出现次数置为0
 *将字符串转为数组，遍历数组，字符出现一次就在存储字符的数组值+1,
 *第二次遍历数组，找出第一个值为1的字符返回
 */

public class solution {
	public char fristNotRepeat(String str){
		//判定条件
		if(str==null||str.length()==0){
			return '0';
		}
		//存储字符的数组
		int mapArr[] = new int[256];
		//为字符数组中的每个字符出现次数均转为0
		for(int i=0;i<str.length();i++){
			mapArr[i] = 0;
		}
		//将字符串转为数组
		char ch[] = str.toCharArray();
		int len = ch.length;
		//第一次遍历，将出现的字符在存储字符的数组中+1
		for(int i=0;i<len;i++){
			mapArr[ch[i]]++;
		}
		//第二次遍历找到第一个只出现一次数
		for(int i=0;i<len;i++){
			if(mapArr[ch[i]]==1){
				return ch[i];
			}
		}
		return '0';
		
	}
}
