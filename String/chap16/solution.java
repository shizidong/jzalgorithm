package code.String.chap16;

public class solution {
	public double power(double base,int exponent) throws Exception{
		double result = 0.0;
		if(base==0&&exponent<0){
			throw new Exception("0的负数次幂无意义");
		}
		if(exponent==0){
			return 1.0;
		}
		result = powerWithUnsigned(base, Math.abs(exponent));
		if(base < 0){
			return -result;
		}
		if(exponent<0){
			return 1.0/result;
		}else{
			return result;
		}
	}

	private double powerWithUnsigned(double base, int exponent) {
		/*double result = 1.0;
		for(int i=1;i<=exponent;i++){
			result *= base;
		}
		return result;*/
		if(exponent ==0){
			return 1;
		}
		if(exponent ==1){
			return base;
		}
		//右移位1，表示除以2
		double result = powerWithUnsigned(base, exponent>>1);
		result *= result;
		//余数为1时
		if((exponent&0X1)==1){
			result *= base;
		}
		return result;
	}	
}
