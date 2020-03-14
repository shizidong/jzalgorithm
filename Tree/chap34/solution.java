package code.Tree.chap34;

import java.util.ArrayList;

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}

public class solution {
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target){
		//result保存所有符合条件的路径
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		//curResult保存当前符合条件的路径
		ArrayList<Integer> curResult = new ArrayList<>();
		if(root==null) {
			return result;
		}
		int curSum = 0;
		findPathCore(root,target,curResult,result,curSum);
		return result;
		
	}

	private void findPathCore(TreeNode root, int target, ArrayList<Integer> curResult,
			ArrayList<ArrayList<Integer>> result, int curSum) {
		if(root==null) {
			return;
		}
		boolean isLeaf = (root.left==null&&root.right==null);
		curSum += root.data;
		//如果当前节点是叶节点
		if(isLeaf){
			//当前的求和和目标数数大小一致
			if(curSum==target){
				curResult.add(root.data);
				result.add(new ArrayList<Integer>(curResult));
				//路径中取出该叶子节点
				curResult.remove(curResult.size()-1);
			}
			//返回上层节点，并从当前路径和中减去该节点的值
			curSum -= root.data;
			return;
		}
		curResult.add(root.data);
		findPathCore(root.left, target, curResult, result, curSum);
		findPathCore(root.right, target, curResult, result, curSum);
		curResult.remove(curResult.size()-1);
	}
}
