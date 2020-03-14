package code.Tree.chap33;

public class solution {
	public boolean verifySeqenceOfBST(int []sequence){
		if(sequence==null||sequence.length==0){
			return false;
		}
		return isTreeBST(sequence,0,sequence.length-1);
	}

	private boolean isTreeBST(int[] sequence, int start, int end) {
		int i=start;
		for(;i<end;i++){
			if(sequence[i]>sequence[end]) break;
		}
		int j=i;
		for(;j<end;j++){
			if(sequence[j]<sequence[end]) return false;
		}
		boolean left = true;
		//根节点左子树不为空
		if(i>0){
			left = isTreeBST(sequence, start, i-1);
		}
		boolean right=true;
		// 根节点右子树不为空
		if(j<end-1){
			right=isTreeBST(sequence, i, end-1);
		}
		return left&&right;
	}
}
