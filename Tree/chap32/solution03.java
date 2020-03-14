package code.Tree.chap32;

import java.util.ArrayList;
import java.util.Stack;

public class solution03 {
	public ArrayList<Integer> fun2(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root==null){
			return null;
		}
		//保存奇数行
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		//保存偶数行
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		//当前层级为1
		int level = 1;
		stack1.push(root);
		//循环跳出条件，栈1和栈2都不为空
		while(!stack1.isEmpty()||!stack2.isEmpty()){
			//如果为奇数行
			if(level%2==1){
				while(!stack1.isEmpty()){
					TreeNode pNode = stack1.pop();
					result.add(pNode.data);
					//将其子节点偶数行保存到stack2中
					if(pNode.left!=null){
						stack2.push(pNode.left);
					}
					if(pNode.right!=null){
						stack2.push(pNode.right);
					}
				}
				//当栈中元素全部弹出，向下一行
				level++;
			}else{
				while(!stack2.isEmpty()){
					TreeNode pNode = stack2.pop();
					result.add(pNode.data);
					//将其子节点奇数行保存到栈2中
					if(pNode.right!=null){
						stack1.push(pNode.right);
					}
					if(pNode.left!=null){
						stack1.push(pNode.left);
					}
				}
				level++;
			}	
		}
		return result;
		
	}
}
