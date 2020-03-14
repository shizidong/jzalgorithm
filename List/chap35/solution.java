package code.List.chap35;

class ListNode{
	public int data;
	public ListNode next;
	public ListNode pSibling;
}

public class solution {
	//复制原始链表
	public void cloneNode(ListNode pHead){
		ListNode pNode = pHead;
		while(pNode!=null){
			ListNode pClone = new ListNode();
			pClone.data = pNode.data;
			pClone.next = pNode.next;
			pClone.pSibling = null;
			pNode.next = pClone;
			pNode = pClone.next;
		}
	}
	
	//复制复杂链表的复杂指针
	public void connectSiblingNode(ListNode pHead){
		ListNode pNode = pHead;
		while(pNode!=null){
			ListNode pClone = pNode.next;
			if(pNode.pSibling!=null){
				pClone.pSibling = pNode.pSibling.next;
			}
			pNode = pClone.next;
		}
	}
	
	//将链表分成两个，一个原始一个复制的
	public ListNode reConnect(ListNode pHead){
		ListNode pNode = pHead;
		ListNode pCloneHead = null;
		ListNode pCloneNode = null;
		if(pNode!=null){
			pCloneHead=pCloneNode=pNode.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		while(pNode!=null){
			pCloneNode.next = pNode.next;
			pCloneNode = pCloneNode.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		return pCloneHead;	
	}
	
	public ListNode clone(ListNode pHead){
		cloneNode(pHead);
		connectSiblingNode(pHead);
		return reConnect(pHead);
	}
}
