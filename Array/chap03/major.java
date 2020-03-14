package code.Array.chap03;

//数组中查找重复的数字
public class major {
	public static void main(String[] args) {
		int a[] = {2,3,1,0,4,5,6,7};
		int []b = new int[5];
		solution s = new solution();
		s.duplicate(a, 7, b);
		System.out.println(s.duplicate(a, 7, b));
		System.out.println(b);
		
		
		/*ArrayList<Integer> arr= new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		while(sc.hasNextDouble())
		{
		int a = sc.nextInt();
		if(a==0)
		break;
		arr.add(a);
		}*/
	}
}
