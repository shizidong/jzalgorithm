package code.List.chap06;

//从尾到头打印链表
public class major {

	public static void main(String[] args) {
		//solution s = new solution();
		solution01 s1 = new solution01();
		LinkNode node1 = new LinkNode();
		LinkNode node2 = new LinkNode();
		LinkNode node3 = new LinkNode();
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		node1.next = node2;
		node2.next = node3;
		s1.printListFromTailToHead(node1);

	}

}
