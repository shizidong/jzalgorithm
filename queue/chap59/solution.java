package code.queue.chap59;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class solution {
	public ArrayList<Integer> maxInWindows(int [] num, int size)
	{
	    ArrayList<Integer> result=new ArrayList<>(0);
	    if(num==null||num.length<1||num.length<size||size<1){
	        return result;
	    }
	    //定义双端队列
	    ArrayDeque<Integer> queue=new ArrayDeque<>();
	    for(int i=0;i<num.length;i++){

	    	while(!queue.isEmpty()&&num[queue.peekLast()]<=num[i]){
	    		queue.pollLast();
	    	}
	    	queue.addLast(i);
	    	//删除队头失效的最大值
	    	if(i-size>=queue.peekFirst()){
	    		queue.pollFirst();
	    	}
	    	if(i>=size-1){
	    		result.add(num[queue.peekFirst()]);
	    	}
	    }
	    return result;
	                                          
	}
}
