package code.List.chap06;

import java.util.ArrayList;

public class solution01 {
	public ArrayList<Integer> printListFromTailToHead(LinkNode pHead){
		if(pHead==null){
			return null;
		}
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(pHead!=null){
			if(pHead.next!=null){
				printListFromTailToHead(pHead.next);
			}
			array.add(pHead.data);
			System.out.print(array);
		}
		return array;
	}
}
