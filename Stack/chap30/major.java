package code.Stack.chap30;

public class major {

	public static void main(String[] args) {
		solution s = new solution();
		s.push(3);
		s.push(4);
		s.push(2);
		s.push(5);
		System.out.println(s.min());
		s.pop();
		System.out.println(s.top());
		s.pop();
		System.out.println(s.min());
		System.out.println(s.top());
	}

}
