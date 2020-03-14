package code.List.chap52;

/**
 *首先确定两个链表的长度，计算两个链表长度的差值，
 *让长的链表先走差值的步数，然后再让两个链表一起走，就可以找到第一个相同节点
 */

public class solution01 {
	public int getFristNum(ListNode head1,ListNode head2){
		if(head1==null||head2==null){
			return -1;
		}
		int length1 = GetListLength(head1);
		//System.out.println(length1);
		int length2 = GetListLength(head2);
		//System.out.println(length2);
		int lengthDif = length1 - length2;
		
		ListNode listLong = head1;
		ListNode listShort = head2;
		if(length2>length1){
			listLong = head2;
			listShort = head1;
			lengthDif = length2 - length1;
		}
		
		for(int i=0;i<lengthDif;i++){
			listLong = listLong.next;
		}
		while(listLong!=null&&listShort!=null&&listLong.data!=listShort.data){
			//System.out.println(listLong.data);
			listLong = listLong.next;
			//System.out.println(listShort.data);
			listShort = listShort.next;
		}
		if(listLong!=null&&listLong==listShort){
			ListNode firstNode = listLong;
			return firstNode.data;
		}else {
			return -1;
		}
		
	}

	private int GetListLength(ListNode head) {
		int length = 0;
		while(head!=null){
			length++;
			head = head.next;
		}
		return length;
	}
}
