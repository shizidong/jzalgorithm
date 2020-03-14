package code.Tree.chap32;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}

public class solution {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root){
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root==null) {
			return null;
		}
		TreeNode cur = root;
		queue.add(root);
		while(queue.size()!=0){
			cur = queue.poll();
			result.add(cur.data);
			if(cur.left!=null){
				queue.add(cur.left);
			}
			if(cur.right!=null){
				queue.add(cur.right);
			}
		}
		
		return result;
		
	}
}
