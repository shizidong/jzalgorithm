package code.Stack.chap30;

import java.util.Stack;

public class solution {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public solution(){
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}
	
	public void push(int node){
		stackData.push(node);
		if(stackMin.empty()){
			stackMin.push(node);
		}else{
			if(node<=stackMin.peek()){
				stackMin.push(node);
			}
		}
	}
	
	public void pop(){
		int data = stackData.pop();
		if(data==stackMin.peek()){
			stackMin.pop();
		}
	}
	
	public int top(){
		return stackData.peek();
	}
	
	public int min(){
		return stackMin.peek();
	}
}
