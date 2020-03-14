package code.List.chap41;

public class major {

	public static void main(String[] args) {
		solution s = new solution();
		for(int i=1;i<=25;i++){
			s.Insert(i);
		
		}
		System.out.println(s.GetMedian());
	}

}
