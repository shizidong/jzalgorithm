package code.String.chap43;

public class solution {
	public int numBetweenAnd(int n){
		//保存1的次数
		int count = 0;
		//对输入的每个数进行计算
		for(int i=1;i<=n;i++){
			//将每个数中包含的1累加
			count += core(i);
		}
		return count;
	}

	private int core(int n) {
		int num = 0;
		//对每一个数进行循环判断有几个1
		while(n!=0){
			if(n%10==1){
				num++;
			}
			//将n除到最小
			n /= 10;
		}
		return num;
	}
}
