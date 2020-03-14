package code.Tree.chap28;

	class TreeNode{
		public int data;
		public TreeNode leftNode;
		public TreeNode rightNode;
		public TreeNode(int data) {
			this.data = data;
		}
	}

public class solution {
	public boolean isSymmetrical(TreeNode pRoot){
		return isSymmetrical(pRoot,pRoot);
	}

	private boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
		if(pRoot1==null&&pRoot2==null) {
			return true;
		}
		if(pRoot1==null||pRoot2==null){
			return false;
		}
		if(pRoot1.data!=pRoot2.data){
			return false;
		}
		return isSymmetrical(pRoot1.leftNode,pRoot2.rightNode)&&isSymmetrical(pRoot1.rightNode, pRoot2.leftNode);
	}
}
