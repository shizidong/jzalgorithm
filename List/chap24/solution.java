package code.List.chap24;

	class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data) {
			this.data = data;
		}
	}

public class solution {
	public int reverseList(ListNode pHead){
		//头结点不为空
		if(pHead==null) return 0;
		//前驱节点
		ListNode pPreNode = null;
		//当前节点
		ListNode pNode = pHead;
		//反转后的头结点
		ListNode reverseHeadNode = null;
		//链表只有一个节点
		if(pNode.next==null) {
			return pHead.data;
		}else{
			//当前节点不为空
			while(pNode!=null){
				ListNode nextNode = null;
				nextNode = pNode.next;
				//指到最后一个节点了
				if(nextNode == null) {
					reverseHeadNode = pNode; 
				}
				pNode.next = pPreNode;
				pPreNode = pNode;
				pNode = nextNode;
			}
		}
		
		return reverseHeadNode.data;
		
	}
}
