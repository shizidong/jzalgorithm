package code.List.chap18;

class ListNode{
	public int data;
	public ListNode next;
}

public class solution {
	public void deleteNode(ListNode pHead,ListNode pDelNode) {
		if(pHead==null||pDelNode==null){
			return ;
		}
		//链表只有一个节点
		if(pHead==pDelNode){
			pHead = null;
			pDelNode = null;
		}
		//待删除节点不是尾节点
		if(pDelNode.next!=null){
			ListNode pNext = pDelNode.next;
			pDelNode.data = pNext.data;
			pDelNode.next = pNext.next;
		}
		//链表中又多个节点，删除尾节点
		else{
			ListNode pNode = pHead;
			while(pNode.next!=pDelNode){
				pNode = pNode.next;
			}
			pNode.next = null;
		}
		
	}
}