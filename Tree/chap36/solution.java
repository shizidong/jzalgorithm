package code.Tree.chap36;

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}

public class solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        if(pRootOfTree.left==null&&pRootOfTree.right==null)
            return pRootOfTree;
        // 1.将左子树构造成双链表，并返回链表头节点
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        // 2.定位至左子树双链表最后一个节点
        while(p!=null&&p.right!=null){
            p = p.right;
        }
        // 3.如果左子树链表不为空的话，将当前pRootOfTree追加到左子树链表
        if(left!=null){
        	//左子树的最右节点连接根节点
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        // 4.将右子树构造成双链表，并返回链表头节点
        TreeNode right = Convert(pRootOfTree.right);
        // 5.如果右子树链表不为空的话，将该链表追加到pRootOfTree节点之后
        if(right!=null){
        	//右子树的最左子节点连接根节点
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        return left!=null?left:pRootOfTree;
    }
}

