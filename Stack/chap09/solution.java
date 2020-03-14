package code.Stack.chap09;

import java.util.Stack;

public class solution {
	Stack<String> stack1 = new Stack<String>();
	Stack<String> stack2 = new Stack<String>();
	
	public void appendTail(String s){
		stack1.push(s);
	}
	
	public String deleteTail() throws Exception{
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty()){
			throw new Exception("队列为空，不能进行删除操作");
		}
		return stack2.pop();
	}
	
}
