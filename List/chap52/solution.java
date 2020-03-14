package code.List.chap52;

import java.util.Stack;

/**
 * 利用两个辅助栈来存储两个链表中的元素，然后再从后向前比较，找到最后一个相等的值返回
 */
class ListNode{
	public int data;
	public ListNode next;
	public ListNode(int data) {
		this.data = data;
	}
}

public class solution {
	public int findFirstNode(ListNode head1,ListNode head2){
		if(head1==null||head2==null){
			return -1;
		}
		//两个辅助栈和保存最后一个值的数
		Stack<ListNode> stack1 = new Stack<ListNode>();
		Stack<ListNode> stack2 = new Stack<ListNode>();
		//保存第一个相同的节点
		ListNode firstNode = null;
		//链表不为空，则一直进栈
		while(head1!=null){
			stack1.push(head1);
			//System.out.println(head1.data);
			head1 = head1.next;
		}
		while(head2!=null){
			stack2.push(head2);
			//System.out.println(head2.data);
			head2 = head2.next;
		}
		//从后向前判断最后一个相等的值
		while(stack1!=null||stack2!=null){
			if(stack1.peek().data==stack2.peek().data){
				//节点相同就保存，之后弹出
				firstNode = stack1.peek();
				stack1.pop();
				stack2.pop();
			}else{
				return firstNode.data;
			}
		}
		return -1;
		
	}
}
