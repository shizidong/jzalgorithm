package code.Tree.chap08;

class TreeLinkNode {
	int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode parent = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class solution {
	
	
	public TreeLinkNode getNext(TreeLinkNode pNode){
		if(pNode == null){
			return null;
		}
		TreeLinkNode pNext = null;
		if(pNode.right != null){
			TreeLinkNode pRight = pNode.right;
			while(pRight.left != null){
				pRight = pRight.left;
			}
			pNext = pRight;
		}else if(pNode.parent != null){
			TreeLinkNode pCurrent = pNode;
			TreeLinkNode pParent = pNode.parent;
			while(pParent != null && pParent.right == pCurrent){
				pCurrent = pParent;
				pParent = pParent.parent;
			}
			pNext = pParent;
		}
		return pNext;
	}
}
