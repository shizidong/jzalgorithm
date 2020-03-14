package code.List.chap22;

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data) {
		data = this.data;
	}
}

public class solution {
	public ListNode findTail(ListNode pHead,int k){
		if(pHead==null||k==0){
			return null;
		}
		ListNode pAhead = pHead;
		ListNode pBhead = null;
		for(int i=0;i<k-1;i++){
			if(pAhead.next!=null){
				pAhead = pAhead.next;
			}else{
				return null;
			}
					
		}
		pBhead = pHead;
		while(pAhead.next!=null){
			pAhead = pAhead.next;
			pBhead = pBhead.next;
		}
		return pBhead;
		
	}
}
