package code.List.chap35;

public class major {

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode l3 = new ListNode();
		ListNode l4 = new ListNode();
		ListNode l5 = new ListNode();
		l1.data = 1;
		l2.data = 2;
		l3.data = 3;
		l4.data = 4;
		l5.data = 5;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l1.pSibling = l3;
		l2.pSibling = l5;
		l4.pSibling = l2;
		solution s = new solution();
		System.out.println(s.clone(l1));

	}

}
