package code.List.chap06;

import java.util.Stack;

class LinkNode{
	LinkNode next;
	int data;
}
public class solution {
	public void reverse(LinkNode headnode){
		Stack<LinkNode> stack = new Stack<LinkNode>();
		while(headnode!=null){
			stack.push(headnode);		
			headnode = headnode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().data+" ");
		}
	}
}
