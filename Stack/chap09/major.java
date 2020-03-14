package code.Stack.chap09;

public class major {
	public static void main(String[] args) throws Exception {
		solution s = new solution();
		/*s.appendTail("a");
		s.appendTail("b");
		s.appendTail("c");*/
		System.out.println(s.deleteTail());
		System.out.println(s.deleteTail());
		System.out.println(s.deleteTail());
		s.appendTail("d");
		s.appendTail("e");
		s.appendTail("f");
		System.out.println(s.deleteTail());
		
		
		
	}
}
