package code.Array.chap49;

public class solution01 {
	public int getUglyNUmber_02(int index){
		if(index<=0){
			return 0;
		}
		//存储丑数的辅助数组
		int uglyArr[] = new int[index];
		//第一个丑数是1
		uglyArr[0] = 1;
		//第一下一个丑数的位置
		int nextUgly = 1;
		
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		int ugly2 = uglyArr[index2];
		int ugly3 = uglyArr[index3];
		int ugly5 = uglyArr[index5];
		
		//找到的丑数还不满足要求
		while(nextUgly<index){
			//获得三个数中的最小值，第一次均指的1，然后分别乘2、3、5，然后移动index2、index3、index5的指针
			//分别指向2、3、5,然后指针位置处的数字再分别乘以2、3、5，得到4、9、25，依次类推，每次得到的都是丑数
			//每次指针后移，就可以用较小空间换取时间
			int min = Min(ugly2*2,ugly3*3,ugly5*5);
			uglyArr[nextUgly] = min;
			
			while(uglyArr[index2]*2<=uglyArr[nextUgly]){
				ugly2 = uglyArr[++index2];
			}
			while(uglyArr[index3]*3<=uglyArr[nextUgly]){
				ugly3 = uglyArr[++index3];
			}
			while(uglyArr[index5]*5<=uglyArr[nextUgly]){
				ugly5 = uglyArr[++index5];
			}
			nextUgly++;
		}
		return uglyArr[nextUgly-1];
		
	}

	//三个数作比较，用两次三目运算符++
	private int Min(int i, int j, int k) {
		int min = i < j ? i : j;
		return min<k?min:k;
	}
}
