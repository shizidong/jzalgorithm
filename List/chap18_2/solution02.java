package code.List.chap18_2;

	class ListNode{
		public int data;
		public ListNode next = null;
		public ListNode(int data) {
			data = this.data;
		}
	}
public class solution02 {
	    public ListNode deleteDuplication(ListNode pHead){
	        if(pHead == null){
	            return null;
	        }
	        if(pHead !=null && pHead.next == null){
	            return pHead;
	        }
	        ListNode preNode =null;
	        ListNode node = pHead;
	        while(node != null){
	            if(node.next !=null && node.data == node.next.data){
	                while(node.next != null && node.next.data == node.data){
	                    node = node.next;
	                }
	                if(preNode == null){
	                    pHead = node.next;
	                }else{
	                    preNode.next = node.next;
	                }
	            }else{
	                preNode = node;
	            }
	            node = node.next;
	        }
	        return pHead;
	    }
	}