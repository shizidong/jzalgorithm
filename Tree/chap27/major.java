package code.Tree.chap27;

public class major {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(6);
		TreeNode t3 = new TreeNode(10);
		TreeNode t4 = new TreeNode(5);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(9);
		TreeNode t7 = new TreeNode(11);
		t1.leftNode = t2;
		t1.rightNode = t3;
		t2.leftNode = t4;
		t2.rightNode = t5;
		t3.leftNode = t6;
		t3.rightNode = t7;
		solution s = new solution();
		s.mirrorTree(t1);
		System.out.println(t1.leftNode.leftNode.data);

	}

}
