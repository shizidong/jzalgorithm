package code.List.chap23;

class ListNode{
	public int data;
	public ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
}

public class solution {
	public ListNode entryNodeOfLoop(ListNode pHead){
		ListNode meetNode = getMeetingNode(pHead);
		if(meetNode==null){
			return null;
		}
		int nodeLoop = 1;
		ListNode pCur = meetNode.next;
		while(pCur!=meetNode){
			nodeLoop++;
			pCur = pCur.next;
		}
		ListNode fast = pHead;
		for(int i=1;i<nodeLoop;i++){
			fast = fast.next;
		}
		ListNode slow = pHead;
		while(fast!=slow){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
	
	private ListNode getMeetingNode(ListNode pHead){
		if(pHead==null) return null;
		ListNode pSlow = pHead.next;
		if(pSlow==null) return null;
		ListNode pFast = pSlow.next;
		while(pFast!=null&&pSlow!=null){
			if(pFast==pSlow){
				return pFast;
			}
			pSlow = pSlow.next;
			pFast = pFast.next;
			if(pFast!=null) return pFast.next;
		}
		return null;
	}
	
}


