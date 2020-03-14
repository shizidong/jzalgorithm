package code.Tree.chap32;

import java.util.LinkedList;

public class solution02 {
	public void fun1(TreeNode root){
		if(root==null){
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		 //下一层节点的数量
		int nextLevel = 0;
		//当前层中还没有打印的节点数
		int toBePrint = 1;
		while(!queue.isEmpty()){
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.data+" ");
			if(tempNode.left!=null){
				queue.add(tempNode.left);
				nextLevel++;
			}
			if(tempNode.right!=null){
				queue.add(tempNode.right);
				nextLevel++;
			}
			toBePrint--;
			if(toBePrint==0){
				System.out.println();
				toBePrint = nextLevel;
				nextLevel = 0;
			}
		}
	}
}
