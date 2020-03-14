package code.List.chap25;

public class major {

	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(3);
		ListNode ln3 = new ListNode(5);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = null;
		ListNode h1 = new ListNode(2);
		ListNode h2 = new ListNode(4);
		ListNode h3 = new ListNode(6);
		h1.next = h2;
		h2.next = h3;
		h3.next = null;
		solution s = new solution();
		ListNode Merge = new ListNode(0);
		Merge = s.merge(ln1, h1);
		s.printList(Merge);

	}

}
