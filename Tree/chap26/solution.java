package code.Tree.chap26;

class TreeNode{
	public int data;
	public TreeNode leftNode;
	public TreeNode rightNode;
	public TreeNode(int data) {
		this.data = data;
	}
}

public class solution {
	public boolean hasSubTree(TreeNode root1,TreeNode root2){
		if(root1==null) return false;
		boolean result = false;
		if(root1!=null&&root2!=null){
			if(equal(root1.data,root2.data)){
				result = doesTreeHave(root1,root2);
			}
			if(!result){
				result = hasSubTree(root1.leftNode, root2);
			}
			if(!result){
				result = hasSubTree(root1.rightNode, root2);
			}
		}
		return result;
		
	}

	private boolean equal(int data1, int data2) {
		if((data1-data2>-0.0000001)&&(data1-data2<0.0000001)){
			return true;
		}else{
			return false;
		}
	}

	private boolean doesTreeHave(TreeNode root1, TreeNode root2) {
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(!equal(root1.data,root2.data)){
			return false;
		}
		return doesTreeHave(root1.leftNode, root2.leftNode)&&doesTreeHave(root1.rightNode, root2.rightNode);
		
	}
}
