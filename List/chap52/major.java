package code.List.chap52;

public class major {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(6);
		ListNode n5 = new ListNode(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode h1 = new ListNode(4);
		ListNode h2 = new ListNode(5);
		ListNode h3 = new ListNode(6);
		ListNode h4 = new ListNode(7);
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		solution s = new solution();
		System.out.println(s.findFirstNode(h1, n1));
		//solution01 s = new solution01();
		//System.out.println(s.getFristNum(h1, n1));
		


	}

}
