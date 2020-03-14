package code.Stack.chap12;

public class major {
	public static void main(String[] args) {
		char []a = {};
		int rows = 1;
		int cols = 4;
		char[] str1 = {'b','c','c','e','d'};
		char[] str2 = {'a','b','c','d'};
		solution s = new solution();
		System.out.println(s.hasPath(a, rows, cols, str1));
		System.out.println(s.hasPath(a, rows, cols, str2));
	}
}
