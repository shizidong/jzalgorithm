package code.Array.chap53.question01;

public class major {

	public static void main(String[] args) {
		int []data = {1,2,3,3,3,3,4,5};
		//solution s = new solution();
		//System.out.println(s.findNumTime(data, 3));
		solution01 s = new solution01();
		System.out.println(s.getNumK(data, 3));
	}

}
