package code.Tree.chap26;

public class major {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(8);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(7);
		TreeNode t4 = new TreeNode(9);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		TreeNode b1 = new TreeNode(8);
		TreeNode b2 = new TreeNode(9);
		TreeNode b3 = new TreeNode(2);
		t1.leftNode = t2;
		t1.rightNode = t3;
		t2.leftNode = t4;
		t2.rightNode = t5;
		t5.leftNode = t6;
		t5.rightNode = t7;
		b1.leftNode = b2;
		b1.rightNode = b3;
		solution s = new solution();
		System.out.println(s.hasSubTree(t1, b1));
	}

}
