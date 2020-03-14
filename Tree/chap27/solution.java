package code.Tree.chap27;

	class TreeNode{
		public int data;
		public TreeNode leftNode;
		public TreeNode rightNode;
		public TreeNode(int data) {
			this.data = data;
		}
	}

public class solution {
	public void mirrorTree(TreeNode pNode){
		if(pNode==null) {
			return;
		}
		if(pNode.leftNode==null&&pNode.rightNode==null) {
			return;
		}
		int temp = pNode.rightNode.data;
		pNode.rightNode.data = pNode.leftNode.data;
		pNode.leftNode.data = temp;
		if(pNode.leftNode!=null){
			mirrorTree(pNode.leftNode);
		}
		if(pNode.rightNode!=null){
			mirrorTree(pNode.rightNode);
		}
	}
}
