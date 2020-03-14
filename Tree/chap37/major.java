package code.Tree.chap37;

public class major {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t3.left = t5;
		t3.right = t6;
		solution s = new solution();
		System.out.println(s.serialize(t1));
		System.out.println(s.deSerialize(s.serialize(null)));

	}

}
