package code.String.nowcoder01;

import java.util.LinkedList;
import java.util.Queue;

public class solution {
	//定义一个用来存储字符的数组
	int []charCnt = new int[256];
	//用队列来保存不重复的字符
	Queue<Character> queue = new LinkedList<Character>();
	
	public void insert(char ch){
		//如果字符第一次出现就加入队列
		if(charCnt[ch]++ == 0){
			queue.add(ch);
		}
	}
	
	public char fristAppranceOnce(){
		Character CHAR = null;
		char c = 0;
		//队列不为空
		while((CHAR=queue.peek())!=null){
			//将队头元素赋给c
			c = CHAR.charValue();
			//判断队头的第一个字符只出现了一次，就是第一个只出现一次的字符，否则就移出队列，判断第二个只出现一次的元素
			if(charCnt[c]==1){
				return c;
			}else{
				queue.remove();
			}
		}
		return '#';
		
	}
}
