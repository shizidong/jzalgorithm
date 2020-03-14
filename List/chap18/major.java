package code.List.chap18;

public class major {

	public static void main(String[] args) throws Exception {
		ListNode ln1 = new ListNode();
		/*ListNode ln2 = new ListNode();
		ListNode ln3 = new ListNode();
		ListNode ln4 = new ListNode();
		ListNode ln5 = new ListNode();
		ListNode ln6 = new ListNode();
		ListNode ln7 = new ListNode();
		ListNode ln8 = new ListNode();*/
		ln1.next = null;
		//ln2.next = ln3;
		/*ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = ln7;
		ln7.next = ln8;
		ln8.next = null;*/
		ln1.data = 1;
		/*ln2.data = 2;
		ln3.data = 3;
		ln4.data = 4;
		ln5.data = 5;
		ln6.data = 6;
		ln7.data = 7;
		ln8.data = 8;*/

		solution s = new solution();
		s.deleteNode(ln1, ln1);
		/*while(ln1!=null){
			System.out.println(ln1.data);
			ln1 = ln1.next;
		}*/
		System.out.println(ln1.next.data);


	}

}
