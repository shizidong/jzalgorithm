package code.String.chap50;

import java.util.LinkedList;
import java.util.Queue;

/**
 *字符流中第一个只出现过一次的字符
 *用一个数据结构存储只出现一次的字符，用一个数组存储字符类似哈希表的key
 */

public class solution01 {
	int charCnt[] = new int[256];
	Queue<Character> queue = new LinkedList<Character>();
	
	public void insert(char ch){
		if(charCnt[ch]++ ==0){
			queue.add(ch);
		}
	}
	
	public char fristApparence(){
		Character CHAR = null;
		char c = 0;
		while((CHAR=queue.peek())!=null){
			c = CHAR.charValue();
			if(charCnt[c]==1){
				return c;
			}else{
				queue.remove();
			}
		}
		return '#';
		
	}
	
	public static void main(String[] args) {
		solution01 s = new solution01();
		s.insert('g');
		s.insert('o');
		s.insert('o');
		s.insert('g');
		System.out.println(s.fristApparence());
		s.insert('l');
		s.insert('e');
		System.out.println(s.fristApparence());
		s.insert('l');
		s.insert('e');
		System.out.println(s.fristApparence());
		
	}
}
