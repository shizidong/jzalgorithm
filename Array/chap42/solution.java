package code.Array.chap42;

public class solution {
	public int findGreatSum(int []data) throws Exception{
		if(data==null||data.length==0){
			throw new Exception("输入异常");
		}
		//保存当前值
		int curSum = data[0];
		//保存最大值
		int greatSum = curSum;
		for(int i=1;i<data.length;i++){
			//如果当前值小于0则将后面的值赋给当前最大值，抛弃前面小的值
			if(curSum<=0){
				curSum = data[i];
				//否则就累加后面的值
			}else{
				curSum += data[i];
			}
			//如果当前累加的值大于保存的最大值，则替换
			if(curSum>greatSum){
				greatSum = curSum;
			}
			
		}
		return greatSum;
		
	}
}
