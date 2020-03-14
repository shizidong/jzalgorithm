package code.List.chap25;

	class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}

public class solution {
	public ListNode merge(ListNode pHead1,ListNode pHead2){
		if(pHead1==null) {
			return pHead2;
		}else if(pHead2==null){
			return pHead1;
		}
		ListNode pMergeHead = null;
		if(pHead1.data<pHead2.data){
			pMergeHead = pHead1;
			pMergeHead.next = merge(pHead1.next, pHead2);
		}else{
			pMergeHead = pHead2;
			pMergeHead.next = merge(pHead1, pHead2.next);
		}
		return pMergeHead;
		
	}
	
	public void printList(ListNode Merge){
		ListNode head = Merge;
		while(head!=null){
			System.out.print(head.data);
			head = head.next;
		}
		System.out.println();
	}
}
