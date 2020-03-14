package code.Stack.chap10;

public class solution {
	
	
		public long fibo(long t){
			if(t == 0 || t == 1){
				return t;
			}
			long fibZero = 0;
			long fibOne = 1;
			long fibN = 0;
			for(long i=2;i<=t;++i){
				fibN = fibZero + fibOne;
				fibZero = fibOne;
				fibOne = fibN;
			}
			return fibN;
		}
	
	
	
	
	
	public static class Demo2 {
		
		private static int getFibo(int i) {
			if (i == 1 || i == 2)
				return 1;
			else
				return getFibo(i - 1) + getFibo(i - 2);
		}
	}
	
}
